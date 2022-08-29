import { Select, Input, Button } from 'antd';
import { useHeaderStore } from '../header/headerStore';
import Drawing from '../drawing';
import { useRef } from 'react';

const Home = () => {
  const data = useHeaderStore((s) => s.data);
  const inputRef = useRef();
  return (
    <div>
      home
      <Select
        style={{ width: '200px' }}
        options={data.map((i) => ({
          label: i.featureName,
          value: i.id,
        }))}
      />
      <Input ref={inputRef} />
      <Button
        onClick={() => {
          inputRef.current.focus();
        }}
      >
        Focus
      </Button>
      <Button
        onClick={() => {
          inputRef.current.blur();
          setTimeout(() => {
            inputRef.current.focus();
          }, 2000);
        }}
      >
        Blur
      </Button>
      <Drawing />
    </div>
  );
};
export default Home;

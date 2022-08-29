import React from 'react';
import Header from './pages/header';
import Home from './pages/home';

// 父级组件
function App() {
  const [data, setData] = React.useState([]);
  return (
    <>
      {/* 子级组件 */}
      <Header />
      {/* 子级组件 */}
      <Home />
    </>
  );
}

export default App;

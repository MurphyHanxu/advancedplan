import { Button, Drawer, Table, Popconfirm, Typography, message } from 'antd';
import { useEffect, useState } from 'react';
import {
  deleteImageFeatureConfig,
  getImageFeatureConfig,
  updateImageFeatureConfig,
} from '../../service';
import { useHeaderStore } from './headerStore';

const { Paragraph } = Typography;

const Header = () => {
  const [visible, setVisible] = useState(false);
  const data = useHeaderStore((s) => s.data);
  const setData = useHeaderStore((s) => s.setData);

  const updateTable = () => {
    return getImageFeatureConfig({ imageVersion: 'test1' }).then((res) => {
      setData(res);
    });
  };

  useEffect(() => {
    if (visible) {
      updateTable();
    }
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [visible]);

  const columns = [
    {
      title: '属性名称',
      dataIndex: 'featureName',
      render: (text, row, index) => (
        <Paragraph
          editable={{
            onChange: (newValue) => {
              if (!newValue) return;
              if (newValue === row.featureName) return;
              updateImageFeatureConfig({
                ...row,
                featureName: newValue,
              }).then((res) => {
                message.success('修改成功');
                updateTable();
              });
            },
          }}
        >
          {text}
        </Paragraph>
      ),
    },
    {
      title: '备注',
      dataIndex: 'remark',
    },
    {
      title: '操作',
      dataIndex: 'operate',
      render: (text, row) => (
        <Popconfirm
          title={
            <div>
              确定删除
              <span style={{ color: 'red' }}>{row.featureName}</span>
              吗？
            </div>
          }
          okText="确定"
          onConfirm={() => {
            deleteImageFeatureConfig({
              id: row.id,
            }).then((res) => {
              message.success('删除成功');
              updateTable();
            });
          }}
          cancelText="取消"
        >
          <a href="#">Delete</a>
        </Popconfirm>
      ),
    },
  ];

  return (
    <>
      <div>
        <Button>标签集配置</Button>
        <Button>标签设置</Button>
        <Button>分类配置</Button>
        <Button
          onClick={() => {
            setVisible(true);
          }}
        >
          图片属性设置
        </Button>
        <Button>快捷键</Button>
        <Button>其他设置</Button>
      </div>
      <Drawer
        title="图片属性设置 Image Feature Setting"
        placement="left"
        width={600}
        onClose={() => {
          setVisible(false);
        }}
        visible={visible}
      >
        <Table rowKey="id" dataSource={data} columns={columns} />;
      </Drawer>
    </>
  );
};

export default Header;

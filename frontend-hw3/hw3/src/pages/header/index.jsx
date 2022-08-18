import { Button, Drawer, Table, Popconfirm, Typography } from 'antd';
import { useEffect, useState } from 'react';
import { request } from '../../utils/request';

const { Paragraph } = Typography;

const Header = () => {
  const [visible, setVisible] = useState(false);
  const [data, setData] = useState([]);

  const updateTable = () => {
    return request
      .post('/feature/get-image-feature-config', { imageVersion: 'test1' })
      .then((res) => {
        setData(res);
      });
  };
  useEffect(() => {
    if (visible) {
      updateTable();
    }
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
              request
                .post('/feature/update-image-feature-config', {
                  ...row,
                  featureName: newValue,
                })
                .then((res) => {
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
            request
              .post('/feature/delete-image-feature-config', {
                id: row.id,
              })
              .then((res) => {
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
        <Table dataSource={data} columns={columns} />;
      </Drawer>
    </>
  );
};

export default Header;

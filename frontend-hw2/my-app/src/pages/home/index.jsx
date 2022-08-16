import './index.css';
import { Button, Checkbox, Form, Input, message, Table } from 'antd';
import React, { useState } from 'react';
import { request } from '../../utils/request';

const App = () => {
  const [tableData, setTableData] = useState([]);
  const onFinish = (values) => {
    request
      .post('/auth/login', {
        email: values.username,
        password: values.password,
      })
      .then(() => {
        request({
          method: 'POST',
          data: { imageVersion: 'test1' },
          url: '/feature/get-image-feature-config',
        }).then(({ data }) => {
          setTableData(data.data);
        });
      });
  };

  const columns = [
    {
      title: '图片属性名称',
      dataIndex: 'featureName',
      key: 'featureName',
    },
    {
      title: '备注',
      dataIndex: 'remark',
      key: 'remark',
    },
  ];

  return (
    <div>
      <Form
        name="basic"
        labelCol={{
          span: 8,
        }}
        wrapperCol={{
          span: 16,
        }}
        initialValues={{
          remember: true,
        }}
        onFinish={onFinish}
        autoComplete="off"
      >
        <Form.Item
          label="Username"
          name="username"
          rules={[
            {
              required: true,
              message: 'Please input your username!',
            },
          ]}
        >
          <Input />
        </Form.Item>

        <Form.Item
          label="Password"
          name="password"
          rules={[
            {
              required: true,
              message: 'Please input your password!',
            },
          ]}
        >
          <Input.Password />
        </Form.Item>

        <Form.Item
          name="remember"
          valuePropName="checked"
          wrapperCol={{
            offset: 8,
            span: 16,
          }}
        >
          <Checkbox>Remember me</Checkbox>
        </Form.Item>

        <Form.Item
          wrapperCol={{
            offset: 8,
            span: 16,
          }}
        >
          <Button type="primary" htmlType="submit">
            Submit
          </Button>
        </Form.Item>
      </Form>
      <Table dataSource={tableData} columns={columns} />;
    </div>
  );
};
export default App;

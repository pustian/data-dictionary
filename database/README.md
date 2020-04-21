# 数据库表

## 表汇总

| 表名称         | 表明         | 说明               |
| -------------- | ------------ | ------------------ |
| 数据项         | element      | 数据项目           |
| 数据项明细     | element_item | 每条项目的明细     |
| 数据项操作日志 | element_log  | 数据项目的操作日志 |

### element

| 字段         | 说明               | 索引和其他补充               |
| ------------ | ------------------ | ---------------------------- |
| id           | 数据项id           | 主键                         |
| name         | 数据项名称         | 索引                         |
| name_en      | 数据项英文名       |                              |
| name_sql     | sql命名            | 下画线分割命名（不超过32位） |
| sql_type     | sql类型            | |
| name_c       | c语言命名          | 简写法                       |
| c_type       | c语言类型          | |
| name_java    | java命名           | 驼峰命名                     |
| java_type    | java类型           | |
| name_js      | js命名             |                              |
| validate | 长度，大小等规范 | |
| decription   | 数据项描述         | ok like 查询从左到右匹配     |
| status       | 不可用，可用，作废 |                              |
| gmt_create   |                    |                              |
| gmt_modified |                    |                              |

### element_item

| 字段         | 说明               | 索引和其他                   |
| ------------ | ------------------ | ---------------------------- |
| id           | 数据item id        | 主键                         |
| element_id   | 数据项id           | ok                           |
| name         | 数据item名称       |                              |
| name_en      | 数据item英文名     |                              |
| name_sql     | sql命名            | 下画线分割命名（不超过32位） |
| name_c       | c语言命名          | 简写法                       |
| name_java    | java命名           | 驼峰命名                     |
| name_js      | js命名             |                              |
| validate     | 长度，大小等规范   |                              |
| decription   | 数据项描述         |                              |
| status       | 不可用，可用，作废 |                              |
| gmt_create   |                    |                              |
| gmt_modified |                    |                              |

// 业务上需要申请操作和批准

### department

| 字段         | 说明       | 索引 |
| ------------ | ---------- | ---- |
| id           | 部门id     | 主键 |
| name         | 部门名称   |      |
| leader       | 部门负责人 |      |
| remark       |            |      |
| is_delete    |            |      |
| gmt_create   |            |      |
| gmt_modified |            |      |

### employee

| 字段          | 说明                            | 索引 |
| ------------- | ------------------------------- | ---- |
| id            | 员工id                          | 主键 |
| department_id | 部门id                          | ok   |
| name          | 员工名称                        | ok   |
| leader_id     | 直属负责人                      |      |
| rank          | 员工级别（6级以上可以直接生效） |      |
| passwd        | 密码                            |      |
| remark        |                                 |      |
| is_delete     |                                 |      |
| gmt_create    |                                 |      |
| gmt_modified  |                                 |      |

### elment_log 包含item的日志

| 字段        | 说明         | 索引 |
| ----------- | ------------ | ---- |
| id          | 数据item id  | 主键 |
| element_id  | 数据项id     | ok   |
| employee_id | 操作人id     |      |
| remark      | 本次操作内容 |      |
| gmt_create  |              |      |
|             |              |      |
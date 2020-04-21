INSERT INTO `data-dictionary`.`element` (id,name,name_en,name_sql,name_c,name_java,name_js,description,`type`,status,gmt_create,gmt_modified) VALUES 
(1,'记录编号','record id','id','id','id','id','记录编号', 0, 1, now(), now());
INSERT INTO `data-dictionary`.`element` (id,name,name_en,name_sql,name_c,name_java,name_js,description,`type`,status,gmt_create,gmt_modified) VALUES 
(2,  '创建时间', 'create time',  'gmt_create',  'gmt_create',  'gmtCreate',  'gmtCreate',   '创建时间',  0,  1,  now(), now() ) ;
INSERT INTO `data-dictionary`.`element` (id,name,name_en,name_sql,name_c,name_java,name_js,description,`type`,status,gmt_create,gmt_modified) VALUES 
(3,  '修改时间', 'modified time',  'gmt_modified',  'gmt_modified',  'gmtModified',  'gmtModified',   '修改时间',  0,  1,  now(), now() ) ;
INSERT INTO `data-dictionary`.`element` (id,name,name_en,name_sql,name_c,name_java,name_js,description,`type`,status,gmt_create,gmt_modified) VALUES
(4,  '属性状态', 'field status',  'status',  'status',  'status',  'status',   '字段状态， 数据库为tiny类型, 0-不可用,1-使用, 9-推荐不再使用',  0,  1,  now(), now() ) ;
INSERT INTO `data-dictionary`.`element` (id,name,name_en,name_sql,name_c,name_java,name_js,description,`type`,status,gmt_create,gmt_modified) VALUES
(5,  '属性类型', 'field type',  'type',  'type',  'type',  'type',   '字段类型 数据库为tiny类型, 0-技术字段，1-业务字段',  0,  1,  now(), now() ) ;


INSERT INTO `data-dictionary`.`element_item` (id, element_id, name, name_en, name_sql, name_c, name_java, name_js, description, status, gmt_create, gmt_modified) VALUES
(1, 4,  '属性不可用', 'field status invalid',  '',  'INVALID',  'INVALID',  'INVALID',   '属性是不可用状态',   1,  now(), now() ) ;
INSERT INTO `data-dictionary`.`element_item` (id, element_id, name, name_en, name_sql, name_c, name_java, name_js, description, status, gmt_create, gmt_modified) VALUES
(2, 4,  '属性正常', 'field status valid',  '',  'VALID',  'VALID',  'VALID',   '属性是正常使用',   1,  now(), now() ) ;
INSERT INTO `data-dictionary`.`element_item` (id, element_id, name, name_en, name_sql, name_c, name_java, name_js, description, status, gmt_create, gmt_modified) VALUES
(3, 4,  '属性建议不再使用', 'field status deprecated',  '',  'DEPRECATED',  'DEPRECATED',  'DEPRECATED',   '属性建议不再使用',   1,  now(), now() ) ;

INSERT INTO `data-dictionary`.`element_item` (id, element_id, name, name_en, name_sql, name_c, name_java, name_js, description, status, gmt_create, gmt_modified) VALUES
(4, 5,  '技术属性', 'technology field',  '',  'TECHNOLOGY',  'TECHNOLOGY',  'TECHNOLOGY',   '技术属性',   1,  now(), now() ) ;
INSERT INTO `data-dictionary`.`element_item` (id, element_id, name, name_en, name_sql, name_c, name_java, name_js, description, status, gmt_create, gmt_modified) VALUES
(5, 5,  '业务属性', 'business field',  '',  'BUSINESS',  'BUSINESS',  'BUSINESS',   '业务属性',   1,  now(), now() ) ;



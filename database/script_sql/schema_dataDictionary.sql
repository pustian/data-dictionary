-- CREATE DATABASE IF NOT EXISTS data-dictionary;
drop table if exists `data-dictionary`.`test` ;
drop table if exists `data-dictionary`.`element` ;
drop table if exists `data-dictionary`.`element_item` ;

create table `data-dictionary`.`test`  (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `gmt_create` datetime DEFAULT NULL,
    `gmt_modified` datetime DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='测试表';

create table `data-dictionary`.`element`  (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `name` varchar(32) DEFAULT NULL,
    `name_en` varchar(32) DEFAULT NULL,
    `name_sql` varchar(32) DEFAULT NULL,
    `sql_type` tinyint DEFAULT NULL COMMENT '0-int,1-char,2-varchar,3-date,4-datetime,5-decimal',
    `name_c` varchar(32) DEFAULT NULL,
    `c_type` tinyint DEFAULT NULL COMMENT '0-int,1-long,2-short,3-char,4-char[],5-enum,6-BOOL',
    `name_java` varchar(32) DEFAULT NULL,
    `java_type` tinyint DEFAULT NULL COMMENT '0-Integer,1-Long,3-Short,4-String,5-enum,6-Boolean',
    `name_js` varchar(32) DEFAULT NULL,
    `validate` varchar(64) DEFAULT NULL comment '长度，取值范围规范',
    `description` varchar(128) DEFAULT NULL comment '业务解释',
    `type` tinyint NOT NULL comment '0-技术字段，1-业务字段',
    `status` tinyint DEFAULT 0 COMMENT '0-不可用,1-使用, 9-推荐不再使用',
    `gmt_create` datetime DEFAULT NULL,
    `gmt_modified` datetime DEFAULT NULL,
    PRIMARY KEY (`id`),
    UNIQUE index name_uqi (name),
    index description_idx (description)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='数据项';

create table `data-dictionary`.`element_item`  (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `element_id` int(11) NOT NULL,
    `name` varchar(32) DEFAULT NULL,
    `name_en` varchar(32) DEFAULT NULL,
    `name_sql` varchar(32) DEFAULT NULL,
    `sql_type` tinyint DEFAULT NULL COMMENT '0-int,1-char,2-varchar,3-date,4-datetime,5-decimal',
    `name_c` varchar(32) DEFAULT NULL,
    `c_type` tinyint DEFAULT NULL COMMENT '0-int,1-long,2-short,3-char,4-char[],5-enum,6-BOOL',
    `name_java` varchar(32) DEFAULT NULL,
    `java_type` tinyint DEFAULT NULL COMMENT '0-Integer,1-Long,3-Short,4-String,5-enum,6-Boolean',
    `name_js` varchar(32) DEFAULT NULL,
    `validate` varchar(64) DEFAULT NULL comment '长度，取值范围规范',
    `description` varchar(128) DEFAULT NULL comment '业务解释',
    `status` tinyint DEFAULT 0 COMMENT '0-不可用,1-使用, 9-推荐不再使用',
    `gmt_create` datetime DEFAULT NULL,
    `gmt_modified` datetime DEFAULT NULL,
    PRIMARY KEY (`id`),
    UNIQUE index name_uqi (name, element_id),
        index element_idx (element_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='数据项明细';

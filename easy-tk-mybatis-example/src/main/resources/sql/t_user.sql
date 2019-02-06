CREATE TABLE `t_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID,自动生成',
  `user_age` int(18) NOT NULL DEFAULT '0',
  `user_name` varchar(32) NOT NULL DEFAULT '',
  `operating` varchar(32) DEFAULT '' COMMENT '操作人',
  `usable` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否可用',
  `server_create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '系统创建时间',
  `server_update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '系统更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='测试用户表';

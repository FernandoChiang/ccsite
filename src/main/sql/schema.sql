-- 数据库初始化脚本

-- 创建数据库
create database seckill;
-- 使用数据库
use seckill;

CREATE TABLE `wx_token` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `access_token` varchar(1024) NOT NULL,
  `expires_in` int(11) NOT NULL,
  `createTime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- 连接数据库控制台
-- mysql -uroot -p
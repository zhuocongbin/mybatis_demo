# mybatis_demo
#1、通过maven+mybatis搭建项目，简单实现对mysql数据库中表的增删改查操作；
#2、MybatisServer.java文件下的main方法，举例实现；
#3、数据库表的创建代码是：
   CREATE TABLE `authors` (
      `author_id` int(11) NOT NULL AUTO_INCREMENT,
      `first_name` varchar(32) NOT NULL,
      `last_name` varchar(128) NOT NULL,
      `country` varchar(128) DEFAULT NULL,
      PRIMARY KEY (`author_id`)
  ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8

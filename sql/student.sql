/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50613
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50613
File Encoding         : 65001

Date: 2013-08-22 18:02:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `age` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

/**
 * 创建用户表，用于登录系统
 */
CREATE TABLE user (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(20) NOT NULL,
  pwd varchar(20) NOT NULL,
  PRIMARY KEY (id)
);


/**
 * 创建两个登录用户
 */
INSERT INTO user (id,name,pwd) VALUES 
 (1,'xmqq','111111'),
 (2,'dmqq','222222');
 
 
 
 
 /**
  * 创建记录表，用来保存学生的成绩等信息
  */
 CREATE TABLE records
(
id_r int NOT NULL AUTO_INCREMENT PRIMARY KEY,
msg varchar(20) NOT NULL,
score int NOT NULL
);


INSERT INTO records (id_r,msg,score) VALUES 
 (1,'very good',80),
 (2,'prefect',98),
 (3,'very bas',40);

 
 /**
  * 创建人物表，人物表和记录表关联
  */
 CREATE TABLE persons
(
id int NOT NULL,
age varchar(20) NOT NULL,
name varchar(20) NOT NULL,
id_foreign int NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (id_foreign) REFERENCES records(id_r)
);


INSERT INTO persons (id,age,name,id_foreign) VALUES 
 (17,'dmqq',3);
 
 
 
 /**
  * 测试关联是否成功
  */
 select persons.name ,records.msg from
 persons,records 
 where persons.id_foreign=records.id_r;
 
 
 








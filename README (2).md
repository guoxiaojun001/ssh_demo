spring
======

[![Join the chat at https://gitter.im/cr2121/spring](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/cr2121/spring?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

spring3 + hibernate4 + struts2
spring3 + mybatis + struts2

when first run this,
shall change the database setting in applicationContext-database.xml

    <property name="jdbcUrl" value="jdbc:mysql://localhost:3306/world" />
    <property name="user" value="root" />
    <property name="password" value="123456" />
as your database setting

and run the following command in your mysql

    create table student(
    id bigint NOT NULL auto_increment,
    name VARCHAR(30),
    age INT,
    primary key (id));


 INSERT INTO student (id,name,age) VALUES 
 (1,'zhangsan',23),
 (2,'lisi',24),
 (3,'wanger',25);


CREATE TABLE user (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(20) NOT NULL,
  pwd varchar(20) NOT NULL,
  PRIMARY KEY (id)
);


INSERT INTO user (id,name,pwd) VALUES 
 (1,'xmqq','111111'),
 (2,'dmqq','222222');

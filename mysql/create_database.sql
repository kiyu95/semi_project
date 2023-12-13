SHOW databases;

CREATE USER 'kbj'@'%' IDENTIFIED BY 'kbj';

USE mysql;

SHOW TABLES;

SELECT * FROM USER;

CREATE DATABASE schooldb;

GRANT ALL PRIVILEGES ON schooldb.* TO 'kbj'@'%';
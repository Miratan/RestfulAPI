create database restfulapi;

use restfulapi;

create table `task` (
	`id` int NOT NULL AUTO_INCREMENT,
	`description` VARCHAR(100) NOT NULL,
	primary key (`id`)
);
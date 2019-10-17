create database Pji;
use pji;

create table usuario(
codigo int not null,
nome varchar(50) not null,
email varchar(50) not null,
senha varchar(50) not null,
primary key(codigo)
)engine innodb;

select *from usuario;
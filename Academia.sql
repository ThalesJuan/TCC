create database academia;

use academia;

create table alunos(
cpf varchar(11) not null primary key,
nome varchar(100) not null,
sexo varchar(1) not null,
endereco varchar(300) not null,
cidade varchar(50) not null,
cep varchar(8) not null,
uf varchar(2) not null,
idade int(3) not null,
peso decimal(3,2) not null,
altura decimal(3,2) not null,
tel_res varchar(50),
tel_cel varchar(50) not null,
email varchar(100) not null
);

create table professores(
cpf varchar(11) not null primary key,
nome varchar(100) not null,
idade int(3) not null,
funcao varchar(200) not null,
email varchar(100) not null
);

create table exercicios(
id_exerc int auto_increment primary key,
nome_exerc varchar(300) not null
);

create table mensalidade(
periodo date not null primary key,
cpf varchar(11) not null,
valor_mens decimal(9,2) not null,
pagamento boolean not null,
foreign key(cpf) references alunos(cpf)
);

create table treinos(
id_treino int primary key,
cpf varchar(11) not null,
id_exerc int,
num_serie int not null,
num_rep int not null,
dia_semana varchar(20),
foreign key(cpf) references alunos(cpf),
foreign key(id_exerc) references exercicios(id_exerc)
);
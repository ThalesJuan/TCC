create database academia;

use academia;

create table alunos(
cpf varchar(11) not null primary key,
nome varchar(100) not null,
sexo varchar(1) not null,
endereco varchar(300) not null,
cidade varchar(50) not null,
cep varchar(9) not null,
uf varchar(2) not null,
idade int(3) not null,
peso double not null,
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
id_mens int auto_increment primary key,
periodo date not null,
cpf varchar(11) not null,
valor_mens float not null,
pagamento boolean not null,
foreign key(cpf) references alunos(cpf)
);

create table treinos(
id_treino int auto_increment primary key,
cod_treino int not null,
cpf varchar(11) not null,
id_exerc int,
num_serie int not null,
num_rep int not null,
dia_semana varchar(300),
foreign key(cpf) references alunos(cpf),
foreign key(id_exerc) references exercicios(id_exerc)
);

INSERT INTO alunos(cpf, nome, sexo, endereco, cidade, cep, uf, idade, peso, altura, tel_res, tel_cel, email) VALUES
('98759373801', 'José da Silva', 'M', '', 'Itapira', '43098-005', 'SP', 52, 94.3, 1.84, '', '11 93738-9032', 'josesilva1@gmail.com'),
('65392638390', 'Maria Eduarda Souza', 'F', '', 'Jacutinga', '53639-825', 'MG', 34, 62.1, 1.54, '35 6780-0925', '35 93589-6784', 'meduardasouza@gmail.com'),
('15273938330', 'Paulo Clemente', 'M', '', 'Mogi Guaçu', '34890-478', 'SP', 21, 72.6, 1.72, '11 3467-7659', '11 93274-0046', 'paulocle@gmail.com'),
('73849262393', 'Joana Cabral', 'F', '', 'Mogi Mirim', '27818-909', 'SP', 39, 52.2, 1.60, '11 4578-2138', '11 94567-2233', 'jocabral@gmail.com');

INSERT INTO professores(cpf, nome, idade, funcao, email) VALUES
('25373048490', 'Cláudio Pereira Aguiar', 29, 'Coordenador', 'cpa@gmail.com'),
('45372028290', 'Paula Celestino da Silva', 24, 'Professora', 'paulacelsilva@gmail.com'),
('56494039389', 'Adilson Cravo', 23, 'Personal Trainer', 'acravo@gmail.com'),
('74940272020', 'Larissa dos Santos', 20, 'Estagiária', 'larsantos@gmail.com');

INSERT INTO exercicios(nome_exerc) VALUES
('Supino Inclinado'),
('Aguachamento'),
('Remada Sentada com Triângulo'),
('Cadeira Flexora');

INSERT INTO mensalidade(periodo, cpf, valor_mens, pagamento) VALUES
('20200110', '98759373801', 115.00, '1'),
('20200110', '65392638390', 115.00, '0'),
('20200110', '15273938330', 115.00, '1'),
('20200110', '73849262393', 115.00, '1'),
('20200210', '98759373801', 120.00, '0'),
('20200210', '65392638390', 120.00, '1'),
('20200210', '15273938330', 120.00, '0'),
('20200210', '73849262393', 120.00, '1');

INSERT INTO treinos(cod_treino, cpf, id_exerc, num_serie, num_rep, dia_semana) VALUES
(0001, '98759373801', 1, 4, 15, 'Segunda-feira'),
(0001, '98759373801', 2, 2, 10, 'Terça-feira'),
(0001, '98759373801', 3, 4, 12, 'Quarta-feira'),
(0001, '98759373801', 4, 3, 12, 'Quinta-feira'),
(0002, '65392638390', 1, 3, 12, 'Segunda-feira'), 
(0002, '65392638390', 2, 2, 12, 'Terça-feira'),
(0002, '65392638390', 3, 2, 12, 'Quarta-feira'),
(0002, '65392638390', 4, 4, 8, 'Quinta-feira'),
(0003, '15273938330', 1, 4, 15, 'Segunda-feira'),
(0003, '15273938330', 2, 2, 12, 'Terça-feira'),
(0003, '15273938330', 3, 3, 12, 'Quarta-feira'),
(0003, '15273938330', 4, 3, 10, 'Quinta-feira'),
(0005, '73849262393', 1, 3, 12, 'Segunda-feira'),
(0005, '73849262393', 2, 2, 8, 'Terça-feira'),
(0005, '73849262393', 3, 2, 10, 'Quarta-feira'),
(0005, '73849262393', 4, 3, 8, 'Quinta-feira');

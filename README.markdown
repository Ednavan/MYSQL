# MYSQL

# DEFINIÇÕES IMPORTANTE PARA CRIAÇÃO DE BANCO DE DADOS, COM AUXÍLIO DE EXEMPLOS
 
### *FERRAMENTAS  QUE UTILIZO PARA CONFIGURAR O BANCO DE DADOS E ESTÁ CRIANDO  NOVAS ALTERAÇÕES DE DDL E DML!*

Exemplo abaixo mostra o comando de criar uma tebela, com seus atributos:
 -------------------------------------------------------------------------------------
|CREATE DATABASE CADASTRO  DEFAULT CHARACTER SET utf8 default collate utf8_general_ci;|
|-----------------------------------------------------------------------------------------------
create table pessoas(|
id INT NOT NULL AUTO_INCREMENT, |                #NOT NULL OBRIGA A DIGITAÇÃO, Auto increment siginfica que a primeeira pessoa terá código 1, a segunda código 2  ....
nome varchar(30) NOT NULL,|                                                  
nascimento date,  |         
sexo enum('M', 'F'),
peso decimal(5,2),|
altura decimal(3,2), |
nacionalidade varchar(20) default 'Brasil',|                     ###nacionalidade se não for definida automaticamente será brasileira pois está definida como padrão
primary key (id) |                                    #definindo primeira chave primeira para o id
) default charset = utf8;|
---------------------------------------------------------------------------------------


`COMANDOS DA CLASSFICAÇÃO DML` 

--------------------------------------
create table if not exists cursos(   |
--------------------------------------
nome varchar(30) not null unique,    |
--------------------------------------
descricao text,                      |
--------------------------------------
carga int unsigned,                  |
--------------------------------------
total de aulas int unsigned,         |
--------------------------------------
ano year default '2016'              |
--------------------------------------


# MYSQL
DEFINIÇÕES IMPORTANTE PARA BANCO DE DADOS
 
#FERRAMENTAS  QUE UTILIZO PARA CONFIGURAR O BANCO DE DADOS E ESTÁ CRIANDO  NOVAS ALTERAÇÕES DE DDL E DML! 


<font color=blue> Some green text </font>

CREATE DATABASE CADASTRO  DEFAULT CHARACTER SET utf8 default collate utf8_general_ci;

create table pessoas(
id INT NOT NULL AUTO_INCREMENT,                 #NOT NULL OBRIGA A DIGITAÇÃO, Auto increment siginfica que a primeeira pessoa terá código 1, a segunda código 2  ....
nome varchar(30) NOT NULL,
nascimento date,
sexo enum('M', 'F'),
peso decimal(5,2),
altura decimal(3,2), 
nacionalidade varchar(20) default 'Brasil',                          # nacionalidade se não for definida automaticamente será brasileira pois está definida como padrão
primary key (id)                                     #definindo primeira chave primeira para o id
) default charset = utf8;





COMANDOS DA CLASSIFICAÇÃO DML

INSERT INTO pessoas values
(DEFAULT,  'Carlos', '1997-09-03', 'M', '80,5', '1,77', DEFAULT);

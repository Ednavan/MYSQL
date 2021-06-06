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



Exemplo   | Valor do exemplo
--------- | ------
Exemplo 1 | R$ 10
Exemplo 2 | R$ 8
Exemplo 3 | R$ 7
Exemplo 4 | R$ 8

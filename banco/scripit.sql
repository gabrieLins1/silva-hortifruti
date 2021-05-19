/**
*controle de estoque
*@autor gabriel da silva
*/

show databases;

create database tabelaestoque;

use tabelaestoque;

show tables ;

create table tabelaestoque(
id int primary key auto_increment,
produtos varchar(50)not null,
quantidade  decimal(10,2) not null,
valor decimal(10,2) not null,
datapd timestamp default current_timestamp,
validade varchar(50)not null
);
 drop table tabelaestoque;  -- oi 
 
describe tabelaestoque;

insert into tabelaestoque(produtos,quantidade,valor,validade)
values ('banana',2,9,'10/6/22');
-- CRUD	create
insert into tabelaestoque(produtos,quantidade,valor,validade)
values ('tomate',3,8,'1/5/22');

insert into tabelaestoque(produtos,quantidade,valor,validade)
values ('abacate',25,7,'17/5/22');

insert into tabelaestoque(produtos,quantidade,valor,validade)
values ('melao',28,6,'7/4/22');

insert into tabelaestoque(produtos,quantidade,valor,validade)
values ('batata',50,1,'19/7/22');

insert into tabelaestoque(produtos,quantidade,valor,validade)
values ('sebola',25,3,'19/3/22');

-- CRUD	read
select * from tabelaestoque;
select * from tabelaestoque order by produtos;
select * from tabelaestoque where id = 2;

-- CRUD	updata
update tabelaestoque set produtos='bolo' where id = 1;
update tabelaestoque  set produtos='laranga', quantidade=30, valor=2, validade='18/5/22' where id = 1;


-- CRUD	delete
delete from tabelaestoque where id = 1;



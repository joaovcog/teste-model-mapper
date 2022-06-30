set foreign_key_checks = 0;

delete from atividades;

set foreign_key_checks = 1;

alter table atividades auto_increment = 1;

insert into atividades (descricao, duracao, cod_atividade_dependente) values ('Fazer revisão do carro', 1, null);
insert into atividades (descricao, duracao, cod_atividade_dependente) values ('Consertar carro', 3, 1);


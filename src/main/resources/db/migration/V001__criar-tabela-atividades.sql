create table atividades (
	codigo bigint not null auto_increment, 
	descricao varchar(60) not null,
	duracao bigint not null, 
	cod_atividade_dependente bigint,
	
	primary key(codigo)
)engine=InnoDB default charset=utf8mb4;

alter table atividades add constraint fk_atividades_atividades foreign key (cod_atividade_dependente) references atividades(codigo);
create table jogos (
    id varchar (225) not null primary key,
    titulo varchar (100) not null,
    desenvolvedora varchar (100) not null,
    genero varchar (50) not null,
    plataforma varchar (50) not null,
    ano_lancamento integer not null,
    nota numeric (2,1),
    finalizado boolean not null
);
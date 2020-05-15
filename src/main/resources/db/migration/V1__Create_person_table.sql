
SET search_path TO s_user;

create table s_user.t_person (
    id int not null,
    name varchar(20) not null,
    phone varchar(11),
    relationship_id int[],
    primary key (id)
);

create table s_user.t_relationship(
    id int not null,
    relationship_type int not null,
    person_one int not null ,
    person_two int not null ,
    create_time timestamp not null ,
    expire_time timestamp not null ,
    delete_time timestamp,
    valid boolean not null ,
    operator int not null
)
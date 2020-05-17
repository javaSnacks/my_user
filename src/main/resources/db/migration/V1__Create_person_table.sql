
SET search_path TO s_user;

create table s_user.t_person (
    id serial primary key  ,
    name varchar(20) not null,
    phone varchar(11),
    relationship_id int[]
);

create table s_user.t_relationship(
    id serial primary key ,
    relationship_type int not null,
    person_one int not null references s_user.t_person(id),
    person_two int not null references s_user.t_person(id),
    create_time timestamp not null ,
    expire_time timestamp not null ,
    delete_time timestamp,
    valid boolean not null ,
    operator int not null references s_user.t_person(id)
)
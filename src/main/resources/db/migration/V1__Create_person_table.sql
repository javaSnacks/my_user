
SET search_path TO s_user;

create table s_user.t_person (
    id serial primary key  ,
    name varchar(20) not null,
    phone varchar(11),
    relationship_id integer array,
    valid int not null
);

COMMENT ON COLUMN t_person.id IS '用户主键';

COMMENT ON COLUMN t_person.name IS '用户姓名';

COMMENT ON COLUMN t_person.phone IS '用户手机';

COMMENT ON COLUMN t_person.relationship_id IS '用户和其他用户关系';

COMMENT ON COLUMN t_person.valid IS '用户有效期，1是在有效期，2是已禁用';

create table s_user.t_relationship(
    id serial primary key ,
    relationship_type int not null,
    person_one int not null references s_user.t_person(id),
    person_two int not null references s_user.t_person(id),
    create_time bigint not null ,
    expire_time bigint not null ,
    delete_time bigint,
    valid int not null ,
    operator int not null references s_user.t_person(id)
);

COMMENT ON COLUMN t_relationship.id IS '关系主键';

COMMENT ON COLUMN t_relationship.relationship_type IS '关系类型';

COMMENT ON COLUMN t_relationship.person_one IS '关系人一';

COMMENT ON COLUMN t_relationship.person_two IS '关系人二';

COMMENT ON COLUMN t_relationship.create_time IS '关系创建时间,精确到秒';

COMMENT ON COLUMN t_relationship.expire_time IS '关系到期时间,精确到秒';

COMMENT ON COLUMN t_relationship.delete_time IS '关系删除时间,精确到秒';

COMMENT ON COLUMN t_relationship.valid IS '关系是否有效';

COMMENT ON COLUMN t_relationship.operator IS '改变关系操作人';


create table s_user.t_goods(
       id serial primary key ,
       name varchar(30) not null ,
       price int not null ,
       description varchar(100) ,
--     category char not null ,
       create_time bigint not null ,
       expire_time bigint not null ,
       delete_time bigint ,
       valid int not null ,
       operator int not null references s_user.t_person(id)
);

COMMENT ON COLUMN t_goods.id IS '商品主键';

COMMENT ON COLUMN t_goods.name IS '商品名称';

COMMENT ON COLUMN t_goods.price IS '商品价格';

COMMENT ON COLUMN t_goods.description IS '商品描述信息';

-- COMMENT ON COLUMN t_goods.category IS '商品类别';

COMMENT ON COLUMN t_goods.create_time IS '商品创建时间,精确到秒';

COMMENT ON COLUMN t_goods.expire_time IS '商品过期时间,精确到秒';

COMMENT ON COLUMN t_goods.delete_time IS '商品删除时间,精确到秒';

COMMENT ON COLUMN t_goods.valid IS '商品是否在有效期,1表示在有效期，2表示已过期';

COMMENT ON COLUMN t_goods.operator IS '商品添加操作人';

-- CREATE TABLE s_user.t_category(
--     id SERIAL PRIMARY KEY ,
--     category_name INT NOT NULL ,
--     father_category INT NOT NULL
-- );
--
-- COMMENT ON COLUMN t_category.id IS '商品类别id';
--
-- COMMENT ON COLUMN t_category.category_name IS '商品类别，0为所有商品父类';
--
-- COMMENT ON COLUMN t_category.father_category IS '商品类别的父类';



create table s_user.t_goods_history(
       id serial primary key ,
       goods_id int not null ,
       name varchar(30) not null ,
       price int not null ,
       description varchar(100) ,
--     category char not null ,
       create_time bigint not null ,
       expire_time bigint not null ,
       delete_time bigint ,
       valid int not null ,
       operator int not null references s_user.t_person(id),
       operator_history int not null references s_user.t_person(id)
);

COMMENT ON COLUMN t_goods_history.id IS '商品主键';

COMMENT ON COLUMN t_goods_history.goods_id IS '商品标识';

COMMENT ON COLUMN t_goods_history.name IS '商品名称';

COMMENT ON COLUMN t_goods_history.price IS '商品价格';

COMMENT ON COLUMN t_goods_history.description IS '商品描述信息';

-- COMMENT ON COLUMN t_goods.category IS '商品类别';

COMMENT ON COLUMN t_goods_history.create_time IS '商品创建时间,精确到秒';

COMMENT ON COLUMN t_goods_history.expire_time IS '商品过期时间,精确到秒';

COMMENT ON COLUMN t_goods_history.delete_time IS '商品删除时间,精确到秒';

COMMENT ON COLUMN t_goods_history.valid IS '商品是否在有效期,1表示在有效期，2表示已过期,3表示已进入历史';

COMMENT ON COLUMN t_goods_history.operator IS '商品添加操作人';

COMMENT ON COLUMN t_goods_history.operator IS '历史添加操作人';
create table blog_types
(
    id        int auto_increment comment '自增ID'
        primary key,
    type_name varchar(20)   not null comment '类型名称',
    add_date  datetime      not null comment '添加日期',
    del_date  datetime      null comment '删除日期',
    is_delete int default 0 not null comment '是否删除'
)
    comment '博客类型';

create table bolg_abstruct
(
    id          int auto_increment comment '自增ID',
    blog_name   varchar(200)  not null comment '博客名称',
    blog_type_1 int null comment '博客类型1',
    blog_type_2 int null,
    blog_type_3 int null,
    blog_type_4 int null,
    blog_type_5 int null,
    add_date    datetime      not null comment '添加日期',
    is_delete   int default 0 not null comment '是否删除',
    del_date    datetime null comment '删除时间',
    constraint bolg_abstruct_pk
        primary key (id)
)
    comment '博客概要');

create table blog_information
(
    id int auto_increment comment '自增ID',
    blog_id int not null comment '博客ID',
    constraint blog_information_pk
        primary key (id)
)
    comment '博客内容';



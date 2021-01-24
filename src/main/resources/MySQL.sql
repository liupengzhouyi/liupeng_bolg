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
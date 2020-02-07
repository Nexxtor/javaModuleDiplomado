create table Student
(
    _id        int auto_increment ,
    name       varchar(100)                          not null,
    last_name  varchar(100)                          not null,
    created_at timestamp default current_timestamp() not null,
    updated_at timestamp                             null,
    constraint Student_pk
        primary key (_id)
);

create table Event
(
    _id        int auto_increment ,
    name       varchar(100)                          null,
    date       timestamp                             null,
    created_at timestamp default current_timestamp() null,
    updated_at timestamp                             null,
    address    varchar(200)                          null,
    constraint Event_pk
        primary key (_id)
);

create table attendance
(
    _id        int auto_increment  ,
    student_id int                            null,
    event_id   int                            null,
    attendance boolean                        null,
    constraint attendance_pk
        primary key (_id, student_id, event_id),
    constraint attendance_Event__id_fk
        foreign key (event_id) references Event (_id),
    constraint attendance_Student__id_fk
        foreign key (student_id) references Student (_id)
);

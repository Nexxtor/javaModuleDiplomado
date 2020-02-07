create table Student
(
    "_id" int generated always as identity
        constraint Student_pk
        primary key,
    name varchar(100) not null,
    last_name varchar(100) not null,
    created_at TIMESTAMP default CURRENT_TIMESTAMP not null,
    updated_at TIMESTAMP null
);

comment on table Student is 'Alamacena la información básica de un alumno';
create table Event
(
    "_id" int not null generated always as identity
        constraint Event_pk
        primary key,
    name varchar(100) not null,
    date timestamp,
    created_at TIMESTAMP default CURRENT_TIMESTAMP not null,
    updated_at TIMESTAMP  null,
    address varchar(200) not null
);

create table attendance
(
    "_id" int  not null generated always as identity,
    student_id int not null
        constraint attendance_Student__id_fk
        references Student ("_id"),
    event_id int not null
        constraint attendance_Event__id_fk
        references Event ("_id"),
    attendance boolean not null,
    constraint attendance_pk
        primary key ("_id", student_id, event_id)
);

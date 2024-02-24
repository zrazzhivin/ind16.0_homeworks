-- liquibase formatted sql

--changeset zrazzhivin:1
create index student_name_indx on student (name);

--changeset zrazzhivin:2
create index faculty_name_color_index on faculty (name, color);


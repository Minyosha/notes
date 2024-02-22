CREATE TABLE notes (
    id BIGINT NOT NULL auto_increment PRIMARY KEY,
    title varchar(255) not null,
    content varchar(255) not null,
    created datetime not null
);
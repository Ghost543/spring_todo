CREATE TABLE IF NOT EXISTS Task (
    id INTEGER AUTO_INCREMENT,
    title varchar(255) not null,
    description text,
    status varchar(20) not null
    primary key (id)
);
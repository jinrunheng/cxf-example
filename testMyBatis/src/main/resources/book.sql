create table book
(
    id                 bigint primary key auto_increment,
    book_name           varchar(255)
);

insert into book values(1,'hello'),(2,'world');
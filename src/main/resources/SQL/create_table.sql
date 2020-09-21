
drop table if exists log;

drop table if exists user;

drop table if exists product;



CREATE TABLE user(id int primary key auto_increment, username varchar(30) not null, password varchar(30) not null, dateOfRegistration date);

CREATE TABLE product(id int primary key auto_increment, name varchar(100) not null, price float not null, quantity int not null);

CREATE TABLE log(user_id int, product_id int, foreign key(user_id) references user(id), foreign key(product_id) references product(id));

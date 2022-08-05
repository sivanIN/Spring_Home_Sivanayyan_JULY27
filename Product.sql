create database ecommerce;
use ecommerce;

create table product (
id BIGINT primary key,
sku VARCHAR(255),
name VARCHAR(255),
description VARCHAR(255),
unitprice DECIMAL(13,2),
imageurl VARCHAR(255),
active bit(1),
unitsinstock INT,
datecreated DATETIME(6),
lastupdated DATETIME(6),
categoryid BIGINT ,
foreign key (categoryid)  references productcategory(categoryid)  );
drop table product;

create table productcategory (categoryid BIGINT primary key,
categoryname VARCHAR(255)
);

insert into product values(7638,"234567","Toy car","Remote controll car",350.5,"https://5.imimg.com/data5/GK/TX/ZT/SELLER-59702771/range-rover-toy-car-500x500.jpg",1,25,"2022-07-12","2022-07-12",101);
select * from product;
insert into productcategory values(103,"Fashion");
select * from productcategory;

delete from product where id = 7649;

create table cart (
id BIGINT primary key AUTO_INCREMENT,
name VARCHAR(255),
description VARCHAR(255),
unitprice DECIMAL(13,2),
quantity BIGINT,
imageurl VARCHAR(255),

productid BIGINT ,
foreign key (productid)  references product(id));

insert into cart values(1,"shirt","red",678,2,"img.jpg",546);
select * from cart;
delete from cart where id = 3;


drop table Cart;


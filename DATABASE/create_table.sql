CREATE TABLE users
( user_id int PRIMARY KEY,
  username varchar(25) NOT NULL,
  password varchar(30) NOT null,
  lastName varchar(255),
  firstName varchar(255),
  address varchar(255),
  city varchar(255),
  nation varchar(255),
  zip_code varchar(9)
  
  );
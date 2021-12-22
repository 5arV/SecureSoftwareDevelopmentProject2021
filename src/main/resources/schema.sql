drop table if exists users;
drop table if exists person;
drop table if exists cars;
drop table if exists comments;

create table users
(
    id       int          NOT NULL AUTO_INCREMENT,
    username varchar(255) not null,
    password varchar(255) not null,
    PRIMARY KEY (ID)
);

create table hashedUsers
(
    id           int          NOT NULL AUTO_INCREMENT,
    username     varchar(255) not null,
    passwordHash varchar(64)  not null,
    salt         varchar(64)  not null,
    totpKey      varchar(255) null,
    PRIMARY KEY (ID)
);

create table user_to_roles
(
    userId int NOT NULL,
    roleId int NOT NULL
);

create table roles
(
    id   int          NOT NULL,
    name varchar(255) NOT NULL,
    PRIMARY KEY (ID)
);

create table address
(
    id     int NOT NULL AUTO_INCREMENT,
    name   varchar(256),
    userId int,
    PRIMARY KEY (ID)
);

create table permissions
(
    id   int          NOT NULL,
    name varchar(255) NOT NULL,
    PRIMARY KEY (ID)
);

create table role_to_permissions
(
    roleId       int NOT NULL,
    permissionId int NOT NULL
);

create table delivery
(
    id           int     NOT NULL,
    isDone       boolean NOT NULL,
    userId       int     NOT NULL,
    restaurantId int     NOT NULL,
    addressId    int     NOT NULL,
    date         date    NOT NULL,
    comment      varchar(256),
    PRIMARY KEY (ID)
);

create table food
(
    id    int          NOT NULL,
    name  varchar(255) NOT NULL,
    price int          NOT NULL,
    PRIMARY KEY (ID)
);

create table restaurant_type
(
    id   int NOT NULL,
    name varchar(255),
    PRIMARY KEY (ID)
);

create table delivery_item
(
    id         int NOT NULL,
    amount     int NOT NULL,
    foodId     int NOT NULL,
    deliveryId int NOT NULL,
    PRIMARY KEY (ID)
);

create table restaurant
(
    id      int NOT NULL,
    name    varchar(255),
    address varchar(255),
    typeId  int NOT NULL,
    PRIMARY KEY (ID)
);

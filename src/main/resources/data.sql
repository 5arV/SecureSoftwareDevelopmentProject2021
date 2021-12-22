insert into users(id, username, password)
values (1, 'bruce', 'wayne'),
       (2, 'peter', 'security_rules'),
       (3, 'tom', 'guessmeifyoucan');

insert into hashedUsers(id, username, passwordHash, salt)
values (1, 'bruce', 'qw8Uxa2fXimKruS9wYEm4qm3ZaIGw/hJNvOG3PemhoA=', 'MEI4PU5hcHhaRHZz'),
       (2, 'peter', 'qPWryBEWiWdHsC+67dmO+y5ugGrMVI2w4MSz0+CpDm4=', 'MnY1am14c2d1ZlBf'),
       (3, 'tom', 'FLmYMYmwSRxcy0n2uwysy39ax0TRWvKHswSCPMo+PiI=', 'OChoOitAKWE0TWlD');

insert into address (id, name, userId)
values (1, 'Gotham City, Bat cave', 1 ),
       (2, 'Redwood', 2),
       (3, 'Batajnica, Srpskih vladara 25', 3);

insert into roles(id, name)
values (1, 'ADMIN'),
       (2, 'CUSTOMER'),
       (3, 'RESTAURANT');

insert into user_to_roles(userId, roleId)
values (1, 1),
       (2, 2),
       (3, 3);

insert into permissions(id, name)
values (1, 'CAR_LIST_VIEW'),
       (2, 'CAR_SEARCH'),
       (3, 'CAR_BUY'),
       (4, 'COMMENT_VIEW'),
       (5, 'COMMENT_ADD'),
       (6, 'CAR_DETAILS_VIEW'),
       (7, 'CAR_DETAILS_EDIT'),
       (8, 'USER_PROFILE_VIEW'),
       (9, 'USER_LIST_VIEW'),
       (10, 'USER_SEARCH'),
       (11, 'USER_PROMOTE_TO_SELLER'),
       (12, 'OWN_PROFILE_VIEW'),
       (13, 'OWN_PROFILE_EDIT'),
       (14, 'CAR_WHOLESALE_PRICE_VIEW');

insert into role_to_permissions(roleId, permissionId)
values (1, 1),
       (2, 1);


insert into delivery(id, isDone, userId, restaurantId, addressId, date, comment)
values (1, TRUE , 2, 1, 1, '2021-12-2', 'Hurry up I am hungry'),
       (2, FALSE, 2, 1, 1, '2021-12-31', 'Just leave it at the door'),
       (3, FALSE, 2, 1, 1, '2021-12-31', '');

insert into food(id, name, price, restaurantId)
values (1, 'cevapi', 750, 1),
       (2, 'pljeskavica', 600, 1),
       (3, 'kajmak', 100, 1),
       (4, 'svadbarski kupus', 400, 1),
       (5, 'becka snicla', 1000, 1),
       (6, 'pica margarita', 800, 2),
       (7, 'pica vesuvo', 900, 2),
       (8, 'pica quattro formaggi', 850, 2),
       (9, 'pica quattro stagioni', 850, 2),
       (10, 'pica kulen', 900, 2);

insert into restaurant_type(id, name)
values (1, 'restoran domace kuhinje'),
       (2, 'pica bar');

insert into restaurant(id, name, address, typeid)
values (1, 'Moj Zavicaj', 'Maksima Gorkog 12, Beograd', 1),
       (2, 'Pica industrija', 'Obilicev venac 5, Beograd', 2);

insert into delivery_item(id, amount, foodId, deliveryId)
values (1, 2, 1, 1),
       (2, 5, 3, 1),
       (3, 1, 4, 2),
       (4, 1, 5, 2),
       (5, 2, 10, 3);



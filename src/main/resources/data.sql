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
       (2, 'Beograd, Gazela', 1),
       (3, 'Beogradska industrija piva', 1),
       (4, 'Redwood', 2),
       (5, 'Trg Nikole Pasica 3', 2),
       (6, 'Batajnica, Srpskih vladara 25', 3);

insert into roles(id, name)
values (1, 'CUSTOMER');

insert into user_to_roles(userId, roleId)
values (1, 1),
       (2, 1),
       (3, 1);

insert into permissions(id, name)
values (1, 'ORDER_FOOD');

insert into role_to_permissions(roleId, permissionId)
values (1, 1),
       (2, 1);

insert into delivery(id, isDone, userId, restaurantId, addressId, date, comment)
values (1, TRUE , 2, 1, 1, '2021-12-2', 'Hurry up I am hungry'),
       (2, FALSE, 2, 1, 1, '2021-12-31', 'Just leave it at the door'),
       (3, FALSE, 2, 1, 1, '2021-12-31', '');

insert into food(id, name, price, restaurantId)
values (1, 'Cevapi', 750, 1),
       (2, 'Pljeskavica', 600, 1),
       (3, 'Kajmak', 100, 1),
       (4, 'Svadbarski kupus', 400, 1),
       (5, 'Becka snicla', 1000, 1),
       (6, 'Pizza Margaritha', 800, 2),
       (7, 'Pizza Vesuvio', 900, 2),
       (8, 'Pizza Quattro Formaggi', 850, 2),
       (9, 'Pizza Quattro Stagioni', 850, 2),
       (10, 'Pizza kulen', 900, 2);

insert into restaurant_type(id, name)
values (1, 'restoran domace kuhinje'),
       (2, 'pizza bar');

insert into restaurant(id, name, address, typeid)
values (1, 'Moj zavicaj', 'Maksima Gorkog 12, Beograd', 1),
       (2, 'Pizza industrija', 'Obilicev venac 5, Beograd', 2);

insert into delivery_item(id, amount, foodId, deliveryId)
values (1, 2, 1, 1),
       (2, 5, 3, 1),
       (3, 1, 4, 2),
       (4, 1, 5, 2),
       (5, 2, 10, 3);

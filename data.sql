USE user_db;

DROP TABLE IF EXISTS users;
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    firstName VARCHAR(12) NOT NULL,
    lastName VARCHAR(12) NOT NULL,
    email VARCHAR(255) NOT NULL,
    contrasena VARCHAR(12) NOT NULL,
    created_at DATETIME,
    updated_at DATETIME
);


insert into users(id, firstName, lastName, email, contrasena, created_at, updated_at) values (1, "Admin", "Admin", "admin@email.com", "admin1", '2024-03-01 08:00:00', '2024-03-01 08:00:00');
insert into users(id, firstName, lastName, email, contrasena, created_at, updated_at) values (2, "Johan", "Ospina", "johan@email.com", "johan1", '2024-03-01 08:00:00', '2024-03-01 08:00:00');
insert into users(id, firstName, lastName, email, contrasena, created_at, updated_at) values (3, "Maria", "Gonzalez", "maria@email.com", "maria123", '2024-03-01 08:00:00', '2024-03-01 08:00:00');
insert into users(id, firstName, lastName, email, contrasena, created_at, updated_at) values (4, "John", "Smith", "john@email.com", "smith456", '2024-03-01 09:15:00', '2024-03-01 09:15:00');
insert into users(id, firstName, lastName, email, contrasena, created_at, updated_at) values (5, "Laura", "Martinez", "laura@email.com", "laura789", '2024-03-01 10:30:00', '2024-03-01 10:30:00');
insert into users(id, firstName, lastName, email, contrasena, created_at, updated_at) values (6, "Ana", "Lopez", "ana@email.com", "ana123", '2024-03-01 11:45:00', '2024-03-01 11:45:00');
insert into users(id, firstName, lastName, email, contrasena, created_at, updated_at) values (7, "Carlos", "Rodriguez", "carlos@email.com", "carlos456", '2024-03-01 12:00:00', '2024-03-01 12:00:00');
insert into users(id, firstName, lastName, email, contrasena, created_at, updated_at) values (8, "Sofia", "Garcia", "sofia@email.com", "sofia789", '2024-03-01 13:15:00', '2024-03-01 13:15:00');
insert into users(id, firstName, lastName, email, contrasena, created_at, updated_at) values (9, "David", "Perez", "david@email.com", "david123", '2024-03-01 14:30:00', '2024-03-01 14:30:00');
insert into users(id, firstName, lastName, email, contrasena, created_at, updated_at) values (10, "Elena", "Sanchez", "elena@email.com", "elena456", '2024-03-01 15:45:00', '2024-03-01 15:45:00');
insert into users(id, firstName, lastName, email, contrasena, created_at, updated_at) values (11, "Pablo", "Martinez", "pablo@email.com", "pablo789", '2024-03-01 16:00:00', '2024-03-01 16:00:00');
insert into users(id, firstName, lastName, email, contrasena, created_at, updated_at) values (12, "Luisa", "Gutierrez", "luisa@email.com", "luisa123", '2024-03-01 17:15:00', '2024-03-01 17:15:00');
insert into users(id, firstName, lastName, email, contrasena, created_at, updated_at) values (13, "Diego", "Hernandez", "diego@email.com", "diego456", '2024-03-01 18:30:00', '2024-03-01 18:30:00');
insert into users(id, firstName, lastName, email, contrasena, created_at, updated_at) values (14, "Marta", "Fernandez", "marta@email.com", "marta789", '2024-03-01 19:45:00', '2024-03-01 19:45:00');
insert into users(id, firstName, lastName, email, contrasena, created_at, updated_at) values (15, "Pedro", "Lopez", "pedro@email.com", "pedro123", '2024-03-01 20:00:00', '2024-03-01 20:00:00');
insert into users(id, firstName, lastName, email, contrasena, created_at, updated_at) values (16, "Ana", "Gomez", "ana2@email.com", "ana456", '2024-03-01 21:15:00', '2024-03-01 21:15:00');
insert into users(id, firstName, lastName, email, contrasena, created_at, updated_at) values (17, "Antonio", "Martinez", "antonio@email.com", "antonio789", '2024-03-01 22:30:00', '2024-03-01 22:30:00');
insert into users(id, firstName, lastName, email, contrasena, created_at, updated_at) values (18, "Isabel", "Rodriguez", "isabel@email.com", "isabel123", '2024-03-01 23:45:00', '2024-03-01 23:45:00');
insert into users(id, firstName, lastName, email, contrasena, created_at, updated_at) values (19, "Gabriel", "Fernandez", "gabriel@email.com", "gabriel456", '2024-03-02 00:00:00', '2024-03-02 00:00:00');
insert into users(id, firstName, lastName, email, contrasena, created_at, updated_at) values (20, "Sara", "Gutierrez", "sara@email.com", "sara789", '2024-03-02 01:15:00', '2024-03-02 01:15:00');
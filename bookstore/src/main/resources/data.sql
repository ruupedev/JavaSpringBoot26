/* 
INSERT INTO category (name)
VALUES
('Horror'),
('Fiction'),
('Mystery');


INSERT INTO book (title, author, publication_year, isbn, price, category_id) 
VALUES 
('Mökkimaailma', 'Marison Manse', 1974, '978-951-45-0001-1', 12.99, 1),
('Kesäinen Polku', 'Aino Kallas', 1931, '978-951-45-0002-8', 9.99, 2),
('Järven Ranta', 'Väinö Linna', 1958, '978-951-45-0003-5', 14.99, 3);


INSERT INTO app_user (username, password, role) 
VALUES 
('user', '$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6', 'USER'),
('admin', '$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C', 'ADMIN');
 */
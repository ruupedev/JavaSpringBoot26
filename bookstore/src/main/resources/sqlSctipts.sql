DROP TABLE IF EXISTS book;
DROP TABLE IF EXISTS app_user;
DROP TABLE IF EXISTS category;

-- category-taulu
CREATE TABLE category (
    id BIGSERIAL PRIMARY KEY,
	name varchar(150) NOT NULL
);

INSERT INTO category (name)
VALUES
('Horror'),
('Fiction'),
('Mystery');

-- book-taulu
CREATE TABLE book (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(150) NOT NULL,
    author VARCHAR(150) NOT NULL,
    publication_year INT,
    isbn VARCHAR(20),
    price DECIMAL(10,2),
	category_id BIGINT REFERENCES category(id)
);

INSERT INTO book (title, author, publication_year, isbn, price, category_id) 
VALUES 
('Mökkimaailma', 'Marison Manse', 1974, '978-951-45-0001-1', 12.99, 1),
('Kesäinen Polku', 'Aino Kallas', 1931, '978-951-45-0002-8', 9.99, 2),
('Järven Ranta', 'Väinö Linna', 1958, '978-951-45-0003-5', 14.99, 3);

-- app_user-taulu
CREATE TABLE app_user (
    id BIGSERIAL PRIMARY KEY,
    username VARCHAR(150) NOT NULL,
	password VARCHAR(150) NOT NULL,
	role VARCHAR(150) NOT NULL
);

INSERT INTO app_user (username, password, role) 
VALUES 
('user', '$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6', 'USER'),
('admin', '$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C', 'ADMIN');


SELECT * FROM book
-- category-taulu
CREATE TABLE category (
    id BIGSERIAL PRIMARY KEY,
	name varchar(150) NOT NULL
);

-- book-taulu
CREATE TABLE book (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(150) NOT NULL,
    author VARCHAR(150) NOT NULL,
    publication_year INT,
    --isbn VARCHAR(20),
    --price DECIMAL(10,2),
	category_id BIGINT REFERENCES category(id)
);

-- app_user-taulu
CREATE TABLE app_user (
    id BIGSERIAL PRIMARY KEY,
    username VARCHAR(150) NOT NULL,
	password VARCHAR(150) NOT NULL,
	role VARCHAR(150) NOT NULL
);

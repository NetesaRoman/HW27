-- Создание схемы
CREATE SCHEMA IF NOT EXISTS my_shop;

-- Создание последовательности;
CREATE SEQUENCE IF NOT EXISTS my_shop.my_shop_seq;
CREATE SEQUENCE IF NOT EXISTS my_shop.client_seq;
-- Создание таблицы;
CREATE TABLE IF NOT EXISTS my_shop.client
(
    id serial PRIMARY KEY,
    name text,
    email text,
    phone text

);

CREATE TABLE IF NOT EXISTS my_shop.address
(
    id serial PRIMARY KEY,
    fk_client_id integer constraint data_source_fk_connection_id_fkey references my_shop.client,
    country text,
    city text,
    street text,
    house text
);







-- Создание таблицы;
CREATE TABLE IF NOT EXISTS my_shop.product
(
    id serial PRIMARY KEY,
    name text,
    description text,
    price double precision

);

CREATE TABLE IF NOT EXISTS my_shop.order
(
    id serial PRIMARY KEY,
    fk_client_id integer constraint data_source_fk_connection_id_fkey references my_shop.client

);

CREATE TABLE IF NOT EXISTS my_shop.order_item
(
    id serial PRIMARY KEY,
    fk_order_id integer constraint data_source_fk_connection_id_fkey references my_shop.order,
    fk_product_id integer constraint product_fkey references my_shop.product,
    count integer
);







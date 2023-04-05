DROP TABLE IF EXISTS books, users;

CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS users
(
    id UUID DEFAULT uuid_generate_v4(),
    login  VARCHAR(200) NOT NULL,
    password  VARCHAR(200) NOT NULL,
    firstName VARCHAR(200) NOT NULL,
    lastName VARCHAR(200) NOT NULL,
    email VARCHAR(200) NOT NULL,
    role VARCHAR(200),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS requests
(
    id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    description  VARCHAR(250),
    requestor_id BIGINT NOT NULL,
    created TIMESTAMP WITHOUT TIME ZONE,
    CONSTRAINT requests_users_id_fk FOREIGN KEY (requestor_id) REFERENCES users (id)
);

CREATE TABLE IF NOT EXISTS items
(
    id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description VARCHAR(250) NOT NULL,
    available BOOLEAN NOT NULL,
    owner_id BIGINT NOT NULL,
    request_id BIGINT,
    CONSTRAINT items_users_id_fk FOREIGN KEY (owner_id) REFERENCES users (id),
    CONSTRAINT items_requests_id_fk FOREIGN KEY (request_id) REFERENCES requests (id)
);

CREATE TABLE IF NOT EXISTS bookings
(
    id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    start_time TIMESTAMP  NOT NULL,
    end_time TIMESTAMP NOT NULL,
    item_id BIGINT NOT NULL,
    booker_id BIGINT NOT NULL,
    status VARCHAR(50) NOT NULL,
    CONSTRAINT bookings_items_id_fk FOREIGN KEY (item_id) REFERENCES items (id),
    CONSTRAINT bookings_users_id_fk FOREIGN KEY (booker_id) REFERENCES users (id)
);

CREATE TABLE IF NOT EXISTS comments
(
    id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    text VARCHAR(1000) NOT NULL,
    item_id   BIGINT NOT NULL,
    author_id BIGINT NOT NULL,
    created   TIMESTAMP WITHOUT TIME ZONE,
    CONSTRAINT comments_items_id_fk FOREIGN KEY (item_id) REFERENCES items (id),
    CONSTRAINT comments_users_id_fk FOREIGN KEY (author_id) REFERENCES users (id)
);
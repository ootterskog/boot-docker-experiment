DROP TABLE IF EXISTS customer;

CREATE TABLE customer (
  id        BIGINT PRIMARY KEY,
  firstname VARCHAR(30),
  lastname  VARCHAR(30),
  email     VARCHAR(30),
  UNIQUE (email)
);

DROP TABLE DOMAINS IF EXISTS;

CREATE TABLE DOMAINS
(
  ID BIGINT PRIMARY KEY NOT NULL IDENTITY,
  DOMAIN_DESC VARCHAR(255),
  DOMAIN_NAME VARCHAR(255)
);




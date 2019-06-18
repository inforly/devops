DROP TABLE IF EXISTS user_info;

CREATE TABLE user_info (
  id        VARCHAR(100) PRIMARY KEY NOT NULL,
  name      TEXT NOT NULL,
  gender    TEXT,
  email     TEXT,
  phone     TEXT);


INSERT INTO user_info (id, name, gender, email, phone)
VALUES ('1', 'John Snow', 'male', 'johnsnow@clouddemo.com', '12311212121');

INSERT INTO user_info (id, name, gender, email, phone)
VALUES ('2', 'Arya Stark', 'female','aryastark@clouddemo.com', '12312123434');

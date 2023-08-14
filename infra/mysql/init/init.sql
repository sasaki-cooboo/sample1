CREATE TABLE IF NOT EXISTS todos
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    status INT NOT NULL,
    title VARCHAR(50) NOT NULL,
    deadline DATE NOT NULL
);

INSERT INTO todos VALUES(null,2,'viewの表示','2023-08-11');
INSERT INTO todos VALUES(null,1,'mysqlの接続','2023-08-12');
INSERT INTO todos VALUES(null,1,'一覧表示','2023-08-13');
INSERT INTO todos VALUES(null,1,'追加機能','2023-08-14');
INSERT INTO todos VALUES(null,1,'更新機能','2023-08-15');
INSERT INTO todos VALUES(null,1,'dockerでアプリを起動させる','2023-08-16');
INSERT INTO todos VALUES(null,1,'デプロイ','2023-08-17');

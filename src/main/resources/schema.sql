CREATE TABLE IF NOT EXISTS tasks
(
    id
    BIGINT
    AUTO_INCREMENT
    PRIMARY
    KEY,
    name
    VARCHAR
(
    255
) NOT NULL,
    description VARCHAR
(
    255
),
    start_date DATE
    );

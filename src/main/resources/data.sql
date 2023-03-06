DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS accounts;

CREATE TABLE `customer` (
    `customer_id` int AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(100) NOT NULL,
    `email` VARCHAR(100) NOT NULL,
    `mobile_number` VARCHAR(20) NOT NULL,
    `create_dt` DATE DEFAULT NOT NULL
);

CREATE TABLE `accounts` (
    `customer_id` INT NOT NULL,
    `account_number` INT PRIMARY KEY,
    `account_type` VARCHAR(100) NOT NULL,
    `branch_address` VARCHAR(200) NOT NULL,
    `create_dt` DATE DEFAULT NULL
);

INSERT INTO `customer` (`name`, `email`, `mobile_number`, `create_dt`)
    VALUES ('Andrej', 'testemail@test', '544 145 123', CURRENT_DATE);

INSERT INTO `accounts` (`customer_id`, `account_number`, `account_type`, `branch_address`, `create_dt`)
    VALUES (1, 123456789, 'Savings', '123 Main Street, Melbourne', CURRENT_DATE)


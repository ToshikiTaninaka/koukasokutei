CREATE TABLE `users` (
    `user_id` SERIAL NOT NULL,
    `username` VARCHAR(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL UNIQUE,
    `password` VARCHAR(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
    `name` VARCHAR(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
    `job_name` VARCHAR(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
    `age` INT NOT NULL,
    `telephone_number` VARCHAR(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL UNIQUE,
    `mail_address` VARCHAR(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL UNIQUE, 
    PRIMARY KEY (`user_id`)
) ENGINE=InnoDB;

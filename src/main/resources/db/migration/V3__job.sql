CREATE TABLE `jobs` (
	`job_id` SERIAL NOT NULL,
	`job_name` VARCHAR(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`authority` TEXT NOT NULL,
	PRIMARY KEY (`job_id`)
) ENGINE=InnoDB;
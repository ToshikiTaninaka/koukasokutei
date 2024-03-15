CREATE TABLE `shifts` (
	`shift_id` SERIAL NOT NULL,
	`start_time` DATETIME NOT NULL,
	`end_time` DATETIME NOT NULL,
	PRIMARY KEY (`shift_id`)
) ENGINE=InnoDB;
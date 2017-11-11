CREATE TABLE `groupmicrofin`.`group_masters`(  
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'Autoincrement',
  `name` VARCHAR(40) NOT NULL,
  `country` VARCHAR(20),
  `town` VARCHAR(40),
  `pincode` VARCHAR(20),
  `login_id` VARCHAR(30),
  `email` VARCHAR(40),
  `password` VARCHAR(50),
  `audit_created_dttm` DATETIME,
  `audit_updated_dttm` DATETIME,
  PRIMARY KEY (`id`),
  INDEX (`login_id`)
);

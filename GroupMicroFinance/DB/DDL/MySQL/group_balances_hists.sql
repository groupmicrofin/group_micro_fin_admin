CREATE TABLE `groupmicrofin`.`group_balances_hists`( 
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `group_master_id` INT(30),
  `assessment_year` VARCHAR(20),
  `amt_share_fac_bal` INT(12),
  `amt_share_fac_bal_others` INT(12),
  `cycle_no`,INT(5),
  `dat_last_meeting` DATE,
  `dat_next_meeting` DATE,
  `last_activity_status`VARCHAR(20),
  `audit_created_dttm` DATETIME,
  `audit_updated_dttm` DATETIME,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_group_master_master_id` FOREIGN KEY (`group_master_id`) REFERENCES `groupmicrofin`.`group_masters`(`id`)
);

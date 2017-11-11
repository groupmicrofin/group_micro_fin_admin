CREATE TABLE `groupmicrofin`.`ln_masters`( 
 `id` INT(11) NOT NULL AUTO_INCREMENT,
 `group_master_id` INT(30),
 `group_member_id` INT(20),
 `ssessment_year`  VARCHAR(20),
 `cycle_no`        INT(2),
 `amt_ln_disb`     INT(10),
 `amt_def_installment`INT(12),
 `dat_ln_disb`  DATE,
 `garunter_ids` VARCHAR(12)

  PRIMARY KEY (`id`),
 
   CONSTRAINT `fk_group_master_master_id` FOREIGN KEY (`group_master_id`) REFERENCES `groupmicrofin`.`group_masters`(`id`),
    CONSTRAINT `fk_group_member_member_id` FOREIGN KEY (`group_member_id`) REFERENCES `groupmicrofin`.`group_members`(`id`)
  
);
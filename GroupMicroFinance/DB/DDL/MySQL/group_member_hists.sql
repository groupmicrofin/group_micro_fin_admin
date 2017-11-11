CREATE TABLE `groupmicrofin`.`group_member_hists`(  
  `id` INT NOT NULL AUTO_INCREMENT,
  `group_master_id` INT(20),
  `assessment_year` VARCHAR(20),
  `cycle_no` INT (12),
  `amt_pend_share`INT(10),
  `amt_paid_fee`INT(10),
  `amt_ln_disb`INT(10),
  `amt_ln_balance`INT(12),
  `no_active_ln`INT(12),
  `amt_accr_int`INT(12),
  `amt_paid_int`INT(12),
  `amt_paid_princ`INT(11),
  `amt_def_installment`INT(11),  
  `dat_last_lndisb`INT(12),                                                      
   PRIMARY KEY (`id`)
);
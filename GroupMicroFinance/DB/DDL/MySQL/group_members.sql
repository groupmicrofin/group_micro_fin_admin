CREATE TABLE `groupmicrofin`.`group_members`(  
  `id` INT NOT NULL AUTO_INCREMENT,
  `group_master_id` INT(20),
  `assessment_year` VARCHAR(20),
   `name` VARCHAR(40) NOT NULL,
  `login_id` VARCHAR(30),
  `email` VARCHAR(40),
  `password` VARCHAR(50),
  `mobile_no` INT(30),
  `birth_date`DATE,
  `kyc_id` INT(30),
  `amtpendShare`INT(10),
  `amtpaidFee`INT(10),
  `amtlnDisb`INT(10),
  `amtlnBalance`INT(12),
  `noactiveLn`INT(12),
  `amtaccrInt`INT(12),
  `amtpaidInt`INT(12),
  `amtpaidPrinc`INT(11),
  `amtdefInstallment`INT(11),  
  `datlastLnDisb`INT(12),                                                      
   PRIMARY KEY (`id`)
 
);
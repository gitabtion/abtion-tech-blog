CREATE TABLE `Tech`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `avatar` VARCHAR(45) NULL,
  `password` VARCHAR(45) NOT NULL,
  `signature` VARCHAR(45) NULL,
  `sex` VARCHAR(1) BINARY NOT NULL,
  `addOn` VARCHAR(45) NULL,
  `createAt` TIMESTAMP(6) NULL,
  `updateAt` TIMESTAMP(6) NULL,
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  PRIMARY KEY (`id`),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC),
  `type` INT NOT NULL );
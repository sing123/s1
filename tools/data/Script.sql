--<ScriptOptions statementTerminator=";"/>

ALTER TABLE `database`.`file` DROP PRIMARY KEY;

DROP TABLE `database`.`file`;

CREATE TABLE `database`.`file` (
	`uuid` VARCHAR(50) NOT NULL,
	`fileName` VARCHAR(2000),
	`filePath` VARCHAR(2000),
	`fileSize` VARCHAR(2000),
	`lastModify` DATE,
	`uri` VARCHAR(2000),
	PRIMARY KEY (`uuid`)
) ENGINE=InnoDB;


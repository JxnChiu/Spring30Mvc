SET search_path = spring30mvc;

DROP TABLE IF EXISTS member_account;

CREATE TABLE member_account (
	ID serial NOT NULL,
	EMAIL varchar(45) DEFAULT NULL,
	PASSWORD varchar(45) DEFAULT NULL,
	ADDRESS varchar(45) DEFAULT NULL,
	CELLPHONE varchar(45) DEFAULT NULL,
	--CREATE_DATE timestamp DEFAULT NULL,
	CONSTRAINT member_account_pkey PRIMARY KEY (ID)
)
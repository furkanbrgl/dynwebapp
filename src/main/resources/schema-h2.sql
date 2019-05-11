CREATE TABLE PUBLIC.T_OWNER(
    ID BIGINT NOT NULL,
    FIRST_NAME VARCHAR(255),
    LAST_NAME VARCHAR(255)
);
ALTER TABLE PUBLIC.T_OWNER ADD CONSTRAINT PUBLIC.CONSTRAINT_1 PRIMARY KEY(ID);

CREATE TABLE PUBLIC.T_MACHINE(
    ID BIGINT NOT NULL,
    NAME VARCHAR(255),
    BIRTH_DATE DATE,
    OWNER_ID BIGINT
);
ALTER TABLE PUBLIC.T_MACHINE ADD CONSTRAINT PUBLIC.CONSTRAINT_2 PRIMARY KEY(ID);

CREATE SEQUENCE PUBLIC.MACHINECLINIC_SEQUENCE START WITH 100;
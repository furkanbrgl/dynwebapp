INSERT INTO t_owner (id,first_name,last_name) VALUES (1, 'Alex', 'Bırq');
INSERT INTO t_owner (id,first_name,last_name) VALUES (2, 'Sanc', 'ASAL');
INSERT INTO t_owner (id,first_name,last_name) VALUES (3, 'Vura', 'Kalo');
INSERT INTO t_owner (id,first_name,last_name) VALUES (4, 'Lol', 'Muz');
INSERT INTO t_owner (id,first_name,last_name) VALUES (5, 'Maste', 'POA');
INSERT INTO t_owner (id,first_name,last_name) VALUES (6, 'Hado', 'DSU');
INSERT INTO t_owner (id,first_name,last_name) VALUES (7, 'Fura', 'PER');
INSERT INTO t_owner (id,first_name,last_name) VALUES (8, 'Oyra', 'Ers');
INSERT INTO t_owner (id,first_name,last_name) VALUES (9, 'Koza', 'Lop');
INSERT INTO t_owner (id,first_name,last_name) VALUES (10, 'Vilay', 'Qua');

INSERT INTO t_machine (id,name,birth_date,owner_id) VALUES (1, 'XAX1', '2005-09-07', 1);
INSERT INTO t_machine (id,name,birth_date,owner_id) VALUES (2, 'XAX2', '2008-08-06', 1);
INSERT INTO t_machine (id,name,birth_date,owner_id) VALUES (3, 'XAX3', '2001-04-17', 1);
INSERT INTO t_machine (id,name,birth_date,owner_id) VALUES (4, 'XAX4', '2009-03-07', 2);
INSERT INTO t_machine (id,name,birth_date,owner_id) VALUES (5, 'XAX5', '2010-11-30', 2);
INSERT INTO t_machine (id,name,birth_date,owner_id) VALUES (6, 'XAX6', '2010-01-20', 3);
INSERT INTO t_machine (id,name,birth_date,owner_id) VALUES (7, 'XAX7', '2008-09-04', 5);
INSERT INTO t_machine (id,name,birth_date,owner_id) VALUES (8, 'XAX8', '2008-09-04', 5);
INSERT INTO t_machine (id,name,birth_date,owner_id) VALUES (9, 'XAX9', '2007-08-06', 5);
INSERT INTO t_machine (id,name,birth_date,owner_id) VALUES (10, 'XAX10', '2009-02-24', 6);
INSERT INTO t_machine (id,name,birth_date,owner_id) VALUES (11, 'XAX11', '2000-03-09', 7);
INSERT INTO t_machine (id,name,birth_date,owner_id) VALUES (12, 'XAX12', '2000-06-24', 8);
INSERT INTO t_machine (id,name,birth_date,owner_id) VALUES (13, 'XAX13', '2002-06-08', 9);

--
INSERT INTO USERS VALUES('user1','{noop}secret',TRUE);
INSERT INTO USERS VALUES('user2','{noop}secret',TRUE);
INSERT INTO USERS VALUES('user3','{noop}secret',TRUE);

INSERT INTO AUTHORITIES VALUES('user1','ROLE_USER');
INSERT INTO AUTHORITIES VALUES('user2','ROLE_USER');
INSERT INTO AUTHORITIES VALUES('user2','ROLE_EDITOR');
INSERT INTO AUTHORITIES VALUES('user3','ROLE_USER');
INSERT INTO AUTHORITIES VALUES('user3','ROLE_ADMIN');
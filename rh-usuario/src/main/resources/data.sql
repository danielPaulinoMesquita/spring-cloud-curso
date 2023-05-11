INSERT INTO tb_user (name,email,password) values ('Nina Brown',
                                                  'nina@gmail.com',
                                                '$2a$12$PcaigDTTynIcSEcJQ8obqe1Wxo5RltmYPa5VDvXZy1xvxuSHhbtlS');
INSERT INTO tb_user (name,email,password) values ('Leia Red', 'leia@gmail.com','TGVpYSBSZWQ=');

INSERT INTO tb_role (role_name) values ('ROLE_OPERATOR');
INSERT INTO tb_role (role_name) values ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) values (1,2);
INSERT INTO tb_user_role (user_id, role_id) values (2,1);
INSERT INTO tb_user_role (user_id, role_id) values (2,2);




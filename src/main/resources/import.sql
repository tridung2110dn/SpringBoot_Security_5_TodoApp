-- Insert role
insert into role(name) values ('ROLE_USER')

-- Insert 2 users
insert into user (username, enabled, password, role_id) values ('ad', true, '$2a$10$6FlFASDAgHUNeAn4FokMYehNR1K7uCo2gEbhbTunQnPr.2Vor./pi', 1);
insert into user (username, enabled, password, role_id) values ('us', true, '$2a$10$piWP1JMtlYvHDTiPyVA4huO64ngCuIgCqC.eHdFcwz9JxLwBcgOHO', 1);

-- Insert tasks
insert into task (complete,description, user_id) values (true,'Code Task entity',1);
insert into task (complete,description, user_id) values (false,'Discuss users and roles',1);
insert into task (complete,description, user_id) values (false,'Enable Spring Security',2);
insert into task (complete,description, user_id) values (false,'Test application',2);
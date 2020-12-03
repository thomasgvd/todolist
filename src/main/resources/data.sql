INSERT INTO app_role (id, name) VALUES (1, 'ROLE_ADMIN');
INSERT INTO app_role (id, name) VALUES (2, 'ROLE_USER');

INSERT INTO app_user (user_name, password, active) VALUES ('admin', 'admin', true);
INSERT INTO app_user (user_name, password, active) VALUES ('user', 'user', true);

INSERT INTO user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO user_role (user_id, role_id) VALUES (2, 2);

INSERT INTO app_permission (id, name) VALUES (1, 'PERMISSION_USER_ADD');
INSERT INTO app_permission (id, name) VALUES (2, 'PERMISSION_USER_GET');
INSERT INTO app_permission (id, name) VALUES (3, 'PERMISSION_USER_DELETE');
INSERT INTO app_permission (id, name) VALUES (4, 'PERMISSION_TASK_OWN_ADD');
INSERT INTO app_permission (id, name) VALUES (5, 'PERMISSION_TASK_OWN_GET');
INSERT INTO app_permission (id, name) VALUES (6, 'PERMISSION_TASK_OWN_DELETE');
INSERT INTO app_permission (id, name) VALUES (7, 'PERMISSION_TASK_ALL_GET');
INSERT INTO app_permission (id, name) VALUES (8, 'PERMISSION_TASK_ALL_SHOW');
INSERT INTO app_permission (id, name) VALUES (9, 'PERMISSION_TASK_ALL_DELETE');

INSERT INTO role_permission (role_id, permission_id) VALUES (1, 1);
INSERT INTO role_permission (role_id, permission_id) VALUES (1, 2);
INSERT INTO role_permission (role_id, permission_id) VALUES (1, 3);
INSERT INTO role_permission (role_id, permission_id) VALUES (1, 4);
INSERT INTO role_permission (role_id, permission_id) VALUES (1, 5);
INSERT INTO role_permission (role_id, permission_id) VALUES (1, 6);
INSERT INTO role_permission (role_id, permission_id) VALUES (1, 7);
INSERT INTO role_permission (role_id, permission_id) VALUES (1, 8);
INSERT INTO role_permission (role_id, permission_id) VALUES (1, 9);
INSERT INTO role_permission (role_id, permission_id) VALUES (2, 1);
INSERT INTO role_permission (role_id, permission_id) VALUES (2, 2);
INSERT INTO role_permission (role_id, permission_id) VALUES (2, 3);
INSERT INTO role_permission (role_id, permission_id) VALUES (2, 4);
INSERT INTO role_permission (role_id, permission_id) VALUES (2, 5);
INSERT INTO role_permission (role_id, permission_id) VALUES (2, 6);
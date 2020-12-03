CREATE TABLE app_role (
    id BIGSERIAL NOT NULL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE app_user (
    id BIGSERIAL NOT NULL PRIMARY KEY,
    user_name VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    active BOOLEAN NOT NULL
);

CREATE TABLE app_permission (
    id BIGSERIAL NOT NULL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE user_role (
    user_id BIGINT NOT NULL REFERENCES app_user(id),
    role_id BIGINT NOT NULL REFERENCES app_role(id)
);

CREATE TABLE role_permission (
    role_id BIGINT NOT NULL REFERENCES app_role(id),
    permission_id BIGINT NOT NULL REFERENCES app_permission(id)
);

CREATE TABLE task (
    id BIGSERIAL NOT NULL PRIMARY KEY,
    description VARCHAR,
    user_id BIGINT NOT NULL REFERENCES app_user(id)
);
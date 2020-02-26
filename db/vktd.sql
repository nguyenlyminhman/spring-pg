-- Table: vktd.users

-- DROP TABLE vktd.users;

CREATE TABLE vktd.users
(
    id smallint NOT NULL DEFAULT nextval('vktd.nguoidung_id_seq'::regclass),
    "Firstname" text COLLATE pg_catalog."default",
    "Lastname" text COLLATE pg_catalog."default",
    "Email" text COLLATE pg_catalog."default",
    CONSTRAINT nguoidung_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE vktd.users
    OWNER to postgres;

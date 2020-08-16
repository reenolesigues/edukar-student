-- SEQUENCE: edukar.student_id_sequence

DROP SEQUENCE IF EXISTS edukar.student_id_sequence;

CREATE SEQUENCE IF NOT EXISTS edukar.student_id_sequence
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE edukar.student_id_sequence
    OWNER TO reenolesigues;

COMMENT ON SEQUENCE edukar.student_id_sequence
    IS 'sequence generator for student ID';
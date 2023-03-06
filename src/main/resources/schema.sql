DROP TABLE IF EXISTS student;
DROP TABLE IF EXISTS course;
CREATE TABLE student
(
    id        INTEGER PRIMARY KEY,
    name      VARCHAR(30) NOT NULL,
    email     VARCHAR(150),
    course_id INTEGER     NOT NULL,
    CONSTRAINT fk_course FOREIGN KEY (course_id) REFERENCES course (id)

);

CREATE TABLE course
(
    id   INTEGER PRIMARY KEY,
    name VARCHAR(30) NOT NULL UNIQUE
)

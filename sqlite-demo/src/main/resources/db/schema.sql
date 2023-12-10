DROP TABLE IF EXISTS `strategy`;
CREATE TABLE `strategy`
(
    `id`            INTEGER PRIMARY KEY, -- '策略id'
    `strategy_name` TEXT(50) NOT NULL    -- '策略名'
);

DROP TABLE IF EXISTS `student`;
CREATE TABLE student
(
    id        INTEGER PRIMARY KEY,
    name      TEXT NOT NULL,
    course_id INTEGER,
    score     REAL,
    FOREIGN KEY (course_id) REFERENCES course (id)
);

DROP TABLE IF EXISTS `course`;
CREATE TABLE course
(
    id   INTEGER PRIMARY KEY,
    name TEXT NOT NULL
);

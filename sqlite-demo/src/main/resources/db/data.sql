DELETE
FROM `strategy`;

INSERT INTO `strategy`(`id`, `strategy_name`)
VALUES (1, "range"),
       (2, "offset");
DELETE
FROM `course`;
INSERT INTO course (id, name)
VALUES (1, 'Mathematics'),
       (2, 'Physics');

DELETE
FROM `student`;
INSERT INTO student (id, name, course_id, score)
VALUES (1, 'Alice', 1, 90.5),
       (2, 'Bob', 2, 85.0);

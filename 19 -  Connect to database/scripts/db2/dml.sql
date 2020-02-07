/* Insert data */
INSERT INTO Student(name,last_name) VALUES ('nestor','aldana');
INSERT INTO Student(name,last_name) VALUES ('Juan','Perez');
INSERT INTO Student(name,last_name) VALUES ('Pedro','Gomez');
INSERT INTO Student(name,last_name) VALUES ('Douglas','Hernandez');
INSERT INTO Student(name,last_name) VALUES ('Nathaly','Alvarenga');
INSERT INTO Student(name,last_name) VALUES ('Elisa','Aldana');

/* Select */

select * from STUDENT;

/* UPDATE */

UPDATE STUDENT
set STUDENT.name ='Néstor',
    STUDENT.last_name='Aldana',
    STUDENT.UPDATED_AT= CURRENT_TIMESTAMP
WHERE "_id" = 1;

/* DELETE */
DELETE FROM STUDENT WHERE  NAME = 'Néstor';
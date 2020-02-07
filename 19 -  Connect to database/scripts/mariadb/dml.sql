/* Insert data */
INSERT INTO Student(name,last_name) VALUES ('nestor','aldana');
INSERT INTO Student(name,last_name) VALUES ('Juan','Perez');
INSERT INTO Student(name,last_name) VALUES ('Pedro','Gomez');
INSERT INTO Student(name,last_name) VALUES ('Douglas','Hernandez');
INSERT INTO Student(name,last_name) VALUES ('Nathaly','Alvarenga');
INSERT INTO Student(name,last_name) VALUES ('Elisa','Aldana');

/* Select */

select * from Student;

/* UPDATE */

UPDATE Student
set Student.name ='Néstor',
    Student.last_name='Aldana',
    Student.UPDATED_AT= CURRENT_TIMESTAMP
WHERE "_id" = 1;

/* DELETE */
DELETE FROM Student WHERE  NAME = 'Néstor';
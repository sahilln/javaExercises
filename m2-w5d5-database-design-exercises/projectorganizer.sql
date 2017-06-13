CREATE TABLE employee
(
employeeId SERIAL not null,
jobTitle varchar(64) not null,
lastName varchar(64) not null,
firstName varchar(64) not null,
gender varchar(20) not null,
birthday varchar(10) not null,
hireDate date not null

	CONSTRAINT pk_employeeId PRIMARY KEY (employeeId)

);

CREATE TABLE department
(
departmentId SERIAL not null,
departmentName varchar(128) not null,
employeeId int not null

	CONSTRAINT pk_departmentId PRIMARY KEY (departmentId)
	CONSTRAINT fk_employeeId FOREIGN KEY (employeeId) REFERENCES employee(employeeId)
);

CREATE TABLE project 
(
projectId SERIAL not null,
projectName varchar(128) not null,
startDate date not null,
employeeId int not null

	CONSTRAINT projectId PRIMARY KEY (projectId)
	CONSTRAINT fk_employeeId FOREIGN KEY (employeeId) REFERENCES employee(employeeId)
);

CREATE TABLE employee_on_project
(
employeeId int not null,
projectId int not null,

	CONSTRAINT pk_employeeProject_employeeId_projectId PRIMARY KEY (employeeId, projectId),
	CONSTRAINT fk_employeeId FOREIGN KEY (employeeId) REFERENCES employee(employeeId),
	CONSTRAINT fk_projectId FOREIGN KEY (projectId) REFERENCES project(projectId)
);

CREATE TABLE employee_in_department
(
employeeId int not null,
departmentId int not null,

	CONSTRAINT pk_employeeDept_employeeId_departmentId PRIMARY KEY (employeeId, departmentId),
	CONSTRAINT fk_employeeId FOREIGN KEY (employeeId) REFERENCES employee(employeeId),
	CONSTRAINT fk_departmentId FOREIGN KEY (departmentId) REFERENCES department(departmentId)
);

INSERT INTO employee (employeeId, firstName, lastName, jobTitle, gender, birthday, hireDate) VALUES (1, 'Elon', 'Musk', 'CEO', 'male', '1970-05-03', '2009-07-27');
INSERT INTO employee (employeeId, firstName, lastName, jobTitle, gender, birthday, hireDate) VALUES (2, 'Bob, 'James', 'Vice-President', 'male', '1998-03-04', '2015-04-29');
INSERT INTO employee (employeeId, firstName, lastName, jobTitle, gender, birthday, hireDate) VALUES (3, 'Mike', 'Jones', 'Wall Watcher', 'male', '1990-05-25', '2013-12-12');
INSERT INTO employee (employeeId, firstName, lastName, jobTitle, gender, birthday, hireDate) VALUES (4, 'Luda', 'Cris', 'Window Washer', null, '1992-07-13', '2014-06-24');
INSERT INTO employee (employeeId, firstName, lastName, jobTitle, gender, birthday, hireDate) VALUES (5, 'Snoop', 'Dogg', 'Snack Tester', 'male', '1973-07-03', '2005-03-25');
INSERT INTO employee (employeeId, firstName, lastName, jobTitle, gender, birthday, hireDate) VALUES (6, 'Dr', 'Dre', 'Nurse', 'female', '1944-09-24', '1978-09-14');
INSERT INTO employee (employeeId, firstName, lastName, jobTitle, gender, birthday, hireDate) VALUES (7, 'Bobby', 'Mack', 'Spaceman', 'female', '1986-11-25', '2017-05-29');
INSERT INTO employee (employeeId, firstName, lastName, jobTitle, gender, birthday, hireDate) VALUES (8, 'Jim', 'John', 'Wallet Stealer', 'female', '1997-06-01', '2015-06-02');

INSERT INTO department (departmentId, departmentName) VALUES (1, 'Balloons');
INSERT INTO department (departmentId, departmentName) VALUES (2, 'Bubbles');
INSERT INTO department (departmentId, departmentName) VALUES (3, 'Burgers');

INSERT INTO project (projectId, projectName, startDate) VALUES (1, 'Balloons', '1965-10-13');
INSERT INTO project (projectId, projectName, startDate) VALUES (2, 'Bubbles', '2006-05-05');
INSERT INTO project (projectId, projectName, startDate) VALUES (3, 'Burgers', '1980-06-01');
INSERT INTO project (projectId, projectName, startDate) VALUES (4, 'Titan', '1956-05-02');

INSERT INTO employee_on_project (employeeId, projectId) VALUES (1, 4);
INSERT INTO employee_on_project (employeeId, projectId) VALUES (2, 1);
INSERT INTO employee_on_project (employeeId, projectId) VALUES (3, 2);
INSERT INTO employee_on_project (employeeId, projectId) VALUES (4, 3);
INSERT INTO employee_on_project (employeeId, projectId) VALUES (5, 2);
INSERT INTO employee_on_project (employeeId, projectId) VALUES (6, 1);
INSERT INTO employee_on_project (employeeId, projectId) VALUES (7, 4);
INSERT INTO employee_on_project (employeeId, projectId) VALUES (8, 3);

INSERT INTO employee_in_department (employeeId, departmentId) VALUES (1, 3);
INSERT INTO employee_in_department (employeeId, departmentId) VALUES (2, 2);
INSERT INTO employee_in_department (employeeId, departmentId) VALUES (3, 1);
INSERT INTO employee_in_department (employeeId, departmentId) VALUES (4, 1);
INSERT INTO employee_in_department (employeeId, departmentId) VALUES (5, 2);
INSERT INTO employee_in_department (employeeId, departmentId) VALUES (6, 3);
INSERT INTO employee_in_department (employeeId, departmentId) VALUES (7, 2);
INSERT INTO employee_in_department (employeeId, departmentId) VALUES (8, 3);
CREATE TABLE IF NOT EXISTS offices (
   office_id INT  AUTO_INCREMENT,
   address VARCHAR(150) NOT NULL,
   city VARCHAR(50) NOT NULL,
   PRIMARY KEY (office_id)
);

CREATE TABLE IF NOT EXISTS employees (
   employee_id INT  AUTO_INCREMENT,
   first_name VARCHAR(50) NOT NULL,
   last_name VARCHAR(50) NOT NULL,
   job_title VARCHAR(50) ,
   salary DECIMAL(10,2) ,
   hire_date DATE DEFAULT (CURRENT_DATE),
   office_id INT,
   CONSTRAINT FK_Office_id FOREIGN KEY (office_id)
      REFERENCES offices(office_id),
   PRIMARY KEY (employee_id)
);

INSERT INTO offices (address, city) VALUES
('03 Reinke Trail', 'Cincinnati'),
('5507 Becker Terrace', 'New York City'),
('54 Northland Court', 'Richmond'),
('08 South Crossing', 'Cincinnati'),
('553 Maple Drive', 'Minneapolis'),
('23 North Plaza', 'Aurora'),
('9658 Wayridge Court', 'Boise'),
('9 Grayhawk Trail', 'New York City'),
('16862 Westend Hill', 'Knoxville'),
('4 Bluestem Parkway', 'Savannah');

INSERT INTO employees (first_name, last_name, job_title, salary, office_id) VALUES
('Yovonnda', 'Magrannell', 'Executive Secretary', 63996, 10),
('Darcy', 'Nortunen', 'Account Executive', 62871, 1),
('Sayer', 'Matterson', 'Statistician III', 98926, 1),
('Mindy', 'Crissil', 'Staff Scientist', 94860, 1),
('Keriann', 'Alloisi', 'VP Marketing', 110150, 1),
('North', 'de Clerc', 'VP Product Management', 114257, 2),
('Elladine', 'Rising', 'Social Worker', 96767, 2),
('Nisse', 'Voysey', 'Financial Advisor', 52832, 2),
('Guthrey', 'Iacopetti', 'Office Assistant I', 117690, 3),
('Kass', 'Hefferan', 'Computer Systems Analyst IV', 96401, 3),
('Virge', 'Goodrum', 'Information Systems Manager', 54578, 3),
('Mirilla','Janowski','Cost Accountant' ,119241 ,3),
('Lynde', 'Aronson', 'Junior Executive', 77182, 4),
('Mildrid', 'Sokale', 'Geologist II', 67987, 4),
('Hazel', 'Tarbert', 'General Manager', 93760, 4),
('Cole', 'Kesterton', 'Pharmacist', 86119, 4),
('Theresa', 'Binney', 'Food Chemist', 47354, 5),
('Estrellita','Daleman','Staff Accountant IV' ,70187 ,5),
('Ivy','Fearey','Structural Engineer' ,92710 ,5),
('Alaster','Scutchin','Assistant Professor' ,32179 ,2),
('Newarcy','Nortunen','Account Executive' ,62300 ,1),
('NewSayer','Matterson','Statistician III' ,79926 ,1),
('NewMindy','Crissil','Staff Scientist' ,33860 ,1),
('NewKeriann','Alloisi','VP Marketing' ,70150 ,1),
('NewNorth','de Clerc','VP Product Management' ,100257 ,2)
;

INSERT INTO 
employees (first_name, last_name, job_title, salary, office_id) VALUES
('NewElladine','Rising','Social Worker' ,96767 ,null),
('NewNisse','Voysey','Financial Advisor' ,52832 ,null),
('NewGuthrey','Iacopetti','Office Assistant I' ,117690 ,null),
('NewKass','Hefferan','Computer Systems Analyst IV' ,96401 ,null);
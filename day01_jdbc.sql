CREATE TABLE countries(
        id int NOT NULL,
        phone_code int NOT NULL,
        country_code char(2) NOT NULL,
        country_name varchar(80) NOT NULL
    );


    INSERT INTO countries VALUES(1, 93, 'AF', 'Afghanistan');
    INSERT INTO countries VALUES(2, 355, 'AL', 'Albania');
    INSERT INTO countries VALUES(3, 213, 'DZ', 'Algeria');
    INSERT INTO countries VALUES(4, 54, 'AR', 'Argentina');
    INSERT INTO countries VALUES(5, 61, 'AU', 'Australia');
    INSERT INTO countries VALUES(6, 43, 'AT', 'Austria');
    INSERT INTO countries VALUES(7, 994, 'AZ', 'Azerbaijan');
    INSERT INTO countries VALUES(8, 1242, 'BS', 'Bahamas');
    INSERT INTO countries VALUES(9, 32, 'BE', 'Belgium');
    INSERT INTO countries VALUES(10, 387, 'BA', 'Bosnia and Herzegovina');
    INSERT INTO countries VALUES(11, 55, 'BR', 'Brazil');
    INSERT INTO countries VALUES(12, 359, 'BG', 'Bulgaria');
    INSERT INTO countries VALUES(13, 226, 'BF', 'Burkina Faso');
    INSERT INTO countries VALUES(14, 237, 'CM', 'Cameroon');
    INSERT INTO countries VALUES(15, 1, 'CA', 'Canada');
    INSERT INTO countries VALUES(16, 236, 'CF', 'Central African Republic');
    INSERT INTO countries VALUES(17, 86, 'CN', 'China');
    INSERT INTO countries VALUES(18, 57, 'CO', 'Colombia');
    INSERT INTO countries VALUES(19, 53, 'CU', 'Cuba');
    INSERT INTO countries VALUES(20, 45, 'DK', 'Denmark');
    INSERT INTO countries VALUES(21, 1809, 'DO', 'Dominican Republic');
    INSERT INTO countries VALUES(22, 20, 'EG', 'Egypt');
    INSERT INTO countries VALUES(23, 503, 'SV', 'El Salvador');
    INSERT INTO countries VALUES(24, 240, 'GQ', 'Equatorial Guinea');
    INSERT INTO countries VALUES(25, 251, 'ET', 'Ethiopia');
    INSERT INTO countries VALUES(26, 358, 'FI', 'Finland');
    INSERT INTO countries VALUES(27, 33, 'FR', 'France');
    INSERT INTO countries VALUES(28, 220, 'GM', 'Gambia');
    INSERT INTO countries VALUES(29, 49, 'DE', 'Germany');
    INSERT INTO countries VALUES(30, 233, 'GH', 'Ghana');
    INSERT INTO countries VALUES(31, 502, 'GT', 'Guatemala');
    INSERT INTO countries VALUES(32, 852, 'HK', 'Hong Kong');
    INSERT INTO countries VALUES(33, 91, 'IN', 'India');
    INSERT INTO countries VALUES(34, 62, 'ID', 'Indonesia');
    INSERT INTO countries VALUES(35, 964, 'IQ', 'Iraq');
    INSERT INTO countries VALUES(36, 39, 'IT', 'Italy');
    INSERT INTO countries VALUES(37, 81, 'JP', 'Japan');
    INSERT INTO countries VALUES(38, 7, 'KZ', 'Kazakhstan');
    INSERT INTO countries VALUES(39, 82, 'KR', 'Korea, Republic of');
    INSERT INTO countries VALUES(40, 261, 'MG', 'Madagascar');
    INSERT INTO countries VALUES(41, 960, 'MV', 'Maldives');
    INSERT INTO countries VALUES(42, 31, 'NL', 'Netherlands');
    INSERT INTO countries VALUES(43, 507, 'PA', 'Panama');
    INSERT INTO countries VALUES(44, 63, 'PH', 'Philippines');
    INSERT INTO countries VALUES(45, 65, 'SG', 'Singapore');
    INSERT INTO countries VALUES(46, 90, 'TR', 'Turkey');
    INSERT INTO countries VALUES(47, 44, 'GB', 'United Kingdom');
    INSERT INTO countries VALUES(48, 1, 'US', 'United States');
    INSERT INTO countries VALUES(49, 58, 'VE', 'Venezuela');
    INSERT INTO countries VALUES(50, 263, 'ZW', 'Zimbabwe');

SELECT * FROM countries;


SELECT country_name FROM countries
WHERE id BETWEEN 3 AND 9;


CREATE TABLE developers (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    salary REAL,
    prog_lang VARCHAR(20)
  );

  -- Insert 20 random records into the table
  INSERT INTO developers (name, salary, prog_lang) VALUES
    ('John Smith', 5000.00, 'Java'),
    ('Alice Johnson', 6000.00, 'Python'),
    ('Mike Wilson', 4500.00, 'JavaScript'),
    ('Emily Thompson', 5500.00, 'C#'),
    ('David Lee', 4800.00, 'Ruby'),
    ('Sarah Davis', 5200.00, 'Java'),
    ('Michael Brown', 5900.00, 'Python'),
    ('Jennifer Miller', 4700.00, 'JavaScript'),
    ('Christopher Anderson', 5100.00, 'C#'),
    ('Jessica Martinez', 5600.00, 'Ruby'),
    ('Matthew Taylor', 5200.00, 'Java'),
    ('Amanda Garcia', 6000.00, 'Python'),
    ('Robert Clark', 4500.00, 'JavaScript'),
    ('Laura Adams', 4800.00, 'C#'),
    ('Daniel Wilson', 5400.00, 'Ruby'),
    ('Lauren Allen', 4900.00, 'Java'),
    ('Andrew Wright', 5700.00, 'Python'),
    ('Samantha Hill', 4600.00, 'JavaScript'),
    ('William Turner', 5300.00, 'C#'),
    ('Olivia Cook', 5500.00, 'Ruby');


CREATE TABLE students(
      id int,
      name varchar(50),
      city varchar(50),
      grade int,
      department varchar(20)
    );


    INSERT INTO students VALUES(100, 'Ahmet Umit', 'İstanbul', 546, 'Comp.Eng.');
    INSERT INTO students VALUES(101, 'R.Nuri Tekin', 'Antalya', 486, 'Management');
    INSERT INTO students VALUES(102, 'S.Faik Faruk', 'Bursa', 554, 'Comp.Eng.');
    INSERT INTO students VALUES(103, 'Yasar Kemal', 'İstanbul', 501, 'Mathematics');
    INSERT INTO students VALUES(104, 'Halide E. Adivar', 'İzmir', 473, 'Psychology');
    INSERT INTO students VALUES(105, 'Nazan Bekir', 'İzmir', 432, 'Literature');
    INSERT INTO students VALUES(106, 'Peyami Safa', 'Antalya', 535, 'Comp.Eng.');
    INSERT INTO students VALUES(107, 'Sabahattin Ali', 'İstanbul', 492, 'Mathematics');
	INSERT INTO students VALUES(108, 'John Smith', 'Texas', 432, 'Comp.Eng.');
	INSERT INTO students VALUES(109, 'Jane Smith', 'Washington DC', 340, 'Literature');
	INSERT INTO students VALUES(110, 'Asye Ahmet', 'Istanbul', 410, 'Psychology');

CREATE TABLE departments(
          dept_id int,
          department varchar(20),
          pass_grade int,
          campus varchar(20)
        );

        INSERT INTO departments VALUES(5001, 'Comp.Eng.', 521,'North');
        INSERT INTO departments VALUES(5002, 'Mathematics', 455,'South');
        INSERT INTO departments VALUES(5003, 'Psychology', 440,'Hisar');
        INSERT INTO departments VALUES(5004, 'Management', 465,'Hisar');
        INSERT INTO departments VALUES(5005, 'Literature', 420,'North');



SELECT * FROM countries;
SELECT * FROM developers;
SELECT * FROM students;
SELECT * FROM departments;


SELECT name, grade, students.department 
	FROM students
	JOIN departments
	ON students.department = departments.department
	WHERE students.grade > departments.pass_grade;

-- Task 1: -- Update salaries of developers whose salaries are less than average salary with average salary


UPDATE devlopers
	SET salary = (SELECT AVG(salary) FROM developers
	WHERE salary > (SELECT	AVG(salary) FROM developers));












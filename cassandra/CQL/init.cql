create keyspace "employee_keyspace" with replication = {'class': 'SimpleStrategy', 'replication_factor': 1};

use employee_keyspace;

create TYPE address(type text, address_Line_1 text, address_Line_2 text, city text, state text, pinCode int, country text);

CREATE TABLE employee_keyspace.employee (
	id int,
	first_Name text,
	last_Name text,
	department text,
	list_address frozen <list<address>>,
 	PRIMARY KEY(id)
);

insert into employee (id, first_Name , last_Name , department, list_address  )values (1,'Virat', 'Kohli', 'Sports',[{type: 'primary', address_Line_1: 'No-1 Street name', address_Line_2: 'Second line address', city: 'Coimbatore', state: 'TN', pincode: 641047, country:'INDIA'}]);

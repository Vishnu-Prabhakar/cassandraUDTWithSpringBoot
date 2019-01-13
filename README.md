# cassandraUDTWithSpringBoot
Spring boot application with Cassanda UDT implementation

Spring boot version is 2.1.2

UDT implementation is with the relation between employee and address table:
	 - An emplpyee can have multiple number of address like primary and secondary
	 - So Address is created as TYPE in cassandra and associated with employee table
	 
Before starting the spring boot application, make sure the following

cassandra instance is up and running with the keyspace mentioned available in it
make use of init.cql available in the resources folder
At the end, access the api point with the url: http://localhost:8080/getEmployee

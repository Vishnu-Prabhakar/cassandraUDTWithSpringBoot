package com.example.cassandraudt.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.example.cassandraudt.model.Employee;

@Repository
public interface IEmployeeRepository extends CassandraRepository<Employee, Integer>{
}

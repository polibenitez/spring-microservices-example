package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by zadik on 29/05/17.
 */
public interface EmployeeRepository extends
        MongoRepository<Employee, String> {
}

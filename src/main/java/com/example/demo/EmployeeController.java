package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zadik on 29/05/17.
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Employee create(@RequestBody Employee employee){

        Employee result = employeeRepository.save(employee);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value="/{employeeId}")
    public Employee get(@PathVariable String employeeId){
        return employeeRepository.findOne(employeeId);
    }


}
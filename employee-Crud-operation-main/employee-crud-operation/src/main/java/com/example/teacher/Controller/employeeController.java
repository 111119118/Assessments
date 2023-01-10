package com.example.teacher.Controller;

import com.example.teacher.Model.Teacher;
import com.example.teacher.Service.teacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/employee")
@RestController
public class employeeController {

    @Autowired
    public employeeService employeeService;

    @GetMapping("/list")
    public ResponseEntity<List<Employee>> getAllemployee()
    {
        try {
            return new ResponseEntity<>(employeeService.getAllemployee(), HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Optional<Employee>> getProduct(@PathVariable("id") String employeeid)
    {
        try {
            return new ResponseEntity<>(employeeService.getEmployee(employeeid),HttpStatus.FOUND);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }


    }

    @GetMapping("/employee/{email}")
    public ResponseEntity<List<Employee>> getemployee(@PathVariable("email") String email)
    {
        try
        {
            return new ResponseEntity<>(employeeService.getemployee(email),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping("/list/add")
    public ResponseEntity<Employee> Addteacher(@RequestBody Employee employee)
    {
        try
        {
            return new ResponseEntity<>(employeeService.Addteacher(employee),HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }

    }

    @PutMapping("/list/{id}")
    public ResponseEntity<String> updateProduct(@RequestBody Employee employee, @PathVariable("id") String employeeid)
    {
        try
        {
            return new ResponseEntity<>(employeeService.updateEmployee(employee,employeeid),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }

    }

    @DeleteMapping("/list/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") String employeeid)
    {
        try
        {
        	employeeService.deleteEmployee(employeeid);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(employeeid+" was deleted",HttpStatus.OK);
    }
}

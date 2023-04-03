package com.neosoft.controller;

import com.neosoft.entities.NeoSoftEmployee;
import com.neosoft.feigncommunication.NeosoftDepartment;
import com.neosoft.service.INeoSoftEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("${employee-service-version}/employee")
public class NeoSoftEmployeeController {

    @Autowired
    private INeoSoftEmployeeService neoSoftEmployeeService;

    @GetMapping("/get-all-employee")
    public List<NeoSoftEmployee> getAllEmployee(){
        return this.neoSoftEmployeeService.fetchAllEmployee();
    }

    @GetMapping("/get-employee-by-id/{emp_id}")
    public NeoSoftEmployee getEmployeeById(@PathVariable("emp_id") Integer emp_id){
        return this.neoSoftEmployeeService.fetchEmployeeById(emp_id);
    }

    @GetMapping(value="/get-employee-by-dept/{dept_id}")
    public NeosoftDepartment getEmployeeDepartment(@PathVariable("dept_id") Integer dept_id){
        return this.neoSoftEmployeeService.fetchEmployeeDepartment(dept_id);
    }

}
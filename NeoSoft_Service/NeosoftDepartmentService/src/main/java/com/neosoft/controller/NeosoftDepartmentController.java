package com.neosoft.controller;

import com.neosoft.entities.NeososftDepartment;
import com.neosoft.service.INeosoftDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("${department-service-version}/department")
public class NeosoftDepartmentController {
    @Autowired
    private INeosoftDepartmentService neosoftDepartmentService;

    @GetMapping(value = "/get-all-department")
    public List<NeososftDepartment> fetchAllDepartments(){

        return neosoftDepartmentService.fetchAllDepartments();
    }

    @GetMapping(value = "/get-department-by-id/{dept_id}")
    public NeososftDepartment fetchDepartmentById(@PathVariable("dept_id") Integer dept_id){
        return neosoftDepartmentService.fetchDepartmentById(dept_id);
    }

}

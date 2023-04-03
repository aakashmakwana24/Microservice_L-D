package com.neosoft.service;

import com.neosoft.entities.NeososftDepartment;
import org.springframework.stereotype.Service;

import java.util.List;


public interface INeosoftDepartmentService {
    public List<NeososftDepartment> fetchAllDepartments();
    public NeososftDepartment fetchDepartmentById(Integer dept_id);


}

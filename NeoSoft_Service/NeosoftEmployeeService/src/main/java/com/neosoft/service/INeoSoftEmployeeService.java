package com.neosoft.service;

import com.neosoft.entities.NeoSoftEmployee;
import com.neosoft.feigncommunication.NeosoftDepartment;

import java.util.List;

public interface INeoSoftEmployeeService {
    public List<NeoSoftEmployee> fetchAllEmployee();
    public NeoSoftEmployee fetchEmployeeById (Integer emp_id);
    public NeosoftDepartment fetchEmployeeDepartment(Integer dept_id);

}

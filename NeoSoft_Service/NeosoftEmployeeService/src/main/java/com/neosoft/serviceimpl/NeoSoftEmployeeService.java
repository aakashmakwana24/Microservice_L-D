package com.neosoft.serviceimpl;

import com.neosoft.entities.NeoSoftEmployee;
import com.neosoft.feigncommunication.INeoSoftDepartmentService;
import com.neosoft.feigncommunication.NeosoftDepartment;
import com.neosoft.service.INeoSoftEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NeoSoftEmployeeService implements INeoSoftEmployeeService {
    @Autowired
    private INeoSoftDepartmentService neoSoftDepartmentService;
    @Override
    public List<NeoSoftEmployee> fetchAllEmployee() {
        return List.of(new NeoSoftEmployee(1, "Aakash Makwana", "aakash@gmail.com", "Java"),
                new NeoSoftEmployee(2, "Shreyash Kashyap", "shreyash@gmail.com", "Java"),
                new NeoSoftEmployee(3, "Akshat Jain", "akshat@gmail.com", "Java"));
    }

    @Override
    public NeoSoftEmployee fetchEmployeeById(Integer emp_id) {
        return new NeoSoftEmployee(2, "Shreyash Kashyap", "shreyash@gmail.com", "Java");
    }

    @Override
    public NeosoftDepartment fetchEmployeeDepartment(Integer dept_id) {

        return this.neoSoftDepartmentService.fetchDepartmentById(dept_id);

    }
}

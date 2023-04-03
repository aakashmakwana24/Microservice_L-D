package com.neosoft.serviceimpl;

import com.neosoft.entities.NeososftDepartment;
import com.neosoft.service.INeosoftDepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class NeosoftDepartmentServiceImpl implements INeosoftDepartmentService {
    @Override
    public List<NeososftDepartment> fetchAllDepartments() {
        return List.of(new NeososftDepartment(1,"Java",350,"Harvey Specter"),
                new NeososftDepartment(2,".NET",325,"Louis Litt"),
                new NeososftDepartment(3,".JS",300,"Mike Ross"),
                new NeososftDepartment(4,".BlockChain",295,"Travis Tanner"));
    }

    @Override
    public NeososftDepartment fetchDepartmentById(Integer dept_id) {
        log.info("got hit from employee service");
        return new NeososftDepartment(1,"Java",350,"Harvey Specter");
    }
}

package com.neosoft.feigncommunication;

import com.neosoft.feignconfiguration.NeoSoftFeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "NEOSOFT-DEPARTMENT-SERVICE", configuration = NeoSoftFeignConfiguration.class)
public interface INeoSoftDepartmentService {

    @GetMapping(value = "/v1.0/department/get-department-by-id/{dept_id}")
    public NeosoftDepartment fetchDepartmentById(@PathVariable("dept_id") Integer dept_id);

}

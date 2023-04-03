package com.neosoft.feigncommunication;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NeosoftDepartment {
    @JsonProperty("department id")
    private Integer ndsDepartmentId;
    @JsonProperty("department name")
    private String ndsDepartmentName;
    @JsonProperty("total employee")
    private Integer ndsTotalEmployee;
    @JsonProperty("department HOD")
    private  String ndsDepartmentHod;

}

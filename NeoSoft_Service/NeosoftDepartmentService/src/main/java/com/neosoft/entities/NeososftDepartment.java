package com.neosoft.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NeososftDepartment {
    @JsonProperty("department id")
    private Integer ndsDepartmentId;
    @JsonProperty("department name")
    private String ndsDepartmentName;
    @JsonProperty("total employee")
    private Integer ndsTotalEmployee;
    @JsonProperty("department HOD")
    private String ndsDepartmentHod;

}

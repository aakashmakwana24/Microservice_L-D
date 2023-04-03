package com.neosoft.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NeoSoftEmployee {
    @JsonProperty("employee id")
    private Integer nesEmployeeId;
    @JsonProperty("employee name")
    private String nesEmployeeName;
    @JsonProperty("employee email")
    private String nesEmployeeEmail;
    @JsonProperty("department name")
    private String nesDepartmentName;

}

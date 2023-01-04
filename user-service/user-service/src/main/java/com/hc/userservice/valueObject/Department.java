package com.hc.userservice.valueObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

	private Integer dept_Id;

	private String dept_Name;

	private String dept_Address;

	private String dept_Code;

}

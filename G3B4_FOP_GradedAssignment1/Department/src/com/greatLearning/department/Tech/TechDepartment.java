package com.greatLearning.department.tech;

import com.greatLearning.department.Super.SuperDepartment;

public class TechDepartment extends SuperDepartment{

	@Override
	public String departmentName() {
		
		return "Tech Department" ;
	}

	@Override
	public String getTodaysWork() {
		 return "Complete coding of Module 1";
	}

	@Override
	public String getWorkDeadline() {
		 return "Complete by EOD";
	}
	
	public String getTechStackInformation() {
		
		return "Core Java";
	}

}

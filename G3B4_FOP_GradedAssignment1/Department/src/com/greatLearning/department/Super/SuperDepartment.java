package com.greatLearning.department.Super;

public class SuperDepartment implements IDepartment {

	@Override
	public String departmentName() {
		return "Super Department";
	}

	@Override
	public String getTodaysWork() {
		return "No work as of now";
	}

	@Override
	public String getWorkDeadline() {
		return "Nil";
	}

	@Override
	public String isTodayAHoliday() {
		return "Today is not a Holiday";
	}
	
	

}

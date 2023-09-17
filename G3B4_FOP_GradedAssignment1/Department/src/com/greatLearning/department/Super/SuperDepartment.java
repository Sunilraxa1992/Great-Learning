package com.greatLearning.department.Super;

public class SuperDepartment implements IDepartment {

	@Override
	public String departmentName() {
		// TODO Auto-generated method stub
		return "Super Department";
	}

	@Override
	public String getTodaysWork() {
		// TODO Auto-generated method stub
		return "No work as of now";
	}

	@Override
	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		return "Nil";
	}

	@Override
	public String isTodayAHoliday() {
		// TODO Auto-generated method stub
		return "Today is not a Holiday";
	}
	
	

}

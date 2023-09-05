package com.greatLearning.email.service;

import com.greatLearning.email.model.Employee;

public interface I_Credential_Service {

	public void generateEmail(Employee employee);
	public void generatePassword(Employee employee);
	public void showCredentials(Employee employee);
}

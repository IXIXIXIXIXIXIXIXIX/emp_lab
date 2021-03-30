package com.example.codeclan.employeeapp;

import com.example.codeclan.employeeapp.models.Department;
import com.example.codeclan.employeeapp.models.Employee;
import com.example.codeclan.employeeapp.models.Project;
import com.example.codeclan.employeeapp.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.codeclan.employeeapp.repositories.DepartmentRepository;
import com.example.codeclan.employeeapp.repositories.EmployeeRepository;

@SpringBootTest
class EmployeeappApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Department department = new Department("Safety");
		departmentRepository.save(department);

		Employee homer = new Employee("Homer", "Simpson", department);
		employeeRepository.save(homer);

		Project project = new Project("Blow Up Power Plant", 3);
		projectRepository.save(project);

		project.addEmployeeToProject(homer);
		projectRepository.save(project);


	}
}

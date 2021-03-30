package com.example.codeclan.employeeapp.repositories;

import com.example.codeclan.employeeapp.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

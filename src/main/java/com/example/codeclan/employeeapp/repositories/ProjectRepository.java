package com.example.codeclan.employeeapp.repositories;

import com.example.codeclan.employeeapp.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}

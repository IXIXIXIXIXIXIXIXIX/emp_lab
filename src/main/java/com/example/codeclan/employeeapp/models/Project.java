package com.example.codeclan.employeeapp.models;

import org.hibernate.annotations.Cascade;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;

    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "employees_projects",
            joinColumns = {
                    @JoinColumn(
                            name = "project_id",
                            nullable = false,
                            updatable = false
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "employee_id",
                            nullable = false,
                            updatable = false
                    )
            }
    )
    private List<Employee> employees;

    @Column(name = "duration")
    private int duration;

    public Project(String name, int duration) {
        this.name = name;
        this.duration = duration;
        this.employees = new ArrayList<>();
    }

    public Project() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void addEmployeeToProject(Employee employee){
        this.employees.add(employee);
    }
}

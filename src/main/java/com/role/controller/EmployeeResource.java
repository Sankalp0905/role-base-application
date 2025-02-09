package com.role.controller;


import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/employees")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeResource {

    // Mock database for simplicity
    private List<Employee> employees = List.of(
            new Employee(1, "John Doe", "Software Engineer"),
            new Employee(2, "Jane Smith", "HR Manager")
    );

    @GET
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @POST
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}


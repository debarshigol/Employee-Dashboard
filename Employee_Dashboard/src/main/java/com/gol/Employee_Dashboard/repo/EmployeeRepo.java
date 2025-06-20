package com.gol.Employee_Dashboard.repo;

import com.gol.Employee_Dashboard.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository <Employee, Long> {
}

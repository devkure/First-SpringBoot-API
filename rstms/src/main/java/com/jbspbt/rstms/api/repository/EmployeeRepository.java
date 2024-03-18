package com.jbspbt.rstms.api.repository;
import com.jbspbt.rstms.api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Możemy dodać własne metody jeśli potrzebujemy dodatkowej funkcjonalności
}

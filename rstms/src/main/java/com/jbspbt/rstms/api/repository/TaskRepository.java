package com.jbspbt.rstms.api.repository;
import com.jbspbt.rstms.api.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
    // Możemy dodać własne metody jeśli potrzebujemy dodatkowej funkcjonalności
}

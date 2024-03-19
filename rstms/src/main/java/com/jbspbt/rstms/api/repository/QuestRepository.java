package com.jbspbt.rstms.api.repository;
import com.jbspbt.rstms.api.model.Employee;
import com.jbspbt.rstms.api.model.Task;
import com.jbspbt.rstms.api.model.Quest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestRepository extends JpaRepository<Quest, Integer> {
    // Możemy dodać własne metody jeśli potrzebujemy dodatkowej funkcjonalności
}

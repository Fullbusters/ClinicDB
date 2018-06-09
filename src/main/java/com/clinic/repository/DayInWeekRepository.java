package com.clinic.repository;

import com.clinic.models.DayInWeek;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayInWeekRepository extends JpaRepository<DayInWeek, Long> {
}

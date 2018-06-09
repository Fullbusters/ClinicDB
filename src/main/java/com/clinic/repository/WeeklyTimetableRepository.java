package com.clinic.repository;

import com.clinic.models.WeeklyTimetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeeklyTimetableRepository extends JpaRepository<WeeklyTimetable, Long> {
}

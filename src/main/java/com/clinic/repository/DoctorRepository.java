package com.clinic.repository;

import com.clinic.models.Doctor;
import com.clinic.models.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    @Query(value = "SELECT * FROM doctor  WHERE Specialty_Id =?1", nativeQuery = true)
    List<Doctor> findBySpecialtyid( Long id);
}

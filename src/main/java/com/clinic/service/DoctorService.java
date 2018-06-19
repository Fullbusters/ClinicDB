package com.clinic.service;

import com.clinic.models.Doctor;
import com.clinic.models.Specialty;
import com.clinic.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor findOne(Long id){
        return doctorRepository.findOne(id);
    }
    public List<Doctor> findAll(){
        return doctorRepository.findAll();
    }
    public Doctor save(Doctor doctor){
        return doctorRepository.save(doctor);
    }
    public void delete(Long id){
        doctorRepository.delete(id);
    }
    public List<Doctor> findBySpecialtyid(Long id ){
        return doctorRepository.findBySpecialtyid(id);
    }

}

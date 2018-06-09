package com.clinic.service;

import com.clinic.models.Doctor;
import com.clinic.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void save(Doctor doctor){
        doctorRepository.save(doctor);
    }
    public void delete(Long id){
        doctorRepository.delete(id);
    }

}

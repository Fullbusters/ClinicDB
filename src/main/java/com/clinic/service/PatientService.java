package com.clinic.service;

import com.clinic.models.Patient;
import com.clinic.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public Patient findOne(Long id){
        return patientRepository.findOne(id);
    }
    public List<Patient> findAll(){
        return patientRepository.findAll();
    }
    public void save(Patient patient){
        patientRepository.save(patient);
    }
    public void delete(Long id){
        patientRepository.delete(id);
    }
}

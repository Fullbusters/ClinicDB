package com.clinic.service;

import com.clinic.models.Specialty;
import com.clinic.repository.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialtyService {

    @Autowired
    private SpecialtyRepository specialtyRepository;

    public Specialty findOne(Long id){
        return specialtyRepository.findOne(id);
    }
    public List<Specialty> findAll(){
        return specialtyRepository.findAll();
    }
    public void save(Specialty specialty){
        specialtyRepository.save(specialty);
    }
    public void delete(Long id){
        specialtyRepository.delete(id);
    }
}

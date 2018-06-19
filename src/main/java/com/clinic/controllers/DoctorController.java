package com.clinic.controllers;


import com.clinic.models.Doctor;
import com.clinic.models.Specialty;
import com.clinic.models.User;
import com.clinic.service.DoctorService;
import com.clinic.service.SpecialtyService;
import com.clinic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private SpecialtyService specialtyService;

    @Autowired
    private UserService userService;

    @CrossOrigin
    @RequestMapping( method = RequestMethod.GET)
    public List<Doctor> getAll(){
        return doctorService.findAll();
    }

    @CrossOrigin
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Doctor getOne(@PathVariable long id){
        return doctorService.findOne(id);
    }

    @CrossOrigin
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public Doctor getOneByUser(@PathVariable long id){
        User user= userService.findOne(id);
        return user.getDoctor();
    }

    @CrossOrigin
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long id){
        doctorService.delete(id);
    }

    @CrossOrigin
    @RequestMapping( method = RequestMethod.POST)
    public void save(@RequestBody Doctor doctor){
        doctorService.save(doctor);
    }

    @CrossOrigin
    @RequestMapping( method = RequestMethod.PUT)
    public void update(@RequestBody Doctor doctor){
        doctorService.save(doctor);
    }

    @CrossOrigin
    @RequestMapping( value = "/spec/{id}", method = RequestMethod.GET)
    public List<Doctor> getAllBySpecialty(@PathVariable long id){
        return doctorService.findBySpecialtyid(id);
    }

    @CrossOrigin
    @RequestMapping( value = "/spec/{id}", method = RequestMethod.PUT)
    public Doctor updateDoctor(@PathVariable long id,@RequestBody long specid){
        Doctor doctor = doctorService.findOne(id);
        Specialty specialty = specialtyService.findOne(specid);
        doctor.setSpecialty(specialty);
        return doctorService.save(doctor);
    }
}

package com.clinic.controllers;


import com.clinic.models.Patient;
import com.clinic.models.User;
import com.clinic.service.PatientService;
import com.clinic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @Autowired
    private UserService userService;

    @CrossOrigin
    @RequestMapping( method = RequestMethod.GET)
    public List<Patient> getAll(){
        return patientService.findAll();
    }

    @CrossOrigin
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Patient getOne(@PathVariable long id){
        return patientService.findOne(id);
    }

    @CrossOrigin
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public Patient getOneByUser(@PathVariable long id){
        User user=userService.findOne(id);
        return user.getPatient();
    }

    @CrossOrigin
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long id){
        patientService.delete(id);
    }

    @CrossOrigin
    @RequestMapping( method = RequestMethod.PUT)
    public void save(@RequestBody Patient patient){
        patientService.save(patient);
    }
}

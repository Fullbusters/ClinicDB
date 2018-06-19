package com.clinic.controllers;

import com.clinic.models.Specialty;
import com.clinic.service.SpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/specialty")
public class SpecialtyController {

    @Autowired
    private SpecialtyService specialtyService;

    @CrossOrigin
    @RequestMapping( method = RequestMethod.GET)
    public List<Specialty> getAll(){
        return specialtyService.findAll();
    }

    @CrossOrigin
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Specialty getOne(@PathVariable long id){
        return specialtyService.findOne(id);
    }

    @CrossOrigin
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long id){
        specialtyService.delete(id);
    }

    @CrossOrigin
    @RequestMapping( method = RequestMethod.POST)
    public void save(@RequestBody Specialty specialty){
        specialtyService.save(specialty);
    }
}

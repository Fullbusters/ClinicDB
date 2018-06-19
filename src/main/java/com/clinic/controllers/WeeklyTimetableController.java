package com.clinic.controllers;


import com.clinic.models.Doctor;
import com.clinic.models.WeeklyTimetable;
import com.clinic.service.DoctorService;
import com.clinic.service.WeeklyTimetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class WeeklyTimetableController {

    @Autowired
    private WeeklyTimetableService weeklyTimetableService;

    @Autowired
    private DoctorService doctorService;

    @CrossOrigin
    @RequestMapping(value = "/weeklytimetable", method = RequestMethod.GET)
    public List<WeeklyTimetable> GetAll()  {
        return weeklyTimetableService.findAll();
    }

    @CrossOrigin
    @RequestMapping(value = "/weeklytimetable", method = RequestMethod.PUT)
    public WeeklyTimetable updateDay(@RequestBody WeeklyTimetable weeklyTimetable, @RequestBody String s)  {
        System.out.println(s);
        System.out.println(weeklyTimetable);
        return weeklyTimetableService.save(weeklyTimetable);
    }
    @CrossOrigin
    @RequestMapping(value = "/weeklytimetable/{id}", method = RequestMethod.POST)
    public WeeklyTimetable saveDay(@RequestBody WeeklyTimetable weeklyTimetable, @PathVariable long id)  {
        Doctor doctor = doctorService.findOne(id);
        System.out.println(doctor);
        weeklyTimetable.setDoctor(doctor);
        return weeklyTimetableService.save(weeklyTimetable);
    }


}



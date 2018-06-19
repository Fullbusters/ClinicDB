package com.clinic.service;

import com.clinic.models.WeeklyTimetable;
import com.clinic.repository.WeeklyTimetableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeeklyTimetableService {

    @Autowired
    private WeeklyTimetableRepository weeklyTimetableRepository;

    public WeeklyTimetable findOne(Long id){
        return weeklyTimetableRepository.findOne(id);
    }
    public List<WeeklyTimetable> findAll(){
        return weeklyTimetableRepository.findAll();
    }
    public WeeklyTimetable save(WeeklyTimetable weeklyTimetable){
        return  weeklyTimetableRepository.save(weeklyTimetable);
    }
    public void delete(Long id){
        weeklyTimetableRepository.delete(id);
    }
}

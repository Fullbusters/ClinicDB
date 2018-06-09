package com.clinic.service;

import com.clinic.models.Calendar;
import com.clinic.repository.CalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalendarService {

    @Autowired
    private CalendarRepository calendarRepository;

    public Calendar findOne(Long id){
        return calendarRepository.findOne(id);
    }
    public List<Calendar> findAll(){
        return calendarRepository.findAll();
    }
    public void save(Calendar calendar){
        calendarRepository.save(calendar);
    }
    public void delete(Long id){
        calendarRepository.delete(id);
    }
}

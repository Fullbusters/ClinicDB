package com.clinic.service;

import com.clinic.models.DayInWeek;
import com.clinic.repository.DayInWeekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DayInWeekService {

    @Autowired
    private DayInWeekRepository dayInWeekRepository;

    public DayInWeek findOne(Long id){
        return dayInWeekRepository.findOne(id);
    }
    public List<DayInWeek> findAll(){
        return dayInWeekRepository.findAll();
    }
    public void save(DayInWeek dayInWeek){
        dayInWeekRepository.save(dayInWeek);
    }
    public void delete(Long id){
        dayInWeekRepository.delete(id);
    }
}

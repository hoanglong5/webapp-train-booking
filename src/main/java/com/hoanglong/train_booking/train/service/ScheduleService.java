package com.hoanglong.train_booking.train.service;

import com.hoanglong.train_booking.train.entity.Schedule;
import com.hoanglong.train_booking.train.service.entityservice.ScheduleEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ScheduleService {
    private final ScheduleEntityService dao;
    public List<Schedule> FindAllSchedule(){
        return dao.FindALl();
    }
    public Schedule FindSchedule(UUID uuid){
        return dao.FindById(uuid);
    }
    public void DeleteSchedule(UUID uuid){
        dao.DeleteById(uuid);
    }
    public void SaveSchedule(Schedule schedule){
        dao.Save(schedule);
    }
    public void UpdateSchedule(UUID uuid,Schedule schedule){
        Schedule schedule2Update = dao.FindById(uuid);
        schedule2Update.setName(schedule.getName());
        dao.Save(schedule2Update);
    }
}

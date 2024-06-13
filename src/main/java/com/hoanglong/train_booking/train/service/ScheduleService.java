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
    private final ScheduleEntityService scheduleEntityService;
    public List<Schedule> FindAllSchedule(){
        return scheduleEntityService.FindALl();
    }
    public Schedule FindSchedule(UUID uuid){
        return scheduleEntityService.FindById(uuid);
    }
    public void DeleteSchedule(UUID uuid){
        scheduleEntityService.DeleteById(uuid);
    }
    public void SaveSchedule(Schedule schedule){
        scheduleEntityService.Save(schedule);
    }
    public void UpdateSchedule(UUID uuid,Schedule updatedSchedule){
        Schedule schedule = scheduleEntityService.FindById(uuid);
        schedule.setName(updatedSchedule.getName());
        scheduleEntityService.Save(schedule);
    }
}

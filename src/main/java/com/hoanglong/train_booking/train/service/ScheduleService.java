package com.hoanglong.train_booking.train.service;

import com.hoanglong.train_booking.train.entity.Schedule;
import com.hoanglong.train_booking.train.service.entityservice.ScheduleEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
//@RequiredArgsConstructor
public class ScheduleService {
    private static final String SCHEDULE_CACHE_KEY = "SCHEDULE::";
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Autowired
    private ScheduleEntityService scheduleEntityService;
    public List<Schedule> FindAllSchedule(){
        return scheduleEntityService.FindALl();
    }
    public Schedule FindSchedule(UUID uuid){
        return scheduleEntityService.FindById(uuid);
    }
    public Schedule getSchedule(UUID scheduleId) {
        String cacheKey = SCHEDULE_CACHE_KEY + scheduleId;
        Schedule schedule = (Schedule) redisTemplate.opsForValue().get(cacheKey);
        if (schedule == null) {
            Optional<Schedule> scheduleOpt = Optional.ofNullable(scheduleEntityService.FindById(scheduleId));
            if (scheduleOpt.isPresent()) {
                schedule = scheduleOpt.get();
                redisTemplate.opsForValue().set(cacheKey, schedule, 10, TimeUnit.MINUTES);
            }
        }
        return schedule;
    }
    public void DeleteSchedule(UUID uuid){
        scheduleEntityService.DeleteById(uuid);
    }
    public Schedule SaveSchedule(Schedule schedule){
        Schedule savedSchedule = scheduleEntityService.Save(schedule);
        redisTemplate.opsForValue().set(SCHEDULE_CACHE_KEY + savedSchedule.getScheduleId(), schedule, 10,TimeUnit.MINUTES);
        return savedSchedule;
    }
    public void UpdateSchedule(UUID uuid,Schedule updatedSchedule){
        Schedule schedule = scheduleEntityService.FindById(uuid);
        schedule.setName(updatedSchedule.getName());
        scheduleEntityService.Save(schedule);
    }
}

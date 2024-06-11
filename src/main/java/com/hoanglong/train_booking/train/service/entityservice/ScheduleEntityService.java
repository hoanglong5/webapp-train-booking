package com.hoanglong.train_booking.train.service.entityservice;

import com.hoanglong.train_booking.base.service.BaseEntityService;
import com.hoanglong.train_booking.train.entity.Schedule;
import com.hoanglong.train_booking.train.repository.ScheduleRepository;
import org.springframework.stereotype.Service;

@Service
public class ScheduleEntityService extends BaseEntityService<Schedule, ScheduleRepository> {
    public ScheduleEntityService(ScheduleRepository dao) {
        super(dao);
    }
}

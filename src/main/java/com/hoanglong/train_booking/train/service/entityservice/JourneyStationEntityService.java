package com.hoanglong.train_booking.train.service.entityservice;

import com.hoanglong.train_booking.base.service.BaseEntityService;
import com.hoanglong.train_booking.train.entity.JourneyStation;
import com.hoanglong.train_booking.train.repository.JourneyStationRepository;
import org.springframework.stereotype.Service;

@Service
public class JourneyStationEntityService extends BaseEntityService<JourneyStation,JourneyStationRepository> {
    public JourneyStationEntityService(JourneyStationRepository dao) {
        super(dao);
    }
}

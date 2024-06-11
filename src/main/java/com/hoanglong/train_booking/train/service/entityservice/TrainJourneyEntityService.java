package com.hoanglong.train_booking.train.service.entityservice;

import com.hoanglong.train_booking.base.service.BaseEntityService;
import com.hoanglong.train_booking.train.entity.TrainJourney;
import com.hoanglong.train_booking.train.repository.TrainJourneyRepository;
import org.springframework.stereotype.Service;

@Service
public class TrainJourneyEntityService extends BaseEntityService<TrainJourney, TrainJourneyRepository> {
    public TrainJourneyEntityService(TrainJourneyRepository dao) {
        super(dao);
    }
}

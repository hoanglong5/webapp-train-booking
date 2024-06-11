package com.hoanglong.train_booking.train.service.entityservice;

import com.hoanglong.train_booking.base.service.BaseEntityService;
import com.hoanglong.train_booking.train.entity.TrainStation;
import com.hoanglong.train_booking.train.repository.TrainStationRepository;
import org.springframework.stereotype.Service;

@Service
public class TrainStationEntityService extends BaseEntityService<TrainStation, TrainStationRepository> {
    public TrainStationEntityService(TrainStationRepository dao) {
        super(dao);
    }
}

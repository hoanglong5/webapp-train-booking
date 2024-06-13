package com.hoanglong.train_booking.carriage.service.entityservice;

import com.hoanglong.train_booking.base.service.BaseEntityService;
import com.hoanglong.train_booking.carriage.entity.CarriageClass;
import com.hoanglong.train_booking.carriage.repository.CarriageClassRepository;
import org.springframework.stereotype.Service;

@Service
public class CarriageClassEntityService extends BaseEntityService<CarriageClass, CarriageClassRepository> {
    public CarriageClassEntityService(CarriageClassRepository dao) {
        super(dao);
    }
}

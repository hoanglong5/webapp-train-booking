package com.hoanglong.train_booking.carriage.service.entityservice;

import com.hoanglong.train_booking.base.service.BaseEntityService;
import com.hoanglong.train_booking.carriage.entity.CarriagePrice;
import com.hoanglong.train_booking.carriage.repository.CarriagePriceRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CarriagePriceEntityService extends BaseEntityService<CarriagePrice, CarriagePriceRepository> {

    public CarriagePriceEntityService(CarriagePriceRepository dao) {
        super(dao);
    }
}

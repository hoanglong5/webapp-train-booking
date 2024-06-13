package com.hoanglong.train_booking.booking.service.entityservice;

import com.hoanglong.train_booking.base.service.BaseEntityService;
import com.hoanglong.train_booking.booking.entity.Passenger;
import com.hoanglong.train_booking.booking.repository.PassengerRepository;
import org.springframework.stereotype.Service;

@Service
public class PassengerEntityService extends BaseEntityService<Passenger, PassengerRepository> {
    public PassengerEntityService(PassengerRepository dao) {
        super(dao);
    }
}

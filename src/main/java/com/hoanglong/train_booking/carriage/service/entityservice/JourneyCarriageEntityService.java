package com.hoanglong.train_booking.carriage.service.entityservice;

import com.hoanglong.train_booking.base.service.BaseEntityService;
import com.hoanglong.train_booking.carriage.entity.JourneyCarriage;
import com.hoanglong.train_booking.carriage.repository.JourneyCarriageRepository;
import org.springframework.stereotype.Service;

@Service
public class JourneyCarriageEntityService extends BaseEntityService<JourneyCarriage, JourneyCarriageRepository> {
    public JourneyCarriageEntityService(JourneyCarriageRepository dao) {
        super(dao);
    }
}

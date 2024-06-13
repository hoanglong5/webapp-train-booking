package com.hoanglong.train_booking.booking.service.entityservice;

import com.hoanglong.train_booking.base.service.BaseEntityService;
import com.hoanglong.train_booking.booking.entity.Booking;
import com.hoanglong.train_booking.booking.repository.BookingRepository;
import org.springframework.stereotype.Service;

@Service
public class BookingEntityService extends BaseEntityService<Booking, BookingRepository> {
    public BookingEntityService(BookingRepository dao) {
        super(dao);
    }
}

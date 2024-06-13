package com.hoanglong.train_booking.booking.service.entityservice;

import com.hoanglong.train_booking.base.service.BaseEntityService;
import com.hoanglong.train_booking.booking.entity.BookingStatus;
import com.hoanglong.train_booking.booking.repository.BookingStatusRepository;
import org.springframework.stereotype.Service;
@Service
public class BookingStatusEntityService extends BaseEntityService<BookingStatus, BookingStatusRepository> {
    public BookingStatusEntityService(BookingStatusRepository dao) {
        super(dao);
    }
}

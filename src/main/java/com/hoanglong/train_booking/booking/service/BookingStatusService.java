package com.hoanglong.train_booking.booking.service;

import com.hoanglong.train_booking.booking.entity.BookingStatus;
import com.hoanglong.train_booking.booking.service.entityservice.BookingStatusEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BookingStatusService {
    private final BookingStatusEntityService bookingStatusEntityService;
    public List<BookingStatus> FindAllBookingStatus(){
        return bookingStatusEntityService.FindALl();
    }
    public BookingStatus FindBookingStatus(UUID uuid){
        return bookingStatusEntityService.FindById(uuid);
    }
    public void DeleteBookingStatus(UUID uuid){
        bookingStatusEntityService.DeleteById(uuid);
    }
    public void SaveBookingStatus(BookingStatus journeyStation){
        bookingStatusEntityService.Save(journeyStation);
    }
    public void UpdateBookingStatus(UUID id,BookingStatus updatedBookingStatus){
        BookingStatus bookingStatus = bookingStatusEntityService.FindById(id);
        bookingStatus.setBookingStatusName(updatedBookingStatus.getBookingStatusName());
        bookingStatusEntityService.Save(bookingStatus);
    }
}

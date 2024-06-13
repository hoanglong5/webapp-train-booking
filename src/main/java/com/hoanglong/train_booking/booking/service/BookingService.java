package com.hoanglong.train_booking.booking.service;

import com.hoanglong.train_booking.booking.entity.Booking;
import com.hoanglong.train_booking.booking.service.entityservice.BookingEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BookingService {
    private final BookingEntityService bookingEntityService;
    public List<Booking> FindAllBooking(){
        return bookingEntityService.FindALl();
    }
    public Booking FindBooking(UUID uuid){
        return bookingEntityService.FindById(uuid);
    }
    public void DeleteBooking(UUID uuid){
        bookingEntityService.DeleteById(uuid);
    }
    public void SaveBooking(Booking journeyStation){
        bookingEntityService.Save(journeyStation);
    }
    public void UpdateBooking(UUID id, Booking updatedBooking) {
        Booking booking = bookingEntityService.FindById(id);
        booking.setBookingStatus(updatedBooking.getBookingStatus());
        booking.setBookingDate(updatedBooking.getBookingDate());
        booking.setStartStation(updatedBooking.getStartStation());
        booking.setEndStation(updatedBooking.getEndStation());
        booking.setTrainJourney(updatedBooking.getTrainJourney());
        booking.setCarriageClass(updatedBooking.getCarriageClass());
        booking.setAmountPaid(updatedBooking.getAmountPaid());
        booking.setTicketNo(updatedBooking.getTicketNo());
        booking.setSeatNo(updatedBooking.getSeatNo());
        bookingEntityService.Save(booking);
    }
}

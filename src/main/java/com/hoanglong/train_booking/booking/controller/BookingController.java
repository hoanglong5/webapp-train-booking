package com.hoanglong.train_booking.booking.controller;

import com.hoanglong.train_booking.base.controller.RestResponse;
import com.hoanglong.train_booking.booking.entity.Booking;
import com.hoanglong.train_booking.booking.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
@RestController
@RequestMapping("/api/${version}/booking")
@RequiredArgsConstructor
public class BookingController {
    private final BookingService bookingService;
    @GetMapping()
    public ResponseEntity<RestResponse<List<Booking>>> FindAllBooking(){
        List<Booking> bookings = bookingService.FindAllBooking();
        return ResponseEntity.ok(RestResponse.of(bookings));
    }
    @GetMapping("/{id}")
    public ResponseEntity<RestResponse<Booking>> FindBooking(@RequestParam UUID id){
        Booking bookings = bookingService.FindBooking(id);
        return ResponseEntity.ok(RestResponse.of(bookings));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<RestResponse<?>> DeleteBooking(@RequestParam UUID id){
        bookingService.DeleteBooking(id);
        return ResponseEntity.ok(RestResponse.empty());
    }
    @PostMapping()
    public ResponseEntity<RestResponse<?>> SaveBooking(@RequestBody Booking booking){
        bookingService.SaveBooking(booking);
        return ResponseEntity.ok(RestResponse.empty());
    }
    @PutMapping("/{id}")
    public ResponseEntity<RestResponse<?>> UpdateBooking(@RequestBody Booking booking,@RequestParam UUID id){
        bookingService.UpdateBooking(id,booking);
        return ResponseEntity.ok(RestResponse.empty());
    }
}

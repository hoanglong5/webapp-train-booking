package com.hoanglong.train_booking.booking.controller;

import com.hoanglong.train_booking.base.controller.RestResponse;
import com.hoanglong.train_booking.booking.entity.BookingStatus;
import com.hoanglong.train_booking.booking.service.BookingStatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/${version}/bookingSta")
@RequiredArgsConstructor
public class BookingStatusController {
    private final BookingStatusService BookingStatusService;
    @GetMapping()
    public ResponseEntity<RestResponse<List<BookingStatus>>> FindAllBookingStatus(){
        List<BookingStatus> bookings = BookingStatusService.FindAllBookingStatus();
        return ResponseEntity.ok(RestResponse.of(bookings));
    }
    @GetMapping("/{id}")
    public ResponseEntity<RestResponse<BookingStatus>> FindBookingStatus(@RequestParam UUID id){
        BookingStatus bookings = BookingStatusService.FindBookingStatus(id);
        return ResponseEntity.ok(RestResponse.of(bookings));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<RestResponse<?>> DeleteBookingStatus(@RequestParam UUID id){
        BookingStatusService.DeleteBookingStatus(id);
        return ResponseEntity.ok(RestResponse.empty());
    }
    @PostMapping()
    public ResponseEntity<RestResponse<?>> SaveBookingStatus(@RequestBody BookingStatus booking){
        BookingStatusService.SaveBookingStatus(booking);
        return ResponseEntity.ok(RestResponse.empty());
    }
    @PutMapping("/{id}")
    public ResponseEntity<RestResponse<?>> UpdateBookingStatus(@RequestBody BookingStatus booking,@RequestParam UUID id){
        BookingStatusService.UpdateBookingStatus(id,booking);
        return ResponseEntity.ok(RestResponse.empty());
    }
}

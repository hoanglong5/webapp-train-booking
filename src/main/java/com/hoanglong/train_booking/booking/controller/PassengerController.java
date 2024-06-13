package com.hoanglong.train_booking.booking.controller;

import com.hoanglong.train_booking.base.controller.RestResponse;
import com.hoanglong.train_booking.booking.entity.Passenger;
import com.hoanglong.train_booking.booking.service.PassengerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/${version}/passenger")
@RequiredArgsConstructor
public class PassengerController {
    private final PassengerService passengerService;
    @GetMapping()
    public ResponseEntity<RestResponse<List<Passenger>>> FindAllPassenger(){
        List<Passenger> bookings = passengerService.FindAllPassenger();
        return ResponseEntity.ok(RestResponse.of(bookings));
    }
    @GetMapping("/{id}")
    public ResponseEntity<RestResponse<Passenger>> FindPassenger(@RequestParam UUID id){
        Passenger bookings = passengerService.FindPassenger(id);
        return ResponseEntity.ok(RestResponse.of(bookings));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<RestResponse<?>> DeletePassenger(@RequestParam UUID id){
        passengerService.DeletePassenger(id);
        return ResponseEntity.ok(RestResponse.empty());
    }
    @PostMapping()
    public ResponseEntity<RestResponse<?>> SavePassenger(@RequestBody Passenger booking){
        passengerService.SavePassenger(booking);
        return ResponseEntity.ok(RestResponse.empty());
    }
    @PutMapping("/{id}")
    public ResponseEntity<RestResponse<?>> UpdatePassenger(@RequestBody Passenger booking,@RequestParam UUID id){
        passengerService.UpdatePassenger(id,booking);
        return ResponseEntity.ok(RestResponse.empty());
    }
}

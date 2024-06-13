package com.hoanglong.train_booking.booking.service;

import com.hoanglong.train_booking.booking.entity.BookingStatus;
import com.hoanglong.train_booking.booking.entity.Passenger;
import com.hoanglong.train_booking.booking.service.entityservice.PassengerEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PassengerService {
    private final PassengerEntityService passengerEntityService;
    public List<Passenger> FindAllPassenger(){
        return passengerEntityService.FindALl();
    }
    public Passenger FindPassenger(UUID uuid){
        return passengerEntityService.FindById(uuid);
    }
    public void DeletePassenger(UUID uuid){
        passengerEntityService.DeleteById(uuid);
    }
    public void SavePassenger(Passenger journeyStation){
        passengerEntityService.Save(journeyStation);
    }
    public void UpdatePassenger(UUID id, Passenger updatedPassenger){
        Passenger passenger = passengerEntityService.FindById(id);
        passenger.setEmail(updatedPassenger.getEmail());
        passenger.setPassword(updatedPassenger.getPassword());
        passenger.setFirstName(updatedPassenger.getFirstName());
        passenger.setLastName(updatedPassenger.getLastName());
        passengerEntityService.Save(passenger);

    }
}

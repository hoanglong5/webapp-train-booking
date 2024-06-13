package com.hoanglong.train_booking.carriage.service;

import com.hoanglong.train_booking.carriage.entity.CarriageClass;
import com.hoanglong.train_booking.carriage.service.entityservice.CarriageClassEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CarriageClassService {
    private final CarriageClassEntityService carriageClassEntityService;
    public List<CarriageClass> FindAllCarriageClass(){
        return carriageClassEntityService.FindALl();
    }
    public CarriageClass FindCarriageClass(UUID uuid){
        return carriageClassEntityService.FindById(uuid);
    }
    public void DeleteCarriageClass(UUID uuid){
        carriageClassEntityService.DeleteById(uuid);
    }
    public void SaveCarriageClass(CarriageClass journeyStation){
        carriageClassEntityService.Save(journeyStation);
    }
    public void UpdateCarriageClass(UUID uuid,CarriageClass updatedCarriageClass){
        CarriageClass carriageClass = carriageClassEntityService.FindById(uuid);
        carriageClass.setClassName(updatedCarriageClass.getClassName());
        carriageClass.setSeatingCapacity(updatedCarriageClass.getSeatingCapacity());
        carriageClassEntityService.Save(carriageClass);
    }
}

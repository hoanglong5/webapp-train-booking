package com.hoanglong.train_booking.carriage.service;

import com.hoanglong.train_booking.carriage.entity.CarriagePrice;
import com.hoanglong.train_booking.carriage.service.entityservice.CarriagePriceEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CarriagePriceService {
    private final CarriagePriceEntityService carriagePriceEntityService;
    public List<CarriagePrice> FindAllCarriagePrice(){
        return carriagePriceEntityService.FindALl();
    }
    public CarriagePrice FindCarriagePrice(UUID uuid){
        return carriagePriceEntityService.FindById(uuid);
    }
    public void DeleteCarriagePrice(UUID uuid){
        carriagePriceEntityService.DeleteById(uuid);
    }
    public void SaveCarriagePrice(CarriagePrice journeyStation){
        carriagePriceEntityService.Save(journeyStation);
    }
    public void UpdateCarriagePrice(UUID uuid,CarriagePrice updatedCarriagePrice){
        CarriagePrice carriagePrice = carriagePriceEntityService.FindById(uuid);
        carriagePrice.setPrice(updatedCarriagePrice.getPrice());
        carriagePriceEntityService.Save(carriagePrice);
    }
}

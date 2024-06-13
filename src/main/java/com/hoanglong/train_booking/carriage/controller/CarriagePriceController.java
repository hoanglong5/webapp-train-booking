package com.hoanglong.train_booking.carriage.controller;

import com.hoanglong.train_booking.base.controller.RestResponse;
import com.hoanglong.train_booking.carriage.entity.CarriagePrice;
import com.hoanglong.train_booking.carriage.service.CarriagePriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/${version}/carriagePri")
@RequiredArgsConstructor
public class CarriagePriceController {
    private final CarriagePriceService carriagePriceService;
    @GetMapping()
    public ResponseEntity<RestResponse<List<CarriagePrice>>> FindAllCarriagePrice(){
        List<CarriagePrice> carriagePrices = carriagePriceService.FindAllCarriagePrice();
        return ResponseEntity.ok(RestResponse.of(carriagePrices));
    }
    @GetMapping("/{id}")
    public ResponseEntity<RestResponse<CarriagePrice>> FindCarriagePrice(@RequestParam UUID id){
        CarriagePrice carriagePrices = carriagePriceService.FindCarriagePrice(id);
        return ResponseEntity.ok(RestResponse.of(carriagePrices));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<RestResponse<?>> DeleteCarriagePrice(@RequestParam UUID id){
        carriagePriceService.DeleteCarriagePrice(id);
        return ResponseEntity.ok(RestResponse.empty());
    }
    @PostMapping()
    public ResponseEntity<RestResponse<?>> SaveCarriagePrice(@RequestBody CarriagePrice carriagePrice){
        carriagePriceService.SaveCarriagePrice(carriagePrice);
        return ResponseEntity.ok(RestResponse.empty());
    }
    @PutMapping("/{id}")
    public ResponseEntity<RestResponse<?>> UpdateCarriagePrice(@RequestBody CarriagePrice carriagePrice,@RequestParam UUID id){
        carriagePriceService.UpdateCarriagePrice(id,carriagePrice);
        return ResponseEntity.ok(RestResponse.empty());
    }
}

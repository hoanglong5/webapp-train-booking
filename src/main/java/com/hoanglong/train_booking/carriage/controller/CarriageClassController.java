package com.hoanglong.train_booking.carriage.controller;

import com.hoanglong.train_booking.base.controller.RestResponse;
import com.hoanglong.train_booking.carriage.entity.CarriageClass;
import com.hoanglong.train_booking.carriage.service.CarriageClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/${version}/carriageCla")
@RequiredArgsConstructor
public class CarriageClassController {
    private final CarriageClassService carriageClassService;
    @GetMapping()
    public ResponseEntity<RestResponse<List<CarriageClass>>> FindAllCarriageClass(){
        List<CarriageClass> carriageClasss = carriageClassService.FindAllCarriageClass();
        return ResponseEntity.ok(RestResponse.of(carriageClasss));
    }
    @GetMapping("/{id}")
    public ResponseEntity<RestResponse<CarriageClass>> FindCarriageClass(@RequestParam UUID id){
        CarriageClass carriageClasss = carriageClassService.FindCarriageClass(id);
        return ResponseEntity.ok(RestResponse.of(carriageClasss));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<RestResponse<?>> DeleteCarriageClass(@RequestParam UUID id){
        carriageClassService.DeleteCarriageClass(id);
        return ResponseEntity.ok(RestResponse.empty());
    }
    @PostMapping()
    public ResponseEntity<RestResponse<?>> SaveCarriageClass(@RequestBody CarriageClass carriageClass){
        carriageClassService.SaveCarriageClass(carriageClass);
        return ResponseEntity.ok(RestResponse.empty());
    }
    @PutMapping("/{id}")
    public ResponseEntity<RestResponse<?>> UpdateCarriageClass(@RequestBody CarriageClass carriageClass,@RequestParam UUID id){
        carriageClassService.UpdateCarriageClass(id,carriageClass);
        return ResponseEntity.ok(RestResponse.empty());
    }
}

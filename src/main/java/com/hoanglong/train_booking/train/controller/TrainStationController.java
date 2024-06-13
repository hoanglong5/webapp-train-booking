package com.hoanglong.train_booking.train.controller;

import com.hoanglong.train_booking.base.controller.RestResponse;
import com.hoanglong.train_booking.train.entity.TrainStation;
import com.hoanglong.train_booking.train.service.TrainStationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/${version}/trainSta")
@RequiredArgsConstructor
public class TrainStationController {
    private final TrainStationService trainStationService;
    @GetMapping()
    public ResponseEntity<RestResponse<List<TrainStation>>> FindAllTrainStation(){
        List<TrainStation> trainStations = trainStationService.FindAllTrainStation();
        return ResponseEntity.ok(RestResponse.of(trainStations));
    }
    @GetMapping("/{id}")
    public ResponseEntity<RestResponse<TrainStation>> FindTrainStation(@RequestParam UUID id){
        TrainStation trainStations = trainStationService.FindTrainStation(id);
        return ResponseEntity.ok(RestResponse.of(trainStations));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<RestResponse<?>> DeleteTrainStation(@RequestParam UUID id){
        trainStationService.DeleteTrainStation(id);
        return ResponseEntity.ok(RestResponse.empty());
    }
    @PostMapping()
    public ResponseEntity<RestResponse<?>> SaveTrainStation(@RequestBody TrainStation trainStation){
        trainStationService.SaveTrainStation(trainStation);
        return ResponseEntity.ok(RestResponse.empty());
    }
    @PutMapping("/{id}")
    public ResponseEntity<RestResponse<?>> UpdateTrainStation(@RequestBody TrainStation trainStation,@RequestParam UUID id){
        trainStationService.UpdateTrainStation(id,trainStation);
        return ResponseEntity.ok(RestResponse.empty());
    }
}

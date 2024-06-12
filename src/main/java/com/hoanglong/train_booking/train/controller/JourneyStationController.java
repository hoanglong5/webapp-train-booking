package com.hoanglong.train_booking.train.controller;

import com.hoanglong.train_booking.base.controller.RestResponse;
import com.hoanglong.train_booking.train.entity.JourneyStation;
import com.hoanglong.train_booking.train.service.JourneyStationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/${version}/JoSta")
@RequiredArgsConstructor
public class JourneyStationController {
    private final JourneyStationService journeyStationService;
    @GetMapping()
    public ResponseEntity<RestResponse<List<JourneyStation>>> FindAllJourneyStation(){
        List<JourneyStation> journeyStations = journeyStationService.FindAllJourneyStation();
        return ResponseEntity.ok(RestResponse.of(journeyStations));
    }
    @GetMapping("/{id}")
    public ResponseEntity<RestResponse<JourneyStation>> FindJourneyStation(@RequestParam UUID id){
        JourneyStation journeyStations = journeyStationService.FindJourneyStation(id);
        return ResponseEntity.ok(RestResponse.of(journeyStations));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<RestResponse<?>> DeleteJourneyStation(@RequestParam UUID id){
        journeyStationService.DeleteJourneyStation(id);
        return ResponseEntity.ok(RestResponse.empty());
    }
    @PostMapping()
    public ResponseEntity<RestResponse<?>> SaveJourneyStation(@RequestBody JourneyStation journeyStation){
        journeyStationService.SaveJourneyStation(journeyStation);
        return ResponseEntity.ok(RestResponse.empty());
    }
    @PutMapping("/{id}")
    public ResponseEntity<RestResponse<?>> UpdateJourneyStation(@RequestBody JourneyStation journeyStation,@RequestParam UUID id){
        journeyStationService.UpdateJourneyStation(id,journeyStation);
        return ResponseEntity.ok(RestResponse.empty());
    }
}

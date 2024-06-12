package com.hoanglong.train_booking.train.controller;

import com.hoanglong.train_booking.base.controller.RestResponse;
import com.hoanglong.train_booking.train.entity.TrainJourney;
import com.hoanglong.train_booking.train.service.TrainJourneyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/${version}/TraJo")
@RequiredArgsConstructor
public class TrainJourneyStation {
    private final TrainJourneyService trainJourneyService;
    @GetMapping()
    public ResponseEntity<RestResponse<List<TrainJourney>>> FindAllTrainJourney(){
        List<TrainJourney> trainJourneys = trainJourneyService.FindAllTrainJourney();
        return ResponseEntity.ok(RestResponse.of(trainJourneys));
    }
    @GetMapping("/{id}")
    public ResponseEntity<RestResponse<TrainJourney>> FindTrainJourney(@RequestParam UUID id){
        TrainJourney trainJourneys = trainJourneyService.FindTrainJourney(id);
        return ResponseEntity.ok(RestResponse.of(trainJourneys));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<RestResponse<?>> DeleteTrainJourney(@RequestParam UUID id){
        trainJourneyService.DeleteTrainJourney(id);
        return ResponseEntity.ok(RestResponse.empty());
    }
    @PostMapping()
    public ResponseEntity<RestResponse<?>> SaveTrainJourney(@RequestBody TrainJourney trainJourney){
        trainJourneyService.SaveTrainJourney(trainJourney);
        return ResponseEntity.ok(RestResponse.empty());
    }
    @PutMapping("/{id}")
    public ResponseEntity<RestResponse<?>> UpdateTrainJourney(@RequestBody TrainJourney trainJourney,@RequestParam UUID id){
        trainJourneyService.UpdateTrainJourney(id,trainJourney);
        return ResponseEntity.ok(RestResponse.empty());
    }
}

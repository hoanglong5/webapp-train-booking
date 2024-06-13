package com.hoanglong.train_booking.carriage.controller;

import com.hoanglong.train_booking.base.controller.RestResponse;
import com.hoanglong.train_booking.carriage.entity.JourneyCarriage;
import com.hoanglong.train_booking.carriage.service.JourneyCarriageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/${version}/journeyCarr")
@RequiredArgsConstructor
public class JourneyCarriageController {
    private final JourneyCarriageService journeyCarriageService;
    @GetMapping()
    public ResponseEntity<RestResponse<List<JourneyCarriage>>> FindAllJourneyCarriage(){
        List<JourneyCarriage> journeyCarriages = journeyCarriageService.FindAllJourneyCarriage();
        return ResponseEntity.ok(RestResponse.of(journeyCarriages));
    }
    @GetMapping("/{id}")
    public ResponseEntity<RestResponse<JourneyCarriage>> FindJourneyCarriage(@RequestParam UUID id){
        JourneyCarriage journeyCarriages = journeyCarriageService.FindJourneyCarriage(id);
        return ResponseEntity.ok(RestResponse.of(journeyCarriages));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<RestResponse<?>> DeleteJourneyCarriage(@RequestParam UUID id){
        journeyCarriageService.DeleteJourneyCarriage(id);
        return ResponseEntity.ok(RestResponse.empty());
    }
    @PostMapping()
    public ResponseEntity<RestResponse<?>> SaveJourneyCarriage(@RequestBody JourneyCarriage journeyCarriage){
        journeyCarriageService.SaveJourneyCarriage(journeyCarriage);
        return ResponseEntity.ok(RestResponse.empty());
    }
    @PutMapping("/{id}")
    public ResponseEntity<RestResponse<?>> UpdateJourneyCarriage(@RequestBody JourneyCarriage journeyCarriage,@RequestParam UUID id){
        journeyCarriageService.UpdateJourneyCarriage(id,journeyCarriage);
        return ResponseEntity.ok(RestResponse.empty());
    }
}

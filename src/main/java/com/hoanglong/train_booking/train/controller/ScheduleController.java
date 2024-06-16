package com.hoanglong.train_booking.train.controller;

import com.hoanglong.train_booking.base.controller.RestResponse;
import com.hoanglong.train_booking.train.entity.Schedule;
import com.hoanglong.train_booking.train.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/${version}/schedule")
@RequiredArgsConstructor
//@RequestMapping("/api/${version}")
public class ScheduleController {
    private final ScheduleService scheduleService;
    @GetMapping()
    public ResponseEntity<RestResponse<List<Schedule>>> FindAllSchedule(){
        List<Schedule> schedules = scheduleService.FindAllSchedule();
        return ResponseEntity.ok(RestResponse.of(schedules));
    }
    @GetMapping("/{id}")
    public ResponseEntity<RestResponse<Schedule>> FindSchedule(@PathVariable UUID id){
        Schedule schedules = scheduleService.getSchedule(id);
        return ResponseEntity.ok(RestResponse.of(schedules));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<RestResponse<?>> DeleteSchedule(@PathVariable UUID id){
        scheduleService.DeleteSchedule(id);
        return ResponseEntity.ok(RestResponse.empty());
    }
    @PostMapping()
    public ResponseEntity<RestResponse<Schedule>> SaveSchedule(@RequestBody Schedule schedule){
        scheduleService.SaveSchedule(schedule);
        return ResponseEntity.ok(RestResponse.of(schedule));
    }
    @PutMapping("/{id}")
    public ResponseEntity<RestResponse<?>> UpdateSchedule(@RequestBody Schedule schedule,@RequestParam UUID id){
        scheduleService.UpdateSchedule(id,schedule);
        return ResponseEntity.ok(RestResponse.empty());
    }
}

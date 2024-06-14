package com.hoanglong.train_booking.train.mapper;

import com.hoanglong.train_booking.train.dto.JourneyStationDto;
import com.hoanglong.train_booking.train.dto.ScheduleDto;
import com.hoanglong.train_booking.train.entity.JourneyStation;
import com.hoanglong.train_booking.train.entity.Schedule;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface ScheduleMapper {
    ScheduleMapper INSTANCE = Mappers.getMapper(ScheduleMapper.class);
    ScheduleDto ScheduleToScheduleDto(Schedule schedule);
    List<ScheduleDto> ListScheduleToListScheduleDto(List<Schedule> schedules);
}

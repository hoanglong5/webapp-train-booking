package com.hoanglong.train_booking.train.mapper;

import com.hoanglong.train_booking.train.dto.JourneyStationDto;
import com.hoanglong.train_booking.train.entity.JourneyStation;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface JourneyStationMapper {
    JourneyStationMapper INSTANCE = Mappers.getMapper(JourneyStationMapper.class);
    JourneyStationDto JoStaToJoStaDto(JourneyStation journeyStation);
    List<JourneyStationDto> ListJoStaToListJoStaDto(List<JourneyStation> journeyStation);
}

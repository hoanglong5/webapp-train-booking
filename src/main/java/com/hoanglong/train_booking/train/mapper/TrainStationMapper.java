package com.hoanglong.train_booking.train.mapper;

import com.hoanglong.train_booking.train.dto.JourneyStationDto;
import com.hoanglong.train_booking.train.dto.TrainStationDto;
import com.hoanglong.train_booking.train.entity.JourneyStation;
import com.hoanglong.train_booking.train.entity.TrainStation;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TrainStationMapper {
    TrainStationMapper INSTANCE = Mappers.getMapper(TrainStationMapper.class);
    TrainStationDto TraStaToTraStaDto(TrainStation trainStation);
    List<TrainStationDto> ListTraStaToListTraStaDto(List<TrainStation> trainStations);
}

package com.hoanglong.train_booking.train.mapper;

import com.hoanglong.train_booking.train.dto.JourneyStationDto;
import com.hoanglong.train_booking.train.dto.TrainJourneyDto;
import com.hoanglong.train_booking.train.entity.JourneyStation;
import com.hoanglong.train_booking.train.entity.TrainJourney;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TrainJourneyMapper {
    TrainJourneyMapper INSTANCE = Mappers.getMapper(TrainJourneyMapper.class);
    TrainJourneyDto TrainJoToTrainJoDto(TrainJourney trainJourney);
    List<TrainJourneyDto> ListTrainJoToListTrainJoDto(List<TrainJourney> trainJourneys);
}

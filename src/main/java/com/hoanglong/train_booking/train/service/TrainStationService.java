package com.hoanglong.train_booking.train.service;

import com.hoanglong.train_booking.train.entity.TrainStation;
import com.hoanglong.train_booking.train.service.entityservice.TrainStationEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TrainStationService {
    private final TrainStationEntityService trainStationEntityService;
    public List<TrainStation> FindAllTrainStation(){
        return trainStationEntityService.FindALl();
    }
    public TrainStation FindTrainStation(UUID uuid){
        return trainStationEntityService.FindById(uuid);
    }
    public void DeleteTrainStation(UUID uuid){
        trainStationEntityService.DeleteById(uuid);
    }
    public void SaveTrainStation(TrainStation trainStation){
        trainStationEntityService.Save(trainStation);
    }
    public void UpdateTrainStation(UUID uuid,TrainStation updatedTrainStation){
        TrainStation trainStation = trainStationEntityService.FindById(uuid);
        trainStation.setStationName(updatedTrainStation.getStationName());
        trainStationEntityService.Save(trainStation);
    }
}

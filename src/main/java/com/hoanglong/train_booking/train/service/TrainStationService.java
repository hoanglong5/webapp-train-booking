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
    private final TrainStationEntityService dao;
    public List<TrainStation> FindAllTrainStation(){
        return dao.FindALl();
    }
    public TrainStation FindTrainStation(UUID uuid){
        return dao.FindById(uuid);
    }
    public void DeleteTrainStation(UUID uuid){
        dao.DeleteById(uuid);
    }
    public void SaveTrainStation(TrainStation trainStation){
        dao.Save(trainStation);
    }
    public void UpdateTrainStation(UUID uuid,TrainStation trainStation){
        TrainStation trainStation2Update = dao.FindById(uuid);
        trainStation2Update.setStationName(trainStation.getStationName());
    }
}

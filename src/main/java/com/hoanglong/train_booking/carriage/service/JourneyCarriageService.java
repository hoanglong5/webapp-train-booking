package com.hoanglong.train_booking.carriage.service;

import com.hoanglong.train_booking.carriage.entity.JourneyCarriage;
import com.hoanglong.train_booking.carriage.service.entityservice.JourneyCarriageEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class JourneyCarriageService {
    private final JourneyCarriageEntityService journeyCarriageEntityService;
    public List<JourneyCarriage> FindAllJourneyCarriage(){
        return journeyCarriageEntityService.FindALl();
    }
    public JourneyCarriage FindJourneyCarriage(UUID uuid){
        return journeyCarriageEntityService.FindById(uuid);
    }
    public void DeleteJourneyCarriage(UUID uuid){
        journeyCarriageEntityService.DeleteById(uuid);
    }
    public void SaveJourneyCarriage(JourneyCarriage journeyCarriage){
        journeyCarriageEntityService.Save(journeyCarriage);
    }
    public void UpdateJourneyCarriage(UUID uuid,JourneyCarriage updatedJourneyCarriage){
        JourneyCarriage journeyCarriage = journeyCarriageEntityService.FindById(uuid);
        journeyCarriage.setPosition(updatedJourneyCarriage.getPosition());
        journeyCarriageEntityService.Save(journeyCarriage);
    }
}

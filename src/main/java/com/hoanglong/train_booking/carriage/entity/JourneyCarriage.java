package com.hoanglong.train_booking.carriage.entity;

import com.hoanglong.train_booking.train.entity.TrainJourney;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "journey_carriage")
public class JourneyCarriage {
    private UUID journeyCarriageId;
    private int position;
    @ManyToOne
    @JoinColumn(name = "journey_id")
    private TrainJourney trainJourney;
    @ManyToOne
    @JoinColumn(name = "carriage_class_id")
    private CarriageClass carriageClass;
}

package com.hoanglong.train_booking.train.entity;

import jakarta.persistence.*;
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
@Table(name = "train_journey")
public class TrainJourney {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID trainJourneyId;
    private String name;
    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;
}

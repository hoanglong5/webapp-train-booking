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
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "train_station")
public class TrainStation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID StaionId;
    private String stationName;
}

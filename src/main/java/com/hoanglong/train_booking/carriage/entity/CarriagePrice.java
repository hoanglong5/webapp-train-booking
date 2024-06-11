package com.hoanglong.train_booking.carriage.entity;

import com.hoanglong.train_booking.train.entity.Schedule;
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
@Table(name = "carriage_price")
public class CarriagePrice {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID carriagePriceId;
    private Long price;
    @ManyToOne
    @JoinColumn(name = "schedule_id",nullable = false)
    private Schedule schedule;
    @ManyToOne
    @JoinColumn(name = "carriage_class_id",nullable = false)
    private CarriageClass carriageClass;
}

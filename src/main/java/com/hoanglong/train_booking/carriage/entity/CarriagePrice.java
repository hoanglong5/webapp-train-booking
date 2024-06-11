package com.hoanglong.train_booking.carriage.entity;

import com.hoanglong.train_booking.train.entity.Schedule;
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
@Table(name = "carriage_price")
public class CarriagePrice {
    private UUID carriagePriceId;
    private Long price;
    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;
    @ManyToOne
    @JoinColumn(name = "carriage_class_id")
    private CarriageClass carriageClass;
}

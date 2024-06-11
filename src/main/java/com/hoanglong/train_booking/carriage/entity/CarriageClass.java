package com.hoanglong.train_booking.carriage.entity;

import jakarta.persistence.Entity;
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
@Table(name = "carriage_class")
public class CarriageClass {
    private UUID carriageClassId;
    private String className;
    private int seatingCapacity;

}

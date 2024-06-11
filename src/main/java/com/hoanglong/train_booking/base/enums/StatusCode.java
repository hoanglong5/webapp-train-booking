package com.hoanglong.train_booking.base.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.hibernate.annotations.NotFound;

@AllArgsConstructor
@Getter
public enum StatusCode {
    NOT_FOUND(404);
    private final int code;
}

package com.hoanglong.train_booking.base.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {
    private LocalDate errorDate;
    private String message;
    private String detail;
}

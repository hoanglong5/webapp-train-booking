package com.hoanglong.train_booking.base.exception;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class ExceptionResponse {
    private LocalDate errorDate;
    private String message;
    private String detail;
}

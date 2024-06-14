package com.hoanglong.train_booking.base.exception;

import com.hoanglong.train_booking.base.controller.RestResponse;
import com.hoanglong.train_booking.base.exception.exceptions.ItemNotFoundException;
import org.hibernate.PropertyValueException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDate;

@RestControllerAdvice
public class BaseException {
    @ExceptionHandler(ItemNotFoundException.class)
    public ResponseEntity<Object> HandlerItemNotFoundException(Exception ex, WebRequest request){
        LocalDate dateError = LocalDate.now();
        String message = ex.getMessage();
        String description = request.getDescription(false);
        ExceptionResponse exceptionResponse =  new ExceptionResponse(dateError,message,description);
        RestResponse<ExceptionResponse> response = RestResponse.error(exceptionResponse);
        response.setMessage(message);
        return ResponseEntity.ok(response);
    }
    @ExceptionHandler(HttpMessageConversionException.class)
    public ResponseEntity<Object> handlerHttpMessageConversionException(Exception ex, WebRequest request){
        LocalDate dateError = LocalDate.now();
        String message = ex.getMessage();
        String description = request.getDescription(false);
        ExceptionResponse exceptionResponse =  new ExceptionResponse(dateError,message,description);
        RestResponse<ExceptionResponse> response = RestResponse.error(exceptionResponse);
        response.setMessage(message);
        return ResponseEntity.ok(response);
    }
    @ExceptionHandler(PropertyValueException.class)
    public ResponseEntity<Object> HandlePropertyValueException(Exception ex, WebRequest request){
        LocalDate dateError = LocalDate.now();
        String message = ex.getMessage();
        String description = request.getDescription(false);
        ExceptionResponse exceptionResponse =  new ExceptionResponse(dateError,message,description);
        RestResponse<ExceptionResponse> response = RestResponse.error(exceptionResponse);
        response.setMessage(message);
        return ResponseEntity.ok(response);
    }
}

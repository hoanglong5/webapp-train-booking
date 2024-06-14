package com.hoanglong.train_booking.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
 
//    com.hoanglong.train_booking..*(..)
private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* com.hoanglong.train_booking..*(..)) && @annotation(org.springframework.web.bind.annotation.PostMapping)")
    public void logBeforeCreate(JoinPoint joinPoint) {
        logger.info("Create operation called on: {}", joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution(* com.hoanglong.train_booking..*(..)) && @annotation(org.springframework.web.bind.annotation.PostMapping)", returning = "result")
    public void logAfterCreate(JoinPoint joinPoint, Object result) {
        logger.info("Create operation on {} returned: {}", joinPoint.getSignature().getName(), result);
    }

    @Before("execution(* com.hoanglong.train_booking..*(..)) && @annotation(org.springframework.web.bind.annotation.GetMapping)")
    public void logBeforeRead(JoinPoint joinPoint) {
        logger.info("Read operation called on: {}", joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution(* com.hoanglong.train_booking..*(..)) && @annotation(org.springframework.web.bind.annotation.GetMapping)", returning = "result")
    public void logAfterRead(JoinPoint joinPoint, Object result) {
        logger.info("Read operation on {} returned: {}", joinPoint.getSignature().getName(), result);
    }

    @Before("execution(* com.hoanglong.train_booking..*(..)) && @annotation(org.springframework.web.bind.annotation.PutMapping)")
    public void logBeforeUpdate(JoinPoint joinPoint) {
        logger.info("Update operation called on: {}", joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution(* com.hoanglong.train_booking..*(..)) && @annotation(org.springframework.web.bind.annotation.PutMapping)", returning = "result")
    public void logAfterUpdate(JoinPoint joinPoint, Object result) {
        logger.info("Update operation on {} returned: {}", joinPoint.getSignature().getName(), result);
    }

    @Before("execution(* com.hoanglong.train_booking..*(..)) && @annotation(org.springframework.web.bind.annotation.DeleteMapping)")
    public void logBeforeDelete(JoinPoint joinPoint) {
        logger.info("Delete operation called on: {}", joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution(* com.hoanglong.train_booking..*(..)) && @annotation(org.springframework.web.bind.annotation.DeleteMapping)", returning = "result")
    public void logAfterDelete(JoinPoint joinPoint, Object result) {
        logger.info("Delete operation on {} returned: {}", joinPoint.getSignature().getName(), result);
    }

    @AfterThrowing(pointcut = "execution(* com.hoanglong.train_booking..*(..))", throwing = "error")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
        String methodName = joinPoint.getSignature().toShortString();
        String errorMessage = error.getMessage();
        Throwable rootCause = getRootCause(error);
        String rootCauseMessage = (rootCause != null) ? rootCause.getMessage() : "Unknown";

        logger.error("Exception in {} with error: {} and root cause: {}",
                methodName, errorMessage, rootCauseMessage);
    }

    private Throwable getRootCause(Throwable throwable) {
        if (throwable == null) {
            return null;
        }
        Throwable rootCause = throwable;
        while (rootCause.getCause() != null && rootCause.getCause() != rootCause) {
            rootCause = rootCause.getCause();
        }
        return rootCause;
    }
}

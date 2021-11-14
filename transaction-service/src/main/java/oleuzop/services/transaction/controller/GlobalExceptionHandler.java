package oleuzop.services.transaction.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.persistence.EntityNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = { EntityNotFoundException.class })
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String notFoundException(Exception ex)
    {
        return "404 - Entity not found";
    }
}
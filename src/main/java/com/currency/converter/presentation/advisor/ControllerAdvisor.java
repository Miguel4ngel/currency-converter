package com.currency.converter.presentation.advisor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.currency.converter.domain.model.exception.CurrencyNotFoundException;

@ControllerAdvice
public class ControllerAdvisor {

    @ExceptionHandler(CurrencyNotFoundException.class)
    public ResponseEntity handleCurrencyNotFoundException(
    		CurrencyNotFoundException ex) {
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
    
}

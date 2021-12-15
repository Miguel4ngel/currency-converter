package com.currency.converter.presentation.controller;

import com.currency.converter.domain.model.CurrencyDto;
import com.currency.converter.domain.service.CurrencyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping("/currency/{code}")
    public ResponseEntity<CurrencyDto> get(@PathVariable("code") String code){
        return ResponseEntity.ok(currencyService.getCurrencyValue(code));
    }
}

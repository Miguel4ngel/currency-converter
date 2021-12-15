package com.currency.converter.domain.service;

import com.currency.converter.data.entity.Currency;
import com.currency.converter.data.repository.CurrencyRepository;
import com.currency.converter.domain.model.CurrencyDto;
import com.currency.converter.domain.model.exception.CurrencyNotFoundException;

import org.springframework.stereotype.Component;

@Component
public class CurrencyService {

    private final CurrencyRepository currencyRepository;

    public CurrencyService(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    public CurrencyDto getCurrencyValue(String code){
        Currency currency = currencyRepository.findByCode(code).orElseThrow(CurrencyNotFoundException::thrown);;
        return CurrencyDto.fromCurrencyEntity(currency.getPrice());
    }
}

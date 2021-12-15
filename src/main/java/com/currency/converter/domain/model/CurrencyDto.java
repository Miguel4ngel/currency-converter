package com.currency.converter.domain.model;

public class CurrencyDto {

    public Integer value;

    public CurrencyDto(Integer value) {
        this.value = value;
    }

    public static CurrencyDto fromCurrencyEntity(Integer value){
        return new CurrencyDto(value);
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}

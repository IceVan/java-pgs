package com.ice.exchange.dto;

import com.ice.exchange.exceptions.WrongParamException;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Currency;

/**
 * Created by Bartek on 2017-03-09.
 */
@Getter
@Setter
@EqualsAndHashCode
public class CurrencyDTO {
    private BigDecimal value;
    private Currency currency;

    public CurrencyDTO(BigDecimal value, BigDecimal multiplier, String currencyTo) {
        this.value = value.multiply(multiplier);
        try{
            this.currency = Currency.getInstance(currencyTo.toUpperCase());
        }
        catch (IllegalArgumentException e)
        {
            throw new WrongParamException();
        }
    }

    public CurrencyDTO(BigDecimal value, String currency) {
        this.value = value;
        try{
            this.currency = Currency.getInstance(currency.toUpperCase());
        }
        catch (IllegalArgumentException e)
        {
            throw new WrongParamException();
        }
    }

    @Override
    public String toString()
    {
        return value + " " + currency.toString();
    }
}

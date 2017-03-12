package com.ice.exchange.services;

import com.ice.exchange.dto.CurrencyDTO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Created by Bartek on 2017-03-12.
 */

@Service
public class ExchangeService {
    public CurrencyDTO getFinalCurrencyDTO(BigDecimal value, BigDecimal multiplier,  String currencyTo){
        return new CurrencyDTO(value, multiplier, currencyTo);
    }
    public CurrencyDTO getSimpleCurrencyDTO(BigDecimal value, String currency)
    {
        return new CurrencyDTO(value, currency);
    }
}

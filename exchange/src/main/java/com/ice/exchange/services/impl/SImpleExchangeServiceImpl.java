package com.ice.exchange.services.impl;

import com.ice.exchange.dto.CurrencyDTO;
import com.ice.exchange.services.ExchangeService;
import com.ice.exchange.services.impl.conditions.WindowsCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Created by Bartek on 2017-03-14.
 */
@Service
public class SImpleExchangeServiceImpl implements ExchangeService {
    public CurrencyDTO getFinalCurrencyDTO(BigDecimal value, BigDecimal multiplier,  String currencyTo){
        return new CurrencyDTO(value, multiplier, currencyTo);
    }
    public CurrencyDTO getSimpleCurrencyDTO(BigDecimal value, String currency)
    {
        return new CurrencyDTO(value, currency);
    }
}

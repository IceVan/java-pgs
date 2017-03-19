package com.ice.exchange.services;

import com.ice.exchange.dto.CurrencyDTO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Created by Bartek on 2017-03-12.
 */

//Interfejs nie powinien miec adnotacji technologicznych
public interface ExchangeService {
    public CurrencyDTO getFinalCurrencyDTO(BigDecimal value, BigDecimal multiplier,  String currencyTo);
    public CurrencyDTO getSimpleCurrencyDTO(BigDecimal value, String currency);
}

package com.ice.exchange.controllers;

import com.ice.exchange.services.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * Created by Bartek on 2017-03-08.
 */
@RestController
public class ExchangeController {

    @Autowired
    ExchangeService exchangeService;

    @RequestMapping("/{value}/{multiplier}")
    public String currencyExchanger(@PathVariable BigDecimal value,
                                    @PathVariable BigDecimal multiplier,
                                    @RequestParam("currencyFrom") String currencyFrom,
                                    @RequestParam("currencyTo") String currencyTo){
        return exchangeService.getSimpleCurrencyDTO(value, currencyFrom).toString() + " -> " + exchangeService.getFinalCurrencyDTO(value,multiplier,currencyTo);
    }
}

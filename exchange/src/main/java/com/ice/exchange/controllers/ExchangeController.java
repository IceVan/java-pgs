package com.ice.exchange.controllers;

import com.ice.exchange.dto.CurrencyDTO;
import com.ice.exchange.services.ExchangeService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Bartek on 2017-03-08.
 */
@RestController
public class ExchangeController {

    @Autowired
    private ExchangeService exchangeService;

    @Autowired
    @Qualifier("getMyString")
    private String myBean;

    @RequestMapping("/{value}/{multiplier}")
    public String currencyExchanger(@PathVariable BigDecimal value,
                                    @PathVariable BigDecimal multiplier,
                                    @RequestParam("currencyFrom") String currencyFrom,
                                    @RequestParam("currencyTo") String currencyTo){
        return exchangeService.getSimpleCurrencyDTO(value, currencyFrom).toString() + " -> " + exchangeService.getFinalCurrencyDTO(value,multiplier,currencyTo);
    }

    @RequestMapping("/bis/{value}/{multiplier}")
    public CurrencyDTO currencyExchangerBis(@PathVariable BigDecimal value,
                                            @PathVariable BigDecimal multiplier,
                                            @RequestParam("currencyFrom") String currencyFrom,
                                            @RequestParam("currencyTo") String currencyTo){
        return exchangeService.getFinalCurrencyDTO(value,multiplier,currencyTo);
    }

    @RequestMapping("/test")
    public String currencyExchangerBisTwo(HttpServletRequest httpRequest, HttpServletResponse httpResponse){
        httpResponse.setStatus(418);
        return "trololololo";
    }
}

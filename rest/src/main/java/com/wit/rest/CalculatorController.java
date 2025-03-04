package com.wit.rest;

import com.wit.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    private CalculadoraService calculadoraService;

    @GetMapping("/soma")
    public BigDecimal add(@RequestParam BigDecimal a, @RequestParam BigDecimal b){
        return calculadoraService.add(a,b);
    }

    @GetMapping("/subtracao")
    public BigDecimal sub(@RequestParam BigDecimal  a, @RequestParam BigDecimal b){
        return calculadoraService.subtract(a,b);
    }

    @GetMapping("/multiplicacao")
    public BigDecimal multiply(@RequestParam BigDecimal  a, @RequestParam BigDecimal b){
        return calculadoraService.multiply(a,b);
    }

    @GetMapping("/divisao")
    public BigDecimal divide(@RequestParam BigDecimal  a, @RequestParam BigDecimal b){
        return calculadoraService.divide(a,b);
    }
}
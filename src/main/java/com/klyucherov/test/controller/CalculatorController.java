package com.klyucherov.test.controller;

import com.klyucherov.test.sevice.CalculatorService;
import jdk.dynalink.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.Objects;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    public final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(produces = MediaType.TEXT_HTML_VALUE)
    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(value = "num1", required = false) int a,
                       @RequestParam(value = "num2", required = false) int b) {
        if (Objects.isNull(a) || Objects.isNull(b)) {
            return "Оба параметра должны быть переданы";
        }
        return buildResult(a,b, calculatorService.plus(a,b), "+");

    }
    @GetMapping("/minus")
    public String minus(@RequestParam(value = "num1", required = false) int a,
                        @RequestParam(value = "num2", required = false) int b) {
        if (Objects.isNull(a) || Objects.isNull(b)) {
            return "Оба параметра должны быть переданы";
        }
        return buildResult(a,b, calculatorService.minus(a,b), "+");

    }
    @GetMapping("/multiplication")
    public String multiplication(@RequestParam(value = "num1", required = false) int a,
                                 @RequestParam(value = "num2", required = false) int b) {
        if (Objects.isNull(a) || Objects.isNull(b)) {
            return "Оба параметра должны быть переданы";
        }
        return buildResult(a,b, calculatorService.multiplication(a,b), "+");

    }
    @GetMapping("/divisionn")
    public String division(@RequestParam(value = "num1", required = false) int a,
                           @RequestParam(value = "num2", required = false) int b) {
        if (Objects.isNull(a) || Objects.isNull(b)) {
            return "Оба параметра должны быть переданы";
        }
        return buildResult(a,b, calculatorService.multiplication(a,b), "+");

    }


    private String buildResult(int a, int b, Number number, String operation) {
        return null;
    }



}

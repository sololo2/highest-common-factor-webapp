package com.proxy.controller;

import com.proxy.service.HighestCommonFactorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HighestCommonFactorController {
    private final HighestCommonFactorService highestCommonFactorService;

    public HighestCommonFactorController(HighestCommonFactorService highestCommonFactorService){
        this.highestCommonFactorService = highestCommonFactorService;
    }
    @RequestMapping("/highestCommonFactor.do")
    public int getHighestCommonFactorService(@RequestParam(value = "firstNumber", required = true) int firstNumber,
                                             @RequestParam(value = "secondNumber", required = true) int secondNumber){
        return highestCommonFactorService.getHighestCommonFactorService(firstNumber,secondNumber);
    }

}

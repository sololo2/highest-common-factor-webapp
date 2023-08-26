package com.proxy.controller;

import com.proxy.service.HighestCommonFactorService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HighestCommonFactorController {
    private final HighestCommonFactorService highestCommonFactorService;
    int highestCommonFactor;

    public HighestCommonFactorController(HighestCommonFactorService highestCommonFactorService){
        this.highestCommonFactorService = highestCommonFactorService;
    }
    @Operation(summary = "post list of integers to get highest common factor",
            description ="highest common factor will be calculated and returned",
            tags = "post" )

    @PostMapping(value = "/highestCommonFactor.do",produces = MediaType.APPLICATION_JSON_VALUE)
    public int getHighestCommonFactorController(@RequestBody int[] array){
        highestCommonFactor = highestCommonFactorService.getHighestCommonFactorService(array);
        System.out.print("Highest Common Factor: "+ highestCommonFactor);
        return highestCommonFactor;
    }
}
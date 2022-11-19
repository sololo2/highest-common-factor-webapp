package com.proxy.service;

import org.springframework.stereotype.Service;

@Service
public class HighestCommonFactorService {

    public int getHighestCommonFactorService(int firstNumber,int secondNumber){
        int highestCommonFactor = 0;
        for(int i = 1; i<=100;i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0)
                highestCommonFactor=i;
        }
        return highestCommonFactor;
    }
}
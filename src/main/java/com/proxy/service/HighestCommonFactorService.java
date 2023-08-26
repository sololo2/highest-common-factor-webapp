package com.proxy.service;
import org.springframework.stereotype.Service;

@Service
public class HighestCommonFactorService {

    public int getHighestCommonFactorService(int[] array) {
        int highestCommonFactor = array[0];
        for(int number:array)  {
            highestCommonFactor = getHighestCommonFactor(highestCommonFactor, number);
        }
        return highestCommonFactor;
    }

    public int getHighestCommonFactor(int a, int b) {
        // hcf of 2 numbers
        int highestCommonFactor = 0;
        for(int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                highestCommonFactor=i;
        }
        return highestCommonFactor;
    }
}
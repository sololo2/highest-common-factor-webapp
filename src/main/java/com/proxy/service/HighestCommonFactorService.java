package com.proxy.service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HighestCommonFactorService {

    public int getHighestCommonFactorService(List<Integer> array) {
        return getHighestCommonFactor(array);

    }
    public int getHighestCommonFactor(List<Integer> array){
        int result = array.get(0);
        for(int number:array){
            result=getHighestCommonFactor(number,result);
        }
        return result;
    }

    public static int getHighestCommonFactor(int a, int b){
        if(b == 0)
            return a;
        return getHighestCommonFactor(b, a%b);
    }
}
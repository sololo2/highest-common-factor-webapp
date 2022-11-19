package com.proxy.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighestCommonFactorServiceTest {
    private final HighestCommonFactorService highestCommonFactorService=new HighestCommonFactorService();
    @Test
    public  void HighestCommonFactorTest(){
        assertEquals(50,highestCommonFactorService.getHighestCommonFactorService(50,100));
        assertEquals(4,highestCommonFactorService.getHighestCommonFactorService(8,12));
    }
}
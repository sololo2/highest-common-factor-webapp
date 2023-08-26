package com.proxy.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class HighestCommonFactorServiceTest {
    @Autowired
    HighestCommonFactorService highestCommonFactorService;

    @Test
    public void getHighestCommonFactorServiceTest(){
        int[] array = {5,10,15,20};
        assertEquals(5,highestCommonFactorService.getHighestCommonFactorService(array));
    }

    @Test
    public void getHighestCommonFactorServiceTestIs1(){
        int[] array = {3,31,2,18};
        assertEquals(1,highestCommonFactorService.getHighestCommonFactorService(array));
    }
}
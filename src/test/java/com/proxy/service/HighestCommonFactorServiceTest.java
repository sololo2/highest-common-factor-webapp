package com.proxy.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")

public class HighestCommonFactorServiceTest {
    @Autowired
    HighestCommonFactorService highestCommonFactorService;


    @Test
    public void getHighestCommonFactorServiceTest(){
        List<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(5);
        listNumbers.add(10);
        listNumbers.add(15);
        listNumbers.add(20);
        assertEquals(5,highestCommonFactorService.getHighestCommonFactorService(listNumbers));
    }

}

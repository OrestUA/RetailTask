package com.example.demo.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TargetSumIndexesServiceTest {

    @Autowired
    private TargetSumIndexesService targetSumIndexesService;

    @Test
    public void testConfigurationFileServiceGetConfigurationShouldReturnNotNull() throws Exception {
        List<Integer> list = Arrays.asList(1, 5, 3, 6, 4, 2);
        Integer sum = 6;

        List<List<Integer>> expectedList = Arrays.asList(Arrays.asList(0, 1), Arrays.asList(4, 5));
        List<List<Integer>> actualList = targetSumIndexesService.findTargetSumIndexes(list, sum);

        Assert.assertEquals(expectedList, actualList);
    }
}






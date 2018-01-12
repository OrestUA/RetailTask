package com.example.demo.service.impl;

import com.example.demo.service.TargetSumIndexesService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TargetSumIndexesServiceImpl implements TargetSumIndexesService {

    @Override
    public List<List<Integer>> findTargetSumIndexes(List<Integer> list, int targetSum) {
        List<List<Integer>> resultList = new ArrayList<>();
        Map<Integer, Integer> deltaMap = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            Integer deltaIndex = deltaMap.get(list.get(i));
            if (deltaIndex != null) {
                resultList.add(Arrays.asList(deltaIndex, i));
            }
            Integer delta = targetSum - list.get(i);
            deltaMap.put(delta, i);
        }
        return resultList;
    }
}

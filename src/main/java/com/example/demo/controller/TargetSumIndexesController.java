package com.example.demo.controller;

import com.example.demo.domain.ArrayData;
import com.example.demo.service.TargetSumIndexesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TargetSumIndexesController {

    @Autowired
    private TargetSumIndexesService targetSumIndexesService;

    @PostMapping(value = "/targetIndexes", consumes = "application/json", produces = "application/json")
    public List<List<Integer>> processTargetSumIndexes(@RequestBody ArrayData arrayData){
        return targetSumIndexesService.findTargetSumIndexes(arrayData.getArray(), arrayData.getSum());
    }

}
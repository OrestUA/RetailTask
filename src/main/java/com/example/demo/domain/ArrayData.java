package com.example.demo.domain;

import lombok.*;
import java.util.*;

@Getter
@Setter
public class ArrayData {

    private int sum;
    private List<Integer> array = new ArrayList<>();
}

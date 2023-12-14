package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {
    List<Integer> newList = new ArrayList<>();


    public Operation<Integer> divideBy(Integer divider) {
        if (divider == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }

        return arg -> {
            for (Integer i : arg) {
                newList.add(i / divider);
            }

            return newList;
        };
    }
}

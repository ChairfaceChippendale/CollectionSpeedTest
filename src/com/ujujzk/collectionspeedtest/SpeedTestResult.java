package com.ujujzk.collectionspeedtest;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class SpeedTestResult {
    Class collection;
    Map<String, Long> speedResults;


    SpeedTestResult () {
        speedResults = new HashMap<>();
    }

    public void setCollection(Class collection) {
        this.collection = collection;
    }

    public void addSpeedResult(String testMethod, Long speedResult) {
        speedResults.put(testMethod, speedResult);
    }

    public void addSpeedResult(Pair methodAndResult) {
        speedResults.put((String)methodAndResult.getKey(), (Long)methodAndResult.getValue());
    }
}

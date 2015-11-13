package com.ujujzk.collectionspeedtest;

import java.util.HashMap;
import java.util.Map;

public class SpeedTestResult {
    Class collection;
    Map<TestMethod, Long> speedResults;

    SpeedTestResult () {
        speedResults = new HashMap<>();
    }

    public void setCollection(Class collection) {
        this.collection = collection;
    }

    public void addSpeedResult(TestMethod testMethod, Long speedResult) {
        speedResults.put(testMethod, speedResult);
    }
}

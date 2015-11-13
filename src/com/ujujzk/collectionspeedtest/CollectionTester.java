package com.ujujzk.collectionspeedtest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionTester implements SpeedTester {

    List<TestMethod> testMethods;

    CollectionTester(List<TestMethod> testMethods) {
        this.testMethods.addAll(testMethods);
    }

    @Override
    public List<SpeedTestResult> runTests(Collection<Class> collections,
                                         int repetitionNumber) {

        List<SpeedTestResult> speedTestResults = new ArrayList<>();

        for (Class clazz : collections) {
            for (TestMethod testMethod : testMethods) {

                speedTestResults.add(testMethod.runTest(clazz, repetitionNumber));

            }
        }

        return speedTestResults;
    }
}

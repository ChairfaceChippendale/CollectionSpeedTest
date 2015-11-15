package com.ujujzk.collectionspeedtest;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionTester implements SpeedTester {

    List<TestMethod> testMethods;

    CollectionTester(List<TestMethod> testMethods) {
        this.testMethods = new ArrayList<>();
        this.testMethods.addAll(testMethods);
    }

    @Override
    public List<SpeedTestResult> runTests(Collection<Class> collections,
                                         int repetitionNumber, Class collectionElementClass) {

        List<SpeedTestResult> speedTestResults = new ArrayList<>();

        for (Class clazz : collections) {

            SpeedTestResult speedTestResult = new SpeedTestResult();
            speedTestResult.setCollection(clazz.getClass());

            for (TestMethod testMethod : testMethods) {

                try {

                    speedTestResult.addSpeedResult(testMethod.getTestName(), testMethod.runTest(clazz, repetitionNumber, collectionElementClass));

                } catch (NoSuchMethodException e){
                    e.printStackTrace();
                } catch (IllegalAccessException e){
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }

            }
            speedTestResults.add(speedTestResult);
        }

        return speedTestResults;
    }
}

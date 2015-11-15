package com.ujujzk.collectionspeedtest;

import com.ujujzk.collectionspeedtest.testObjects.TestObjectMiddle;
import com.ujujzk.collectionspeedtest.testObjects.TestObjectSmall;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<TestMethod> testMethods = new ArrayList<>();
        testMethods.add(new TestMethodAdd());
        testMethods.add(new TestMethodAddAll());
        testMethods.add(new TestMethodClear());

        Collection<Class> testingCollections = new ArrayList<>();
        testingCollections.add( (new ArrayList<>()).getClass() );
        testingCollections.add( (new LinkedList<>()).getClass() );
        testingCollections.add( (new HashSet<>()).getClass() );

        CollectionTester collectionTester = new CollectionTester(testMethods);

        List<SpeedTestResult> speedTestResults = collectionTester.runTests(testingCollections, 10000, TestObjectSmall.class);


        for (SpeedTestResult speedTestResult: speedTestResults) {

                System.out.println(speedTestResult.getCollection() + "\n" + speedTestResult.getSpeedResults());

        }
    }

}

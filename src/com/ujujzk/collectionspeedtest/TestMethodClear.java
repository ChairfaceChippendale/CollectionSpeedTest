package com.ujujzk.collectionspeedtest;

import com.ujujzk.collectionspeedtest.testObjects.ObjectService;
import com.ujujzk.collectionspeedtest.testObjects.TestObjectSmall;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

public class TestMethodClear implements TestMethod {

    private String testName = "All elements removing";

    @Override
    public long runTest(Class collectionClass, int repetitionNumber)
            throws NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException {

        long totalTime = 0;

        Object collectionObject = collectionClass.getConstructor().newInstance();
        if (collectionObject instanceof Collection) {

            Collection collection = (Collection) collectionObject;
            ObjectService.init(repetitionNumber, TestObjectSmall.class);
            collection.addAll(ObjectService.getAll());

            totalTime = System.currentTimeMillis();
            collection.clear();
            totalTime = System.currentTimeMillis() - totalTime;
        }

        return totalTime;
    }

    @Override
    public String getTestName() {
        return testName;
    }
}

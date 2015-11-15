package com.ujujzk.collectionspeedtest;

import com.ujujzk.collectionspeedtest.testObjects.ObjectService;
import com.ujujzk.collectionspeedtest.testObjects.TestObjectMiddle;
import com.ujujzk.collectionspeedtest.testObjects.TestObjectSmall;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

public class TestMethodAdd implements TestMethod{

    private String testName = "Elements adding";

    @Override
    public String getTestName (){
        return testName;
    }

    @Override
    public long runTest(Class collectionClass, int repetitionNumber, Class collectionElementClass)
            throws NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException {

        long totalTime = 0;
        long callTime;

        Object collectionObject = collectionClass.getConstructor().newInstance();
        if (collectionObject instanceof Collection) {

            Collection collection = (Collection) collectionObject;
            ObjectService.init(repetitionNumber, collectionElementClass);
            for (int i = 0; i < repetitionNumber; i++) {

                Object obj = ObjectService.get(i);
                callTime = System.currentTimeMillis();
                collection.add(obj);
                callTime = System.currentTimeMillis() - callTime;
                totalTime += callTime;
            }
        }

        return totalTime;
    }
}

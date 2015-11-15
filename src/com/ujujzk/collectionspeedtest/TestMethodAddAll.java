package com.ujujzk.collectionspeedtest;

import com.ujujzk.collectionspeedtest.testObjects.ObjectService;
import com.ujujzk.collectionspeedtest.testObjects.TestObjectMiddle;
import com.ujujzk.collectionspeedtest.testObjects.TestObjectSmall;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;

public class TestMethodAddAll implements TestMethod {

    private String testName = "All elements adding";

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

        Object collectionObject = collectionClass.getConstructor().newInstance();
        if (collectionObject instanceof Collection) {

            Collection collection = (Collection) collectionObject;
            ObjectService.init(repetitionNumber, collectionElementClass);
            List<Object> objectList = ObjectService.getAll();

            totalTime = System.currentTimeMillis();
            collection.addAll(objectList);
            totalTime = System.currentTimeMillis() - totalTime;
        }

        return totalTime;
    }


}

package com.ujujzk.collectionspeedtest;

import javafx.print.Collation;
import javafx.util.Pair;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

public class TestMethodAdding implements TestMethod{

    private final String testName = "Adding of elements";

    @Override
    public String getTestName (){
        return testName;
    }

    @Override
    public long runTest(Class collectionClass, int repetitionNumber)
            throws NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException {

        long result = 0;

        Object collectionObject = collectionClass.getConstructor().newInstance();
        if (collectionObject instanceof Collection) {
            Collection collection = (Collection) collectionObject;
            for (int i = 0; i < repetitionNumber; i++) {
                collection.add(ObjectService.get(i));
            }
        }



        return result;
    }
}

package com.ujujzk.collectionspeedtest;


import java.lang.reflect.InvocationTargetException;
import java.util.NoSuchElementException;

public interface TestMethod {

    long runTest (Class collection, int repetitionNumber) throws NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException;

    String getTestName ();

}

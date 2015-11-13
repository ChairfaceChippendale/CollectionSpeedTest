package com.ujujzk.collectionspeedtest;

import java.util.Collection;

public class TestMethodAdding<T> implements TestMethod{
    @Override
    public SpeedTestResult runTest(Class collection, int repetitionNumber) {
        SpeedTestResult result = new SpeedTestResult();

        collection.isInstance(Collection<T>);


        return result;
    }
}

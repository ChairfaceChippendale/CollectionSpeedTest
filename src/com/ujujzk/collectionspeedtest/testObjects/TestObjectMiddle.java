package com.ujujzk.collectionspeedtest.testObjects;

public class TestObjectMiddle implements Comparable<TestObjectMiddle>{

    private String mString;
    private double mDouble;
    private float mFloat;
    private long data;
    private int mInteger;
    private String [] mStringArray;


    TestObjectMiddle(){

        mString = "Hello world!";
        mDouble = 3.1415;
        mFloat = 2.71828f;
        data = System.currentTimeMillis();
        mInteger = 15;
        mStringArray = new String[mInteger];
        for (int i = 0; i < mInteger; i++) {
            mStringArray[i] = "Element on position " + (i+1);
        }
    }

    public long getData () {
        return data;
    }

    @Override
    public int compareTo(TestObjectMiddle other) {
        return (int)this.data - (int)other.getData();
    }
}

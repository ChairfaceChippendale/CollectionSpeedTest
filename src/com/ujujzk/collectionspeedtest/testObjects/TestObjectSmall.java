package com.ujujzk.collectionspeedtest.testObjects;

public class TestObjectSmall implements Comparable<TestObjectSmall> {

    private long data;

    TestObjectSmall () {
       data = System.currentTimeMillis();
    }

    public long getData (){
        return data;
    }

    @Override
    public int compareTo(TestObjectSmall other) {
        return (int)this.data - (int)other.getData();
    }
}

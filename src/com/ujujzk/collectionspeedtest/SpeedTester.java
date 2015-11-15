package com.ujujzk.collectionspeedtest;

import java.util.Collection;
import java.util.List;

public interface SpeedTester {
    List<SpeedTestResult> runTests (Collection<Class> collections, int repetitionNumber, Class collectionElementClass);
}

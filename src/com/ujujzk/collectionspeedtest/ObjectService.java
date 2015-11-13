package com.ujujzk.collectionspeedtest;


public class ObjectService {

    static Object[] objects;

    public static void init(int repetitionNumber, Class clazz) throws IllegalAccessException, InstantiationException {
        objects = new Object[repetitionNumber];
        for(int i = 0; i < repetitionNumber; i++){
            objects[i] = clazz.newInstance();
        }
    }

    public static Object get(int i){
        return objects[i];
    }


}

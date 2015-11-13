package com.ujujzk.collectionspeedtest.testObjects;


import java.util.ArrayList;
import java.util.List;

public class ObjectService {

    static List<Object> objects;

    public static void init(int repetitionNumber, Class clazz) throws IllegalAccessException, InstantiationException {
        objects = new ArrayList<Object>();
        for(int i = 0; i < repetitionNumber; i++){
            objects.add(clazz.newInstance());
        }
    }

    public static Object get(int position){
        return objects.get(position);
    }

    public static List<Object> getAll(){
        return objects;
    }


}

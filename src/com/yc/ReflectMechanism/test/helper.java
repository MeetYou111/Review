package com.yc.ReflectMechanism.test;

import java.lang.reflect.Field;

public class helper {

    public static void setProperty(Object obj,String propertyName,Object vlaue) throws NoSuchFieldException, IllegalAccessException {
        Class<?> aClass = obj.getClass();
        Field declaredField = aClass.getDeclaredField(propertyName);
        declaredField.setAccessible(true);
        declaredField.set(obj,vlaue);

    }
}

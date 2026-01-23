package com.nimbusds.jose.shaded.asm;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* loaded from: classes27.dex */
public class BeansAccessConfig {
    protected static HashMap<Class<?>, LinkedHashSet<Class<?>>> classMapper = new HashMap<>();
    protected static HashMap<Class<?>, HashMap<String, String>> classFiledNameMapper = new HashMap<>();

    static {
        addTypeMapper(Object.class, DefaultConverter.class);
        addTypeMapper(Object.class, ConvertDate.class);
    }

    public static void addTypeMapper(Class<?> cls, Class<?> cls2) {
        synchronized (classMapper) {
            try {
                LinkedHashSet<Class<?>> linkedHashSet = classMapper.get(cls);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet<>();
                    classMapper.put(cls, linkedHashSet);
                }
                linkedHashSet.add(cls2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package com.nimbusds.jose.shaded.asm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes27.dex */
public abstract class BeansAccess<T> {

    /* renamed from: cache, reason: collision with root package name */
    private static ConcurrentHashMap<Class<?>, BeansAccess<?>> f9863cache = new ConcurrentHashMap<>();
    private Accessor[] accs;
    private HashMap<String, Accessor> map;

    public abstract Object get(T t, int i);

    protected void setAccessor(Accessor[] accessorArr) {
        this.accs = accessorArr;
        this.map = new HashMap<>();
        int length = accessorArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Accessor accessor = accessorArr[i];
            accessor.index = i2;
            this.map.put(accessor.getName(), accessor);
            i++;
            i2++;
        }
    }

    public Accessor[] getAccessors() {
        return this.accs;
    }

    public static <P> BeansAccess<P> get(Class<P> cls, FieldFilter fieldFilter) throws ClassNotFoundException, SecurityException {
        String strConcat;
        Class<?> clsBulid;
        BeansAccess<P> beansAccess = (BeansAccess) f9863cache.get(cls);
        if (beansAccess != null) {
            return beansAccess;
        }
        Accessor[] accessors = ASMUtil.getAccessors(cls, fieldFilter);
        String name = cls.getName();
        if (name.startsWith("java.util.")) {
            strConcat = "com.nimbusds.jose.shaded.asm." + name + "AccAccess";
        } else {
            strConcat = name.concat("AccAccess");
        }
        DynamicClassLoader dynamicClassLoader = new DynamicClassLoader(cls.getClassLoader());
        try {
            clsBulid = dynamicClassLoader.loadClass(strConcat);
        } catch (ClassNotFoundException unused) {
            clsBulid = null;
        }
        LinkedList<Class<?>> parents = getParents(cls);
        if (clsBulid == null) {
            BeansAccessBuilder beansAccessBuilder = new BeansAccessBuilder(cls, accessors, dynamicClassLoader);
            Iterator<Class<?>> it = parents.iterator();
            while (it.hasNext()) {
                beansAccessBuilder.addConversion(BeansAccessConfig.classMapper.get(it.next()));
            }
            clsBulid = beansAccessBuilder.bulid();
        }
        try {
            BeansAccess<P> beansAccess2 = (BeansAccess) clsBulid.newInstance();
            beansAccess2.setAccessor(accessors);
            f9863cache.putIfAbsent(cls, beansAccess2);
            Iterator<Class<?>> it2 = parents.iterator();
            while (it2.hasNext()) {
                addAlias(beansAccess2, BeansAccessConfig.classFiledNameMapper.get(it2.next()));
            }
            return beansAccess2;
        } catch (Exception e) {
            throw new RuntimeException("Error constructing accessor class: " + strConcat, e);
        }
    }

    private static LinkedList<Class<?>> getParents(Class<?> cls) {
        LinkedList<Class<?>> linkedList = new LinkedList<>();
        while (cls != null && !cls.equals(Object.class)) {
            linkedList.addLast(cls);
            for (Class<?> cls2 : cls.getInterfaces()) {
                linkedList.addLast(cls2);
            }
            cls = cls.getSuperclass();
        }
        linkedList.addLast(Object.class);
        return linkedList;
    }

    private static void addAlias(BeansAccess<?> beansAccess, HashMap<String, String> map) {
        if (map == null) {
            return;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Accessor accessor = ((BeansAccess) beansAccess).map.get(entry.getValue());
            if (accessor != null) {
                map2.put(entry.getValue(), accessor);
            }
        }
        ((BeansAccess) beansAccess).map.putAll(map2);
    }
}

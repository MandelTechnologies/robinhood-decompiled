package io.sentry;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes21.dex */
public final class OptionsContainer<T> {
    private final Class<T> clazz;

    public static <T> OptionsContainer<T> create(Class<T> cls) {
        return new OptionsContainer<>(cls);
    }

    private OptionsContainer(Class<T> cls) {
        this.clazz = cls;
    }

    public T createInstance() throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        return this.clazz.getDeclaredConstructor(null).newInstance(null);
    }
}

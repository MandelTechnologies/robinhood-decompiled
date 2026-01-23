package com.mux.stats.sdk.core.util;

import java.util.concurrent.Callable;

/* loaded from: classes27.dex */
public class Util {

    public interface Consumer<T> {
        void apply(T t);
    }

    public static <T> T lazyGet(T t, Callable<T> callable) {
        if (t != null) {
            return t;
        }
        try {
            return callable.call();
        } catch (Exception e) {
            throw new RuntimeException("lazyGet: factory threw an exception", e);
        }
    }

    public static <T> T let(T t, Consumer<T> consumer) {
        if (t == null) {
            return null;
        }
        consumer.apply(t);
        return t;
    }

    public static <T> boolean oneOf(T t, T... tArr) {
        for (T t2 : tArr) {
            if (t.equals(t2)) {
                return true;
            }
        }
        return false;
    }
}

package com.nimbusds.jose.util;

/* loaded from: classes27.dex */
public class Container<T> {
    private T item;

    public Container(T t) {
        this.item = t;
    }

    public T get() {
        return this.item;
    }

    public void set(T t) {
        this.item = t;
    }
}

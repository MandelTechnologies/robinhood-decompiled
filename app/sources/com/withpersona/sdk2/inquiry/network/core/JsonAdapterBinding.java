package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.JsonAdapter;

/* loaded from: classes18.dex */
public final class JsonAdapterBinding<T> {
    private final Class<T> clazz;
    private final JsonAdapter<T> jsonAdapter;

    public JsonAdapterBinding(Class<T> cls, JsonAdapter<T> jsonAdapter) {
        this.clazz = cls;
        this.jsonAdapter = jsonAdapter;
    }

    public final Class<T> getClazz() {
        return this.clazz;
    }

    public final JsonAdapter<T> getJsonAdapter() {
        return this.jsonAdapter;
    }
}

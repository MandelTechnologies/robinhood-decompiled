package com.mux.stats.sdk.core.model;

/* loaded from: classes27.dex */
public class SessionTag {
    public final String key;
    public final String value;

    public SessionTag(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public String toString() {
        return "{ key='" + this.key + "', value='" + this.value + "'}";
    }
}

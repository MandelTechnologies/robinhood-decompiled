package com.squareup.wire;

import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* compiled from: Wire.kt */
@Metadata(m3635d1 = {"\u0000\u0004\n\u0002\b\u0006\u001a#\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\b\u0010\u0002\u001a\u0004\u0018\u0001H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"get", "T", "value", "defaultValue", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "wire-runtime"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@JvmName
/* loaded from: classes12.dex */
public final class Wire {
    public static final <T> T get(T t, T t2) {
        return t == null ? t2 : t;
    }
}

package com.mux.android.util;

import kotlin.Metadata;
import kotlin.properties.Interfaces3;

/* compiled from: Weak.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a+\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"T", "t", "Lkotlin/properties/ReadWriteProperty;", "", "weak", "(Ljava/lang/Object;)Lkotlin/properties/ReadWriteProperty;", "mux-kt-utils_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.mux.android.util.WeakKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class Weak2 {
    public static final <T> Interfaces3<Object, T> weak(T t) {
        return new Weak(t);
    }
}

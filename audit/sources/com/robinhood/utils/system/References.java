package com.robinhood.utils.system;

import kotlin.Metadata;
import kotlin.properties.Interfaces3;

/* compiled from: References.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a1\u0010\u0000\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u0001H\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"weak", "Lkotlin/properties/ReadWriteProperty;", "", "T", "value", "(Ljava/lang/Object;)Lkotlin/properties/ReadWriteProperty;", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.system.ReferencesKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class References {
    public static final <T> Interfaces3<Object, T> weak(T t) {
        return new References2(t);
    }

    public static /* synthetic */ Interfaces3 weak$default(Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return weak(obj);
    }
}

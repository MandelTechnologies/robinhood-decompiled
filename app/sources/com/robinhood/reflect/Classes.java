package com.robinhood.reflect;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Classes.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u0002H\u0006\u0018\u00010\u0005\"\b\b\u0000\u0010\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005J'\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u0002H\u0006\u0018\u00010\u0005\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0086\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/reflect/Classes;", "", "<init>", "()V", "forNameOrNull", "Ljava/lang/Class;", "T", "className", "", "upperBound", "lib-reflect"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class Classes {
    public static final Classes INSTANCE = new Classes();

    private Classes() {
    }

    public final <T> Class<? extends T> forNameOrNull(String className, Class<T> upperBound) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        try {
            return (Class<? extends T>) Class.forName(className).asSubclass(upperBound);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final /* synthetic */ <T> Class<? extends T> forNameOrNull(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.reifiedOperationMarker(4, "T");
        return forNameOrNull(className, Object.class);
    }
}

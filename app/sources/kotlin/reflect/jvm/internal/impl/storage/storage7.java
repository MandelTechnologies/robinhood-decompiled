package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: storage.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.storage.StorageKt, reason: use source file name */
/* loaded from: classes23.dex */
public final class storage7 {
    public static final <T> T getValue(storage5<? extends T> storage5Var, Object obj, KProperty<?> p) {
        Intrinsics.checkNotNullParameter(storage5Var, "<this>");
        Intrinsics.checkNotNullParameter(p, "p");
        return (T) storage5Var.invoke();
    }

    public static final <T> T getValue(storage6<? extends T> storage6Var, Object obj, KProperty<?> p) {
        Intrinsics.checkNotNullParameter(storage6Var, "<this>");
        Intrinsics.checkNotNullParameter(p, "p");
        return (T) storage6Var.invoke();
    }
}

package com.robinhood.android.lib.formats;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThreadLocals.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u00012\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/lib/formats/ThreadLocals;", "", "<init>", "()V", "lazy", "Ljava/lang/ThreadLocal;", "T", "initializer", "Lkotlin/Function0;", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class ThreadLocals {
    public static final ThreadLocals INSTANCE = new ThreadLocals();

    private ThreadLocals() {
    }

    public final <T> ThreadLocal<T> lazy(final Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new ThreadLocal<T>() { // from class: com.robinhood.android.lib.formats.ThreadLocals.lazy.1
            @Override // java.lang.ThreadLocal
            protected T initialValue() {
                return initializer.invoke();
            }
        };
    }
}

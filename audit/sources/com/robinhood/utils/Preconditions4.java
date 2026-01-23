package com.robinhood.utils;

import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Preconditions.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, m3636d2 = {"checkOnMainThread", "", "Lcom/robinhood/utils/Preconditions;", "checkNotOnMainThread", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.PreconditionsKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class Preconditions4 {
    public static final void checkOnMainThread(Preconditions preconditions) {
        Intrinsics.checkNotNullParameter(preconditions, "<this>");
        if (!Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            throw new IllegalStateException("Code not executing on main thread!");
        }
    }

    public static final void checkNotOnMainThread(Preconditions preconditions) {
        Intrinsics.checkNotNullParameter(preconditions, "<this>");
        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            throw new IllegalStateException("Code executing on main thread!");
        }
    }
}

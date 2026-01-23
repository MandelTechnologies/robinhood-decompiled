package com.jakewharton.rxbinding3.internal;

import android.os.Looper;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposables;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: mainThread.kt */
@Metadata(m3634bv = {1, 0, 3}, m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0007¨\u0006\u0004"}, m3636d2 = {"checkMainThread", "", "observer", "Lio/reactivex/Observer;", "rxbinding_release"}, m3637k = 2, m3638mv = {1, 1, 15})
@JvmName
/* renamed from: com.jakewharton.rxbinding3.internal.Preconditions, reason: use source file name */
/* loaded from: classes17.dex */
public final class mainThread {
    public static final boolean checkMainThread(Observer<?> observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            return true;
        }
        observer.onSubscribe(Disposables.empty());
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to be called on the main thread but was ");
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        observer.onError(new IllegalStateException(sb.toString()));
        return false;
    }
}

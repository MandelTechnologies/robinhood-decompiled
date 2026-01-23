package androidx.work.multiprocess;

import android.annotation.SuppressLint;

@SuppressLint({"LambdaLast"})
/* loaded from: classes16.dex */
public interface RemoteDispatcher<T> {
    void execute(T t, IWorkManagerImplCallback iWorkManagerImplCallback) throws Throwable;
}

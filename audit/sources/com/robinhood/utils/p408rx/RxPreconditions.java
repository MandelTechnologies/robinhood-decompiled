package com.robinhood.utils.p408rx;

import android.os.Looper;
import io.reactivex.CompletableObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposables;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RxPreconditions.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/utils/rx/RxPreconditions;", "", "<init>", "()V", "checkMainThread", "", "observer", "Lio/reactivex/Observer;", "Lio/reactivex/CompletableObserver;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class RxPreconditions {
    public static final RxPreconditions INSTANCE = new RxPreconditions();

    private RxPreconditions() {
    }

    public final boolean checkMainThread(Observer<?> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            return true;
        }
        observer.onSubscribe(Disposables.empty());
        observer.onError(new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName()));
        return false;
    }

    public final boolean checkMainThread(CompletableObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            return true;
        }
        observer.onSubscribe(Disposables.empty());
        observer.onError(new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName()));
        return false;
    }
}

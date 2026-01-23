package io.reactivex;

import io.reactivex.disposables.Disposable;

/* loaded from: classes21.dex */
public interface SingleObserver<T> {
    void onError(Throwable th);

    void onSubscribe(Disposable disposable);

    void onSuccess(T t);
}

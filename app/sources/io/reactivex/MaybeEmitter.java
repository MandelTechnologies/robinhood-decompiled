package io.reactivex;

import io.reactivex.functions.Cancellable;

/* loaded from: classes21.dex */
public interface MaybeEmitter<T> {
    boolean isDisposed();

    void onComplete();

    void onError(Throwable th);

    void onSuccess(T t);

    void setCancellable(Cancellable cancellable);

    boolean tryOnError(Throwable th);
}

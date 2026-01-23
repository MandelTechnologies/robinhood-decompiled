package io.reactivex;

import io.reactivex.functions.Cancellable;

/* loaded from: classes21.dex */
public interface CompletableEmitter {
    boolean isDisposed();

    void onComplete();

    void onError(Throwable th);

    void setCancellable(Cancellable cancellable);

    boolean tryOnError(Throwable th);
}

package io.reactivex.internal.operators.single;

import defpackage.C0008xc140899a;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* loaded from: classes14.dex */
public final class SingleFromCallable<T> extends Single<T> {
    final Callable<? extends T> callable;

    public SingleFromCallable(Callable<? extends T> callable) {
        this.callable = callable;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(SingleObserver<? super T> singleObserver) {
        Disposable disposableEmpty = Disposables.empty();
        singleObserver.onSubscribe(disposableEmpty);
        if (disposableEmpty.getDisposed()) {
            return;
        }
        try {
            C0008xc140899a c0008xc140899a = (Object) ObjectHelper.requireNonNull(this.callable.call(), "The callable returned a null value");
            if (disposableEmpty.getDisposed()) {
                return;
            }
            singleObserver.onSuccess(c0008xc140899a);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            if (!disposableEmpty.getDisposed()) {
                singleObserver.onError(th);
            } else {
                RxJavaPlugins.onError(th);
            }
        }
    }
}

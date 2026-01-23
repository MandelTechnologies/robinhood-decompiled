package com.robinhood.utils.p408rx;

import android.os.SystemClock;
import io.reactivex.ObservableOperator;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Timed;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OperatorElapsedTimeInterval.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0004\u0012\u0004\u0012\u0002H\u00010\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\u0007\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\b2\u0014\u0010\t\u001a\u0010\u0012\f\b\u0000\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\bH\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/utils/rx/OperatorElapsedTimeInterval;", "T", "", "Lio/reactivex/ObservableOperator;", "Lio/reactivex/schedulers/Timed;", "<init>", "()V", "apply", "Lio/reactivex/Observer;", "observer", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class OperatorElapsedTimeInterval<T> implements ObservableOperator<Timed<T>, T> {
    @Override // io.reactivex.ObservableOperator
    public Observer<? super T> apply(final Observer<? super Timed<T>> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        return new Observer<T>() { // from class: com.robinhood.utils.rx.OperatorElapsedTimeInterval.apply.1
            private long lastTimestamp = SystemClock.elapsedRealtime();

            @Override // io.reactivex.Observer
            public void onNext(T t) {
                Intrinsics.checkNotNullParameter(t, "t");
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                observer.onNext(new Timed(t, jElapsedRealtime - this.lastTimestamp, TimeUnit.MILLISECONDS));
                this.lastTimestamp = jElapsedRealtime;
            }

            @Override // io.reactivex.Observer
            public void onError(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                observer.onError(throwable);
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                observer.onComplete();
            }

            @Override // io.reactivex.Observer
            public void onSubscribe(Disposable disposable) {
                Intrinsics.checkNotNullParameter(disposable, "disposable");
                observer.onSubscribe(disposable);
            }
        };
    }
}

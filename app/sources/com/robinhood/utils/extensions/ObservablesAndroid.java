package com.robinhood.utils.extensions;

import com.robinhood.utils.p408rx.OperatorElapsedTimeInterval;
import com.robinhood.utils.p408rx.scheduler.FastPathHandlerScheduler;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Timed;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ObservablesAndroid.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a \u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0001¨\u0006\u0007"}, m3636d2 = {"observeOnMainThread", "Lio/reactivex/Observable;", "T", "", "observeOnFastPath", "elapsedTimeInterval", "Lio/reactivex/schedulers/Timed;", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.ObservablesAndroidKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class ObservablesAndroid {
    public static final <T> Observable<T> observeOnMainThread(Observable<T> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Observable<T> observableObserveOn = observable.observeOn(AndroidSchedulers.mainThread());
        Intrinsics.checkNotNullExpressionValue(observableObserveOn, "observeOn(...)");
        return observableObserveOn;
    }

    public static final <T> Observable<T> observeOnFastPath(Observable<T> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Observable<T> observableObserveOn = observable.observeOn(FastPathHandlerScheduler.INSTANCE.getMainThread());
        Intrinsics.checkNotNullExpressionValue(observableObserveOn, "observeOn(...)");
        return observableObserveOn;
    }

    public static final <T> Observable<Timed<T>> elapsedTimeInterval(Observable<T> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Observable<Timed<T>> observable2 = (Observable<Timed<T>>) observable.lift(new OperatorElapsedTimeInterval());
        Intrinsics.checkNotNullExpressionValue(observable2, "lift(...)");
        return observable2;
    }
}

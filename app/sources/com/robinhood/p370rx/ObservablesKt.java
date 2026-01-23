package com.robinhood.p370rx;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Observables.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"onTimeoutEmit", "Lio/reactivex/Observable;", "T", "", "delay", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "(Lio/reactivex/Observable;JLjava/util/concurrent/TimeUnit;Ljava/lang/Object;)Lio/reactivex/Observable;", "lib-rx"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ObservablesKt {
    public static final <T> Observable<T> onTimeoutEmit(Observable<T> observable, long j, TimeUnit timeUnit, T t) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(t, "default");
        Observable<T> observableRefCount = observable.replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        Observable<T> observableAmbWith = observableRefCount.ambWith(Observable.just(t).delay(j, timeUnit).concatWith(observableRefCount));
        Intrinsics.checkNotNullExpressionValue(observableAmbWith, "ambWith(...)");
        return observableAmbWith;
    }
}

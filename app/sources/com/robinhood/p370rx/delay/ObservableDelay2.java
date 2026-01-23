package com.robinhood.p370rx.delay;

import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ObservableDelay.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"minTimeInFlight", "Lio/reactivex/Observable;", "T", "", "delay", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "lib-rx-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rx.delay.ObservableDelayKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class ObservableDelay2 {
    public static /* synthetic */ Observable minTimeInFlight$default(Observable observable, long j, TimeUnit timeUnit, int i, Object obj) {
        if ((i & 2) != 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        return minTimeInFlight(observable, j, timeUnit);
    }

    public static final <T> Observable<T> minTimeInFlight(Observable<T> observable, long j, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Observable<T> observable2 = (Observable<T>) observable.compose(new MinTimeInFlightTransformer(j, timeUnit));
        Intrinsics.checkNotNullExpressionValue(observable2, "compose(...)");
        return observable2;
    }
}

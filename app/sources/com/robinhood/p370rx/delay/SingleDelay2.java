package com.robinhood.p370rx.delay;

import io.reactivex.Single;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SingleDelay.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"minTimeInFlight", "Lio/reactivex/Single;", "T", "", "delay", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "lib-rx-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rx.delay.SingleDelayKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class SingleDelay2 {
    public static /* synthetic */ Single minTimeInFlight$default(Single single, long j, TimeUnit timeUnit, int i, Object obj) {
        if ((i & 2) != 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        return minTimeInFlight(single, j, timeUnit);
    }

    public static final <T> Single<T> minTimeInFlight(Single<T> single, long j, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Single<T> single2 = (Single<T>) single.compose(new MinTimeInFlightTransformer(j, timeUnit));
        Intrinsics.checkNotNullExpressionValue(single2, "compose(...)");
        return single2;
    }
}

package com.robinhood.p370rx.delay;

import io.reactivex.Completable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CompletableDelay.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"minTimeInFlight", "Lio/reactivex/Completable;", "delay", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "lib-rx-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rx.delay.CompletableDelayKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class CompletableDelay2 {
    public static /* synthetic */ Completable minTimeInFlight$default(Completable completable, long j, TimeUnit timeUnit, int i, Object obj) {
        if ((i & 2) != 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        return minTimeInFlight(completable, j, timeUnit);
    }

    public static final Completable minTimeInFlight(Completable completable, long j, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(completable, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Completable completableCompose = completable.compose(new MinTimeInFlightTransformer(j, timeUnit));
        Intrinsics.checkNotNullExpressionValue(completableCompose, "compose(...)");
        return completableCompose;
    }
}

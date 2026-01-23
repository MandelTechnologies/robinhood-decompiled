package com.robinhood.android.moria.network.bouncer;

import com.robinhood.models.card.p311db.Card;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: DefaultStaleDecider.kt */
@kotlin.Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u000b\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/moria/network/bouncer/DefaultStaleDecider;", "Lkotlin/Function1;", "", "", "j$/time/Duration", "duration", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lj$/time/Duration;Lj$/time/Clock;)V", "p1", "invoke", "(Ljava/lang/Long;)Ljava/lang/Boolean;", "Lj$/time/Clock;", "staleThresholdInMillis", "J", "lib-moria"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DefaultStaleDecider implements Function1<Long, Boolean> {
    private final Clock clock;
    private final long staleThresholdInMillis;

    public DefaultStaleDecider(Duration duration, Clock clock) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.clock = clock;
        this.staleThresholdInMillis = duration.toMillis();
    }

    @Override // kotlin.jvm.functions.Function1
    public Boolean invoke(Long p1) {
        if (p1 != null) {
            return Boolean.valueOf(this.clock.millis() - p1.longValue() >= this.staleThresholdInMillis);
        }
        return Boolean.TRUE;
    }
}

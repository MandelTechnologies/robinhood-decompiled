package com.robinhood.time;

import com.robinhood.android.gold.contracts.GoldFeature;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.ZoneId;

/* compiled from: SimpleClock.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\b\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/time/SimpleClock;", "j$/time/Clock", "j$/time/ZoneId", "zone", "<init>", "(Lj$/time/ZoneId;)V", "getZone", "()Lj$/time/ZoneId;", "withZone", "(Lj$/time/ZoneId;)Lj$/time/Clock;", "j$/time/Instant", GoldFeature.INSTANT, "()Lj$/time/Instant;", "", "millis", "()J", "Lj$/time/ZoneId;", "lib-time"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public abstract class SimpleClock extends Clock {
    private final ZoneId zone;

    @Override // p479j$.time.Clock
    public abstract long millis();

    public SimpleClock(ZoneId zone) {
        Intrinsics.checkNotNullParameter(zone, "zone");
        this.zone = zone;
    }

    @Override // p479j$.time.Clock
    public ZoneId getZone() {
        return this.zone;
    }

    @Override // p479j$.time.Clock
    public Clock withZone(ZoneId zone) {
        Intrinsics.checkNotNullParameter(zone, "zone");
        return new SimpleClock2(zone, this);
    }

    @Override // p479j$.time.Clock
    public final Instant instant() {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(millis());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        return instantOfEpochMilli;
    }
}

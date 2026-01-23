package com.robinhood.time;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.ZoneId;

/* compiled from: SimpleClock.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/time/DelegatedClock;", "Lcom/robinhood/time/SimpleClock;", "j$/time/ZoneId", "zone", "j$/time/Clock", "delegate", "<init>", "(Lj$/time/ZoneId;Lj$/time/Clock;)V", "", "millis", "()J", "Lj$/time/Clock;", "lib-time"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.time.DelegatedClock, reason: use source file name */
/* loaded from: classes12.dex */
public final class SimpleClock2 extends SimpleClock {
    private final Clock delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleClock2(ZoneId zone, Clock delegate) {
        super(zone);
        Intrinsics.checkNotNullParameter(zone, "zone");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // com.robinhood.time.SimpleClock, p479j$.time.Clock
    public long millis() {
        return this.delegate.millis();
    }
}

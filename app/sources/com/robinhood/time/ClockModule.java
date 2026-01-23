package com.robinhood.time;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: ClockModule.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/time/ClockModule;", "", "<init>", "()V", "j$/time/Clock", "provideClock", "()Lj$/time/Clock;", "lib-time"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ClockModule {
    public static final ClockModule INSTANCE = new ClockModule();

    private ClockModule() {
    }

    public final Clock provideClock() {
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        Intrinsics.checkNotNullExpressionValue(clockSystemDefaultZone, "systemDefaultZone(...)");
        return clockSystemDefaultZone;
    }
}

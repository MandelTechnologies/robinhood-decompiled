package com.robinhood.android.plt;

import com.robinhood.models.card.p311db.Card;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: Stopwatch.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/plt/Stopwatch;", "", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lj$/time/Clock;)V", "", "start", "()V", "stop", "", "reset", "()J", "Lj$/time/Clock;", "startTime", "Ljava/lang/Long;", "totalElapsedTime", "J", "lib-perceived-loading-time_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class Stopwatch {
    public static final int $stable = 8;
    private final Clock clock;
    private Long startTime;
    private long totalElapsedTime;

    public Stopwatch(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.clock = clock;
    }

    public final void start() {
        if (this.startTime == null) {
            this.startTime = Long.valueOf(this.clock.millis());
        }
    }

    public final void stop() {
        Long l = this.startTime;
        if (l != null) {
            this.totalElapsedTime += this.clock.millis() - l.longValue();
        }
        this.startTime = null;
    }

    public final long reset() {
        long j = this.totalElapsedTime;
        this.startTime = null;
        this.totalElapsedTime = 0L;
        return j;
    }
}

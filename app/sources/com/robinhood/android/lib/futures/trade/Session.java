package com.robinhood.android.lib.futures.trade;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: GetMarketSessionChangeState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/lib/futures/trade/Session;", "", "j$/time/Instant", "startTime", "endTime", "<init>", "(Lj$/time/Instant;Lj$/time/Instant;)V", "component1", "()Lj$/time/Instant;", "component2", "copy", "(Lj$/time/Instant;Lj$/time/Instant;)Lcom/robinhood/android/lib/futures/trade/Session;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Instant;", "getStartTime", "getEndTime", "lib-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Session {
    private final Instant endTime;
    private final Instant startTime;

    public static /* synthetic */ Session copy$default(Session session, Instant instant, Instant instant2, int i, Object obj) {
        if ((i & 1) != 0) {
            instant = session.startTime;
        }
        if ((i & 2) != 0) {
            instant2 = session.endTime;
        }
        return session.copy(instant, instant2);
    }

    /* renamed from: component1, reason: from getter */
    public final Instant getStartTime() {
        return this.startTime;
    }

    /* renamed from: component2, reason: from getter */
    public final Instant getEndTime() {
        return this.endTime;
    }

    public final Session copy(Instant startTime, Instant endTime) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        return new Session(startTime, endTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Session)) {
            return false;
        }
        Session session = (Session) other;
        return Intrinsics.areEqual(this.startTime, session.startTime) && Intrinsics.areEqual(this.endTime, session.endTime);
    }

    public int hashCode() {
        return (this.startTime.hashCode() * 31) + this.endTime.hashCode();
    }

    public String toString() {
        return "Session(startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
    }

    public Session(Instant startTime, Instant endTime) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public final Instant getStartTime() {
        return this.startTime;
    }

    public final Instant getEndTime() {
        return this.endTime;
    }
}

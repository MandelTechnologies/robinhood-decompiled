package com.robinhood.userleap;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Duration;

/* compiled from: SurveyManager.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/userleap/PendingSurvey;", "", "", "event", "j$/time/Duration", "delay", "<init>", "(Ljava/lang/String;Lj$/time/Duration;)V", "component1", "()Ljava/lang/String;", "component2", "()Lj$/time/Duration;", "copy", "(Ljava/lang/String;Lj$/time/Duration;)Lcom/robinhood/userleap/PendingSurvey;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEvent", "Lj$/time/Duration;", "getDelay", "lib-userleap_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
final /* data */ class PendingSurvey {
    private final Duration delay;
    private final String event;

    public static /* synthetic */ PendingSurvey copy$default(PendingSurvey pendingSurvey, String str, Duration duration, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pendingSurvey.event;
        }
        if ((i & 2) != 0) {
            duration = pendingSurvey.delay;
        }
        return pendingSurvey.copy(str, duration);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEvent() {
        return this.event;
    }

    /* renamed from: component2, reason: from getter */
    public final Duration getDelay() {
        return this.delay;
    }

    public final PendingSurvey copy(String event, Duration delay) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(delay, "delay");
        return new PendingSurvey(event, delay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PendingSurvey)) {
            return false;
        }
        PendingSurvey pendingSurvey = (PendingSurvey) other;
        return Intrinsics.areEqual(this.event, pendingSurvey.event) && Intrinsics.areEqual(this.delay, pendingSurvey.delay);
    }

    public int hashCode() {
        return (this.event.hashCode() * 31) + this.delay.hashCode();
    }

    public String toString() {
        return "PendingSurvey(event=" + this.event + ", delay=" + this.delay + ")";
    }

    public PendingSurvey(String event, Duration delay) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(delay, "delay");
        this.event = event;
        this.delay = delay;
    }

    public final String getEvent() {
        return this.event;
    }

    public final Duration getDelay() {
        return this.delay;
    }
}

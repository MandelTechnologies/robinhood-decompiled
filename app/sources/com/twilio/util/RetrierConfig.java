package com.twilio.util;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;

/* compiled from: Retrier.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u0017\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0010J\u0016\u0010\u0019\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0010J\u0016\u0010\u001b\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\rJ\u0016\u0010\u001f\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0010JQ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\tHÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0019\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0016\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, m3636d2 = {"Lcom/twilio/util/RetrierConfig;", "", "startDelay", "Lkotlin/time/Duration;", "minDelay", "maxDelay", "randomizeFactor", "", "maxAttemptsCount", "", "maxAttemptsTime", "(JJJDLjava/lang/Integer;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMaxAttemptsCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxAttemptsTime-UwyO8pc", "()J", "J", "getMaxDelay-UwyO8pc", "getMinDelay-UwyO8pc", "getRandomizeFactor", "()D", "getStartDelay-UwyO8pc", "component1", "component1-UwyO8pc", "component2", "component2-UwyO8pc", "component3", "component3-UwyO8pc", "component4", "component5", "component6", "component6-UwyO8pc", "copy", "copy-_WNkvzk", "(JJJDLjava/lang/Integer;J)Lcom/twilio/util/RetrierConfig;", "equals", "", "other", "hashCode", "toString", "", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RetrierConfig {
    private final Integer maxAttemptsCount;
    private final long maxAttemptsTime;
    private final long maxDelay;
    private final long minDelay;
    private final double randomizeFactor;
    private final long startDelay;

    public /* synthetic */ RetrierConfig(long j, long j2, long j3, double d, Integer num, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, d, num, j4);
    }

    /* renamed from: copy-_WNkvzk$default, reason: not valid java name */
    public static /* synthetic */ RetrierConfig m27244copy_WNkvzk$default(RetrierConfig retrierConfig, long j, long j2, long j3, double d, Integer num, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = retrierConfig.startDelay;
        }
        return retrierConfig.m27249copy_WNkvzk(j, (i & 2) != 0 ? retrierConfig.minDelay : j2, (i & 4) != 0 ? retrierConfig.maxDelay : j3, (i & 8) != 0 ? retrierConfig.randomizeFactor : d, (i & 16) != 0 ? retrierConfig.maxAttemptsCount : num, (i & 32) != 0 ? retrierConfig.maxAttemptsTime : j4);
    }

    /* renamed from: component1-UwyO8pc, reason: not valid java name and from getter */
    public final long getStartDelay() {
        return this.startDelay;
    }

    /* renamed from: component2-UwyO8pc, reason: not valid java name and from getter */
    public final long getMinDelay() {
        return this.minDelay;
    }

    /* renamed from: component3-UwyO8pc, reason: not valid java name and from getter */
    public final long getMaxDelay() {
        return this.maxDelay;
    }

    /* renamed from: component4, reason: from getter */
    public final double getRandomizeFactor() {
        return this.randomizeFactor;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getMaxAttemptsCount() {
        return this.maxAttemptsCount;
    }

    /* renamed from: component6-UwyO8pc, reason: not valid java name and from getter */
    public final long getMaxAttemptsTime() {
        return this.maxAttemptsTime;
    }

    /* renamed from: copy-_WNkvzk, reason: not valid java name */
    public final RetrierConfig m27249copy_WNkvzk(long startDelay, long minDelay, long maxDelay, double randomizeFactor, Integer maxAttemptsCount, long maxAttemptsTime) {
        return new RetrierConfig(startDelay, minDelay, maxDelay, randomizeFactor, maxAttemptsCount, maxAttemptsTime, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetrierConfig)) {
            return false;
        }
        RetrierConfig retrierConfig = (RetrierConfig) other;
        return Duration.m28733equalsimpl0(this.startDelay, retrierConfig.startDelay) && Duration.m28733equalsimpl0(this.minDelay, retrierConfig.minDelay) && Duration.m28733equalsimpl0(this.maxDelay, retrierConfig.maxDelay) && Double.compare(this.randomizeFactor, retrierConfig.randomizeFactor) == 0 && Intrinsics.areEqual(this.maxAttemptsCount, retrierConfig.maxAttemptsCount) && Duration.m28733equalsimpl0(this.maxAttemptsTime, retrierConfig.maxAttemptsTime);
    }

    public int hashCode() {
        int iM28747hashCodeimpl = ((((((Duration.m28747hashCodeimpl(this.startDelay) * 31) + Duration.m28747hashCodeimpl(this.minDelay)) * 31) + Duration.m28747hashCodeimpl(this.maxDelay)) * 31) + Double.hashCode(this.randomizeFactor)) * 31;
        Integer num = this.maxAttemptsCount;
        return ((iM28747hashCodeimpl + (num == null ? 0 : num.hashCode())) * 31) + Duration.m28747hashCodeimpl(this.maxAttemptsTime);
    }

    public String toString() {
        return "RetrierConfig(startDelay=" + ((Object) Duration.m28761toStringimpl(this.startDelay)) + ", minDelay=" + ((Object) Duration.m28761toStringimpl(this.minDelay)) + ", maxDelay=" + ((Object) Duration.m28761toStringimpl(this.maxDelay)) + ", randomizeFactor=" + this.randomizeFactor + ", maxAttemptsCount=" + this.maxAttemptsCount + ", maxAttemptsTime=" + ((Object) Duration.m28761toStringimpl(this.maxAttemptsTime)) + ')';
    }

    private RetrierConfig(long j, long j2, long j3, double d, Integer num, long j4) {
        this.startDelay = j;
        this.minDelay = j2;
        this.maxDelay = j3;
        this.randomizeFactor = d;
        this.maxAttemptsCount = num;
        this.maxAttemptsTime = j4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RetrierConfig(long j, long j2, long j3, double d, Integer num, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long duration;
        long duration2;
        long duration3;
        long jM28767getZEROUwyO8pc = (i & 1) != 0 ? Duration.INSTANCE.m28767getZEROUwyO8pc() : j;
        if ((i & 2) != 0) {
            Duration.Companion companion = Duration.INSTANCE;
            duration = Duration3.toDuration(2, DurationUnitJvm.SECONDS);
        } else {
            duration = j2;
        }
        if ((i & 4) != 0) {
            Duration.Companion companion2 = Duration.INSTANCE;
            duration2 = Duration3.toDuration(10, DurationUnitJvm.SECONDS);
        } else {
            duration2 = j3;
        }
        double d2 = (i & 8) != 0 ? 0.2d : d;
        Integer num2 = (i & 16) != 0 ? 10 : num;
        if ((i & 32) != 0) {
            Duration.Companion companion3 = Duration.INSTANCE;
            duration3 = Duration3.toDuration(65, DurationUnitJvm.SECONDS);
        } else {
            duration3 = j4;
        }
        this(jM28767getZEROUwyO8pc, duration, duration2, d2, num2, duration3, null);
    }

    /* renamed from: getStartDelay-UwyO8pc, reason: not valid java name */
    public final long m27253getStartDelayUwyO8pc() {
        return this.startDelay;
    }

    /* renamed from: getMinDelay-UwyO8pc, reason: not valid java name */
    public final long m27252getMinDelayUwyO8pc() {
        return this.minDelay;
    }

    /* renamed from: getMaxDelay-UwyO8pc, reason: not valid java name */
    public final long m27251getMaxDelayUwyO8pc() {
        return this.maxDelay;
    }

    public final double getRandomizeFactor() {
        return this.randomizeFactor;
    }

    public final Integer getMaxAttemptsCount() {
        return this.maxAttemptsCount;
    }

    /* renamed from: getMaxAttemptsTime-UwyO8pc, reason: not valid java name */
    public final long m27250getMaxAttemptsTimeUwyO8pc() {
        return this.maxAttemptsTime;
    }
}

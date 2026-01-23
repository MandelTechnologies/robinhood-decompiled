package com.robinhood.analytics.performance;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: ColdStartDetector.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001f\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/analytics/performance/ColdStart;", "", "j$/time/Instant", "startTime", "Ljava/lang/Class;", "Landroid/app/Activity;", "activityClass", "<init>", "(Lj$/time/Instant;Ljava/lang/Class;)V", "component1", "()Lj$/time/Instant;", "component2", "()Ljava/lang/Class;", "copy", "(Lj$/time/Instant;Ljava/lang/Class;)Lcom/robinhood/analytics/performance/ColdStart;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Instant;", "getStartTime", "Ljava/lang/Class;", "getActivityClass", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ColdStart {
    private final Class<? extends Activity> activityClass;
    private final Instant startTime;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ColdStart copy$default(ColdStart coldStart, Instant instant, Class cls, int i, Object obj) {
        if ((i & 1) != 0) {
            instant = coldStart.startTime;
        }
        if ((i & 2) != 0) {
            cls = coldStart.activityClass;
        }
        return coldStart.copy(instant, cls);
    }

    /* renamed from: component1, reason: from getter */
    public final Instant getStartTime() {
        return this.startTime;
    }

    public final Class<? extends Activity> component2() {
        return this.activityClass;
    }

    public final ColdStart copy(Instant startTime, Class<? extends Activity> activityClass) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(activityClass, "activityClass");
        return new ColdStart(startTime, activityClass);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColdStart)) {
            return false;
        }
        ColdStart coldStart = (ColdStart) other;
        return Intrinsics.areEqual(this.startTime, coldStart.startTime) && Intrinsics.areEqual(this.activityClass, coldStart.activityClass);
    }

    public int hashCode() {
        return (this.startTime.hashCode() * 31) + this.activityClass.hashCode();
    }

    public String toString() {
        return "ColdStart(startTime=" + this.startTime + ", activityClass=" + this.activityClass + ")";
    }

    public ColdStart(Instant startTime, Class<? extends Activity> activityClass) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(activityClass, "activityClass");
        this.startTime = startTime;
        this.activityClass = activityClass;
    }

    public final Instant getStartTime() {
        return this.startTime;
    }

    public final Class<? extends Activity> getActivityClass() {
        return this.activityClass;
    }
}

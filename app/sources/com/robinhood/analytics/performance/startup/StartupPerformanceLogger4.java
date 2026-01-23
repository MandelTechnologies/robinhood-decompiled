package com.robinhood.analytics.performance.startup;

import com.robinhood.analytics.performance.ColdStart;
import com.robinhood.analytics.performance.startup.StartupActivity;
import com.robinhood.analytics.performance.startup.StartupPerformanceLogger2;
import com.robinhood.models.card.p311db.Card;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: StartupPerformanceLogger.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0013\u0082\u0001\u0003\u0017\u0018\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/analytics/performance/startup/State;", "", "<init>", "()V", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/performance/ColdStart;", "coldStart", "Lcom/robinhood/analytics/performance/startup/StartupActivity;", "activity", "onActivityCreated", "(Lj$/time/Clock;Lcom/robinhood/analytics/performance/ColdStart;Lcom/robinhood/analytics/performance/startup/StartupActivity;)Lcom/robinhood/analytics/performance/startup/State;", "", "isLocked", "onActivityResumed", "(Lj$/time/Clock;ZLcom/robinhood/analytics/performance/startup/StartupActivity;)Lcom/robinhood/analytics/performance/startup/State;", "onActivityPaused", "(Lj$/time/Clock;Lcom/robinhood/analytics/performance/startup/StartupActivity;)Lcom/robinhood/analytics/performance/startup/State;", "onWatchlistReady", "(Lj$/time/Clock;)Lcom/robinhood/analytics/performance/startup/State;", "onLockscreenReady", "Stopped", "Aborted", "Lcom/robinhood/analytics/performance/startup/StartupState;", "Lcom/robinhood/analytics/performance/startup/State$Aborted;", "Lcom/robinhood/analytics/performance/startup/State$Stopped;", "lib-startup-performance_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.analytics.performance.startup.State, reason: use source file name */
/* loaded from: classes17.dex */
public abstract class StartupPerformanceLogger4 {
    public /* synthetic */ StartupPerformanceLogger4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public StartupPerformanceLogger4 onActivityPaused(Clock clock, StartupActivity activity) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(activity, "activity");
        return this;
    }

    private StartupPerformanceLogger4() {
    }

    public StartupPerformanceLogger4 onActivityCreated(Clock clock, ColdStart coldStart, StartupActivity activity) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(activity, "activity");
        return Aborted.INSTANCE;
    }

    public StartupPerformanceLogger4 onActivityResumed(Clock clock, boolean isLocked, StartupActivity activity) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(activity, "activity");
        return Aborted.INSTANCE;
    }

    public StartupPerformanceLogger4 onWatchlistReady(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        return Aborted.INSTANCE;
    }

    public StartupPerformanceLogger4 onLockscreenReady(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        return Aborted.INSTANCE;
    }

    /* compiled from: StartupPerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/analytics/performance/startup/State$Stopped;", "Lcom/robinhood/analytics/performance/startup/State;", "<init>", "()V", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/performance/ColdStart;", "coldStart", "Lcom/robinhood/analytics/performance/startup/StartupActivity;", "activity", "onActivityCreated", "(Lj$/time/Clock;Lcom/robinhood/analytics/performance/ColdStart;Lcom/robinhood/analytics/performance/startup/StartupActivity;)Lcom/robinhood/analytics/performance/startup/State;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "WELCOME_ACTIVITY_NAME", "Ljava/lang/String;", "lib-startup-performance_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.analytics.performance.startup.State$Stopped */
    public static final /* data */ class Stopped extends StartupPerformanceLogger4 {
        public static final Stopped INSTANCE = new Stopped();
        private static final String WELCOME_ACTIVITY_NAME = "com.robinhood.android.welcome.WelcomeActivity";

        /* compiled from: StartupPerformanceLogger.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.analytics.performance.startup.State$Stopped$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[StartupActivity.Screen.values().length];
                try {
                    iArr[StartupActivity.Screen.WELCOME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Stopped);
        }

        public int hashCode() {
            return -2069264636;
        }

        public String toString() {
            return "Stopped";
        }

        private Stopped() {
            super(null);
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger4
        public StartupPerformanceLogger4 onActivityCreated(Clock clock, ColdStart coldStart, StartupActivity activity) {
            Instant constructionTimestamp;
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (coldStart != null && !Intrinsics.areEqual(coldStart.getActivityClass().getName(), WELCOME_ACTIVITY_NAME)) {
                return Aborted.INSTANCE;
            }
            Instant instant = clock.instant();
            if (WhenMappings.$EnumSwitchMapping$0[activity.getScreen().ordinal()] == 1) {
                boolean z = true;
                if (coldStart == null) {
                    z = false;
                }
                boolean z2 = z;
                if (coldStart == null || (constructionTimestamp = coldStart.getStartTime()) == null) {
                    constructionTimestamp = activity.getConstructionTimestamp();
                }
                Instant instant2 = constructionTimestamp;
                Intrinsics.checkNotNull(instant);
                return new StartupPerformanceLogger2.Welcome(z2, false, instant2, instant, instant);
            }
            return Aborted.INSTANCE;
        }
    }

    /* compiled from: StartupPerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/analytics/performance/startup/State$Aborted;", "Lcom/robinhood/analytics/performance/startup/State;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-startup-performance_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.analytics.performance.startup.State$Aborted */
    public static final /* data */ class Aborted extends StartupPerformanceLogger4 {
        public static final Aborted INSTANCE = new Aborted();

        public boolean equals(Object other) {
            return this == other || (other instanceof Aborted);
        }

        public int hashCode() {
            return -1379723002;
        }

        public String toString() {
            return "Aborted";
        }

        private Aborted() {
            super(null);
        }
    }
}

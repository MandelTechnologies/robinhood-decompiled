package com.robinhood.analytics.performance.startup;

import com.robinhood.analytics.performance.ColdStart;
import com.robinhood.analytics.performance.startup.StartupActivity;
import com.robinhood.analytics.performance.startup.StartupPerformanceLogger2;
import com.robinhood.analytics.performance.startup.StartupPerformanceLogger4;
import com.robinhood.models.card.p311db.Card;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: StartupPerformanceLogger.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006R\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\u0082\u0001\u0005\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/analytics/performance/startup/StartupState;", "Lcom/robinhood/analytics/performance/startup/State;", "<init>", "()V", "", "isFromColdStart", "()Z", "getRequiresLocalAuth", "requiresLocalAuth", "j$/time/Instant", "getStartTimestamp", "()Lj$/time/Instant;", "startTimestamp", "getProcessLaunchEndTimestamp", "processLaunchEndTimestamp", "HomeStarting", "HomePending", "LockscreenStarting", "LockscreenPending", "Lcom/robinhood/analytics/performance/startup/ReportableState;", "Lcom/robinhood/analytics/performance/startup/StartupState$HomePending;", "Lcom/robinhood/analytics/performance/startup/StartupState$HomeStarting;", "Lcom/robinhood/analytics/performance/startup/StartupState$LockscreenPending;", "Lcom/robinhood/analytics/performance/startup/StartupState$LockscreenStarting;", "lib-startup-performance_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.analytics.performance.startup.StartupState, reason: use source file name */
/* loaded from: classes17.dex */
public abstract class StartupPerformanceLogger3 extends StartupPerformanceLogger4 {
    public /* synthetic */ StartupPerformanceLogger3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Instant getProcessLaunchEndTimestamp();

    public abstract boolean getRequiresLocalAuth();

    public abstract Instant getStartTimestamp();

    public abstract boolean isFromColdStart();

    private StartupPerformanceLogger3() {
        super(null);
    }

    /* compiled from: StartupPerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b\u0003\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b,\u0010\u001a¨\u0006-"}, m3636d2 = {"Lcom/robinhood/analytics/performance/startup/StartupState$HomeStarting;", "Lcom/robinhood/analytics/performance/startup/StartupState;", "", "isFromColdStart", "requiresLocalAuth", "j$/time/Instant", "startTimestamp", "processLaunchEndTimestamp", "<init>", "(ZZLj$/time/Instant;Lj$/time/Instant;)V", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/performance/ColdStart;", "coldStart", "Lcom/robinhood/analytics/performance/startup/StartupActivity;", "activity", "Lcom/robinhood/analytics/performance/startup/State;", "onActivityCreated", "(Lj$/time/Clock;Lcom/robinhood/analytics/performance/ColdStart;Lcom/robinhood/analytics/performance/startup/StartupActivity;)Lcom/robinhood/analytics/performance/startup/State;", "isLocked", "onActivityResumed", "(Lj$/time/Clock;ZLcom/robinhood/analytics/performance/startup/StartupActivity;)Lcom/robinhood/analytics/performance/startup/State;", "component1", "()Z", "component2", "component3", "()Lj$/time/Instant;", "component4", "copy", "(ZZLj$/time/Instant;Lj$/time/Instant;)Lcom/robinhood/analytics/performance/startup/StartupState$HomeStarting;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getRequiresLocalAuth", "Lj$/time/Instant;", "getStartTimestamp", "getProcessLaunchEndTimestamp", "lib-startup-performance_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.analytics.performance.startup.StartupState$HomeStarting, reason: from toString */
    /* loaded from: classes24.dex */
    public static final /* data */ class HomeStarting extends StartupPerformanceLogger3 {
        private final boolean isFromColdStart;
        private final Instant processLaunchEndTimestamp;
        private final boolean requiresLocalAuth;
        private final Instant startTimestamp;

        /* compiled from: StartupPerformanceLogger.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.analytics.performance.startup.StartupState$HomeStarting$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[StartupActivity.Screen.values().length];
                try {
                    iArr[StartupActivity.Screen.LOCKSCREEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StartupActivity.Screen.MAIN_TAB.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ HomeStarting copy$default(HomeStarting homeStarting, boolean z, boolean z2, Instant instant, Instant instant2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = homeStarting.isFromColdStart;
            }
            if ((i & 2) != 0) {
                z2 = homeStarting.requiresLocalAuth;
            }
            if ((i & 4) != 0) {
                instant = homeStarting.startTimestamp;
            }
            if ((i & 8) != 0) {
                instant2 = homeStarting.processLaunchEndTimestamp;
            }
            return homeStarting.copy(z, z2, instant, instant2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsFromColdStart() {
            return this.isFromColdStart;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getRequiresLocalAuth() {
            return this.requiresLocalAuth;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getStartTimestamp() {
            return this.startTimestamp;
        }

        /* renamed from: component4, reason: from getter */
        public final Instant getProcessLaunchEndTimestamp() {
            return this.processLaunchEndTimestamp;
        }

        public final HomeStarting copy(boolean isFromColdStart, boolean requiresLocalAuth, Instant startTimestamp, Instant processLaunchEndTimestamp) {
            Intrinsics.checkNotNullParameter(startTimestamp, "startTimestamp");
            Intrinsics.checkNotNullParameter(processLaunchEndTimestamp, "processLaunchEndTimestamp");
            return new HomeStarting(isFromColdStart, requiresLocalAuth, startTimestamp, processLaunchEndTimestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HomeStarting)) {
                return false;
            }
            HomeStarting homeStarting = (HomeStarting) other;
            return this.isFromColdStart == homeStarting.isFromColdStart && this.requiresLocalAuth == homeStarting.requiresLocalAuth && Intrinsics.areEqual(this.startTimestamp, homeStarting.startTimestamp) && Intrinsics.areEqual(this.processLaunchEndTimestamp, homeStarting.processLaunchEndTimestamp);
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.isFromColdStart) * 31) + Boolean.hashCode(this.requiresLocalAuth)) * 31) + this.startTimestamp.hashCode()) * 31) + this.processLaunchEndTimestamp.hashCode();
        }

        public String toString() {
            return "HomeStarting(isFromColdStart=" + this.isFromColdStart + ", requiresLocalAuth=" + this.requiresLocalAuth + ", startTimestamp=" + this.startTimestamp + ", processLaunchEndTimestamp=" + this.processLaunchEndTimestamp + ")";
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger3
        public boolean isFromColdStart() {
            return this.isFromColdStart;
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger3
        public boolean getRequiresLocalAuth() {
            return this.requiresLocalAuth;
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger3
        public Instant getStartTimestamp() {
            return this.startTimestamp;
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger3
        public Instant getProcessLaunchEndTimestamp() {
            return this.processLaunchEndTimestamp;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeStarting(boolean z, boolean z2, Instant startTimestamp, Instant processLaunchEndTimestamp) {
            super(null);
            Intrinsics.checkNotNullParameter(startTimestamp, "startTimestamp");
            Intrinsics.checkNotNullParameter(processLaunchEndTimestamp, "processLaunchEndTimestamp");
            this.isFromColdStart = z;
            this.requiresLocalAuth = z2;
            this.startTimestamp = startTimestamp;
            this.processLaunchEndTimestamp = processLaunchEndTimestamp;
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger4
        public StartupPerformanceLogger4 onActivityCreated(Clock clock, ColdStart coldStart, StartupActivity activity) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (WhenMappings.$EnumSwitchMapping$0[activity.getScreen().ordinal()] == 1) {
                return new LockscreenStarting(isFromColdStart(), getStartTimestamp(), getProcessLaunchEndTimestamp());
            }
            return StartupPerformanceLogger4.Aborted.INSTANCE;
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger4
        public StartupPerformanceLogger4 onActivityResumed(Clock clock, boolean isLocked, StartupActivity activity) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (WhenMappings.$EnumSwitchMapping$0[activity.getScreen().ordinal()] != 2) {
                return StartupPerformanceLogger4.Aborted.INSTANCE;
            }
            if (isLocked) {
                return copy$default(this, false, true, null, null, 13, null);
            }
            return new HomePending(isFromColdStart(), getRequiresLocalAuth(), getStartTimestamp(), getProcessLaunchEndTimestamp());
        }
    }

    /* compiled from: StartupPerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J8\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\u0003\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b%\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/analytics/performance/startup/StartupState$HomePending;", "Lcom/robinhood/analytics/performance/startup/StartupState;", "", "isFromColdStart", "requiresLocalAuth", "j$/time/Instant", "startTimestamp", "processLaunchEndTimestamp", "<init>", "(ZZLj$/time/Instant;Lj$/time/Instant;)V", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/performance/startup/ReportableState$Home;", "onWatchlistReady", "(Lj$/time/Clock;)Lcom/robinhood/analytics/performance/startup/ReportableState$Home;", "component1", "()Z", "component2", "component3", "()Lj$/time/Instant;", "component4", "copy", "(ZZLj$/time/Instant;Lj$/time/Instant;)Lcom/robinhood/analytics/performance/startup/StartupState$HomePending;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getRequiresLocalAuth", "Lj$/time/Instant;", "getStartTimestamp", "getProcessLaunchEndTimestamp", "lib-startup-performance_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.analytics.performance.startup.StartupState$HomePending, reason: from toString */
    /* loaded from: classes24.dex */
    public static final /* data */ class HomePending extends StartupPerformanceLogger3 {
        private final boolean isFromColdStart;
        private final Instant processLaunchEndTimestamp;
        private final boolean requiresLocalAuth;
        private final Instant startTimestamp;

        public static /* synthetic */ HomePending copy$default(HomePending homePending, boolean z, boolean z2, Instant instant, Instant instant2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = homePending.isFromColdStart;
            }
            if ((i & 2) != 0) {
                z2 = homePending.requiresLocalAuth;
            }
            if ((i & 4) != 0) {
                instant = homePending.startTimestamp;
            }
            if ((i & 8) != 0) {
                instant2 = homePending.processLaunchEndTimestamp;
            }
            return homePending.copy(z, z2, instant, instant2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsFromColdStart() {
            return this.isFromColdStart;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getRequiresLocalAuth() {
            return this.requiresLocalAuth;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getStartTimestamp() {
            return this.startTimestamp;
        }

        /* renamed from: component4, reason: from getter */
        public final Instant getProcessLaunchEndTimestamp() {
            return this.processLaunchEndTimestamp;
        }

        public final HomePending copy(boolean isFromColdStart, boolean requiresLocalAuth, Instant startTimestamp, Instant processLaunchEndTimestamp) {
            Intrinsics.checkNotNullParameter(startTimestamp, "startTimestamp");
            Intrinsics.checkNotNullParameter(processLaunchEndTimestamp, "processLaunchEndTimestamp");
            return new HomePending(isFromColdStart, requiresLocalAuth, startTimestamp, processLaunchEndTimestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HomePending)) {
                return false;
            }
            HomePending homePending = (HomePending) other;
            return this.isFromColdStart == homePending.isFromColdStart && this.requiresLocalAuth == homePending.requiresLocalAuth && Intrinsics.areEqual(this.startTimestamp, homePending.startTimestamp) && Intrinsics.areEqual(this.processLaunchEndTimestamp, homePending.processLaunchEndTimestamp);
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.isFromColdStart) * 31) + Boolean.hashCode(this.requiresLocalAuth)) * 31) + this.startTimestamp.hashCode()) * 31) + this.processLaunchEndTimestamp.hashCode();
        }

        public String toString() {
            return "HomePending(isFromColdStart=" + this.isFromColdStart + ", requiresLocalAuth=" + this.requiresLocalAuth + ", startTimestamp=" + this.startTimestamp + ", processLaunchEndTimestamp=" + this.processLaunchEndTimestamp + ")";
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger3
        public boolean isFromColdStart() {
            return this.isFromColdStart;
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger3
        public boolean getRequiresLocalAuth() {
            return this.requiresLocalAuth;
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger3
        public Instant getStartTimestamp() {
            return this.startTimestamp;
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger3
        public Instant getProcessLaunchEndTimestamp() {
            return this.processLaunchEndTimestamp;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomePending(boolean z, boolean z2, Instant startTimestamp, Instant processLaunchEndTimestamp) {
            super(null);
            Intrinsics.checkNotNullParameter(startTimestamp, "startTimestamp");
            Intrinsics.checkNotNullParameter(processLaunchEndTimestamp, "processLaunchEndTimestamp");
            this.isFromColdStart = z;
            this.requiresLocalAuth = z2;
            this.startTimestamp = startTimestamp;
            this.processLaunchEndTimestamp = processLaunchEndTimestamp;
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger4
        public StartupPerformanceLogger2.Home onWatchlistReady(Clock clock) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            boolean zIsFromColdStart = isFromColdStart();
            boolean requiresLocalAuth = getRequiresLocalAuth();
            Instant startTimestamp = getStartTimestamp();
            Instant instant = clock.instant();
            Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
            return new StartupPerformanceLogger2.Home(zIsFromColdStart, requiresLocalAuth, startTimestamp, instant, getProcessLaunchEndTimestamp());
        }
    }

    /* compiled from: StartupPerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J.\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b%\u0010\u0014R\u0014\u0010'\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0012¨\u0006("}, m3636d2 = {"Lcom/robinhood/analytics/performance/startup/StartupState$LockscreenStarting;", "Lcom/robinhood/analytics/performance/startup/StartupState;", "", "isFromColdStart", "j$/time/Instant", "startTimestamp", "processLaunchEndTimestamp", "<init>", "(ZLj$/time/Instant;Lj$/time/Instant;)V", "j$/time/Clock", Card.Icon.CLOCK, "isLocked", "Lcom/robinhood/analytics/performance/startup/StartupActivity;", "activity", "Lcom/robinhood/analytics/performance/startup/State;", "onActivityResumed", "(Lj$/time/Clock;ZLcom/robinhood/analytics/performance/startup/StartupActivity;)Lcom/robinhood/analytics/performance/startup/State;", "component1", "()Z", "component2", "()Lj$/time/Instant;", "component3", "copy", "(ZLj$/time/Instant;Lj$/time/Instant;)Lcom/robinhood/analytics/performance/startup/StartupState$LockscreenStarting;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Lj$/time/Instant;", "getStartTimestamp", "getProcessLaunchEndTimestamp", "getRequiresLocalAuth", "requiresLocalAuth", "lib-startup-performance_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.analytics.performance.startup.StartupState$LockscreenStarting, reason: from toString */
    /* loaded from: classes24.dex */
    public static final /* data */ class LockscreenStarting extends StartupPerformanceLogger3 {
        private final boolean isFromColdStart;
        private final Instant processLaunchEndTimestamp;
        private final Instant startTimestamp;

        /* compiled from: StartupPerformanceLogger.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.analytics.performance.startup.StartupState$LockscreenStarting$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[StartupActivity.Screen.values().length];
                try {
                    iArr[StartupActivity.Screen.LOCKSCREEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ LockscreenStarting copy$default(LockscreenStarting lockscreenStarting, boolean z, Instant instant, Instant instant2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = lockscreenStarting.isFromColdStart;
            }
            if ((i & 2) != 0) {
                instant = lockscreenStarting.startTimestamp;
            }
            if ((i & 4) != 0) {
                instant2 = lockscreenStarting.processLaunchEndTimestamp;
            }
            return lockscreenStarting.copy(z, instant, instant2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsFromColdStart() {
            return this.isFromColdStart;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getStartTimestamp() {
            return this.startTimestamp;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getProcessLaunchEndTimestamp() {
            return this.processLaunchEndTimestamp;
        }

        public final LockscreenStarting copy(boolean isFromColdStart, Instant startTimestamp, Instant processLaunchEndTimestamp) {
            Intrinsics.checkNotNullParameter(startTimestamp, "startTimestamp");
            Intrinsics.checkNotNullParameter(processLaunchEndTimestamp, "processLaunchEndTimestamp");
            return new LockscreenStarting(isFromColdStart, startTimestamp, processLaunchEndTimestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LockscreenStarting)) {
                return false;
            }
            LockscreenStarting lockscreenStarting = (LockscreenStarting) other;
            return this.isFromColdStart == lockscreenStarting.isFromColdStart && Intrinsics.areEqual(this.startTimestamp, lockscreenStarting.startTimestamp) && Intrinsics.areEqual(this.processLaunchEndTimestamp, lockscreenStarting.processLaunchEndTimestamp);
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger3
        public boolean getRequiresLocalAuth() {
            return true;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isFromColdStart) * 31) + this.startTimestamp.hashCode()) * 31) + this.processLaunchEndTimestamp.hashCode();
        }

        public String toString() {
            return "LockscreenStarting(isFromColdStart=" + this.isFromColdStart + ", startTimestamp=" + this.startTimestamp + ", processLaunchEndTimestamp=" + this.processLaunchEndTimestamp + ")";
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger3
        public boolean isFromColdStart() {
            return this.isFromColdStart;
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger3
        public Instant getStartTimestamp() {
            return this.startTimestamp;
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger3
        public Instant getProcessLaunchEndTimestamp() {
            return this.processLaunchEndTimestamp;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LockscreenStarting(boolean z, Instant startTimestamp, Instant processLaunchEndTimestamp) {
            super(null);
            Intrinsics.checkNotNullParameter(startTimestamp, "startTimestamp");
            Intrinsics.checkNotNullParameter(processLaunchEndTimestamp, "processLaunchEndTimestamp");
            this.isFromColdStart = z;
            this.startTimestamp = startTimestamp;
            this.processLaunchEndTimestamp = processLaunchEndTimestamp;
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger4
        public StartupPerformanceLogger4 onActivityResumed(Clock clock, boolean isLocked, StartupActivity activity) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (WhenMappings.$EnumSwitchMapping$0[activity.getScreen().ordinal()] == 1) {
                return new LockscreenPending(isFromColdStart(), getStartTimestamp(), getProcessLaunchEndTimestamp());
            }
            return StartupPerformanceLogger4.Aborted.INSTANCE;
        }
    }

    /* compiled from: StartupPerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b\u0003\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\"\u0010\u0011R\u0014\u0010$\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u000f¨\u0006%"}, m3636d2 = {"Lcom/robinhood/analytics/performance/startup/StartupState$LockscreenPending;", "Lcom/robinhood/analytics/performance/startup/StartupState;", "", "isFromColdStart", "j$/time/Instant", "startTimestamp", "processLaunchEndTimestamp", "<init>", "(ZLj$/time/Instant;Lj$/time/Instant;)V", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/performance/startup/ReportableState$Lockscreen;", "onLockscreenReady", "(Lj$/time/Clock;)Lcom/robinhood/analytics/performance/startup/ReportableState$Lockscreen;", "component1", "()Z", "component2", "()Lj$/time/Instant;", "component3", "copy", "(ZLj$/time/Instant;Lj$/time/Instant;)Lcom/robinhood/analytics/performance/startup/StartupState$LockscreenPending;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Lj$/time/Instant;", "getStartTimestamp", "getProcessLaunchEndTimestamp", "getRequiresLocalAuth", "requiresLocalAuth", "lib-startup-performance_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.analytics.performance.startup.StartupState$LockscreenPending, reason: from toString */
    /* loaded from: classes24.dex */
    public static final /* data */ class LockscreenPending extends StartupPerformanceLogger3 {
        private final boolean isFromColdStart;
        private final Instant processLaunchEndTimestamp;
        private final Instant startTimestamp;

        public static /* synthetic */ LockscreenPending copy$default(LockscreenPending lockscreenPending, boolean z, Instant instant, Instant instant2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = lockscreenPending.isFromColdStart;
            }
            if ((i & 2) != 0) {
                instant = lockscreenPending.startTimestamp;
            }
            if ((i & 4) != 0) {
                instant2 = lockscreenPending.processLaunchEndTimestamp;
            }
            return lockscreenPending.copy(z, instant, instant2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsFromColdStart() {
            return this.isFromColdStart;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getStartTimestamp() {
            return this.startTimestamp;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getProcessLaunchEndTimestamp() {
            return this.processLaunchEndTimestamp;
        }

        public final LockscreenPending copy(boolean isFromColdStart, Instant startTimestamp, Instant processLaunchEndTimestamp) {
            Intrinsics.checkNotNullParameter(startTimestamp, "startTimestamp");
            Intrinsics.checkNotNullParameter(processLaunchEndTimestamp, "processLaunchEndTimestamp");
            return new LockscreenPending(isFromColdStart, startTimestamp, processLaunchEndTimestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LockscreenPending)) {
                return false;
            }
            LockscreenPending lockscreenPending = (LockscreenPending) other;
            return this.isFromColdStart == lockscreenPending.isFromColdStart && Intrinsics.areEqual(this.startTimestamp, lockscreenPending.startTimestamp) && Intrinsics.areEqual(this.processLaunchEndTimestamp, lockscreenPending.processLaunchEndTimestamp);
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger3
        public boolean getRequiresLocalAuth() {
            return true;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isFromColdStart) * 31) + this.startTimestamp.hashCode()) * 31) + this.processLaunchEndTimestamp.hashCode();
        }

        public String toString() {
            return "LockscreenPending(isFromColdStart=" + this.isFromColdStart + ", startTimestamp=" + this.startTimestamp + ", processLaunchEndTimestamp=" + this.processLaunchEndTimestamp + ")";
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger3
        public boolean isFromColdStart() {
            return this.isFromColdStart;
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger3
        public Instant getStartTimestamp() {
            return this.startTimestamp;
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger3
        public Instant getProcessLaunchEndTimestamp() {
            return this.processLaunchEndTimestamp;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LockscreenPending(boolean z, Instant startTimestamp, Instant processLaunchEndTimestamp) {
            super(null);
            Intrinsics.checkNotNullParameter(startTimestamp, "startTimestamp");
            Intrinsics.checkNotNullParameter(processLaunchEndTimestamp, "processLaunchEndTimestamp");
            this.isFromColdStart = z;
            this.startTimestamp = startTimestamp;
            this.processLaunchEndTimestamp = processLaunchEndTimestamp;
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger4
        public StartupPerformanceLogger2.Lockscreen onLockscreenReady(Clock clock) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            boolean zIsFromColdStart = isFromColdStart();
            Instant startTimestamp = getStartTimestamp();
            Instant instant = clock.instant();
            Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
            return new StartupPerformanceLogger2.Lockscreen(zIsFromColdStart, startTimestamp, instant, getProcessLaunchEndTimestamp());
        }
    }
}

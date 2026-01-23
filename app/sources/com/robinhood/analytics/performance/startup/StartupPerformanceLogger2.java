package com.robinhood.analytics.performance.startup;

import com.robinhood.analytics.performance.ColdStart;
import com.robinhood.analytics.performance.startup.StartupActivity;
import com.robinhood.analytics.performance.startup.StartupPerformanceLogger3;
import com.robinhood.analytics.performance.startup.StartupPerformanceLogger4;
import com.robinhood.models.card.p311db.Card;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: StartupPerformanceLogger.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/analytics/performance/startup/ReportableState;", "Lcom/robinhood/analytics/performance/startup/StartupState;", "<init>", "()V", "j$/time/Instant", "getEndTimestamp", "()Lj$/time/Instant;", "endTimestamp", "Welcome", "Home", "Lockscreen", "Lcom/robinhood/analytics/performance/startup/ReportableState$Home;", "Lcom/robinhood/analytics/performance/startup/ReportableState$Lockscreen;", "Lcom/robinhood/analytics/performance/startup/ReportableState$Welcome;", "lib-startup-performance_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.analytics.performance.startup.ReportableState, reason: use source file name */
/* loaded from: classes17.dex */
public abstract class StartupPerformanceLogger2 extends StartupPerformanceLogger3 {
    public /* synthetic */ StartupPerformanceLogger2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Instant getEndTimestamp();

    private StartupPerformanceLogger2() {
        super(null);
    }

    /* compiled from: StartupPerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018JB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b\u0003\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b+\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b,\u0010\u0018¨\u0006-"}, m3636d2 = {"Lcom/robinhood/analytics/performance/startup/ReportableState$Welcome;", "Lcom/robinhood/analytics/performance/startup/ReportableState;", "", "isFromColdStart", "requiresLocalAuth", "j$/time/Instant", "startTimestamp", "endTimestamp", "processLaunchEndTimestamp", "<init>", "(ZZLj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;)V", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/performance/ColdStart;", "coldStart", "Lcom/robinhood/analytics/performance/startup/StartupActivity;", "activity", "Lcom/robinhood/analytics/performance/startup/State;", "onActivityCreated", "(Lj$/time/Clock;Lcom/robinhood/analytics/performance/ColdStart;Lcom/robinhood/analytics/performance/startup/StartupActivity;)Lcom/robinhood/analytics/performance/startup/State;", "component1", "()Z", "component2", "component3", "()Lj$/time/Instant;", "component4", "component5", "copy", "(ZZLj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;)Lcom/robinhood/analytics/performance/startup/ReportableState$Welcome;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getRequiresLocalAuth", "Lj$/time/Instant;", "getStartTimestamp", "getEndTimestamp", "getProcessLaunchEndTimestamp", "lib-startup-performance_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.analytics.performance.startup.ReportableState$Welcome, reason: from toString */
    public static final /* data */ class Welcome extends StartupPerformanceLogger2 {
        private final Instant endTimestamp;
        private final boolean isFromColdStart;
        private final Instant processLaunchEndTimestamp;
        private final boolean requiresLocalAuth;
        private final Instant startTimestamp;

        /* compiled from: StartupPerformanceLogger.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.analytics.performance.startup.ReportableState$Welcome$WhenMappings */
        /* loaded from: classes24.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[StartupActivity.Screen.values().length];
                try {
                    iArr[StartupActivity.Screen.MAIN_TAB.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ Welcome copy$default(Welcome welcome, boolean z, boolean z2, Instant instant, Instant instant2, Instant instant3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = welcome.isFromColdStart;
            }
            if ((i & 2) != 0) {
                z2 = welcome.requiresLocalAuth;
            }
            if ((i & 4) != 0) {
                instant = welcome.startTimestamp;
            }
            if ((i & 8) != 0) {
                instant2 = welcome.endTimestamp;
            }
            if ((i & 16) != 0) {
                instant3 = welcome.processLaunchEndTimestamp;
            }
            Instant instant4 = instant3;
            Instant instant5 = instant;
            return welcome.copy(z, z2, instant5, instant2, instant4);
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
        public final Instant getEndTimestamp() {
            return this.endTimestamp;
        }

        /* renamed from: component5, reason: from getter */
        public final Instant getProcessLaunchEndTimestamp() {
            return this.processLaunchEndTimestamp;
        }

        public final Welcome copy(boolean isFromColdStart, boolean requiresLocalAuth, Instant startTimestamp, Instant endTimestamp, Instant processLaunchEndTimestamp) {
            Intrinsics.checkNotNullParameter(startTimestamp, "startTimestamp");
            Intrinsics.checkNotNullParameter(endTimestamp, "endTimestamp");
            Intrinsics.checkNotNullParameter(processLaunchEndTimestamp, "processLaunchEndTimestamp");
            return new Welcome(isFromColdStart, requiresLocalAuth, startTimestamp, endTimestamp, processLaunchEndTimestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Welcome)) {
                return false;
            }
            Welcome welcome = (Welcome) other;
            return this.isFromColdStart == welcome.isFromColdStart && this.requiresLocalAuth == welcome.requiresLocalAuth && Intrinsics.areEqual(this.startTimestamp, welcome.startTimestamp) && Intrinsics.areEqual(this.endTimestamp, welcome.endTimestamp) && Intrinsics.areEqual(this.processLaunchEndTimestamp, welcome.processLaunchEndTimestamp);
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.isFromColdStart) * 31) + Boolean.hashCode(this.requiresLocalAuth)) * 31) + this.startTimestamp.hashCode()) * 31) + this.endTimestamp.hashCode()) * 31) + this.processLaunchEndTimestamp.hashCode();
        }

        public String toString() {
            return "Welcome(isFromColdStart=" + this.isFromColdStart + ", requiresLocalAuth=" + this.requiresLocalAuth + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", processLaunchEndTimestamp=" + this.processLaunchEndTimestamp + ")";
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

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger2
        public Instant getEndTimestamp() {
            return this.endTimestamp;
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger3
        public Instant getProcessLaunchEndTimestamp() {
            return this.processLaunchEndTimestamp;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Welcome(boolean z, boolean z2, Instant startTimestamp, Instant endTimestamp, Instant processLaunchEndTimestamp) {
            super(null);
            Intrinsics.checkNotNullParameter(startTimestamp, "startTimestamp");
            Intrinsics.checkNotNullParameter(endTimestamp, "endTimestamp");
            Intrinsics.checkNotNullParameter(processLaunchEndTimestamp, "processLaunchEndTimestamp");
            this.isFromColdStart = z;
            this.requiresLocalAuth = z2;
            this.startTimestamp = startTimestamp;
            this.endTimestamp = endTimestamp;
            this.processLaunchEndTimestamp = processLaunchEndTimestamp;
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger4
        public StartupPerformanceLogger4 onActivityCreated(Clock clock, ColdStart coldStart, StartupActivity activity) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (WhenMappings.$EnumSwitchMapping$0[activity.getScreen().ordinal()] == 1) {
                return new StartupPerformanceLogger3.HomeStarting(isFromColdStart(), getRequiresLocalAuth(), getStartTimestamp(), getEndTimestamp());
            }
            return StartupPerformanceLogger4.Aborted.INSTANCE;
        }
    }

    /* compiled from: StartupPerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016JB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b\u0003\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b)\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b*\u0010\u0016¨\u0006+"}, m3636d2 = {"Lcom/robinhood/analytics/performance/startup/ReportableState$Home;", "Lcom/robinhood/analytics/performance/startup/ReportableState;", "", "isFromColdStart", "requiresLocalAuth", "j$/time/Instant", "startTimestamp", "endTimestamp", "processLaunchEndTimestamp", "<init>", "(ZZLj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;)V", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/performance/startup/StartupActivity;", "activity", "Lcom/robinhood/analytics/performance/startup/State$Aborted;", "onActivityPaused", "(Lj$/time/Clock;Lcom/robinhood/analytics/performance/startup/StartupActivity;)Lcom/robinhood/analytics/performance/startup/State$Aborted;", "component1", "()Z", "component2", "component3", "()Lj$/time/Instant;", "component4", "component5", "copy", "(ZZLj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;)Lcom/robinhood/analytics/performance/startup/ReportableState$Home;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getRequiresLocalAuth", "Lj$/time/Instant;", "getStartTimestamp", "getEndTimestamp", "getProcessLaunchEndTimestamp", "lib-startup-performance_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.analytics.performance.startup.ReportableState$Home, reason: from toString */
    public static final /* data */ class Home extends StartupPerformanceLogger2 {
        private final Instant endTimestamp;
        private final boolean isFromColdStart;
        private final Instant processLaunchEndTimestamp;
        private final boolean requiresLocalAuth;
        private final Instant startTimestamp;

        public static /* synthetic */ Home copy$default(Home home, boolean z, boolean z2, Instant instant, Instant instant2, Instant instant3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = home.isFromColdStart;
            }
            if ((i & 2) != 0) {
                z2 = home.requiresLocalAuth;
            }
            if ((i & 4) != 0) {
                instant = home.startTimestamp;
            }
            if ((i & 8) != 0) {
                instant2 = home.endTimestamp;
            }
            if ((i & 16) != 0) {
                instant3 = home.processLaunchEndTimestamp;
            }
            Instant instant4 = instant3;
            Instant instant5 = instant;
            return home.copy(z, z2, instant5, instant2, instant4);
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
        public final Instant getEndTimestamp() {
            return this.endTimestamp;
        }

        /* renamed from: component5, reason: from getter */
        public final Instant getProcessLaunchEndTimestamp() {
            return this.processLaunchEndTimestamp;
        }

        public final Home copy(boolean isFromColdStart, boolean requiresLocalAuth, Instant startTimestamp, Instant endTimestamp, Instant processLaunchEndTimestamp) {
            Intrinsics.checkNotNullParameter(startTimestamp, "startTimestamp");
            Intrinsics.checkNotNullParameter(endTimestamp, "endTimestamp");
            Intrinsics.checkNotNullParameter(processLaunchEndTimestamp, "processLaunchEndTimestamp");
            return new Home(isFromColdStart, requiresLocalAuth, startTimestamp, endTimestamp, processLaunchEndTimestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Home)) {
                return false;
            }
            Home home = (Home) other;
            return this.isFromColdStart == home.isFromColdStart && this.requiresLocalAuth == home.requiresLocalAuth && Intrinsics.areEqual(this.startTimestamp, home.startTimestamp) && Intrinsics.areEqual(this.endTimestamp, home.endTimestamp) && Intrinsics.areEqual(this.processLaunchEndTimestamp, home.processLaunchEndTimestamp);
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.isFromColdStart) * 31) + Boolean.hashCode(this.requiresLocalAuth)) * 31) + this.startTimestamp.hashCode()) * 31) + this.endTimestamp.hashCode()) * 31) + this.processLaunchEndTimestamp.hashCode();
        }

        public String toString() {
            return "Home(isFromColdStart=" + this.isFromColdStart + ", requiresLocalAuth=" + this.requiresLocalAuth + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", processLaunchEndTimestamp=" + this.processLaunchEndTimestamp + ")";
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

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger2
        public Instant getEndTimestamp() {
            return this.endTimestamp;
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger3
        public Instant getProcessLaunchEndTimestamp() {
            return this.processLaunchEndTimestamp;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Home(boolean z, boolean z2, Instant startTimestamp, Instant endTimestamp, Instant processLaunchEndTimestamp) {
            super(null);
            Intrinsics.checkNotNullParameter(startTimestamp, "startTimestamp");
            Intrinsics.checkNotNullParameter(endTimestamp, "endTimestamp");
            Intrinsics.checkNotNullParameter(processLaunchEndTimestamp, "processLaunchEndTimestamp");
            this.isFromColdStart = z;
            this.requiresLocalAuth = z2;
            this.startTimestamp = startTimestamp;
            this.endTimestamp = endTimestamp;
            this.processLaunchEndTimestamp = processLaunchEndTimestamp;
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger4
        public StartupPerformanceLogger4.Aborted onActivityPaused(Clock clock, StartupActivity activity) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(activity, "activity");
            return StartupPerformanceLogger4.Aborted.INSTANCE;
        }
    }

    /* compiled from: StartupPerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b'\u0010\u0014R\u0014\u0010)\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0012¨\u0006*"}, m3636d2 = {"Lcom/robinhood/analytics/performance/startup/ReportableState$Lockscreen;", "Lcom/robinhood/analytics/performance/startup/ReportableState;", "", "isFromColdStart", "j$/time/Instant", "startTimestamp", "endTimestamp", "processLaunchEndTimestamp", "<init>", "(ZLj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;)V", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/performance/startup/StartupActivity;", "activity", "Lcom/robinhood/analytics/performance/startup/State;", "onActivityPaused", "(Lj$/time/Clock;Lcom/robinhood/analytics/performance/startup/StartupActivity;)Lcom/robinhood/analytics/performance/startup/State;", "component1", "()Z", "component2", "()Lj$/time/Instant;", "component3", "component4", "copy", "(ZLj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;)Lcom/robinhood/analytics/performance/startup/ReportableState$Lockscreen;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Lj$/time/Instant;", "getStartTimestamp", "getEndTimestamp", "getProcessLaunchEndTimestamp", "getRequiresLocalAuth", "requiresLocalAuth", "lib-startup-performance_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.analytics.performance.startup.ReportableState$Lockscreen, reason: from toString */
    public static final /* data */ class Lockscreen extends StartupPerformanceLogger2 {
        private final Instant endTimestamp;
        private final boolean isFromColdStart;
        private final Instant processLaunchEndTimestamp;
        private final Instant startTimestamp;

        /* compiled from: StartupPerformanceLogger.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.analytics.performance.startup.ReportableState$Lockscreen$WhenMappings */
        /* loaded from: classes24.dex */
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

        public static /* synthetic */ Lockscreen copy$default(Lockscreen lockscreen, boolean z, Instant instant, Instant instant2, Instant instant3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = lockscreen.isFromColdStart;
            }
            if ((i & 2) != 0) {
                instant = lockscreen.startTimestamp;
            }
            if ((i & 4) != 0) {
                instant2 = lockscreen.endTimestamp;
            }
            if ((i & 8) != 0) {
                instant3 = lockscreen.processLaunchEndTimestamp;
            }
            return lockscreen.copy(z, instant, instant2, instant3);
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
        public final Instant getEndTimestamp() {
            return this.endTimestamp;
        }

        /* renamed from: component4, reason: from getter */
        public final Instant getProcessLaunchEndTimestamp() {
            return this.processLaunchEndTimestamp;
        }

        public final Lockscreen copy(boolean isFromColdStart, Instant startTimestamp, Instant endTimestamp, Instant processLaunchEndTimestamp) {
            Intrinsics.checkNotNullParameter(startTimestamp, "startTimestamp");
            Intrinsics.checkNotNullParameter(endTimestamp, "endTimestamp");
            Intrinsics.checkNotNullParameter(processLaunchEndTimestamp, "processLaunchEndTimestamp");
            return new Lockscreen(isFromColdStart, startTimestamp, endTimestamp, processLaunchEndTimestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Lockscreen)) {
                return false;
            }
            Lockscreen lockscreen = (Lockscreen) other;
            return this.isFromColdStart == lockscreen.isFromColdStart && Intrinsics.areEqual(this.startTimestamp, lockscreen.startTimestamp) && Intrinsics.areEqual(this.endTimestamp, lockscreen.endTimestamp) && Intrinsics.areEqual(this.processLaunchEndTimestamp, lockscreen.processLaunchEndTimestamp);
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger3
        public boolean getRequiresLocalAuth() {
            return true;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.isFromColdStart) * 31) + this.startTimestamp.hashCode()) * 31) + this.endTimestamp.hashCode()) * 31) + this.processLaunchEndTimestamp.hashCode();
        }

        public String toString() {
            return "Lockscreen(isFromColdStart=" + this.isFromColdStart + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", processLaunchEndTimestamp=" + this.processLaunchEndTimestamp + ")";
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger3
        public boolean isFromColdStart() {
            return this.isFromColdStart;
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger3
        public Instant getStartTimestamp() {
            return this.startTimestamp;
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger2
        public Instant getEndTimestamp() {
            return this.endTimestamp;
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger3
        public Instant getProcessLaunchEndTimestamp() {
            return this.processLaunchEndTimestamp;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Lockscreen(boolean z, Instant startTimestamp, Instant endTimestamp, Instant processLaunchEndTimestamp) {
            super(null);
            Intrinsics.checkNotNullParameter(startTimestamp, "startTimestamp");
            Intrinsics.checkNotNullParameter(endTimestamp, "endTimestamp");
            Intrinsics.checkNotNullParameter(processLaunchEndTimestamp, "processLaunchEndTimestamp");
            this.isFromColdStart = z;
            this.startTimestamp = startTimestamp;
            this.endTimestamp = endTimestamp;
            this.processLaunchEndTimestamp = processLaunchEndTimestamp;
        }

        @Override // com.robinhood.analytics.performance.startup.StartupPerformanceLogger4
        public StartupPerformanceLogger4 onActivityPaused(Clock clock, StartupActivity activity) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(activity, "activity");
            Instant instant = clock.instant();
            if (WhenMappings.$EnumSwitchMapping$0[activity.getScreen().ordinal()] == 1) {
                boolean zIsFromColdStart = isFromColdStart();
                boolean requiresLocalAuth = getRequiresLocalAuth();
                Intrinsics.checkNotNull(instant);
                return new StartupPerformanceLogger3.HomeStarting(zIsFromColdStart, requiresLocalAuth, instant, instant);
            }
            return StartupPerformanceLogger4.Aborted.INSTANCE;
        }
    }
}

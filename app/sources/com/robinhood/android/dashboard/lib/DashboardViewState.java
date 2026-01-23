package com.robinhood.android.dashboard.lib;

import com.robinhood.android.autoeventlogging.LoggableViewState;
import com.robinhood.android.autoeventlogging.LoggableViewState2;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.models.home.component.DashboardComponent;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: DashboardViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u000e\u000fR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/DashboardViewState;", "Lcom/robinhood/android/autoeventlogging/LoggableViewState;", "pageDirection", "Lcom/robinhood/compose/bento/theme/Direction;", "getPageDirection", "()Lcom/robinhood/compose/bento/theme/Direction;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "brokerageAccountContext", "Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContext;", "getBrokerageAccountContext", "()Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContext;", "Loading", "Loaded", "Lcom/robinhood/android/dashboard/lib/DashboardViewState$Loaded;", "Lcom/robinhood/android/dashboard/lib/DashboardViewState$Loading;", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface DashboardViewState extends LoggableViewState {
    BrokerageAccountContext getBrokerageAccountContext();

    BentoTheme4 getPageDirection();

    Screen getScreen();

    /* compiled from: DashboardViewState.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/DashboardViewState$Loading;", "Lcom/robinhood/android/dashboard/lib/DashboardViewState;", "<init>", "()V", "pageDirection", "Lcom/robinhood/compose/bento/theme/Direction;", "getPageDirection", "()Lcom/robinhood/compose/bento/theme/Direction;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "brokerageAccountContext", "Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContext;", "getBrokerageAccountContext", "()Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContext;", "loadedState", "Lcom/robinhood/android/autoeventlogging/LoadedState$Loading;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements DashboardViewState {
        private static final BrokerageAccountContext brokerageAccountContext = null;
        private static final BentoTheme4 pageDirection = null;
        public static final Loading INSTANCE = new Loading();
        public static final int $stable = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 704394749;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }

        @Override // com.robinhood.android.dashboard.lib.DashboardViewState
        public BentoTheme4 getPageDirection() {
            return pageDirection;
        }

        @Override // com.robinhood.android.dashboard.lib.DashboardViewState
        public Screen getScreen() {
            return new Screen(null, null, null, null, 15, null);
        }

        @Override // com.robinhood.android.dashboard.lib.DashboardViewState
        public BrokerageAccountContext getBrokerageAccountContext() {
            return brokerageAccountContext;
        }

        @Override // com.robinhood.android.autoeventlogging.LoggableViewState
        public LoggableViewState2.Loading loadedState() {
            return new LoggableViewState2.Loading("DASHBOARD_DUXO");
        }
    }

    /* compiled from: DashboardViewState.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001f\u001a\u00020 H\u0016J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003Jc\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eHÆ\u0001J\u0013\u0010*\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001e¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/DashboardViewState$Loaded;", "Lcom/robinhood/android/dashboard/lib/DashboardViewState;", "dashboardType", "Lcom/robinhood/android/home/contracts/HomeDashboardType;", "components", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/home/component/DashboardComponent;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "brokerageAccountContext", "Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContext;", "pageDirection", "Lcom/robinhood/compose/bento/theme/Direction;", "hasSeenFxSwitcherFtux", "", "isEmbedded", "isDashboardFundingCtaEnabled", "<init>", "(Lcom/robinhood/android/home/contracts/HomeDashboardType;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContext;Lcom/robinhood/compose/bento/theme/Direction;ZZZ)V", "getDashboardType", "()Lcom/robinhood/android/home/contracts/HomeDashboardType;", "getComponents", "()Lkotlinx/collections/immutable/ImmutableList;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getBrokerageAccountContext", "()Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContext;", "getPageDirection", "()Lcom/robinhood/compose/bento/theme/Direction;", "getHasSeenFxSwitcherFtux", "()Z", "loadedState", "Lcom/robinhood/android/autoeventlogging/LoadedState$Completed;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Loaded implements DashboardViewState {
        public static final int $stable = 8;
        private final BrokerageAccountContext brokerageAccountContext;
        private final ImmutableList<DashboardComponent> components;
        private final HomeDashboardType dashboardType;
        private final boolean hasSeenFxSwitcherFtux;
        private final boolean isDashboardFundingCtaEnabled;
        private final boolean isEmbedded;
        private final BentoTheme4 pageDirection;
        private final Screen screen;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, HomeDashboardType homeDashboardType, ImmutableList immutableList, Screen screen, BrokerageAccountContext brokerageAccountContext, BentoTheme4 bentoTheme4, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                homeDashboardType = loaded.dashboardType;
            }
            if ((i & 2) != 0) {
                immutableList = loaded.components;
            }
            if ((i & 4) != 0) {
                screen = loaded.screen;
            }
            if ((i & 8) != 0) {
                brokerageAccountContext = loaded.brokerageAccountContext;
            }
            if ((i & 16) != 0) {
                bentoTheme4 = loaded.pageDirection;
            }
            if ((i & 32) != 0) {
                z = loaded.hasSeenFxSwitcherFtux;
            }
            if ((i & 64) != 0) {
                z2 = loaded.isEmbedded;
            }
            if ((i & 128) != 0) {
                z3 = loaded.isDashboardFundingCtaEnabled;
            }
            boolean z4 = z2;
            boolean z5 = z3;
            BentoTheme4 bentoTheme42 = bentoTheme4;
            boolean z6 = z;
            return loaded.copy(homeDashboardType, immutableList, screen, brokerageAccountContext, bentoTheme42, z6, z4, z5);
        }

        /* renamed from: component1, reason: from getter */
        public final HomeDashboardType getDashboardType() {
            return this.dashboardType;
        }

        public final ImmutableList<DashboardComponent> component2() {
            return this.components;
        }

        /* renamed from: component3, reason: from getter */
        public final Screen getScreen() {
            return this.screen;
        }

        /* renamed from: component4, reason: from getter */
        public final BrokerageAccountContext getBrokerageAccountContext() {
            return this.brokerageAccountContext;
        }

        /* renamed from: component5, reason: from getter */
        public final BentoTheme4 getPageDirection() {
            return this.pageDirection;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getHasSeenFxSwitcherFtux() {
            return this.hasSeenFxSwitcherFtux;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsEmbedded() {
            return this.isEmbedded;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsDashboardFundingCtaEnabled() {
            return this.isDashboardFundingCtaEnabled;
        }

        public final Loaded copy(HomeDashboardType dashboardType, ImmutableList<? extends DashboardComponent> components, Screen screen, BrokerageAccountContext brokerageAccountContext, BentoTheme4 pageDirection, boolean hasSeenFxSwitcherFtux, boolean isEmbedded, boolean isDashboardFundingCtaEnabled) {
            Intrinsics.checkNotNullParameter(dashboardType, "dashboardType");
            Intrinsics.checkNotNullParameter(components, "components");
            Intrinsics.checkNotNullParameter(screen, "screen");
            return new Loaded(dashboardType, components, screen, brokerageAccountContext, pageDirection, hasSeenFxSwitcherFtux, isEmbedded, isDashboardFundingCtaEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.dashboardType, loaded.dashboardType) && Intrinsics.areEqual(this.components, loaded.components) && Intrinsics.areEqual(this.screen, loaded.screen) && Intrinsics.areEqual(this.brokerageAccountContext, loaded.brokerageAccountContext) && this.pageDirection == loaded.pageDirection && this.hasSeenFxSwitcherFtux == loaded.hasSeenFxSwitcherFtux && this.isEmbedded == loaded.isEmbedded && this.isDashboardFundingCtaEnabled == loaded.isDashboardFundingCtaEnabled;
        }

        public int hashCode() {
            int iHashCode = ((((this.dashboardType.hashCode() * 31) + this.components.hashCode()) * 31) + this.screen.hashCode()) * 31;
            BrokerageAccountContext brokerageAccountContext = this.brokerageAccountContext;
            int iHashCode2 = (iHashCode + (brokerageAccountContext == null ? 0 : brokerageAccountContext.hashCode())) * 31;
            BentoTheme4 bentoTheme4 = this.pageDirection;
            return ((((((iHashCode2 + (bentoTheme4 != null ? bentoTheme4.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasSeenFxSwitcherFtux)) * 31) + Boolean.hashCode(this.isEmbedded)) * 31) + Boolean.hashCode(this.isDashboardFundingCtaEnabled);
        }

        public String toString() {
            return "Loaded(dashboardType=" + this.dashboardType + ", components=" + this.components + ", screen=" + this.screen + ", brokerageAccountContext=" + this.brokerageAccountContext + ", pageDirection=" + this.pageDirection + ", hasSeenFxSwitcherFtux=" + this.hasSeenFxSwitcherFtux + ", isEmbedded=" + this.isEmbedded + ", isDashboardFundingCtaEnabled=" + this.isDashboardFundingCtaEnabled + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(HomeDashboardType dashboardType, ImmutableList<? extends DashboardComponent> components, Screen screen, BrokerageAccountContext brokerageAccountContext, BentoTheme4 bentoTheme4, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(dashboardType, "dashboardType");
            Intrinsics.checkNotNullParameter(components, "components");
            Intrinsics.checkNotNullParameter(screen, "screen");
            this.dashboardType = dashboardType;
            this.components = components;
            this.screen = screen;
            this.brokerageAccountContext = brokerageAccountContext;
            this.pageDirection = bentoTheme4;
            this.hasSeenFxSwitcherFtux = z;
            this.isEmbedded = z2;
            this.isDashboardFundingCtaEnabled = z3;
        }

        public /* synthetic */ Loaded(HomeDashboardType homeDashboardType, ImmutableList immutableList, Screen screen, BrokerageAccountContext brokerageAccountContext, BentoTheme4 bentoTheme4, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(homeDashboardType, immutableList, screen, (i & 8) != 0 ? null : brokerageAccountContext, bentoTheme4, (i & 32) != 0 ? false : z, z2, z3);
        }

        public final HomeDashboardType getDashboardType() {
            return this.dashboardType;
        }

        public final ImmutableList<DashboardComponent> getComponents() {
            return this.components;
        }

        @Override // com.robinhood.android.dashboard.lib.DashboardViewState
        public Screen getScreen() {
            return this.screen;
        }

        @Override // com.robinhood.android.dashboard.lib.DashboardViewState
        public BrokerageAccountContext getBrokerageAccountContext() {
            return this.brokerageAccountContext;
        }

        @Override // com.robinhood.android.dashboard.lib.DashboardViewState
        public BentoTheme4 getPageDirection() {
            return this.pageDirection;
        }

        public final boolean getHasSeenFxSwitcherFtux() {
            return this.hasSeenFxSwitcherFtux;
        }

        public final boolean isEmbedded() {
            return this.isEmbedded;
        }

        public final boolean isDashboardFundingCtaEnabled() {
            return this.isDashboardFundingCtaEnabled;
        }

        @Override // com.robinhood.android.autoeventlogging.LoggableViewState
        public LoggableViewState2.Completed loadedState() {
            Set of = SetsKt.setOf("DASHBOARD_APP_BAR_DUXO");
            if (this.isEmbedded) {
                of = null;
            }
            if (of == null) {
                of = SetsKt.emptySet();
            }
            return new LoggableViewState2.Completed("DASHBOARD_DUXO", of);
        }
    }
}

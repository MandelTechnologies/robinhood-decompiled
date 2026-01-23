package com.robinhood.android.dashboard.lib.header.brokerage.pill;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.dashboard.store.HomeDashboardStore;
import com.robinhood.android.dashboardpill.DashboardPillManager;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.BooleanPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: DashboardHeaderPillDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019Bw\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/DashboardHeaderPillDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/DashboardHeaderPillDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/android/dashboardpill/DashboardPillManager;", "dashboardPillManager", "Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "homeDashboardStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "sortingHatStore", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/prefs/BooleanPreference;", "hasCryptoImpressionPref", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/DashboardHeaderPillDuxo;", "Ljavax/inject/Provider;", "Companion", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class DashboardHeaderPillDuxo_Factory implements Factory<DashboardHeaderPillDuxo> {
    private final Provider<Clock> clock;
    private final Provider<DashboardPillManager> dashboardPillManager;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<BooleanPreference> hasCryptoImpressionPref;
    private final Provider<HomeDashboardStore> homeDashboardStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<BaseSortingHatStore> sortingHatStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final DashboardHeaderPillDuxo_Factory create(Provider<ExperimentsStore> provider, Provider<DashboardPillManager> provider2, Provider<HomeDashboardStore> provider3, Provider<BaseSortingHatStore> provider4, Provider<RegionGateProvider> provider5, Provider<BooleanPreference> provider6, Provider<Clock> provider7, Provider<DuxoBundle> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final DashboardHeaderPillDuxo newInstance(ExperimentsStore experimentsStore, DashboardPillManager dashboardPillManager, HomeDashboardStore homeDashboardStore, BaseSortingHatStore baseSortingHatStore, RegionGateProvider regionGateProvider, BooleanPreference booleanPreference, Clock clock, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(experimentsStore, dashboardPillManager, homeDashboardStore, baseSortingHatStore, regionGateProvider, booleanPreference, clock, duxoBundle);
    }

    public DashboardHeaderPillDuxo_Factory(Provider<ExperimentsStore> experimentsStore, Provider<DashboardPillManager> dashboardPillManager, Provider<HomeDashboardStore> homeDashboardStore, Provider<BaseSortingHatStore> sortingHatStore, Provider<RegionGateProvider> regionGateProvider, Provider<BooleanPreference> hasCryptoImpressionPref, Provider<Clock> clock, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(dashboardPillManager, "dashboardPillManager");
        Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(hasCryptoImpressionPref, "hasCryptoImpressionPref");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.experimentsStore = experimentsStore;
        this.dashboardPillManager = dashboardPillManager;
        this.homeDashboardStore = homeDashboardStore;
        this.sortingHatStore = sortingHatStore;
        this.regionGateProvider = regionGateProvider;
        this.hasCryptoImpressionPref = hasCryptoImpressionPref;
        this.clock = clock;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public DashboardHeaderPillDuxo get() {
        Companion companion = INSTANCE;
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        DashboardPillManager dashboardPillManager = this.dashboardPillManager.get();
        Intrinsics.checkNotNullExpressionValue(dashboardPillManager, "get(...)");
        HomeDashboardStore homeDashboardStore = this.homeDashboardStore.get();
        Intrinsics.checkNotNullExpressionValue(homeDashboardStore, "get(...)");
        BaseSortingHatStore baseSortingHatStore = this.sortingHatStore.get();
        Intrinsics.checkNotNullExpressionValue(baseSortingHatStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        BooleanPreference booleanPreference = this.hasCryptoImpressionPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(experimentsStore, dashboardPillManager, homeDashboardStore, baseSortingHatStore, regionGateProvider, booleanPreference, clock, duxoBundle);
    }

    /* compiled from: DashboardHeaderPillDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u007f\u0010\u0016\u001a\u00020\u00152\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017JO\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/DashboardHeaderPillDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/android/dashboardpill/DashboardPillManager;", "dashboardPillManager", "Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "homeDashboardStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "sortingHatStore", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/prefs/BooleanPreference;", "hasCryptoImpressionPref", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/DashboardHeaderPillDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/DashboardHeaderPillDuxo_Factory;", "Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/DashboardHeaderPillDuxo;", "newInstance", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/dashboardpill/DashboardPillManager;Lcom/robinhood/android/dashboard/store/HomeDashboardStore;Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/prefs/BooleanPreference;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;)Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/DashboardHeaderPillDuxo;", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DashboardHeaderPillDuxo_Factory create(Provider<ExperimentsStore> experimentsStore, Provider<DashboardPillManager> dashboardPillManager, Provider<HomeDashboardStore> homeDashboardStore, Provider<BaseSortingHatStore> sortingHatStore, Provider<RegionGateProvider> regionGateProvider, Provider<BooleanPreference> hasCryptoImpressionPref, Provider<Clock> clock, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(dashboardPillManager, "dashboardPillManager");
            Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(hasCryptoImpressionPref, "hasCryptoImpressionPref");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new DashboardHeaderPillDuxo_Factory(experimentsStore, dashboardPillManager, homeDashboardStore, sortingHatStore, regionGateProvider, hasCryptoImpressionPref, clock, duxoBundle);
        }

        @JvmStatic
        public final DashboardHeaderPillDuxo newInstance(ExperimentsStore experimentsStore, DashboardPillManager dashboardPillManager, HomeDashboardStore homeDashboardStore, BaseSortingHatStore sortingHatStore, RegionGateProvider regionGateProvider, BooleanPreference hasCryptoImpressionPref, Clock clock, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(dashboardPillManager, "dashboardPillManager");
            Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(hasCryptoImpressionPref, "hasCryptoImpressionPref");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new DashboardHeaderPillDuxo(experimentsStore, dashboardPillManager, homeDashboardStore, sortingHatStore, regionGateProvider, hasCryptoImpressionPref, clock, duxoBundle);
        }
    }
}

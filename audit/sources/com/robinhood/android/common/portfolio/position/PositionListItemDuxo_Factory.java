package com.robinhood.android.common.portfolio.position;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equities.store.swipetotrade.EquitySwipeNuxStore;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.iac.alertsheet.IacAlertSheetStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore;
import com.robinhood.prefs.IntPreference;
import com.robinhood.shared.portfolio.listsswipenux.SwipeNuxProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PositionListItemDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0085\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/position/PositionListItemDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/portfolio/position/PositionListItemDuxo;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/portfolio/position/PositionItemStateProvider;", "positionDetailsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionDetailsStore;", "iacAlertSheetStore", "Lcom/robinhood/iac/alertsheet/IacAlertSheetStore;", "equitySwipeNuxStore", "Lcom/robinhood/android/equities/store/swipetotrade/EquitySwipeNuxStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "futuresSwipeNuxProvider", "Lcom/robinhood/shared/portfolio/listsswipenux/SwipeNuxProvider;", "displayCurrencyPref", "Lcom/robinhood/prefs/IntPreference;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PositionListItemDuxo_Factory implements Factory<PositionListItemDuxo> {
    private final Provider<IntPreference> displayCurrencyPref;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EquitySwipeNuxStore> equitySwipeNuxStore;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<SwipeNuxProvider> futuresSwipeNuxProvider;
    private final Provider<IacAlertSheetStore> iacAlertSheetStore;
    private final Provider<PositionDetailsStore> positionDetailsStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<PositionItemStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PositionListItemDuxo_Factory create(Provider<PositionItemStateProvider> provider, Provider<PositionDetailsStore> provider2, Provider<IacAlertSheetStore> provider3, Provider<EquitySwipeNuxStore> provider4, Provider<ExperimentsStore> provider5, Provider<SwipeNuxProvider> provider6, Provider<IntPreference> provider7, Provider<RegionGateProvider> provider8, Provider<DuxoBundle> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final PositionListItemDuxo newInstance(PositionItemStateProvider positionItemStateProvider, PositionDetailsStore positionDetailsStore, IacAlertSheetStore iacAlertSheetStore, EquitySwipeNuxStore equitySwipeNuxStore, ExperimentsStore experimentsStore, SwipeNuxProvider swipeNuxProvider, IntPreference intPreference, RegionGateProvider regionGateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(positionItemStateProvider, positionDetailsStore, iacAlertSheetStore, equitySwipeNuxStore, experimentsStore, swipeNuxProvider, intPreference, regionGateProvider, duxoBundle);
    }

    public PositionListItemDuxo_Factory(Provider<PositionItemStateProvider> stateProvider, Provider<PositionDetailsStore> positionDetailsStore, Provider<IacAlertSheetStore> iacAlertSheetStore, Provider<EquitySwipeNuxStore> equitySwipeNuxStore, Provider<ExperimentsStore> experimentsStore, Provider<SwipeNuxProvider> futuresSwipeNuxProvider, Provider<IntPreference> displayCurrencyPref, Provider<RegionGateProvider> regionGateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(positionDetailsStore, "positionDetailsStore");
        Intrinsics.checkNotNullParameter(iacAlertSheetStore, "iacAlertSheetStore");
        Intrinsics.checkNotNullParameter(equitySwipeNuxStore, "equitySwipeNuxStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(futuresSwipeNuxProvider, "futuresSwipeNuxProvider");
        Intrinsics.checkNotNullParameter(displayCurrencyPref, "displayCurrencyPref");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.stateProvider = stateProvider;
        this.positionDetailsStore = positionDetailsStore;
        this.iacAlertSheetStore = iacAlertSheetStore;
        this.equitySwipeNuxStore = equitySwipeNuxStore;
        this.experimentsStore = experimentsStore;
        this.futuresSwipeNuxProvider = futuresSwipeNuxProvider;
        this.displayCurrencyPref = displayCurrencyPref;
        this.regionGateProvider = regionGateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public PositionListItemDuxo get() {
        Companion companion = INSTANCE;
        PositionItemStateProvider positionItemStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(positionItemStateProvider, "get(...)");
        PositionDetailsStore positionDetailsStore = this.positionDetailsStore.get();
        Intrinsics.checkNotNullExpressionValue(positionDetailsStore, "get(...)");
        IacAlertSheetStore iacAlertSheetStore = this.iacAlertSheetStore.get();
        Intrinsics.checkNotNullExpressionValue(iacAlertSheetStore, "get(...)");
        EquitySwipeNuxStore equitySwipeNuxStore = this.equitySwipeNuxStore.get();
        Intrinsics.checkNotNullExpressionValue(equitySwipeNuxStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        SwipeNuxProvider swipeNuxProvider = this.futuresSwipeNuxProvider.get();
        Intrinsics.checkNotNullExpressionValue(swipeNuxProvider, "get(...)");
        IntPreference intPreference = this.displayCurrencyPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(positionItemStateProvider, positionDetailsStore, iacAlertSheetStore, equitySwipeNuxStore, experimentsStore, swipeNuxProvider, intPreference, regionGateProvider, duxoBundle);
    }

    /* compiled from: PositionListItemDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0086\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u0007JP\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/position/PositionListItemDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/portfolio/position/PositionListItemDuxo_Factory;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/portfolio/position/PositionItemStateProvider;", "positionDetailsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionDetailsStore;", "iacAlertSheetStore", "Lcom/robinhood/iac/alertsheet/IacAlertSheetStore;", "equitySwipeNuxStore", "Lcom/robinhood/android/equities/store/swipetotrade/EquitySwipeNuxStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "futuresSwipeNuxProvider", "Lcom/robinhood/shared/portfolio/listsswipenux/SwipeNuxProvider;", "displayCurrencyPref", "Lcom/robinhood/prefs/IntPreference;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/common/portfolio/position/PositionListItemDuxo;", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PositionListItemDuxo_Factory create(Provider<PositionItemStateProvider> stateProvider, Provider<PositionDetailsStore> positionDetailsStore, Provider<IacAlertSheetStore> iacAlertSheetStore, Provider<EquitySwipeNuxStore> equitySwipeNuxStore, Provider<ExperimentsStore> experimentsStore, Provider<SwipeNuxProvider> futuresSwipeNuxProvider, Provider<IntPreference> displayCurrencyPref, Provider<RegionGateProvider> regionGateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(positionDetailsStore, "positionDetailsStore");
            Intrinsics.checkNotNullParameter(iacAlertSheetStore, "iacAlertSheetStore");
            Intrinsics.checkNotNullParameter(equitySwipeNuxStore, "equitySwipeNuxStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(futuresSwipeNuxProvider, "futuresSwipeNuxProvider");
            Intrinsics.checkNotNullParameter(displayCurrencyPref, "displayCurrencyPref");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new PositionListItemDuxo_Factory(stateProvider, positionDetailsStore, iacAlertSheetStore, equitySwipeNuxStore, experimentsStore, futuresSwipeNuxProvider, displayCurrencyPref, regionGateProvider, duxoBundle);
        }

        @JvmStatic
        public final PositionListItemDuxo newInstance(PositionItemStateProvider stateProvider, PositionDetailsStore positionDetailsStore, IacAlertSheetStore iacAlertSheetStore, EquitySwipeNuxStore equitySwipeNuxStore, ExperimentsStore experimentsStore, SwipeNuxProvider futuresSwipeNuxProvider, IntPreference displayCurrencyPref, RegionGateProvider regionGateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(positionDetailsStore, "positionDetailsStore");
            Intrinsics.checkNotNullParameter(iacAlertSheetStore, "iacAlertSheetStore");
            Intrinsics.checkNotNullParameter(equitySwipeNuxStore, "equitySwipeNuxStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(futuresSwipeNuxProvider, "futuresSwipeNuxProvider");
            Intrinsics.checkNotNullParameter(displayCurrencyPref, "displayCurrencyPref");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new PositionListItemDuxo(stateProvider, positionDetailsStore, iacAlertSheetStore, equitySwipeNuxStore, experimentsStore, futuresSwipeNuxProvider, displayCurrencyPref, regionGateProvider, duxoBundle);
        }
    }
}

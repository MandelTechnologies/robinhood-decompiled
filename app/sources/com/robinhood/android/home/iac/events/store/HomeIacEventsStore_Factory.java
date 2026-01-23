package com.robinhood.android.home.iac.events.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.slip.lib.SlipUpdatedAgreementManager;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store;
import com.robinhood.prefs.StringToBooleanMapPreference;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeIacEventsStore_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/home/iac/events/store/HomeIacEventsStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/home/iac/events/store/HomeIacEventsStore;", "crossSellLaunchManager", "Ljavax/inject/Provider;", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "positionsV2Store", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "slipUpdatedAgreementManager", "Lcom/robinhood/android/slip/lib/SlipUpdatedAgreementManager;", "showPspDetailOnLaunchPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-home-iac-events_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class HomeIacEventsStore_Factory implements Factory<HomeIacEventsStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CrossSellLaunchManager> crossSellLaunchManager;
    private final Provider<PositionsV2Store> positionsV2Store;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<StringToBooleanMapPreference> showPspDetailOnLaunchPref;
    private final Provider<SlipUpdatedAgreementManager> slipUpdatedAgreementManager;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final HomeIacEventsStore_Factory create(Provider<CrossSellLaunchManager> provider, Provider<PositionsV2Store> provider2, Provider<RegionGateProvider> provider3, Provider<SlipUpdatedAgreementManager> provider4, Provider<StringToBooleanMapPreference> provider5, Provider<StoreBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final HomeIacEventsStore newInstance(CrossSellLaunchManager crossSellLaunchManager, PositionsV2Store positionsV2Store, RegionGateProvider regionGateProvider, SlipUpdatedAgreementManager slipUpdatedAgreementManager, StringToBooleanMapPreference stringToBooleanMapPreference, StoreBundle storeBundle) {
        return INSTANCE.newInstance(crossSellLaunchManager, positionsV2Store, regionGateProvider, slipUpdatedAgreementManager, stringToBooleanMapPreference, storeBundle);
    }

    public HomeIacEventsStore_Factory(Provider<CrossSellLaunchManager> crossSellLaunchManager, Provider<PositionsV2Store> positionsV2Store, Provider<RegionGateProvider> regionGateProvider, Provider<SlipUpdatedAgreementManager> slipUpdatedAgreementManager, Provider<StringToBooleanMapPreference> showPspDetailOnLaunchPref, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(crossSellLaunchManager, "crossSellLaunchManager");
        Intrinsics.checkNotNullParameter(positionsV2Store, "positionsV2Store");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(slipUpdatedAgreementManager, "slipUpdatedAgreementManager");
        Intrinsics.checkNotNullParameter(showPspDetailOnLaunchPref, "showPspDetailOnLaunchPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.crossSellLaunchManager = crossSellLaunchManager;
        this.positionsV2Store = positionsV2Store;
        this.regionGateProvider = regionGateProvider;
        this.slipUpdatedAgreementManager = slipUpdatedAgreementManager;
        this.showPspDetailOnLaunchPref = showPspDetailOnLaunchPref;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public HomeIacEventsStore get() {
        Companion companion = INSTANCE;
        CrossSellLaunchManager crossSellLaunchManager = this.crossSellLaunchManager.get();
        Intrinsics.checkNotNullExpressionValue(crossSellLaunchManager, "get(...)");
        PositionsV2Store positionsV2Store = this.positionsV2Store.get();
        Intrinsics.checkNotNullExpressionValue(positionsV2Store, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        SlipUpdatedAgreementManager slipUpdatedAgreementManager = this.slipUpdatedAgreementManager.get();
        Intrinsics.checkNotNullExpressionValue(slipUpdatedAgreementManager, "get(...)");
        StringToBooleanMapPreference stringToBooleanMapPreference = this.showPspDetailOnLaunchPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToBooleanMapPreference, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(crossSellLaunchManager, positionsV2Store, regionGateProvider, slipUpdatedAgreementManager, stringToBooleanMapPreference, storeBundle);
    }

    /* compiled from: HomeIacEventsStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/home/iac/events/store/HomeIacEventsStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/home/iac/events/store/HomeIacEventsStore_Factory;", "crossSellLaunchManager", "Ljavax/inject/Provider;", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "positionsV2Store", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "slipUpdatedAgreementManager", "Lcom/robinhood/android/slip/lib/SlipUpdatedAgreementManager;", "showPspDetailOnLaunchPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/android/home/iac/events/store/HomeIacEventsStore;", "lib-store-home-iac-events_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final HomeIacEventsStore_Factory create(Provider<CrossSellLaunchManager> crossSellLaunchManager, Provider<PositionsV2Store> positionsV2Store, Provider<RegionGateProvider> regionGateProvider, Provider<SlipUpdatedAgreementManager> slipUpdatedAgreementManager, Provider<StringToBooleanMapPreference> showPspDetailOnLaunchPref, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(crossSellLaunchManager, "crossSellLaunchManager");
            Intrinsics.checkNotNullParameter(positionsV2Store, "positionsV2Store");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(slipUpdatedAgreementManager, "slipUpdatedAgreementManager");
            Intrinsics.checkNotNullParameter(showPspDetailOnLaunchPref, "showPspDetailOnLaunchPref");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new HomeIacEventsStore_Factory(crossSellLaunchManager, positionsV2Store, regionGateProvider, slipUpdatedAgreementManager, showPspDetailOnLaunchPref, storeBundle);
        }

        @JvmStatic
        public final HomeIacEventsStore newInstance(CrossSellLaunchManager crossSellLaunchManager, PositionsV2Store positionsV2Store, RegionGateProvider regionGateProvider, SlipUpdatedAgreementManager slipUpdatedAgreementManager, StringToBooleanMapPreference showPspDetailOnLaunchPref, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(crossSellLaunchManager, "crossSellLaunchManager");
            Intrinsics.checkNotNullParameter(positionsV2Store, "positionsV2Store");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(slipUpdatedAgreementManager, "slipUpdatedAgreementManager");
            Intrinsics.checkNotNullParameter(showPspDetailOnLaunchPref, "showPspDetailOnLaunchPref");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new HomeIacEventsStore(crossSellLaunchManager, positionsV2Store, regionGateProvider, slipUpdatedAgreementManager, showPspDetailOnLaunchPref, storeBundle);
        }
    }
}

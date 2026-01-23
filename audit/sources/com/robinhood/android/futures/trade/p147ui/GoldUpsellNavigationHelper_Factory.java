package com.robinhood.android.futures.trade.p147ui;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.store.futures.FuturesOrderStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldUpsellNavigationHelper_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/GoldUpsellNavigationHelper_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/futures/trade/ui/GoldUpsellNavigationHelper;", "shouldShowFuturesGoldUpsellPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/BooleanPreference;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "futuresOrderStore", "Lcom/robinhood/store/futures/FuturesOrderStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class GoldUpsellNavigationHelper_Factory implements Factory<GoldUpsellNavigationHelper> {
    private final Provider<FuturesOrderStore> futuresOrderStore;
    private final Provider<MarginSubscriptionStore> marginSubscriptionStore;
    private final Provider<Navigator> navigator;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<BooleanPreference> shouldShowFuturesGoldUpsellPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final GoldUpsellNavigationHelper_Factory create(Provider<BooleanPreference> provider, Provider<Navigator> provider2, Provider<MarginSubscriptionStore> provider3, Provider<FuturesOrderStore> provider4, Provider<RegionGateProvider> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final GoldUpsellNavigationHelper newInstance(BooleanPreference booleanPreference, Navigator navigator, MarginSubscriptionStore marginSubscriptionStore, FuturesOrderStore futuresOrderStore, RegionGateProvider regionGateProvider) {
        return INSTANCE.newInstance(booleanPreference, navigator, marginSubscriptionStore, futuresOrderStore, regionGateProvider);
    }

    public GoldUpsellNavigationHelper_Factory(Provider<BooleanPreference> shouldShowFuturesGoldUpsellPref, Provider<Navigator> navigator, Provider<MarginSubscriptionStore> marginSubscriptionStore, Provider<FuturesOrderStore> futuresOrderStore, Provider<RegionGateProvider> regionGateProvider) {
        Intrinsics.checkNotNullParameter(shouldShowFuturesGoldUpsellPref, "shouldShowFuturesGoldUpsellPref");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(futuresOrderStore, "futuresOrderStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        this.shouldShowFuturesGoldUpsellPref = shouldShowFuturesGoldUpsellPref;
        this.navigator = navigator;
        this.marginSubscriptionStore = marginSubscriptionStore;
        this.futuresOrderStore = futuresOrderStore;
        this.regionGateProvider = regionGateProvider;
    }

    @Override // javax.inject.Provider
    public GoldUpsellNavigationHelper get() {
        Companion companion = INSTANCE;
        BooleanPreference booleanPreference = this.shouldShowFuturesGoldUpsellPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        MarginSubscriptionStore marginSubscriptionStore = this.marginSubscriptionStore.get();
        Intrinsics.checkNotNullExpressionValue(marginSubscriptionStore, "get(...)");
        FuturesOrderStore futuresOrderStore = this.futuresOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresOrderStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        return companion.newInstance(booleanPreference, navigator, marginSubscriptionStore, futuresOrderStore, regionGateProvider);
    }

    /* compiled from: GoldUpsellNavigationHelper_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/GoldUpsellNavigationHelper_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/futures/trade/ui/GoldUpsellNavigationHelper_Factory;", "shouldShowFuturesGoldUpsellPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/BooleanPreference;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "futuresOrderStore", "Lcom/robinhood/store/futures/FuturesOrderStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "newInstance", "Lcom/robinhood/android/futures/trade/ui/GoldUpsellNavigationHelper;", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GoldUpsellNavigationHelper_Factory create(Provider<BooleanPreference> shouldShowFuturesGoldUpsellPref, Provider<Navigator> navigator, Provider<MarginSubscriptionStore> marginSubscriptionStore, Provider<FuturesOrderStore> futuresOrderStore, Provider<RegionGateProvider> regionGateProvider) {
            Intrinsics.checkNotNullParameter(shouldShowFuturesGoldUpsellPref, "shouldShowFuturesGoldUpsellPref");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
            Intrinsics.checkNotNullParameter(futuresOrderStore, "futuresOrderStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            return new GoldUpsellNavigationHelper_Factory(shouldShowFuturesGoldUpsellPref, navigator, marginSubscriptionStore, futuresOrderStore, regionGateProvider);
        }

        @JvmStatic
        public final GoldUpsellNavigationHelper newInstance(BooleanPreference shouldShowFuturesGoldUpsellPref, Navigator navigator, MarginSubscriptionStore marginSubscriptionStore, FuturesOrderStore futuresOrderStore, RegionGateProvider regionGateProvider) {
            Intrinsics.checkNotNullParameter(shouldShowFuturesGoldUpsellPref, "shouldShowFuturesGoldUpsellPref");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
            Intrinsics.checkNotNullParameter(futuresOrderStore, "futuresOrderStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            return new GoldUpsellNavigationHelper(shouldShowFuturesGoldUpsellPref, navigator, marginSubscriptionStore, futuresOrderStore, regionGateProvider);
        }
    }
}

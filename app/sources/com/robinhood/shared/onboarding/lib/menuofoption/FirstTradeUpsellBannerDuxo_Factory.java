package com.robinhood.shared.onboarding.lib.menuofoption;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.shared.onboarding.lib.menuofoption.FirstTradeUpsellBannerDuxo;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FirstTradeUpsellBannerDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/FirstTradeUpsellBannerDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/FirstTradeUpsellBannerDuxo;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/FirstTradeUpsellBannerDuxo$StateProvider;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class FirstTradeUpsellBannerDuxo_Factory implements Factory<FirstTradeUpsellBannerDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<BaseSortingHatStore> sortingHatStore;
    private final Provider<FirstTradeUpsellBannerDuxo.StateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final FirstTradeUpsellBannerDuxo_Factory create(Provider<FirstTradeUpsellBannerDuxo.StateProvider> provider, Provider<RegionGateProvider> provider2, Provider<BaseSortingHatStore> provider3, Provider<DuxoBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final FirstTradeUpsellBannerDuxo newInstance(FirstTradeUpsellBannerDuxo.StateProvider stateProvider, RegionGateProvider regionGateProvider, BaseSortingHatStore baseSortingHatStore, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(stateProvider, regionGateProvider, baseSortingHatStore, duxoBundle);
    }

    public FirstTradeUpsellBannerDuxo_Factory(Provider<FirstTradeUpsellBannerDuxo.StateProvider> stateProvider, Provider<RegionGateProvider> regionGateProvider, Provider<BaseSortingHatStore> sortingHatStore, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.stateProvider = stateProvider;
        this.regionGateProvider = regionGateProvider;
        this.sortingHatStore = sortingHatStore;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public FirstTradeUpsellBannerDuxo get() {
        Companion companion = INSTANCE;
        FirstTradeUpsellBannerDuxo.StateProvider stateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(stateProvider, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        BaseSortingHatStore baseSortingHatStore = this.sortingHatStore.get();
        Intrinsics.checkNotNullExpressionValue(baseSortingHatStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(stateProvider, regionGateProvider, baseSortingHatStore, duxoBundle);
    }

    /* compiled from: FirstTradeUpsellBannerDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/FirstTradeUpsellBannerDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/onboarding/lib/menuofoption/FirstTradeUpsellBannerDuxo_Factory;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/FirstTradeUpsellBannerDuxo$StateProvider;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/shared/onboarding/lib/menuofoption/FirstTradeUpsellBannerDuxo;", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FirstTradeUpsellBannerDuxo_Factory create(Provider<FirstTradeUpsellBannerDuxo.StateProvider> stateProvider, Provider<RegionGateProvider> regionGateProvider, Provider<BaseSortingHatStore> sortingHatStore, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new FirstTradeUpsellBannerDuxo_Factory(stateProvider, regionGateProvider, sortingHatStore, duxoBundle);
        }

        @JvmStatic
        public final FirstTradeUpsellBannerDuxo newInstance(FirstTradeUpsellBannerDuxo.StateProvider stateProvider, RegionGateProvider regionGateProvider, BaseSortingHatStore sortingHatStore, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new FirstTradeUpsellBannerDuxo(stateProvider, regionGateProvider, sortingHatStore, duxoBundle);
        }
    }
}

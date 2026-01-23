package com.robinhood.android.equities.store.swipetotrade;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquitySwipeNuxStore_Factory.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/equities/store/swipetotrade/EquitySwipeNuxStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/equities/store/swipetotrade/EquitySwipeNuxStore;", "peekLastShownPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringPreference;", "peekCountPref", "Lcom/robinhood/prefs/IntPreference;", "tooltipLastShownPref", "tradesSinceLastPeekOrSwipePref", "lastSwipePref", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-equity-swipetotrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class EquitySwipeNuxStore_Factory implements Factory<EquitySwipeNuxStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<StringPreference> lastSwipePref;
    private final Provider<IntPreference> peekCountPref;
    private final Provider<StringPreference> peekLastShownPref;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<StringPreference> tooltipLastShownPref;
    private final Provider<IntPreference> tradesSinceLastPeekOrSwipePref;

    @JvmStatic
    public static final EquitySwipeNuxStore_Factory create(Provider<StringPreference> provider, Provider<IntPreference> provider2, Provider<StringPreference> provider3, Provider<IntPreference> provider4, Provider<StringPreference> provider5, Provider<ExperimentsStore> provider6, Provider<RegionGateProvider> provider7, Provider<StoreBundle> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final EquitySwipeNuxStore newInstance(StringPreference stringPreference, IntPreference intPreference, StringPreference stringPreference2, IntPreference intPreference2, StringPreference stringPreference3, ExperimentsStore experimentsStore, RegionGateProvider regionGateProvider, StoreBundle storeBundle) {
        return INSTANCE.newInstance(stringPreference, intPreference, stringPreference2, intPreference2, stringPreference3, experimentsStore, regionGateProvider, storeBundle);
    }

    public EquitySwipeNuxStore_Factory(Provider<StringPreference> peekLastShownPref, Provider<IntPreference> peekCountPref, Provider<StringPreference> tooltipLastShownPref, Provider<IntPreference> tradesSinceLastPeekOrSwipePref, Provider<StringPreference> lastSwipePref, Provider<ExperimentsStore> experimentsStore, Provider<RegionGateProvider> regionGateProvider, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(peekLastShownPref, "peekLastShownPref");
        Intrinsics.checkNotNullParameter(peekCountPref, "peekCountPref");
        Intrinsics.checkNotNullParameter(tooltipLastShownPref, "tooltipLastShownPref");
        Intrinsics.checkNotNullParameter(tradesSinceLastPeekOrSwipePref, "tradesSinceLastPeekOrSwipePref");
        Intrinsics.checkNotNullParameter(lastSwipePref, "lastSwipePref");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.peekLastShownPref = peekLastShownPref;
        this.peekCountPref = peekCountPref;
        this.tooltipLastShownPref = tooltipLastShownPref;
        this.tradesSinceLastPeekOrSwipePref = tradesSinceLastPeekOrSwipePref;
        this.lastSwipePref = lastSwipePref;
        this.experimentsStore = experimentsStore;
        this.regionGateProvider = regionGateProvider;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public EquitySwipeNuxStore get() {
        Companion companion = INSTANCE;
        StringPreference stringPreference = this.peekLastShownPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        IntPreference intPreference = this.peekCountPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference, "get(...)");
        StringPreference stringPreference2 = this.tooltipLastShownPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        IntPreference intPreference2 = this.tradesSinceLastPeekOrSwipePref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference2, "get(...)");
        StringPreference stringPreference3 = this.lastSwipePref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference3, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(stringPreference, intPreference, stringPreference2, intPreference2, stringPreference3, experimentsStore, regionGateProvider, storeBundle);
    }

    /* compiled from: EquitySwipeNuxStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007H\u0007JH\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equities/store/swipetotrade/EquitySwipeNuxStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/equities/store/swipetotrade/EquitySwipeNuxStore_Factory;", "peekLastShownPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringPreference;", "peekCountPref", "Lcom/robinhood/prefs/IntPreference;", "tooltipLastShownPref", "tradesSinceLastPeekOrSwipePref", "lastSwipePref", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/android/equities/store/swipetotrade/EquitySwipeNuxStore;", "lib-store-equity-swipetotrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EquitySwipeNuxStore_Factory create(Provider<StringPreference> peekLastShownPref, Provider<IntPreference> peekCountPref, Provider<StringPreference> tooltipLastShownPref, Provider<IntPreference> tradesSinceLastPeekOrSwipePref, Provider<StringPreference> lastSwipePref, Provider<ExperimentsStore> experimentsStore, Provider<RegionGateProvider> regionGateProvider, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(peekLastShownPref, "peekLastShownPref");
            Intrinsics.checkNotNullParameter(peekCountPref, "peekCountPref");
            Intrinsics.checkNotNullParameter(tooltipLastShownPref, "tooltipLastShownPref");
            Intrinsics.checkNotNullParameter(tradesSinceLastPeekOrSwipePref, "tradesSinceLastPeekOrSwipePref");
            Intrinsics.checkNotNullParameter(lastSwipePref, "lastSwipePref");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new EquitySwipeNuxStore_Factory(peekLastShownPref, peekCountPref, tooltipLastShownPref, tradesSinceLastPeekOrSwipePref, lastSwipePref, experimentsStore, regionGateProvider, storeBundle);
        }

        @JvmStatic
        public final EquitySwipeNuxStore newInstance(StringPreference peekLastShownPref, IntPreference peekCountPref, StringPreference tooltipLastShownPref, IntPreference tradesSinceLastPeekOrSwipePref, StringPreference lastSwipePref, ExperimentsStore experimentsStore, RegionGateProvider regionGateProvider, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(peekLastShownPref, "peekLastShownPref");
            Intrinsics.checkNotNullParameter(peekCountPref, "peekCountPref");
            Intrinsics.checkNotNullParameter(tooltipLastShownPref, "tooltipLastShownPref");
            Intrinsics.checkNotNullParameter(tradesSinceLastPeekOrSwipePref, "tradesSinceLastPeekOrSwipePref");
            Intrinsics.checkNotNullParameter(lastSwipePref, "lastSwipePref");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new EquitySwipeNuxStore(peekLastShownPref, peekCountPref, tooltipLastShownPref, tradesSinceLastPeekOrSwipePref, lastSwipePref, experimentsStore, regionGateProvider, storeBundle);
        }
    }
}

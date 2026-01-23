package com.robinhood.android.common.recurring.upsell;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.LongSetPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.store.base.InstrumentRecurringTradabilityStore;
import com.robinhood.store.base.InvestmentScheduleStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoRecurringOrderUpsellManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/upsell/CryptoRecurringOrderUpsellManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/recurring/upsell/CryptoRecurringOrderUpsellManager;", "appType", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoRecurringOrderUpsellTimestampsPref", "Lcom/robinhood/prefs/LongSetPreference;", "cryptoRecurringOrderUpsellViewCountPref", "Lcom/robinhood/prefs/IntPreference;", "investmentScheduleStore", "Lcom/robinhood/store/base/InvestmentScheduleStore;", "recurringTradabilityStore", "Lcom/robinhood/store/base/InstrumentRecurringTradabilityStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CryptoRecurringOrderUpsellManager_Factory implements Factory<CryptoRecurringOrderUpsellManager> {
    private final Provider<AppType> appType;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<LongSetPreference> cryptoRecurringOrderUpsellTimestampsPref;
    private final Provider<IntPreference> cryptoRecurringOrderUpsellViewCountPref;
    private final Provider<InvestmentScheduleStore> investmentScheduleStore;
    private final Provider<InstrumentRecurringTradabilityStore> recurringTradabilityStore;
    private final Provider<RegionGateProvider> regionGateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoRecurringOrderUpsellManager_Factory create(Provider<AppType> provider, Provider<CryptoExperimentsStore> provider2, Provider<LongSetPreference> provider3, Provider<IntPreference> provider4, Provider<InvestmentScheduleStore> provider5, Provider<InstrumentRecurringTradabilityStore> provider6, Provider<RegionGateProvider> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final CryptoRecurringOrderUpsellManager newInstance(AppType appType, CryptoExperimentsStore cryptoExperimentsStore, LongSetPreference longSetPreference, IntPreference intPreference, InvestmentScheduleStore investmentScheduleStore, InstrumentRecurringTradabilityStore instrumentRecurringTradabilityStore, RegionGateProvider regionGateProvider) {
        return INSTANCE.newInstance(appType, cryptoExperimentsStore, longSetPreference, intPreference, investmentScheduleStore, instrumentRecurringTradabilityStore, regionGateProvider);
    }

    public CryptoRecurringOrderUpsellManager_Factory(Provider<AppType> appType, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<LongSetPreference> cryptoRecurringOrderUpsellTimestampsPref, Provider<IntPreference> cryptoRecurringOrderUpsellViewCountPref, Provider<InvestmentScheduleStore> investmentScheduleStore, Provider<InstrumentRecurringTradabilityStore> recurringTradabilityStore, Provider<RegionGateProvider> regionGateProvider) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoRecurringOrderUpsellTimestampsPref, "cryptoRecurringOrderUpsellTimestampsPref");
        Intrinsics.checkNotNullParameter(cryptoRecurringOrderUpsellViewCountPref, "cryptoRecurringOrderUpsellViewCountPref");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(recurringTradabilityStore, "recurringTradabilityStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        this.appType = appType;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoRecurringOrderUpsellTimestampsPref = cryptoRecurringOrderUpsellTimestampsPref;
        this.cryptoRecurringOrderUpsellViewCountPref = cryptoRecurringOrderUpsellViewCountPref;
        this.investmentScheduleStore = investmentScheduleStore;
        this.recurringTradabilityStore = recurringTradabilityStore;
        this.regionGateProvider = regionGateProvider;
    }

    @Override // javax.inject.Provider
    public CryptoRecurringOrderUpsellManager get() {
        Companion companion = INSTANCE;
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        LongSetPreference longSetPreference = this.cryptoRecurringOrderUpsellTimestampsPref.get();
        Intrinsics.checkNotNullExpressionValue(longSetPreference, "get(...)");
        IntPreference intPreference = this.cryptoRecurringOrderUpsellViewCountPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference, "get(...)");
        InvestmentScheduleStore investmentScheduleStore = this.investmentScheduleStore.get();
        Intrinsics.checkNotNullExpressionValue(investmentScheduleStore, "get(...)");
        InstrumentRecurringTradabilityStore instrumentRecurringTradabilityStore = this.recurringTradabilityStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentRecurringTradabilityStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        return companion.newInstance(appType, cryptoExperimentsStore, longSetPreference, intPreference, investmentScheduleStore, instrumentRecurringTradabilityStore, regionGateProvider);
    }

    /* compiled from: CryptoRecurringOrderUpsellManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/upsell/CryptoRecurringOrderUpsellManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/recurring/upsell/CryptoRecurringOrderUpsellManager_Factory;", "appType", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoRecurringOrderUpsellTimestampsPref", "Lcom/robinhood/prefs/LongSetPreference;", "cryptoRecurringOrderUpsellViewCountPref", "Lcom/robinhood/prefs/IntPreference;", "investmentScheduleStore", "Lcom/robinhood/store/base/InvestmentScheduleStore;", "recurringTradabilityStore", "Lcom/robinhood/store/base/InstrumentRecurringTradabilityStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "newInstance", "Lcom/robinhood/android/common/recurring/upsell/CryptoRecurringOrderUpsellManager;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoRecurringOrderUpsellManager_Factory create(Provider<AppType> appType, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<LongSetPreference> cryptoRecurringOrderUpsellTimestampsPref, Provider<IntPreference> cryptoRecurringOrderUpsellViewCountPref, Provider<InvestmentScheduleStore> investmentScheduleStore, Provider<InstrumentRecurringTradabilityStore> recurringTradabilityStore, Provider<RegionGateProvider> regionGateProvider) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoRecurringOrderUpsellTimestampsPref, "cryptoRecurringOrderUpsellTimestampsPref");
            Intrinsics.checkNotNullParameter(cryptoRecurringOrderUpsellViewCountPref, "cryptoRecurringOrderUpsellViewCountPref");
            Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
            Intrinsics.checkNotNullParameter(recurringTradabilityStore, "recurringTradabilityStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            return new CryptoRecurringOrderUpsellManager_Factory(appType, cryptoExperimentsStore, cryptoRecurringOrderUpsellTimestampsPref, cryptoRecurringOrderUpsellViewCountPref, investmentScheduleStore, recurringTradabilityStore, regionGateProvider);
        }

        @JvmStatic
        public final CryptoRecurringOrderUpsellManager newInstance(AppType appType, CryptoExperimentsStore cryptoExperimentsStore, LongSetPreference cryptoRecurringOrderUpsellTimestampsPref, IntPreference cryptoRecurringOrderUpsellViewCountPref, InvestmentScheduleStore investmentScheduleStore, InstrumentRecurringTradabilityStore recurringTradabilityStore, RegionGateProvider regionGateProvider) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoRecurringOrderUpsellTimestampsPref, "cryptoRecurringOrderUpsellTimestampsPref");
            Intrinsics.checkNotNullParameter(cryptoRecurringOrderUpsellViewCountPref, "cryptoRecurringOrderUpsellViewCountPref");
            Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
            Intrinsics.checkNotNullParameter(recurringTradabilityStore, "recurringTradabilityStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            return new CryptoRecurringOrderUpsellManager(appType, cryptoExperimentsStore, cryptoRecurringOrderUpsellTimestampsPref, cryptoRecurringOrderUpsellViewCountPref, investmentScheduleStore, recurringTradabilityStore, regionGateProvider);
        }
    }
}

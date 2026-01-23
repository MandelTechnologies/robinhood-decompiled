package com.robinhood.android.crypto.p094ui.detail.recurring;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoHoldingStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.librobinhood.data.store.fee.monetizationModel.CryptoOrderMonetizationModelProvider;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.recurring.resolver.InvestmentScheduleKeyResolver;
import com.robinhood.store.base.InstrumentRecurringTradabilityStore;
import com.robinhood.store.base.InvestmentScheduleStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoDetailRecurringDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B½\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010 \u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringDuxo;", "appType", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringStateProvider;", "investmentScheduleKeyResolver", "Lcom/robinhood/shared/recurring/resolver/InvestmentScheduleKeyResolver;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoHoldingStore", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "investmentScheduleStore", "Lcom/robinhood/store/base/InvestmentScheduleStore;", "instrumentRecurringTradabilityStore", "Lcom/robinhood/store/base/InstrumentRecurringTradabilityStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "cryptoOrderMonetizationModelProvider", "Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoDetailRecurringDuxo_Factory implements Factory<CryptoDetailRecurringDuxo> {
    private final Provider<AppType> appType;
    private final Provider<CryptoAccountProvider> cryptoAccountProvider;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CryptoHoldingStore> cryptoHoldingStore;
    private final Provider<CryptoOrderMonetizationModelProvider> cryptoOrderMonetizationModelProvider;
    private final Provider<CurrencyPairV2Store> currencyPairStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<InstrumentRecurringTradabilityStore> instrumentRecurringTradabilityStore;
    private final Provider<InvestmentScheduleKeyResolver> investmentScheduleKeyResolver;
    private final Provider<InvestmentScheduleStore> investmentScheduleStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CryptoDetailRecurringStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoDetailRecurringDuxo_Factory create(Provider<AppType> provider, Provider<DuxoBundle> provider2, Provider<CryptoDetailRecurringStateProvider> provider3, Provider<InvestmentScheduleKeyResolver> provider4, Provider<CryptoAccountProvider> provider5, Provider<CryptoHoldingStore> provider6, Provider<InvestmentScheduleStore> provider7, Provider<InstrumentRecurringTradabilityStore> provider8, Provider<RegionGateProvider> provider9, Provider<CurrencyPairV2Store> provider10, Provider<CryptoOrderMonetizationModelProvider> provider11, Provider<CryptoExperimentsStore> provider12, Provider<SavedStateHandle> provider13) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    @JvmStatic
    public static final CryptoDetailRecurringDuxo newInstance(AppType appType, DuxoBundle duxoBundle, CryptoDetailRecurringStateProvider cryptoDetailRecurringStateProvider, InvestmentScheduleKeyResolver investmentScheduleKeyResolver, CryptoAccountProvider cryptoAccountProvider, CryptoHoldingStore cryptoHoldingStore, InvestmentScheduleStore investmentScheduleStore, InstrumentRecurringTradabilityStore instrumentRecurringTradabilityStore, RegionGateProvider regionGateProvider, CurrencyPairV2Store currencyPairV2Store, CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider, CryptoExperimentsStore cryptoExperimentsStore, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(appType, duxoBundle, cryptoDetailRecurringStateProvider, investmentScheduleKeyResolver, cryptoAccountProvider, cryptoHoldingStore, investmentScheduleStore, instrumentRecurringTradabilityStore, regionGateProvider, currencyPairV2Store, cryptoOrderMonetizationModelProvider, cryptoExperimentsStore, savedStateHandle);
    }

    public CryptoDetailRecurringDuxo_Factory(Provider<AppType> appType, Provider<DuxoBundle> duxoBundle, Provider<CryptoDetailRecurringStateProvider> stateProvider, Provider<InvestmentScheduleKeyResolver> investmentScheduleKeyResolver, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<CryptoHoldingStore> cryptoHoldingStore, Provider<InvestmentScheduleStore> investmentScheduleStore, Provider<InstrumentRecurringTradabilityStore> instrumentRecurringTradabilityStore, Provider<RegionGateProvider> regionGateProvider, Provider<CurrencyPairV2Store> currencyPairStore, Provider<CryptoOrderMonetizationModelProvider> cryptoOrderMonetizationModelProvider, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(investmentScheduleKeyResolver, "investmentScheduleKeyResolver");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(instrumentRecurringTradabilityStore, "instrumentRecurringTradabilityStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(cryptoOrderMonetizationModelProvider, "cryptoOrderMonetizationModelProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.appType = appType;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.investmentScheduleKeyResolver = investmentScheduleKeyResolver;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoHoldingStore = cryptoHoldingStore;
        this.investmentScheduleStore = investmentScheduleStore;
        this.instrumentRecurringTradabilityStore = instrumentRecurringTradabilityStore;
        this.regionGateProvider = regionGateProvider;
        this.currencyPairStore = currencyPairStore;
        this.cryptoOrderMonetizationModelProvider = cryptoOrderMonetizationModelProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public CryptoDetailRecurringDuxo get() {
        Companion companion = INSTANCE;
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoDetailRecurringStateProvider cryptoDetailRecurringStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoDetailRecurringStateProvider, "get(...)");
        InvestmentScheduleKeyResolver investmentScheduleKeyResolver = this.investmentScheduleKeyResolver.get();
        Intrinsics.checkNotNullExpressionValue(investmentScheduleKeyResolver, "get(...)");
        CryptoAccountProvider cryptoAccountProvider = this.cryptoAccountProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountProvider, "get(...)");
        CryptoHoldingStore cryptoHoldingStore = this.cryptoHoldingStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHoldingStore, "get(...)");
        InvestmentScheduleStore investmentScheduleStore = this.investmentScheduleStore.get();
        Intrinsics.checkNotNullExpressionValue(investmentScheduleStore, "get(...)");
        InstrumentRecurringTradabilityStore instrumentRecurringTradabilityStore = this.instrumentRecurringTradabilityStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentRecurringTradabilityStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        CurrencyPairV2Store currencyPairV2Store = this.currencyPairStore.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairV2Store, "get(...)");
        CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider = this.cryptoOrderMonetizationModelProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoOrderMonetizationModelProvider, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(appType, duxoBundle, cryptoDetailRecurringStateProvider, investmentScheduleKeyResolver, cryptoAccountProvider, cryptoHoldingStore, investmentScheduleStore, instrumentRecurringTradabilityStore, regionGateProvider, currencyPairV2Store, cryptoOrderMonetizationModelProvider, cryptoExperimentsStore, savedStateHandle);
    }

    /* compiled from: CryptoDetailRecurringDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¾\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0007H\u0007Jp\u0010!\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0007¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringDuxo_Factory;", "appType", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringStateProvider;", "investmentScheduleKeyResolver", "Lcom/robinhood/shared/recurring/resolver/InvestmentScheduleKeyResolver;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoHoldingStore", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "investmentScheduleStore", "Lcom/robinhood/store/base/InvestmentScheduleStore;", "instrumentRecurringTradabilityStore", "Lcom/robinhood/store/base/InstrumentRecurringTradabilityStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "cryptoOrderMonetizationModelProvider", "Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringDuxo;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoDetailRecurringDuxo_Factory create(Provider<AppType> appType, Provider<DuxoBundle> duxoBundle, Provider<CryptoDetailRecurringStateProvider> stateProvider, Provider<InvestmentScheduleKeyResolver> investmentScheduleKeyResolver, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<CryptoHoldingStore> cryptoHoldingStore, Provider<InvestmentScheduleStore> investmentScheduleStore, Provider<InstrumentRecurringTradabilityStore> instrumentRecurringTradabilityStore, Provider<RegionGateProvider> regionGateProvider, Provider<CurrencyPairV2Store> currencyPairStore, Provider<CryptoOrderMonetizationModelProvider> cryptoOrderMonetizationModelProvider, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(investmentScheduleKeyResolver, "investmentScheduleKeyResolver");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
            Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
            Intrinsics.checkNotNullParameter(instrumentRecurringTradabilityStore, "instrumentRecurringTradabilityStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(cryptoOrderMonetizationModelProvider, "cryptoOrderMonetizationModelProvider");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CryptoDetailRecurringDuxo_Factory(appType, duxoBundle, stateProvider, investmentScheduleKeyResolver, cryptoAccountProvider, cryptoHoldingStore, investmentScheduleStore, instrumentRecurringTradabilityStore, regionGateProvider, currencyPairStore, cryptoOrderMonetizationModelProvider, cryptoExperimentsStore, savedStateHandle);
        }

        @JvmStatic
        public final CryptoDetailRecurringDuxo newInstance(AppType appType, DuxoBundle duxoBundle, CryptoDetailRecurringStateProvider stateProvider, InvestmentScheduleKeyResolver investmentScheduleKeyResolver, CryptoAccountProvider cryptoAccountProvider, CryptoHoldingStore cryptoHoldingStore, InvestmentScheduleStore investmentScheduleStore, InstrumentRecurringTradabilityStore instrumentRecurringTradabilityStore, RegionGateProvider regionGateProvider, CurrencyPairV2Store currencyPairStore, CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider, CryptoExperimentsStore cryptoExperimentsStore, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(investmentScheduleKeyResolver, "investmentScheduleKeyResolver");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
            Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
            Intrinsics.checkNotNullParameter(instrumentRecurringTradabilityStore, "instrumentRecurringTradabilityStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(cryptoOrderMonetizationModelProvider, "cryptoOrderMonetizationModelProvider");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CryptoDetailRecurringDuxo(appType, duxoBundle, stateProvider, investmentScheduleKeyResolver, cryptoAccountProvider, cryptoHoldingStore, investmentScheduleStore, instrumentRecurringTradabilityStore, regionGateProvider, currencyPairStore, cryptoOrderMonetizationModelProvider, cryptoExperimentsStore, savedStateHandle);
        }
    }
}

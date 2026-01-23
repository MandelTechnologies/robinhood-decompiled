package com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoAccountPreferencesStore;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.librobinhood.data.store.TaxlotabilityStore;
import com.robinhood.librobinhood.data.store.fee.monetizationModel.CryptoOrderMonetizationModelProvider;
import com.robinhood.prefs.IntPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.store.base.InstrumentRecurringTradabilityStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderTypeSelectorDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BË\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004¢\u0006\u0004\b \u0010!J\b\u0010\"\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorDuxo;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "recurringTradabilityStore", "Lcom/robinhood/store/base/InstrumentRecurringTradabilityStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoOrderMonetizationModelProvider", "Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;", "cryptoAccountPreferencesStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountPreferencesStore;", "cryptoUsTaxLotsOrderTypeDisplayCountPref", "Lcom/robinhood/prefs/IntPreference;", "taxlotabilityStore", "Lcom/robinhood/librobinhood/data/store/TaxlotabilityStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CryptoOrderTypeSelectorDuxo_Factory implements Factory<CryptoOrderTypeSelectorDuxo> {
    private final Provider<AppType> appType;
    private final Provider<CryptoAccountPreferencesStore> cryptoAccountPreferencesStore;
    private final Provider<CryptoAccountStore> cryptoAccountStore;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CryptoOrderMonetizationModelProvider> cryptoOrderMonetizationModelProvider;
    private final Provider<CryptoQuoteStore> cryptoQuoteStore;
    private final Provider<IntPreference> cryptoUsTaxLotsOrderTypeDisplayCountPref;
    private final Provider<CurrencyPairV2Store> currencyPairStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<InstrumentRecurringTradabilityStore> recurringTradabilityStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CryptoOrderTypeSelectorDuxo5> stateProvider;
    private final Provider<TaxlotabilityStore> taxlotabilityStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoOrderTypeSelectorDuxo_Factory create(Provider<CryptoOrderTypeSelectorDuxo5> provider, Provider<DuxoBundle> provider2, Provider<SavedStateHandle> provider3, Provider<CurrencyPairV2Store> provider4, Provider<InstrumentRecurringTradabilityStore> provider5, Provider<CryptoQuoteStore> provider6, Provider<RegionGateProvider> provider7, Provider<CryptoExperimentsStore> provider8, Provider<CryptoAccountStore> provider9, Provider<CryptoOrderMonetizationModelProvider> provider10, Provider<CryptoAccountPreferencesStore> provider11, Provider<IntPreference> provider12, Provider<TaxlotabilityStore> provider13, Provider<AppType> provider14) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    @JvmStatic
    public static final CryptoOrderTypeSelectorDuxo newInstance(CryptoOrderTypeSelectorDuxo5 cryptoOrderTypeSelectorDuxo5, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, CurrencyPairV2Store currencyPairV2Store, InstrumentRecurringTradabilityStore instrumentRecurringTradabilityStore, CryptoQuoteStore cryptoQuoteStore, RegionGateProvider regionGateProvider, CryptoExperimentsStore cryptoExperimentsStore, CryptoAccountStore cryptoAccountStore, CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider, CryptoAccountPreferencesStore cryptoAccountPreferencesStore, IntPreference intPreference, TaxlotabilityStore taxlotabilityStore, AppType appType) {
        return INSTANCE.newInstance(cryptoOrderTypeSelectorDuxo5, duxoBundle, savedStateHandle, currencyPairV2Store, instrumentRecurringTradabilityStore, cryptoQuoteStore, regionGateProvider, cryptoExperimentsStore, cryptoAccountStore, cryptoOrderMonetizationModelProvider, cryptoAccountPreferencesStore, intPreference, taxlotabilityStore, appType);
    }

    public CryptoOrderTypeSelectorDuxo_Factory(Provider<CryptoOrderTypeSelectorDuxo5> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<CurrencyPairV2Store> currencyPairStore, Provider<InstrumentRecurringTradabilityStore> recurringTradabilityStore, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<RegionGateProvider> regionGateProvider, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoAccountStore> cryptoAccountStore, Provider<CryptoOrderMonetizationModelProvider> cryptoOrderMonetizationModelProvider, Provider<CryptoAccountPreferencesStore> cryptoAccountPreferencesStore, Provider<IntPreference> cryptoUsTaxLotsOrderTypeDisplayCountPref, Provider<TaxlotabilityStore> taxlotabilityStore, Provider<AppType> appType) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(recurringTradabilityStore, "recurringTradabilityStore");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(cryptoOrderMonetizationModelProvider, "cryptoOrderMonetizationModelProvider");
        Intrinsics.checkNotNullParameter(cryptoAccountPreferencesStore, "cryptoAccountPreferencesStore");
        Intrinsics.checkNotNullParameter(cryptoUsTaxLotsOrderTypeDisplayCountPref, "cryptoUsTaxLotsOrderTypeDisplayCountPref");
        Intrinsics.checkNotNullParameter(taxlotabilityStore, "taxlotabilityStore");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
        this.currencyPairStore = currencyPairStore;
        this.recurringTradabilityStore = recurringTradabilityStore;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.regionGateProvider = regionGateProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoAccountStore = cryptoAccountStore;
        this.cryptoOrderMonetizationModelProvider = cryptoOrderMonetizationModelProvider;
        this.cryptoAccountPreferencesStore = cryptoAccountPreferencesStore;
        this.cryptoUsTaxLotsOrderTypeDisplayCountPref = cryptoUsTaxLotsOrderTypeDisplayCountPref;
        this.taxlotabilityStore = taxlotabilityStore;
        this.appType = appType;
    }

    @Override // javax.inject.Provider
    public CryptoOrderTypeSelectorDuxo get() {
        Companion companion = INSTANCE;
        CryptoOrderTypeSelectorDuxo5 cryptoOrderTypeSelectorDuxo5 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoOrderTypeSelectorDuxo5, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        CurrencyPairV2Store currencyPairV2Store = this.currencyPairStore.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairV2Store, "get(...)");
        InstrumentRecurringTradabilityStore instrumentRecurringTradabilityStore = this.recurringTradabilityStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentRecurringTradabilityStore, "get(...)");
        CryptoQuoteStore cryptoQuoteStore = this.cryptoQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoQuoteStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        CryptoAccountStore cryptoAccountStore = this.cryptoAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountStore, "get(...)");
        CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider = this.cryptoOrderMonetizationModelProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoOrderMonetizationModelProvider, "get(...)");
        CryptoAccountPreferencesStore cryptoAccountPreferencesStore = this.cryptoAccountPreferencesStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountPreferencesStore, "get(...)");
        IntPreference intPreference = this.cryptoUsTaxLotsOrderTypeDisplayCountPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference, "get(...)");
        TaxlotabilityStore taxlotabilityStore = this.taxlotabilityStore.get();
        Intrinsics.checkNotNullExpressionValue(taxlotabilityStore, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        return companion.newInstance(cryptoOrderTypeSelectorDuxo5, duxoBundle, savedStateHandle, currencyPairV2Store, instrumentRecurringTradabilityStore, cryptoQuoteStore, regionGateProvider, cryptoExperimentsStore, cryptoAccountStore, cryptoOrderMonetizationModelProvider, cryptoAccountPreferencesStore, intPreference, taxlotabilityStore, appType);
    }

    /* compiled from: CryptoOrderTypeSelectorDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÌ\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0007H\u0007Jx\u0010#\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0007¨\u0006%"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorDuxo_Factory;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "recurringTradabilityStore", "Lcom/robinhood/store/base/InstrumentRecurringTradabilityStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoOrderMonetizationModelProvider", "Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;", "cryptoAccountPreferencesStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountPreferencesStore;", "cryptoUsTaxLotsOrderTypeDisplayCountPref", "Lcom/robinhood/prefs/IntPreference;", "taxlotabilityStore", "Lcom/robinhood/librobinhood/data/store/TaxlotabilityStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "newInstance", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorDuxo;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoOrderTypeSelectorDuxo_Factory create(Provider<CryptoOrderTypeSelectorDuxo5> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<CurrencyPairV2Store> currencyPairStore, Provider<InstrumentRecurringTradabilityStore> recurringTradabilityStore, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<RegionGateProvider> regionGateProvider, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoAccountStore> cryptoAccountStore, Provider<CryptoOrderMonetizationModelProvider> cryptoOrderMonetizationModelProvider, Provider<CryptoAccountPreferencesStore> cryptoAccountPreferencesStore, Provider<IntPreference> cryptoUsTaxLotsOrderTypeDisplayCountPref, Provider<TaxlotabilityStore> taxlotabilityStore, Provider<AppType> appType) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(recurringTradabilityStore, "recurringTradabilityStore");
            Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(cryptoOrderMonetizationModelProvider, "cryptoOrderMonetizationModelProvider");
            Intrinsics.checkNotNullParameter(cryptoAccountPreferencesStore, "cryptoAccountPreferencesStore");
            Intrinsics.checkNotNullParameter(cryptoUsTaxLotsOrderTypeDisplayCountPref, "cryptoUsTaxLotsOrderTypeDisplayCountPref");
            Intrinsics.checkNotNullParameter(taxlotabilityStore, "taxlotabilityStore");
            Intrinsics.checkNotNullParameter(appType, "appType");
            return new CryptoOrderTypeSelectorDuxo_Factory(stateProvider, duxoBundle, savedStateHandle, currencyPairStore, recurringTradabilityStore, cryptoQuoteStore, regionGateProvider, cryptoExperimentsStore, cryptoAccountStore, cryptoOrderMonetizationModelProvider, cryptoAccountPreferencesStore, cryptoUsTaxLotsOrderTypeDisplayCountPref, taxlotabilityStore, appType);
        }

        @JvmStatic
        public final CryptoOrderTypeSelectorDuxo newInstance(CryptoOrderTypeSelectorDuxo5 stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, CurrencyPairV2Store currencyPairStore, InstrumentRecurringTradabilityStore recurringTradabilityStore, CryptoQuoteStore cryptoQuoteStore, RegionGateProvider regionGateProvider, CryptoExperimentsStore cryptoExperimentsStore, CryptoAccountStore cryptoAccountStore, CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider, CryptoAccountPreferencesStore cryptoAccountPreferencesStore, IntPreference cryptoUsTaxLotsOrderTypeDisplayCountPref, TaxlotabilityStore taxlotabilityStore, AppType appType) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(recurringTradabilityStore, "recurringTradabilityStore");
            Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(cryptoOrderMonetizationModelProvider, "cryptoOrderMonetizationModelProvider");
            Intrinsics.checkNotNullParameter(cryptoAccountPreferencesStore, "cryptoAccountPreferencesStore");
            Intrinsics.checkNotNullParameter(cryptoUsTaxLotsOrderTypeDisplayCountPref, "cryptoUsTaxLotsOrderTypeDisplayCountPref");
            Intrinsics.checkNotNullParameter(taxlotabilityStore, "taxlotabilityStore");
            Intrinsics.checkNotNullParameter(appType, "appType");
            return new CryptoOrderTypeSelectorDuxo(stateProvider, duxoBundle, savedStateHandle, currencyPairStore, recurringTradabilityStore, cryptoQuoteStore, regionGateProvider, cryptoExperimentsStore, cryptoAccountStore, cryptoOrderMonetizationModelProvider, cryptoAccountPreferencesStore, cryptoUsTaxLotsOrderTypeDisplayCountPref, taxlotabilityStore, appType);
        }
    }
}

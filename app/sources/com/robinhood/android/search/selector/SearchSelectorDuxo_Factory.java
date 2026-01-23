package com.robinhood.android.search.selector;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.cortex.store.asset.AssetDigestPopularInstrumentsStore;
import com.robinhood.android.equities.companyfinancials.microgram.CompanyFinancialsCachedService;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.tradingtrends.microgram.TradingTrendsCachedService;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.InstrumentPositionStore;
import com.robinhood.librobinhood.data.store.OptionChainSearchItemStore;
import com.robinhood.store.search.SearchStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchSelectorDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB¡\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchSelectorDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/search/selector/SearchSelectorDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "instrumentPositionStore", "Lcom/robinhood/librobinhood/data/store/InstrumentPositionStore;", "optionChainSearchItemStore", "Lcom/robinhood/librobinhood/data/store/OptionChainSearchItemStore;", "searchStore", "Lcom/robinhood/store/search/SearchStore;", "assetDigestPopularInstrumentsStore", "Lcom/robinhood/android/cortex/store/asset/AssetDigestPopularInstrumentsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "tradingTrendsCachedService", "Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsCachedService;", "companyFinancialsCachedService", "Lcom/robinhood/android/equities/companyfinancials/microgram/CompanyFinancialsCachedService;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SearchSelectorDuxo_Factory implements Factory<SearchSelectorDuxo> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AssetDigestPopularInstrumentsStore> assetDigestPopularInstrumentsStore;
    private final Provider<CompanyFinancialsCachedService> companyFinancialsCachedService;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<InstrumentPositionStore> instrumentPositionStore;
    private final Provider<OptionChainSearchItemStore> optionChainSearchItemStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<SearchStore> searchStore;
    private final Provider<TradingTrendsCachedService> tradingTrendsCachedService;

    @JvmStatic
    public static final SearchSelectorDuxo_Factory create(Provider<AccountProvider> provider, Provider<EventLogger> provider2, Provider<InstrumentPositionStore> provider3, Provider<OptionChainSearchItemStore> provider4, Provider<SearchStore> provider5, Provider<AssetDigestPopularInstrumentsStore> provider6, Provider<RegionGateProvider> provider7, Provider<TradingTrendsCachedService> provider8, Provider<CompanyFinancialsCachedService> provider9, Provider<SavedStateHandle> provider10, Provider<DuxoBundle> provider11) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    @JvmStatic
    public static final SearchSelectorDuxo newInstance(AccountProvider accountProvider, EventLogger eventLogger, InstrumentPositionStore instrumentPositionStore, OptionChainSearchItemStore optionChainSearchItemStore, SearchStore searchStore, AssetDigestPopularInstrumentsStore assetDigestPopularInstrumentsStore, RegionGateProvider regionGateProvider, TradingTrendsCachedService tradingTrendsCachedService, CompanyFinancialsCachedService companyFinancialsCachedService, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(accountProvider, eventLogger, instrumentPositionStore, optionChainSearchItemStore, searchStore, assetDigestPopularInstrumentsStore, regionGateProvider, tradingTrendsCachedService, companyFinancialsCachedService, savedStateHandle, duxoBundle);
    }

    public SearchSelectorDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<EventLogger> eventLogger, Provider<InstrumentPositionStore> instrumentPositionStore, Provider<OptionChainSearchItemStore> optionChainSearchItemStore, Provider<SearchStore> searchStore, Provider<AssetDigestPopularInstrumentsStore> assetDigestPopularInstrumentsStore, Provider<RegionGateProvider> regionGateProvider, Provider<TradingTrendsCachedService> tradingTrendsCachedService, Provider<CompanyFinancialsCachedService> companyFinancialsCachedService, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(instrumentPositionStore, "instrumentPositionStore");
        Intrinsics.checkNotNullParameter(optionChainSearchItemStore, "optionChainSearchItemStore");
        Intrinsics.checkNotNullParameter(searchStore, "searchStore");
        Intrinsics.checkNotNullParameter(assetDigestPopularInstrumentsStore, "assetDigestPopularInstrumentsStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(tradingTrendsCachedService, "tradingTrendsCachedService");
        Intrinsics.checkNotNullParameter(companyFinancialsCachedService, "companyFinancialsCachedService");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.eventLogger = eventLogger;
        this.instrumentPositionStore = instrumentPositionStore;
        this.optionChainSearchItemStore = optionChainSearchItemStore;
        this.searchStore = searchStore;
        this.assetDigestPopularInstrumentsStore = assetDigestPopularInstrumentsStore;
        this.regionGateProvider = regionGateProvider;
        this.tradingTrendsCachedService = tradingTrendsCachedService;
        this.companyFinancialsCachedService = companyFinancialsCachedService;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public SearchSelectorDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        InstrumentPositionStore instrumentPositionStore = this.instrumentPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentPositionStore, "get(...)");
        OptionChainSearchItemStore optionChainSearchItemStore = this.optionChainSearchItemStore.get();
        Intrinsics.checkNotNullExpressionValue(optionChainSearchItemStore, "get(...)");
        SearchStore searchStore = this.searchStore.get();
        Intrinsics.checkNotNullExpressionValue(searchStore, "get(...)");
        AssetDigestPopularInstrumentsStore assetDigestPopularInstrumentsStore = this.assetDigestPopularInstrumentsStore.get();
        Intrinsics.checkNotNullExpressionValue(assetDigestPopularInstrumentsStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        TradingTrendsCachedService tradingTrendsCachedService = this.tradingTrendsCachedService.get();
        Intrinsics.checkNotNullExpressionValue(tradingTrendsCachedService, "get(...)");
        CompanyFinancialsCachedService companyFinancialsCachedService = this.companyFinancialsCachedService.get();
        Intrinsics.checkNotNullExpressionValue(companyFinancialsCachedService, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(accountProvider, eventLogger, instrumentPositionStore, optionChainSearchItemStore, searchStore, assetDigestPopularInstrumentsStore, regionGateProvider, tradingTrendsCachedService, companyFinancialsCachedService, savedStateHandle, duxoBundle);
    }

    /* compiled from: SearchSelectorDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¢\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007H\u0007J`\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchSelectorDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/search/selector/SearchSelectorDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "instrumentPositionStore", "Lcom/robinhood/librobinhood/data/store/InstrumentPositionStore;", "optionChainSearchItemStore", "Lcom/robinhood/librobinhood/data/store/OptionChainSearchItemStore;", "searchStore", "Lcom/robinhood/store/search/SearchStore;", "assetDigestPopularInstrumentsStore", "Lcom/robinhood/android/cortex/store/asset/AssetDigestPopularInstrumentsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "tradingTrendsCachedService", "Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsCachedService;", "companyFinancialsCachedService", "Lcom/robinhood/android/equities/companyfinancials/microgram/CompanyFinancialsCachedService;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/search/selector/SearchSelectorDuxo;", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SearchSelectorDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<EventLogger> eventLogger, Provider<InstrumentPositionStore> instrumentPositionStore, Provider<OptionChainSearchItemStore> optionChainSearchItemStore, Provider<SearchStore> searchStore, Provider<AssetDigestPopularInstrumentsStore> assetDigestPopularInstrumentsStore, Provider<RegionGateProvider> regionGateProvider, Provider<TradingTrendsCachedService> tradingTrendsCachedService, Provider<CompanyFinancialsCachedService> companyFinancialsCachedService, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(instrumentPositionStore, "instrumentPositionStore");
            Intrinsics.checkNotNullParameter(optionChainSearchItemStore, "optionChainSearchItemStore");
            Intrinsics.checkNotNullParameter(searchStore, "searchStore");
            Intrinsics.checkNotNullParameter(assetDigestPopularInstrumentsStore, "assetDigestPopularInstrumentsStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(tradingTrendsCachedService, "tradingTrendsCachedService");
            Intrinsics.checkNotNullParameter(companyFinancialsCachedService, "companyFinancialsCachedService");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new SearchSelectorDuxo_Factory(accountProvider, eventLogger, instrumentPositionStore, optionChainSearchItemStore, searchStore, assetDigestPopularInstrumentsStore, regionGateProvider, tradingTrendsCachedService, companyFinancialsCachedService, savedStateHandle, duxoBundle);
        }

        @JvmStatic
        public final SearchSelectorDuxo newInstance(AccountProvider accountProvider, EventLogger eventLogger, InstrumentPositionStore instrumentPositionStore, OptionChainSearchItemStore optionChainSearchItemStore, SearchStore searchStore, AssetDigestPopularInstrumentsStore assetDigestPopularInstrumentsStore, RegionGateProvider regionGateProvider, TradingTrendsCachedService tradingTrendsCachedService, CompanyFinancialsCachedService companyFinancialsCachedService, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(instrumentPositionStore, "instrumentPositionStore");
            Intrinsics.checkNotNullParameter(optionChainSearchItemStore, "optionChainSearchItemStore");
            Intrinsics.checkNotNullParameter(searchStore, "searchStore");
            Intrinsics.checkNotNullParameter(assetDigestPopularInstrumentsStore, "assetDigestPopularInstrumentsStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(tradingTrendsCachedService, "tradingTrendsCachedService");
            Intrinsics.checkNotNullParameter(companyFinancialsCachedService, "companyFinancialsCachedService");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new SearchSelectorDuxo(accountProvider, eventLogger, instrumentPositionStore, optionChainSearchItemStore, searchStore, assetDigestPopularInstrumentsStore, regionGateProvider, tradingTrendsCachedService, companyFinancialsCachedService, savedStateHandle, duxoBundle);
        }
    }
}

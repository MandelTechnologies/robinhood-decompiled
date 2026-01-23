package com.robinhood.android.widget.p277ui;

import com.robinhood.android.common.p088ui.daynight.NightModeManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.colorscheme.ColorSchemeManager;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.widget.util.PortfolioWidgetInfoPref;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore;
import com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore;
import com.robinhood.librobinhood.data.store.CryptoHistoricalStore;
import com.robinhood.librobinhood.data.store.CryptoHoldingStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.CurrencyPairStore;
import com.robinhood.librobinhood.data.store.InstrumentPositionStore;
import com.robinhood.librobinhood.data.store.OptionStrategyInfoStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.shared.store.lists.store.CuratedListItemsStore;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.futures.FuturesPositionStore;
import com.robinhood.store.futures.marketdata.FuturesMarketDataStore;
import com.robinhood.store.futures.marketdata.FuturesQuoteStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WatchlistViewsFactory_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00015B»\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0004\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/WatchlistViewsFactory_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/widget/ui/WatchlistViewsFactory;", "regionGateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "instrumentPositionStore", "Lcom/robinhood/librobinhood/data/store/InstrumentPositionStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "cryptoHoldingStore", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "cryptoHistoricalStore", "Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "aggregateOptionQuoteStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore;", "aggregateOptionStrategyQuoteStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "futuresPositionStore", "Lcom/robinhood/store/futures/FuturesPositionStore;", "futuresQuoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "futuresMarketDataStore", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "nightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "widgetPref", "Lcom/robinhood/android/widget/util/PortfolioWidgetInfoPref;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "colorSchemeManager", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class WatchlistViewsFactory_MembersInjector implements MembersInjector<WatchlistViewsFactory> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AggregateOptionPositionStore> aggregateOptionPositionStore;
    private final Provider<AggregateOptionQuoteStore> aggregateOptionQuoteStore;
    private final Provider<AggregateOptionStrategyQuoteStore> aggregateOptionStrategyQuoteStore;
    private final Provider<ColorSchemeManager> colorSchemeManager;
    private final Provider<CryptoHistoricalStore> cryptoHistoricalStore;
    private final Provider<CryptoHoldingStore> cryptoHoldingStore;
    private final Provider<CryptoQuoteStore> cryptoQuoteStore;
    private final Provider<CuratedListItemsStore> curatedListItemsStore;
    private final Provider<CuratedListStore> curatedListStore;
    private final Provider<CurrencyPairStore> currencyPairStore;
    private final Provider<FuturesMarketDataStore> futuresMarketDataStore;
    private final Provider<FuturesPositionStore> futuresPositionStore;
    private final Provider<FuturesQuoteStore> futuresQuoteStore;
    private final Provider<InstrumentPositionStore> instrumentPositionStore;
    private final Provider<Navigator> navigator;
    private final Provider<NightModeManager> nightModeManager;
    private final Provider<OptionStrategyInfoStore> optionStrategyInfoStore;
    private final Provider<QuoteStore> quoteStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<UserStore> userStore;
    private final Provider<PortfolioWidgetInfoPref> widgetPref;

    @JvmStatic
    public static final MembersInjector<WatchlistViewsFactory> create(Provider<RegionGateProvider> provider, Provider<AccountProvider> provider2, Provider<InstrumentPositionStore> provider3, Provider<QuoteStore> provider4, Provider<CryptoHoldingStore> provider5, Provider<CryptoHistoricalStore> provider6, Provider<CurrencyPairStore> provider7, Provider<CryptoQuoteStore> provider8, Provider<AggregateOptionPositionStore> provider9, Provider<AggregateOptionQuoteStore> provider10, Provider<AggregateOptionStrategyQuoteStore> provider11, Provider<CuratedListStore> provider12, Provider<CuratedListItemsStore> provider13, Provider<FuturesPositionStore> provider14, Provider<FuturesQuoteStore> provider15, Provider<FuturesMarketDataStore> provider16, Provider<OptionStrategyInfoStore> provider17, Provider<UserStore> provider18, Provider<NightModeManager> provider19, Provider<PortfolioWidgetInfoPref> provider20, Provider<Navigator> provider21, Provider<ColorSchemeManager> provider22) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22);
    }

    @JvmStatic
    public static final void injectAccountProvider(WatchlistViewsFactory watchlistViewsFactory, AccountProvider accountProvider) {
        INSTANCE.injectAccountProvider(watchlistViewsFactory, accountProvider);
    }

    @JvmStatic
    public static final void injectAggregateOptionPositionStore(WatchlistViewsFactory watchlistViewsFactory, AggregateOptionPositionStore aggregateOptionPositionStore) {
        INSTANCE.injectAggregateOptionPositionStore(watchlistViewsFactory, aggregateOptionPositionStore);
    }

    @JvmStatic
    public static final void injectAggregateOptionQuoteStore(WatchlistViewsFactory watchlistViewsFactory, AggregateOptionQuoteStore aggregateOptionQuoteStore) {
        INSTANCE.injectAggregateOptionQuoteStore(watchlistViewsFactory, aggregateOptionQuoteStore);
    }

    @JvmStatic
    public static final void injectAggregateOptionStrategyQuoteStore(WatchlistViewsFactory watchlistViewsFactory, AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore) {
        INSTANCE.injectAggregateOptionStrategyQuoteStore(watchlistViewsFactory, aggregateOptionStrategyQuoteStore);
    }

    @JvmStatic
    public static final void injectColorSchemeManager(WatchlistViewsFactory watchlistViewsFactory, ColorSchemeManager colorSchemeManager) {
        INSTANCE.injectColorSchemeManager(watchlistViewsFactory, colorSchemeManager);
    }

    @JvmStatic
    public static final void injectCryptoHistoricalStore(WatchlistViewsFactory watchlistViewsFactory, CryptoHistoricalStore cryptoHistoricalStore) {
        INSTANCE.injectCryptoHistoricalStore(watchlistViewsFactory, cryptoHistoricalStore);
    }

    @JvmStatic
    public static final void injectCryptoHoldingStore(WatchlistViewsFactory watchlistViewsFactory, CryptoHoldingStore cryptoHoldingStore) {
        INSTANCE.injectCryptoHoldingStore(watchlistViewsFactory, cryptoHoldingStore);
    }

    @JvmStatic
    public static final void injectCryptoQuoteStore(WatchlistViewsFactory watchlistViewsFactory, CryptoQuoteStore cryptoQuoteStore) {
        INSTANCE.injectCryptoQuoteStore(watchlistViewsFactory, cryptoQuoteStore);
    }

    @JvmStatic
    public static final void injectCuratedListItemsStore(WatchlistViewsFactory watchlistViewsFactory, CuratedListItemsStore curatedListItemsStore) {
        INSTANCE.injectCuratedListItemsStore(watchlistViewsFactory, curatedListItemsStore);
    }

    @JvmStatic
    public static final void injectCuratedListStore(WatchlistViewsFactory watchlistViewsFactory, CuratedListStore curatedListStore) {
        INSTANCE.injectCuratedListStore(watchlistViewsFactory, curatedListStore);
    }

    @JvmStatic
    public static final void injectCurrencyPairStore(WatchlistViewsFactory watchlistViewsFactory, CurrencyPairStore currencyPairStore) {
        INSTANCE.injectCurrencyPairStore(watchlistViewsFactory, currencyPairStore);
    }

    @JvmStatic
    public static final void injectFuturesMarketDataStore(WatchlistViewsFactory watchlistViewsFactory, FuturesMarketDataStore futuresMarketDataStore) {
        INSTANCE.injectFuturesMarketDataStore(watchlistViewsFactory, futuresMarketDataStore);
    }

    @JvmStatic
    public static final void injectFuturesPositionStore(WatchlistViewsFactory watchlistViewsFactory, FuturesPositionStore futuresPositionStore) {
        INSTANCE.injectFuturesPositionStore(watchlistViewsFactory, futuresPositionStore);
    }

    @JvmStatic
    public static final void injectFuturesQuoteStore(WatchlistViewsFactory watchlistViewsFactory, FuturesQuoteStore futuresQuoteStore) {
        INSTANCE.injectFuturesQuoteStore(watchlistViewsFactory, futuresQuoteStore);
    }

    @JvmStatic
    public static final void injectInstrumentPositionStore(WatchlistViewsFactory watchlistViewsFactory, InstrumentPositionStore instrumentPositionStore) {
        INSTANCE.injectInstrumentPositionStore(watchlistViewsFactory, instrumentPositionStore);
    }

    @JvmStatic
    public static final void injectNavigator(WatchlistViewsFactory watchlistViewsFactory, Navigator navigator) {
        INSTANCE.injectNavigator(watchlistViewsFactory, navigator);
    }

    @JvmStatic
    public static final void injectNightModeManager(WatchlistViewsFactory watchlistViewsFactory, NightModeManager nightModeManager) {
        INSTANCE.injectNightModeManager(watchlistViewsFactory, nightModeManager);
    }

    @JvmStatic
    public static final void injectOptionStrategyInfoStore(WatchlistViewsFactory watchlistViewsFactory, OptionStrategyInfoStore optionStrategyInfoStore) {
        INSTANCE.injectOptionStrategyInfoStore(watchlistViewsFactory, optionStrategyInfoStore);
    }

    @JvmStatic
    public static final void injectQuoteStore(WatchlistViewsFactory watchlistViewsFactory, QuoteStore quoteStore) {
        INSTANCE.injectQuoteStore(watchlistViewsFactory, quoteStore);
    }

    @JvmStatic
    public static final void injectRegionGateProvider(WatchlistViewsFactory watchlistViewsFactory, RegionGateProvider regionGateProvider) {
        INSTANCE.injectRegionGateProvider(watchlistViewsFactory, regionGateProvider);
    }

    @JvmStatic
    public static final void injectUserStore(WatchlistViewsFactory watchlistViewsFactory, UserStore userStore) {
        INSTANCE.injectUserStore(watchlistViewsFactory, userStore);
    }

    @JvmStatic
    public static final void injectWidgetPref(WatchlistViewsFactory watchlistViewsFactory, PortfolioWidgetInfoPref portfolioWidgetInfoPref) {
        INSTANCE.injectWidgetPref(watchlistViewsFactory, portfolioWidgetInfoPref);
    }

    public WatchlistViewsFactory_MembersInjector(Provider<RegionGateProvider> regionGateProvider, Provider<AccountProvider> accountProvider, Provider<InstrumentPositionStore> instrumentPositionStore, Provider<QuoteStore> quoteStore, Provider<CryptoHoldingStore> cryptoHoldingStore, Provider<CryptoHistoricalStore> cryptoHistoricalStore, Provider<CurrencyPairStore> currencyPairStore, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<AggregateOptionPositionStore> aggregateOptionPositionStore, Provider<AggregateOptionQuoteStore> aggregateOptionQuoteStore, Provider<AggregateOptionStrategyQuoteStore> aggregateOptionStrategyQuoteStore, Provider<CuratedListStore> curatedListStore, Provider<CuratedListItemsStore> curatedListItemsStore, Provider<FuturesPositionStore> futuresPositionStore, Provider<FuturesQuoteStore> futuresQuoteStore, Provider<FuturesMarketDataStore> futuresMarketDataStore, Provider<OptionStrategyInfoStore> optionStrategyInfoStore, Provider<UserStore> userStore, Provider<NightModeManager> nightModeManager, Provider<PortfolioWidgetInfoPref> widgetPref, Provider<Navigator> navigator, Provider<ColorSchemeManager> colorSchemeManager) {
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(instrumentPositionStore, "instrumentPositionStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
        Intrinsics.checkNotNullParameter(cryptoHistoricalStore, "cryptoHistoricalStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(aggregateOptionQuoteStore, "aggregateOptionQuoteStore");
        Intrinsics.checkNotNullParameter(aggregateOptionStrategyQuoteStore, "aggregateOptionStrategyQuoteStore");
        Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
        Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
        Intrinsics.checkNotNullParameter(futuresPositionStore, "futuresPositionStore");
        Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
        Intrinsics.checkNotNullParameter(futuresMarketDataStore, "futuresMarketDataStore");
        Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(nightModeManager, "nightModeManager");
        Intrinsics.checkNotNullParameter(widgetPref, "widgetPref");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(colorSchemeManager, "colorSchemeManager");
        this.regionGateProvider = regionGateProvider;
        this.accountProvider = accountProvider;
        this.instrumentPositionStore = instrumentPositionStore;
        this.quoteStore = quoteStore;
        this.cryptoHoldingStore = cryptoHoldingStore;
        this.cryptoHistoricalStore = cryptoHistoricalStore;
        this.currencyPairStore = currencyPairStore;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.aggregateOptionQuoteStore = aggregateOptionQuoteStore;
        this.aggregateOptionStrategyQuoteStore = aggregateOptionStrategyQuoteStore;
        this.curatedListStore = curatedListStore;
        this.curatedListItemsStore = curatedListItemsStore;
        this.futuresPositionStore = futuresPositionStore;
        this.futuresQuoteStore = futuresQuoteStore;
        this.futuresMarketDataStore = futuresMarketDataStore;
        this.optionStrategyInfoStore = optionStrategyInfoStore;
        this.userStore = userStore;
        this.nightModeManager = nightModeManager;
        this.widgetPref = widgetPref;
        this.navigator = navigator;
        this.colorSchemeManager = colorSchemeManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(WatchlistViewsFactory instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        companion.injectRegionGateProvider(instance, regionGateProvider);
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        companion.injectAccountProvider(instance, accountProvider);
        InstrumentPositionStore instrumentPositionStore = this.instrumentPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentPositionStore, "get(...)");
        companion.injectInstrumentPositionStore(instance, instrumentPositionStore);
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        companion.injectQuoteStore(instance, quoteStore);
        CryptoHoldingStore cryptoHoldingStore = this.cryptoHoldingStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHoldingStore, "get(...)");
        companion.injectCryptoHoldingStore(instance, cryptoHoldingStore);
        CryptoHistoricalStore cryptoHistoricalStore = this.cryptoHistoricalStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHistoricalStore, "get(...)");
        companion.injectCryptoHistoricalStore(instance, cryptoHistoricalStore);
        CurrencyPairStore currencyPairStore = this.currencyPairStore.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairStore, "get(...)");
        companion.injectCurrencyPairStore(instance, currencyPairStore);
        CryptoQuoteStore cryptoQuoteStore = this.cryptoQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoQuoteStore, "get(...)");
        companion.injectCryptoQuoteStore(instance, cryptoQuoteStore);
        AggregateOptionPositionStore aggregateOptionPositionStore = this.aggregateOptionPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(aggregateOptionPositionStore, "get(...)");
        companion.injectAggregateOptionPositionStore(instance, aggregateOptionPositionStore);
        AggregateOptionQuoteStore aggregateOptionQuoteStore = this.aggregateOptionQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(aggregateOptionQuoteStore, "get(...)");
        companion.injectAggregateOptionQuoteStore(instance, aggregateOptionQuoteStore);
        AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore = this.aggregateOptionStrategyQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(aggregateOptionStrategyQuoteStore, "get(...)");
        companion.injectAggregateOptionStrategyQuoteStore(instance, aggregateOptionStrategyQuoteStore);
        CuratedListStore curatedListStore = this.curatedListStore.get();
        Intrinsics.checkNotNullExpressionValue(curatedListStore, "get(...)");
        companion.injectCuratedListStore(instance, curatedListStore);
        CuratedListItemsStore curatedListItemsStore = this.curatedListItemsStore.get();
        Intrinsics.checkNotNullExpressionValue(curatedListItemsStore, "get(...)");
        companion.injectCuratedListItemsStore(instance, curatedListItemsStore);
        FuturesPositionStore futuresPositionStore = this.futuresPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresPositionStore, "get(...)");
        companion.injectFuturesPositionStore(instance, futuresPositionStore);
        FuturesQuoteStore futuresQuoteStore = this.futuresQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresQuoteStore, "get(...)");
        companion.injectFuturesQuoteStore(instance, futuresQuoteStore);
        FuturesMarketDataStore futuresMarketDataStore = this.futuresMarketDataStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresMarketDataStore, "get(...)");
        companion.injectFuturesMarketDataStore(instance, futuresMarketDataStore);
        OptionStrategyInfoStore optionStrategyInfoStore = this.optionStrategyInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(optionStrategyInfoStore, "get(...)");
        companion.injectOptionStrategyInfoStore(instance, optionStrategyInfoStore);
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        companion.injectUserStore(instance, userStore);
        NightModeManager nightModeManager = this.nightModeManager.get();
        Intrinsics.checkNotNullExpressionValue(nightModeManager, "get(...)");
        companion.injectNightModeManager(instance, nightModeManager);
        PortfolioWidgetInfoPref portfolioWidgetInfoPref = this.widgetPref.get();
        Intrinsics.checkNotNullExpressionValue(portfolioWidgetInfoPref, "get(...)");
        companion.injectWidgetPref(instance, portfolioWidgetInfoPref);
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        companion.injectNavigator(instance, navigator);
        ColorSchemeManager colorSchemeManager = this.colorSchemeManager.get();
        Intrinsics.checkNotNullExpressionValue(colorSchemeManager, "get(...)");
        companion.injectColorSchemeManager(instance, colorSchemeManager);
    }

    /* compiled from: WatchlistViewsFactory_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÂ\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\b2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\b2\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\b2\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\bH\u0007J\u0018\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u00107\u001a\u0002052\u0006\u00106\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u00108\u001a\u0002052\u0006\u00106\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u00109\u001a\u0002052\u0006\u00106\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010:\u001a\u0002052\u0006\u00106\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010;\u001a\u0002052\u0006\u00106\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010<\u001a\u0002052\u0006\u00106\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010=\u001a\u0002052\u0006\u00106\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010>\u001a\u0002052\u0006\u00106\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0018\u0010?\u001a\u0002052\u0006\u00106\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0018\u0010@\u001a\u0002052\u0006\u00106\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0018\u0010A\u001a\u0002052\u0006\u00106\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0018\u0010B\u001a\u0002052\u0006\u00106\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!H\u0007J\u0018\u0010C\u001a\u0002052\u0006\u00106\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020#H\u0007J\u0018\u0010D\u001a\u0002052\u0006\u00106\u001a\u00020\u00062\u0006\u0010$\u001a\u00020%H\u0007J\u0018\u0010E\u001a\u0002052\u0006\u00106\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'H\u0007J\u0018\u0010F\u001a\u0002052\u0006\u00106\u001a\u00020\u00062\u0006\u0010(\u001a\u00020)H\u0007J\u0018\u0010G\u001a\u0002052\u0006\u00106\u001a\u00020\u00062\u0006\u0010*\u001a\u00020+H\u0007J\u0018\u0010H\u001a\u0002052\u0006\u00106\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-H\u0007J\u0018\u0010I\u001a\u0002052\u0006\u00106\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0007J\u0018\u0010J\u001a\u0002052\u0006\u00106\u001a\u00020\u00062\u0006\u00100\u001a\u000201H\u0007J\u0018\u0010K\u001a\u0002052\u0006\u00106\u001a\u00020\u00062\u0006\u00102\u001a\u000203H\u0007¨\u0006L"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/WatchlistViewsFactory_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/widget/ui/WatchlistViewsFactory;", "regionGateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "instrumentPositionStore", "Lcom/robinhood/librobinhood/data/store/InstrumentPositionStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "cryptoHoldingStore", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "cryptoHistoricalStore", "Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "aggregateOptionQuoteStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore;", "aggregateOptionStrategyQuoteStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "futuresPositionStore", "Lcom/robinhood/store/futures/FuturesPositionStore;", "futuresQuoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "futuresMarketDataStore", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "nightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "widgetPref", "Lcom/robinhood/android/widget/util/PortfolioWidgetInfoPref;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "colorSchemeManager", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "injectRegionGateProvider", "", "instance", "injectAccountProvider", "injectInstrumentPositionStore", "injectQuoteStore", "injectCryptoHoldingStore", "injectCryptoHistoricalStore", "injectCurrencyPairStore", "injectCryptoQuoteStore", "injectAggregateOptionPositionStore", "injectAggregateOptionQuoteStore", "injectAggregateOptionStrategyQuoteStore", "injectCuratedListStore", "injectCuratedListItemsStore", "injectFuturesPositionStore", "injectFuturesQuoteStore", "injectFuturesMarketDataStore", "injectOptionStrategyInfoStore", "injectUserStore", "injectNightModeManager", "injectWidgetPref", "injectNavigator", "injectColorSchemeManager", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<WatchlistViewsFactory> create(Provider<RegionGateProvider> regionGateProvider, Provider<AccountProvider> accountProvider, Provider<InstrumentPositionStore> instrumentPositionStore, Provider<QuoteStore> quoteStore, Provider<CryptoHoldingStore> cryptoHoldingStore, Provider<CryptoHistoricalStore> cryptoHistoricalStore, Provider<CurrencyPairStore> currencyPairStore, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<AggregateOptionPositionStore> aggregateOptionPositionStore, Provider<AggregateOptionQuoteStore> aggregateOptionQuoteStore, Provider<AggregateOptionStrategyQuoteStore> aggregateOptionStrategyQuoteStore, Provider<CuratedListStore> curatedListStore, Provider<CuratedListItemsStore> curatedListItemsStore, Provider<FuturesPositionStore> futuresPositionStore, Provider<FuturesQuoteStore> futuresQuoteStore, Provider<FuturesMarketDataStore> futuresMarketDataStore, Provider<OptionStrategyInfoStore> optionStrategyInfoStore, Provider<UserStore> userStore, Provider<NightModeManager> nightModeManager, Provider<PortfolioWidgetInfoPref> widgetPref, Provider<Navigator> navigator, Provider<ColorSchemeManager> colorSchemeManager) {
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(instrumentPositionStore, "instrumentPositionStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
            Intrinsics.checkNotNullParameter(cryptoHistoricalStore, "cryptoHistoricalStore");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
            Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
            Intrinsics.checkNotNullParameter(aggregateOptionQuoteStore, "aggregateOptionQuoteStore");
            Intrinsics.checkNotNullParameter(aggregateOptionStrategyQuoteStore, "aggregateOptionStrategyQuoteStore");
            Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
            Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
            Intrinsics.checkNotNullParameter(futuresPositionStore, "futuresPositionStore");
            Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
            Intrinsics.checkNotNullParameter(futuresMarketDataStore, "futuresMarketDataStore");
            Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(nightModeManager, "nightModeManager");
            Intrinsics.checkNotNullParameter(widgetPref, "widgetPref");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(colorSchemeManager, "colorSchemeManager");
            return new WatchlistViewsFactory_MembersInjector(regionGateProvider, accountProvider, instrumentPositionStore, quoteStore, cryptoHoldingStore, cryptoHistoricalStore, currencyPairStore, cryptoQuoteStore, aggregateOptionPositionStore, aggregateOptionQuoteStore, aggregateOptionStrategyQuoteStore, curatedListStore, curatedListItemsStore, futuresPositionStore, futuresQuoteStore, futuresMarketDataStore, optionStrategyInfoStore, userStore, nightModeManager, widgetPref, navigator, colorSchemeManager);
        }

        @JvmStatic
        public final void injectRegionGateProvider(WatchlistViewsFactory instance, RegionGateProvider regionGateProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            instance.setRegionGateProvider(regionGateProvider);
        }

        @JvmStatic
        public final void injectAccountProvider(WatchlistViewsFactory instance, AccountProvider accountProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            instance.setAccountProvider(accountProvider);
        }

        @JvmStatic
        public final void injectInstrumentPositionStore(WatchlistViewsFactory instance, InstrumentPositionStore instrumentPositionStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(instrumentPositionStore, "instrumentPositionStore");
            instance.setInstrumentPositionStore(instrumentPositionStore);
        }

        @JvmStatic
        public final void injectQuoteStore(WatchlistViewsFactory instance, QuoteStore quoteStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            instance.setQuoteStore(quoteStore);
        }

        @JvmStatic
        public final void injectCryptoHoldingStore(WatchlistViewsFactory instance, CryptoHoldingStore cryptoHoldingStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
            instance.setCryptoHoldingStore(cryptoHoldingStore);
        }

        @JvmStatic
        public final void injectCryptoHistoricalStore(WatchlistViewsFactory instance, CryptoHistoricalStore cryptoHistoricalStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(cryptoHistoricalStore, "cryptoHistoricalStore");
            instance.setCryptoHistoricalStore(cryptoHistoricalStore);
        }

        @JvmStatic
        public final void injectCurrencyPairStore(WatchlistViewsFactory instance, CurrencyPairStore currencyPairStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            instance.setCurrencyPairStore(currencyPairStore);
        }

        @JvmStatic
        public final void injectCryptoQuoteStore(WatchlistViewsFactory instance, CryptoQuoteStore cryptoQuoteStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
            instance.setCryptoQuoteStore(cryptoQuoteStore);
        }

        @JvmStatic
        public final void injectAggregateOptionPositionStore(WatchlistViewsFactory instance, AggregateOptionPositionStore aggregateOptionPositionStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
            instance.setAggregateOptionPositionStore(aggregateOptionPositionStore);
        }

        @JvmStatic
        public final void injectAggregateOptionQuoteStore(WatchlistViewsFactory instance, AggregateOptionQuoteStore aggregateOptionQuoteStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(aggregateOptionQuoteStore, "aggregateOptionQuoteStore");
            instance.setAggregateOptionQuoteStore(aggregateOptionQuoteStore);
        }

        @JvmStatic
        public final void injectAggregateOptionStrategyQuoteStore(WatchlistViewsFactory instance, AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(aggregateOptionStrategyQuoteStore, "aggregateOptionStrategyQuoteStore");
            instance.setAggregateOptionStrategyQuoteStore(aggregateOptionStrategyQuoteStore);
        }

        @JvmStatic
        public final void injectCuratedListStore(WatchlistViewsFactory instance, CuratedListStore curatedListStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
            instance.setCuratedListStore(curatedListStore);
        }

        @JvmStatic
        public final void injectCuratedListItemsStore(WatchlistViewsFactory instance, CuratedListItemsStore curatedListItemsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
            instance.setCuratedListItemsStore(curatedListItemsStore);
        }

        @JvmStatic
        public final void injectFuturesPositionStore(WatchlistViewsFactory instance, FuturesPositionStore futuresPositionStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(futuresPositionStore, "futuresPositionStore");
            instance.setFuturesPositionStore(futuresPositionStore);
        }

        @JvmStatic
        public final void injectFuturesQuoteStore(WatchlistViewsFactory instance, FuturesQuoteStore futuresQuoteStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
            instance.setFuturesQuoteStore(futuresQuoteStore);
        }

        @JvmStatic
        public final void injectFuturesMarketDataStore(WatchlistViewsFactory instance, FuturesMarketDataStore futuresMarketDataStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(futuresMarketDataStore, "futuresMarketDataStore");
            instance.setFuturesMarketDataStore(futuresMarketDataStore);
        }

        @JvmStatic
        public final void injectOptionStrategyInfoStore(WatchlistViewsFactory instance, OptionStrategyInfoStore optionStrategyInfoStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
            instance.setOptionStrategyInfoStore(optionStrategyInfoStore);
        }

        @JvmStatic
        public final void injectUserStore(WatchlistViewsFactory instance, UserStore userStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            instance.setUserStore(userStore);
        }

        @JvmStatic
        public final void injectNightModeManager(WatchlistViewsFactory instance, NightModeManager nightModeManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(nightModeManager, "nightModeManager");
            instance.setNightModeManager(nightModeManager);
        }

        @JvmStatic
        public final void injectWidgetPref(WatchlistViewsFactory instance, PortfolioWidgetInfoPref widgetPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(widgetPref, "widgetPref");
            instance.setWidgetPref(widgetPref);
        }

        @JvmStatic
        public final void injectNavigator(WatchlistViewsFactory instance, Navigator navigator) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            instance.setNavigator(navigator);
        }

        @JvmStatic
        public final void injectColorSchemeManager(WatchlistViewsFactory instance, ColorSchemeManager colorSchemeManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(colorSchemeManager, "colorSchemeManager");
            instance.setColorSchemeManager(colorSchemeManager);
        }
    }
}

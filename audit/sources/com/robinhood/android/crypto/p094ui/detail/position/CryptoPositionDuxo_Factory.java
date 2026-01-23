package com.robinhood.android.crypto.p094ui.detail.position;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoHoldingStore;
import com.robinhood.librobinhood.data.store.CryptoPositionDetailsStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.CryptoStakingStore;
import com.robinhood.librobinhood.data.store.CryptobilityStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.librobinhood.data.store.MarketDataProxyStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.app.type.AppType;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: CryptoPositionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\u0083\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0003\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0003\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0003\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0003\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u0003\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u0003¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010*R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010*R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010*R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010*R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010*R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010*R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010*R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010*R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010*R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010*R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010*R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010*R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010*¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionStateProvider;", "stateProvider", "Lcom/robinhood/shared/app/type/AppType;", "appType", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoAccountStore", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoAccountProvider", "Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;", "cryptoStakingStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "cryptoHoldingStore", "Lcom/robinhood/librobinhood/data/store/CryptoPositionDetailsStore;", "cryptoPositionDetailsStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptobilityStore;", "cryptobilityStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/MarketDataProxyStore;", "marketDataProxyStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "unifiedAccountStore", "Lcom/robinhood/prefs/BooleanPreference;", "hasDismissedPnlUnavailableBannerPref", "hasDismissedPnlPendingBannerPref", "hasSeenAvgCostReturnOptimizedTooltipPref", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CryptoPositionDuxo_Factory implements Factory<CryptoPositionDuxo> {
    private final Provider<AppType> appType;
    private final Provider<Clock> clock;
    private final Provider<CryptoAccountProvider> cryptoAccountProvider;
    private final Provider<CryptoAccountStore> cryptoAccountStore;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CryptoHoldingStore> cryptoHoldingStore;
    private final Provider<CryptoPositionDetailsStore> cryptoPositionDetailsStore;
    private final Provider<CryptoQuoteStore> cryptoQuoteStore;
    private final Provider<CryptoStakingStore> cryptoStakingStore;
    private final Provider<CryptobilityStore> cryptobilityStore;
    private final Provider<CurrencyPairV2Store> currencyPairStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<BooleanPreference> hasDismissedPnlPendingBannerPref;
    private final Provider<BooleanPreference> hasDismissedPnlUnavailableBannerPref;
    private final Provider<BooleanPreference> hasSeenAvgCostReturnOptimizedTooltipPref;
    private final Provider<MarketDataProxyStore> marketDataProxyStore;
    private final Provider<CryptoPositionStateProvider> stateProvider;
    private final Provider<UnifiedAccountStore> unifiedAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoPositionDuxo_Factory create(Provider<DuxoBundle> provider, Provider<CryptoPositionStateProvider> provider2, Provider<AppType> provider3, Provider<Clock> provider4, Provider<CryptoAccountStore> provider5, Provider<CryptoAccountProvider> provider6, Provider<CryptoStakingStore> provider7, Provider<CryptoExperimentsStore> provider8, Provider<CryptoHoldingStore> provider9, Provider<CryptoPositionDetailsStore> provider10, Provider<CryptoQuoteStore> provider11, Provider<CryptobilityStore> provider12, Provider<CurrencyPairV2Store> provider13, Provider<MarketDataProxyStore> provider14, Provider<UnifiedAccountStore> provider15, Provider<BooleanPreference> provider16, Provider<BooleanPreference> provider17, Provider<BooleanPreference> provider18) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18);
    }

    @JvmStatic
    public static final CryptoPositionDuxo newInstance(DuxoBundle duxoBundle, CryptoPositionStateProvider cryptoPositionStateProvider, AppType appType, Clock clock, CryptoAccountStore cryptoAccountStore, CryptoAccountProvider cryptoAccountProvider, CryptoStakingStore cryptoStakingStore, CryptoExperimentsStore cryptoExperimentsStore, CryptoHoldingStore cryptoHoldingStore, CryptoPositionDetailsStore cryptoPositionDetailsStore, CryptoQuoteStore cryptoQuoteStore, CryptobilityStore cryptobilityStore, CurrencyPairV2Store currencyPairV2Store, MarketDataProxyStore marketDataProxyStore, UnifiedAccountStore unifiedAccountStore, BooleanPreference booleanPreference, BooleanPreference booleanPreference2, BooleanPreference booleanPreference3) {
        return INSTANCE.newInstance(duxoBundle, cryptoPositionStateProvider, appType, clock, cryptoAccountStore, cryptoAccountProvider, cryptoStakingStore, cryptoExperimentsStore, cryptoHoldingStore, cryptoPositionDetailsStore, cryptoQuoteStore, cryptobilityStore, currencyPairV2Store, marketDataProxyStore, unifiedAccountStore, booleanPreference, booleanPreference2, booleanPreference3);
    }

    public CryptoPositionDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<CryptoPositionStateProvider> stateProvider, Provider<AppType> appType, Provider<Clock> clock, Provider<CryptoAccountStore> cryptoAccountStore, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<CryptoStakingStore> cryptoStakingStore, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoHoldingStore> cryptoHoldingStore, Provider<CryptoPositionDetailsStore> cryptoPositionDetailsStore, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<CryptobilityStore> cryptobilityStore, Provider<CurrencyPairV2Store> currencyPairStore, Provider<MarketDataProxyStore> marketDataProxyStore, Provider<UnifiedAccountStore> unifiedAccountStore, Provider<BooleanPreference> hasDismissedPnlUnavailableBannerPref, Provider<BooleanPreference> hasDismissedPnlPendingBannerPref, Provider<BooleanPreference> hasSeenAvgCostReturnOptimizedTooltipPref) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoStakingStore, "cryptoStakingStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
        Intrinsics.checkNotNullParameter(cryptoPositionDetailsStore, "cryptoPositionDetailsStore");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(cryptobilityStore, "cryptobilityStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(marketDataProxyStore, "marketDataProxyStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(hasDismissedPnlUnavailableBannerPref, "hasDismissedPnlUnavailableBannerPref");
        Intrinsics.checkNotNullParameter(hasDismissedPnlPendingBannerPref, "hasDismissedPnlPendingBannerPref");
        Intrinsics.checkNotNullParameter(hasSeenAvgCostReturnOptimizedTooltipPref, "hasSeenAvgCostReturnOptimizedTooltipPref");
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.appType = appType;
        this.clock = clock;
        this.cryptoAccountStore = cryptoAccountStore;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoStakingStore = cryptoStakingStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoHoldingStore = cryptoHoldingStore;
        this.cryptoPositionDetailsStore = cryptoPositionDetailsStore;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.cryptobilityStore = cryptobilityStore;
        this.currencyPairStore = currencyPairStore;
        this.marketDataProxyStore = marketDataProxyStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.hasDismissedPnlUnavailableBannerPref = hasDismissedPnlUnavailableBannerPref;
        this.hasDismissedPnlPendingBannerPref = hasDismissedPnlPendingBannerPref;
        this.hasSeenAvgCostReturnOptimizedTooltipPref = hasSeenAvgCostReturnOptimizedTooltipPref;
    }

    @Override // javax.inject.Provider
    public CryptoPositionDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoPositionStateProvider cryptoPositionStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoPositionStateProvider, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        CryptoAccountStore cryptoAccountStore = this.cryptoAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountStore, "get(...)");
        CryptoAccountProvider cryptoAccountProvider = this.cryptoAccountProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountProvider, "get(...)");
        CryptoStakingStore cryptoStakingStore = this.cryptoStakingStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoStakingStore, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        CryptoHoldingStore cryptoHoldingStore = this.cryptoHoldingStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHoldingStore, "get(...)");
        CryptoPositionDetailsStore cryptoPositionDetailsStore = this.cryptoPositionDetailsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoPositionDetailsStore, "get(...)");
        CryptoQuoteStore cryptoQuoteStore = this.cryptoQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoQuoteStore, "get(...)");
        CryptobilityStore cryptobilityStore = this.cryptobilityStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptobilityStore, "get(...)");
        CurrencyPairV2Store currencyPairV2Store = this.currencyPairStore.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairV2Store, "get(...)");
        MarketDataProxyStore marketDataProxyStore = this.marketDataProxyStore.get();
        Intrinsics.checkNotNullExpressionValue(marketDataProxyStore, "get(...)");
        MarketDataProxyStore marketDataProxyStore2 = marketDataProxyStore;
        UnifiedAccountStore unifiedAccountStore = this.unifiedAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(unifiedAccountStore, "get(...)");
        UnifiedAccountStore unifiedAccountStore2 = unifiedAccountStore;
        BooleanPreference booleanPreference = this.hasDismissedPnlUnavailableBannerPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = booleanPreference;
        BooleanPreference booleanPreference3 = this.hasDismissedPnlPendingBannerPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference3, "get(...)");
        BooleanPreference booleanPreference4 = booleanPreference3;
        BooleanPreference booleanPreference5 = this.hasSeenAvgCostReturnOptimizedTooltipPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference5, "get(...)");
        return companion.newInstance(duxoBundle, cryptoPositionStateProvider, appType, clock, cryptoAccountStore, cryptoAccountProvider, cryptoStakingStore, cryptoExperimentsStore, cryptoHoldingStore, cryptoPositionDetailsStore, cryptoQuoteStore, cryptobilityStore, currencyPairV2Store, marketDataProxyStore2, unifiedAccountStore2, booleanPreference2, booleanPreference4, booleanPreference5);
    }

    /* compiled from: CryptoPositionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u008b\u0002\u0010(\u001a\u00020'2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00042\f\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\u0004H\u0007¢\u0006\u0004\b(\u0010)J\u009f\u0001\u0010+\u001a\u00020*2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#H\u0007¢\u0006\u0004\b+\u0010,¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionStateProvider;", "stateProvider", "Lcom/robinhood/shared/app/type/AppType;", "appType", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoAccountStore", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoAccountProvider", "Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;", "cryptoStakingStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "cryptoHoldingStore", "Lcom/robinhood/librobinhood/data/store/CryptoPositionDetailsStore;", "cryptoPositionDetailsStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptobilityStore;", "cryptobilityStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/MarketDataProxyStore;", "marketDataProxyStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "unifiedAccountStore", "Lcom/robinhood/prefs/BooleanPreference;", "hasDismissedPnlUnavailableBannerPref", "hasDismissedPnlPendingBannerPref", "hasSeenAvgCostReturnOptimizedTooltipPref", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDuxo_Factory;", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDuxo;", "newInstance", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionStateProvider;Lcom/robinhood/shared/app/type/AppType;Lj$/time/Clock;Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;Lcom/robinhood/librobinhood/data/store/CryptoPositionDetailsStore;Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;Lcom/robinhood/librobinhood/data/store/CryptobilityStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Lcom/robinhood/librobinhood/data/store/MarketDataProxyStore;Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;)Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDuxo;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoPositionDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<CryptoPositionStateProvider> stateProvider, Provider<AppType> appType, Provider<Clock> clock, Provider<CryptoAccountStore> cryptoAccountStore, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<CryptoStakingStore> cryptoStakingStore, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoHoldingStore> cryptoHoldingStore, Provider<CryptoPositionDetailsStore> cryptoPositionDetailsStore, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<CryptobilityStore> cryptobilityStore, Provider<CurrencyPairV2Store> currencyPairStore, Provider<MarketDataProxyStore> marketDataProxyStore, Provider<UnifiedAccountStore> unifiedAccountStore, Provider<BooleanPreference> hasDismissedPnlUnavailableBannerPref, Provider<BooleanPreference> hasDismissedPnlPendingBannerPref, Provider<BooleanPreference> hasSeenAvgCostReturnOptimizedTooltipPref) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(cryptoStakingStore, "cryptoStakingStore");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
            Intrinsics.checkNotNullParameter(cryptoPositionDetailsStore, "cryptoPositionDetailsStore");
            Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
            Intrinsics.checkNotNullParameter(cryptobilityStore, "cryptobilityStore");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(marketDataProxyStore, "marketDataProxyStore");
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            Intrinsics.checkNotNullParameter(hasDismissedPnlUnavailableBannerPref, "hasDismissedPnlUnavailableBannerPref");
            Intrinsics.checkNotNullParameter(hasDismissedPnlPendingBannerPref, "hasDismissedPnlPendingBannerPref");
            Intrinsics.checkNotNullParameter(hasSeenAvgCostReturnOptimizedTooltipPref, "hasSeenAvgCostReturnOptimizedTooltipPref");
            return new CryptoPositionDuxo_Factory(duxoBundle, stateProvider, appType, clock, cryptoAccountStore, cryptoAccountProvider, cryptoStakingStore, cryptoExperimentsStore, cryptoHoldingStore, cryptoPositionDetailsStore, cryptoQuoteStore, cryptobilityStore, currencyPairStore, marketDataProxyStore, unifiedAccountStore, hasDismissedPnlUnavailableBannerPref, hasDismissedPnlPendingBannerPref, hasSeenAvgCostReturnOptimizedTooltipPref);
        }

        @JvmStatic
        public final CryptoPositionDuxo newInstance(DuxoBundle duxoBundle, CryptoPositionStateProvider stateProvider, AppType appType, Clock clock, CryptoAccountStore cryptoAccountStore, CryptoAccountProvider cryptoAccountProvider, CryptoStakingStore cryptoStakingStore, CryptoExperimentsStore cryptoExperimentsStore, CryptoHoldingStore cryptoHoldingStore, CryptoPositionDetailsStore cryptoPositionDetailsStore, CryptoQuoteStore cryptoQuoteStore, CryptobilityStore cryptobilityStore, CurrencyPairV2Store currencyPairStore, MarketDataProxyStore marketDataProxyStore, UnifiedAccountStore unifiedAccountStore, BooleanPreference hasDismissedPnlUnavailableBannerPref, BooleanPreference hasDismissedPnlPendingBannerPref, BooleanPreference hasSeenAvgCostReturnOptimizedTooltipPref) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(cryptoStakingStore, "cryptoStakingStore");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
            Intrinsics.checkNotNullParameter(cryptoPositionDetailsStore, "cryptoPositionDetailsStore");
            Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
            Intrinsics.checkNotNullParameter(cryptobilityStore, "cryptobilityStore");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(marketDataProxyStore, "marketDataProxyStore");
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            Intrinsics.checkNotNullParameter(hasDismissedPnlUnavailableBannerPref, "hasDismissedPnlUnavailableBannerPref");
            Intrinsics.checkNotNullParameter(hasDismissedPnlPendingBannerPref, "hasDismissedPnlPendingBannerPref");
            Intrinsics.checkNotNullParameter(hasSeenAvgCostReturnOptimizedTooltipPref, "hasSeenAvgCostReturnOptimizedTooltipPref");
            return new CryptoPositionDuxo(duxoBundle, stateProvider, appType, clock, cryptoAccountStore, cryptoAccountProvider, cryptoStakingStore, cryptoExperimentsStore, cryptoHoldingStore, cryptoPositionDetailsStore, cryptoQuoteStore, cryptobilityStore, currencyPairStore, marketDataProxyStore, unifiedAccountStore, hasDismissedPnlUnavailableBannerPref, hasDismissedPnlPendingBannerPref, hasSeenAvgCostReturnOptimizedTooltipPref);
        }
    }
}

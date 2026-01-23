package com.robinhood.android.trade.options;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.common.options.order.OptionOrderContextFactory;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.markethours.data.store.MarketHoursStore;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.trade.options.util.OptionOrderManager;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.CryptoPendingAndCancelStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.OptionFeeStore;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.librobinhood.data.store.OptionMarketabilityStore;
import com.robinhood.librobinhood.data.store.OptionOrderCheckStore;
import com.robinhood.librobinhood.data.store.OptionOrderDiscoveryStore;
import com.robinhood.librobinhood.data.store.OptionOrderNomenclatureStore;
import com.robinhood.librobinhood.data.store.OptionOrderStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionTradeSettingsStore;
import com.robinhood.librobinhood.data.store.OptionsBuyingPowerStore;
import com.robinhood.librobinhood.data.store.OptionsExtendedHoursEnabledStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p355ui.OptionChainLandingPage;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: OptionOrderDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 I2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001IBÄ\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0003\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0003\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0003\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0003\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0003\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0003\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0003\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u0003\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0003\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u0003\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u0002000\u0003\u0012\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0003\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u0002040\u0003\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u0002060\u0003\u0012\u0017\u0010;\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020908¢\u0006\u0002\b:0\u0003\u0012\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u0003\u0012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u0003\u0012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u0003\u0012\f\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u0003¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0002H\u0016¢\u0006\u0004\bF\u0010GR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010HR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010HR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010HR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010HR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010HR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010HR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010HR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010HR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010HR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010HR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010HR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010HR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010HR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010HR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010HR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010HR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010HR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010HR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010HR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010HR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010HR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010HR\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010HR\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010HR\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010HR\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010HR%\u0010;\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020908¢\u0006\u0002\b:0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010HR\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010HR\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010HR\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010HR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010H¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/trade/options/OptionOrderDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/analytics/AnalyticsLogger;", "analytics", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/CryptoPendingAndCancelStore;", "cryptoPendingAndCancelStore", "Lcom/robinhood/analytics/TraderEventLogger;", "eventLogger", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "indexStore", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "marketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionsBuyingPowerStore;", "optionBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/OptionFeeStore;", "optionFeeStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketabilityStore;", "optionMarketabilityStore", "Lcom/robinhood/android/common/options/order/OptionOrderContextFactory;", "optionOrderContextFactory", "Lcom/robinhood/librobinhood/data/store/OptionOrderCheckStore;", "optionOrderCheckStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderDiscoveryStore;", "optionOrderDiscoveryStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderNomenclatureStore;", "optionOrderNomenclatureStore", "Lcom/robinhood/android/trade/options/util/OptionOrderManager;", "optionOrderManager", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionTradeSettingsStore;", "optionTradeSettingsStore", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceLogger", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "quoteStore", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "optionsExtendedHoursEnabledStore", "Lcom/robinhood/prefs/BooleanPreference;", "optionOrderMarketTooltipPref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/models/ui/OptionChainLandingPage;", "Lkotlin/jvm/JvmSuppressWildcards;", "optionChainLandingPagePref", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Ldispatch/core/DispatcherProvider;", "dispatcherProvider", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxFactory", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "rxGlobalErrorHandler", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/trade/options/OptionOrderDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OptionOrderDuxo_Factory implements Factory<OptionOrderDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<Clock> clock;
    private final Provider<CryptoPendingAndCancelStore> cryptoPendingAndCancelStore;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<TraderEventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<IndexStore> indexStore;
    private final Provider<MarketHoursStore> marketHoursStore;
    private final Provider<OptionAccountSwitcherStore> optionAccountSwitcherStore;
    private final Provider<OptionsBuyingPowerStore> optionBuyingPowerStore;
    private final Provider<EnumPreference<OptionChainLandingPage>> optionChainLandingPagePref;
    private final Provider<OptionFeeStore> optionFeeStore;
    private final Provider<OptionMarketHoursStore> optionMarketHoursStore;
    private final Provider<OptionMarketabilityStore> optionMarketabilityStore;
    private final Provider<OptionOrderCheckStore> optionOrderCheckStore;
    private final Provider<OptionOrderContextFactory> optionOrderContextFactory;
    private final Provider<OptionOrderDiscoveryStore> optionOrderDiscoveryStore;
    private final Provider<OptionOrderManager> optionOrderManager;
    private final Provider<BooleanPreference> optionOrderMarketTooltipPref;
    private final Provider<OptionOrderNomenclatureStore> optionOrderNomenclatureStore;
    private final Provider<OptionOrderStore> optionOrderStore;
    private final Provider<OptionQuoteStore> optionQuoteStore;
    private final Provider<OptionTradeSettingsStore> optionTradeSettingsStore;
    private final Provider<OptionsExtendedHoursEnabledStore> optionsExtendedHoursEnabledStore;
    private final Provider<PerformanceLogger> performanceLogger;
    private final Provider<QuoteStore> quoteStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OptionOrderDuxo_Factory create(Provider<AccountProvider> provider, Provider<AnalyticsLogger> provider2, Provider<Clock> provider3, Provider<CryptoPendingAndCancelStore> provider4, Provider<TraderEventLogger> provider5, Provider<ExperimentsStore> provider6, Provider<IndexStore> provider7, Provider<MarketHoursStore> provider8, Provider<OptionAccountSwitcherStore> provider9, Provider<OptionsBuyingPowerStore> provider10, Provider<OptionFeeStore> provider11, Provider<OptionMarketHoursStore> provider12, Provider<OptionMarketabilityStore> provider13, Provider<OptionOrderContextFactory> provider14, Provider<OptionOrderCheckStore> provider15, Provider<OptionOrderDiscoveryStore> provider16, Provider<OptionOrderNomenclatureStore> provider17, Provider<OptionOrderManager> provider18, Provider<OptionOrderStore> provider19, Provider<OptionQuoteStore> provider20, Provider<OptionTradeSettingsStore> provider21, Provider<PerformanceLogger> provider22, Provider<QuoteStore> provider23, Provider<UserStore> provider24, Provider<OptionsExtendedHoursEnabledStore> provider25, Provider<BooleanPreference> provider26, Provider<EnumPreference<OptionChainLandingPage>> provider27, Provider<SavedStateHandle> provider28, Provider<DispatcherProvider> provider29, Provider<RxFactory> provider30, Provider<RxGlobalErrorHandler> provider31) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26, provider27, provider28, provider29, provider30, provider31);
    }

    @JvmStatic
    public static final OptionOrderDuxo newInstance(AccountProvider accountProvider, AnalyticsLogger analyticsLogger, Clock clock, CryptoPendingAndCancelStore cryptoPendingAndCancelStore, TraderEventLogger traderEventLogger, ExperimentsStore experimentsStore, IndexStore indexStore, MarketHoursStore marketHoursStore, OptionAccountSwitcherStore optionAccountSwitcherStore, OptionsBuyingPowerStore optionsBuyingPowerStore, OptionFeeStore optionFeeStore, OptionMarketHoursStore optionMarketHoursStore, OptionMarketabilityStore optionMarketabilityStore, OptionOrderContextFactory optionOrderContextFactory, OptionOrderCheckStore optionOrderCheckStore, OptionOrderDiscoveryStore optionOrderDiscoveryStore, OptionOrderNomenclatureStore optionOrderNomenclatureStore, OptionOrderManager optionOrderManager, OptionOrderStore optionOrderStore, OptionQuoteStore optionQuoteStore, OptionTradeSettingsStore optionTradeSettingsStore, PerformanceLogger performanceLogger, QuoteStore quoteStore, UserStore userStore, OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore, BooleanPreference booleanPreference, EnumPreference<OptionChainLandingPage> enumPreference, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(accountProvider, analyticsLogger, clock, cryptoPendingAndCancelStore, traderEventLogger, experimentsStore, indexStore, marketHoursStore, optionAccountSwitcherStore, optionsBuyingPowerStore, optionFeeStore, optionMarketHoursStore, optionMarketabilityStore, optionOrderContextFactory, optionOrderCheckStore, optionOrderDiscoveryStore, optionOrderNomenclatureStore, optionOrderManager, optionOrderStore, optionQuoteStore, optionTradeSettingsStore, performanceLogger, quoteStore, userStore, optionsExtendedHoursEnabledStore, booleanPreference, enumPreference, savedStateHandle);
    }

    public OptionOrderDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<AnalyticsLogger> analytics, Provider<Clock> clock, Provider<CryptoPendingAndCancelStore> cryptoPendingAndCancelStore, Provider<TraderEventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<IndexStore> indexStore, Provider<MarketHoursStore> marketHoursStore, Provider<OptionAccountSwitcherStore> optionAccountSwitcherStore, Provider<OptionsBuyingPowerStore> optionBuyingPowerStore, Provider<OptionFeeStore> optionFeeStore, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<OptionMarketabilityStore> optionMarketabilityStore, Provider<OptionOrderContextFactory> optionOrderContextFactory, Provider<OptionOrderCheckStore> optionOrderCheckStore, Provider<OptionOrderDiscoveryStore> optionOrderDiscoveryStore, Provider<OptionOrderNomenclatureStore> optionOrderNomenclatureStore, Provider<OptionOrderManager> optionOrderManager, Provider<OptionOrderStore> optionOrderStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<OptionTradeSettingsStore> optionTradeSettingsStore, Provider<PerformanceLogger> performanceLogger, Provider<QuoteStore> quoteStore, Provider<UserStore> userStore, Provider<OptionsExtendedHoursEnabledStore> optionsExtendedHoursEnabledStore, Provider<BooleanPreference> optionOrderMarketTooltipPref, Provider<EnumPreference<OptionChainLandingPage>> optionChainLandingPagePref, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(cryptoPendingAndCancelStore, "cryptoPendingAndCancelStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
        Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(optionBuyingPowerStore, "optionBuyingPowerStore");
        Intrinsics.checkNotNullParameter(optionFeeStore, "optionFeeStore");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(optionMarketabilityStore, "optionMarketabilityStore");
        Intrinsics.checkNotNullParameter(optionOrderContextFactory, "optionOrderContextFactory");
        Intrinsics.checkNotNullParameter(optionOrderCheckStore, "optionOrderCheckStore");
        Intrinsics.checkNotNullParameter(optionOrderDiscoveryStore, "optionOrderDiscoveryStore");
        Intrinsics.checkNotNullParameter(optionOrderNomenclatureStore, "optionOrderNomenclatureStore");
        Intrinsics.checkNotNullParameter(optionOrderManager, "optionOrderManager");
        Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(optionTradeSettingsStore, "optionTradeSettingsStore");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
        Intrinsics.checkNotNullParameter(optionOrderMarketTooltipPref, "optionOrderMarketTooltipPref");
        Intrinsics.checkNotNullParameter(optionChainLandingPagePref, "optionChainLandingPagePref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.accountProvider = accountProvider;
        this.analytics = analytics;
        this.clock = clock;
        this.cryptoPendingAndCancelStore = cryptoPendingAndCancelStore;
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.indexStore = indexStore;
        this.marketHoursStore = marketHoursStore;
        this.optionAccountSwitcherStore = optionAccountSwitcherStore;
        this.optionBuyingPowerStore = optionBuyingPowerStore;
        this.optionFeeStore = optionFeeStore;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.optionMarketabilityStore = optionMarketabilityStore;
        this.optionOrderContextFactory = optionOrderContextFactory;
        this.optionOrderCheckStore = optionOrderCheckStore;
        this.optionOrderDiscoveryStore = optionOrderDiscoveryStore;
        this.optionOrderNomenclatureStore = optionOrderNomenclatureStore;
        this.optionOrderManager = optionOrderManager;
        this.optionOrderStore = optionOrderStore;
        this.optionQuoteStore = optionQuoteStore;
        this.optionTradeSettingsStore = optionTradeSettingsStore;
        this.performanceLogger = performanceLogger;
        this.quoteStore = quoteStore;
        this.userStore = userStore;
        this.optionsExtendedHoursEnabledStore = optionsExtendedHoursEnabledStore;
        this.optionOrderMarketTooltipPref = optionOrderMarketTooltipPref;
        this.optionChainLandingPagePref = optionChainLandingPagePref;
        this.savedStateHandle = savedStateHandle;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public OptionOrderDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        CryptoPendingAndCancelStore cryptoPendingAndCancelStore = this.cryptoPendingAndCancelStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoPendingAndCancelStore, "get(...)");
        TraderEventLogger traderEventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(traderEventLogger, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        IndexStore indexStore = this.indexStore.get();
        Intrinsics.checkNotNullExpressionValue(indexStore, "get(...)");
        MarketHoursStore marketHoursStore = this.marketHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(marketHoursStore, "get(...)");
        OptionAccountSwitcherStore optionAccountSwitcherStore = this.optionAccountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(optionAccountSwitcherStore, "get(...)");
        OptionsBuyingPowerStore optionsBuyingPowerStore = this.optionBuyingPowerStore.get();
        Intrinsics.checkNotNullExpressionValue(optionsBuyingPowerStore, "get(...)");
        OptionFeeStore optionFeeStore = this.optionFeeStore.get();
        Intrinsics.checkNotNullExpressionValue(optionFeeStore, "get(...)");
        OptionMarketHoursStore optionMarketHoursStore = this.optionMarketHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(optionMarketHoursStore, "get(...)");
        OptionMarketabilityStore optionMarketabilityStore = this.optionMarketabilityStore.get();
        Intrinsics.checkNotNullExpressionValue(optionMarketabilityStore, "get(...)");
        OptionOrderContextFactory optionOrderContextFactory = this.optionOrderContextFactory.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderContextFactory, "get(...)");
        OptionOrderContextFactory optionOrderContextFactory2 = optionOrderContextFactory;
        OptionOrderCheckStore optionOrderCheckStore = this.optionOrderCheckStore.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderCheckStore, "get(...)");
        OptionOrderCheckStore optionOrderCheckStore2 = optionOrderCheckStore;
        OptionOrderDiscoveryStore optionOrderDiscoveryStore = this.optionOrderDiscoveryStore.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderDiscoveryStore, "get(...)");
        OptionOrderDiscoveryStore optionOrderDiscoveryStore2 = optionOrderDiscoveryStore;
        OptionOrderNomenclatureStore optionOrderNomenclatureStore = this.optionOrderNomenclatureStore.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderNomenclatureStore, "get(...)");
        OptionOrderNomenclatureStore optionOrderNomenclatureStore2 = optionOrderNomenclatureStore;
        OptionOrderManager optionOrderManager = this.optionOrderManager.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderManager, "get(...)");
        OptionOrderManager optionOrderManager2 = optionOrderManager;
        OptionOrderStore optionOrderStore = this.optionOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderStore, "get(...)");
        OptionOrderStore optionOrderStore2 = optionOrderStore;
        OptionQuoteStore optionQuoteStore = this.optionQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(optionQuoteStore, "get(...)");
        OptionQuoteStore optionQuoteStore2 = optionQuoteStore;
        OptionTradeSettingsStore optionTradeSettingsStore = this.optionTradeSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(optionTradeSettingsStore, "get(...)");
        OptionTradeSettingsStore optionTradeSettingsStore2 = optionTradeSettingsStore;
        PerformanceLogger performanceLogger = this.performanceLogger.get();
        Intrinsics.checkNotNullExpressionValue(performanceLogger, "get(...)");
        PerformanceLogger performanceLogger2 = performanceLogger;
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        QuoteStore quoteStore2 = quoteStore;
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        UserStore userStore2 = userStore;
        OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore = this.optionsExtendedHoursEnabledStore.get();
        Intrinsics.checkNotNullExpressionValue(optionsExtendedHoursEnabledStore, "get(...)");
        OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore2 = optionsExtendedHoursEnabledStore;
        BooleanPreference booleanPreference = this.optionOrderMarketTooltipPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = booleanPreference;
        EnumPreference<OptionChainLandingPage> enumPreference = this.optionChainLandingPagePref.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        EnumPreference<OptionChainLandingPage> enumPreference2 = enumPreference;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        OptionOrderDuxo optionOrderDuxoNewInstance = companion.newInstance(accountProvider, analyticsLogger, clock, cryptoPendingAndCancelStore, traderEventLogger, experimentsStore, indexStore, marketHoursStore, optionAccountSwitcherStore, optionsBuyingPowerStore, optionFeeStore, optionMarketHoursStore, optionMarketabilityStore, optionOrderContextFactory2, optionOrderCheckStore2, optionOrderDiscoveryStore2, optionOrderNomenclatureStore2, optionOrderManager2, optionOrderStore2, optionQuoteStore2, optionTradeSettingsStore2, performanceLogger2, quoteStore2, userStore2, optionsExtendedHoursEnabledStore2, booleanPreference2, enumPreference2, savedStateHandle);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(optionOrderDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(optionOrderDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(optionOrderDuxoNewInstance, rxGlobalErrorHandler);
        return optionOrderDuxoNewInstance;
    }

    /* compiled from: OptionOrderDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÌ\u0003\u0010F\u001a\u00020E2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00042\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00042\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00042\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00042\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00042\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00042\f\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00042\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00042\f\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00042\f\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00042\u0017\u0010<\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020:09¢\u0006\u0002\b;0\u00042\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u00042\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00042\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u00042\f\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u0004H\u0007¢\u0006\u0004\bF\u0010GJú\u0001\u0010I\u001a\u00020H2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u0002072\u0011\u0010<\u001a\r\u0012\u0004\u0012\u00020:09¢\u0006\u0002\b;2\u0006\u0010>\u001a\u00020=H\u0007¢\u0006\u0004\bI\u0010J¨\u0006K"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/analytics/AnalyticsLogger;", "analytics", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/CryptoPendingAndCancelStore;", "cryptoPendingAndCancelStore", "Lcom/robinhood/analytics/TraderEventLogger;", "eventLogger", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "indexStore", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "marketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionsBuyingPowerStore;", "optionBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/OptionFeeStore;", "optionFeeStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketabilityStore;", "optionMarketabilityStore", "Lcom/robinhood/android/common/options/order/OptionOrderContextFactory;", "optionOrderContextFactory", "Lcom/robinhood/librobinhood/data/store/OptionOrderCheckStore;", "optionOrderCheckStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderDiscoveryStore;", "optionOrderDiscoveryStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderNomenclatureStore;", "optionOrderNomenclatureStore", "Lcom/robinhood/android/trade/options/util/OptionOrderManager;", "optionOrderManager", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionTradeSettingsStore;", "optionTradeSettingsStore", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceLogger", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "quoteStore", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "optionsExtendedHoursEnabledStore", "Lcom/robinhood/prefs/BooleanPreference;", "optionOrderMarketTooltipPref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/models/ui/OptionChainLandingPage;", "Lkotlin/jvm/JvmSuppressWildcards;", "optionChainLandingPagePref", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Ldispatch/core/DispatcherProvider;", "dispatcherProvider", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxFactory", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "rxGlobalErrorHandler", "Lcom/robinhood/android/trade/options/OptionOrderDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/trade/options/OptionOrderDuxo_Factory;", "Lcom/robinhood/android/trade/options/OptionOrderDuxo;", "newInstance", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/analytics/AnalyticsLogger;Lj$/time/Clock;Lcom/robinhood/librobinhood/data/store/CryptoPendingAndCancelStore;Lcom/robinhood/analytics/TraderEventLogger;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/android/markethours/data/store/MarketHoursStore;Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;Lcom/robinhood/librobinhood/data/store/OptionsBuyingPowerStore;Lcom/robinhood/librobinhood/data/store/OptionFeeStore;Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;Lcom/robinhood/librobinhood/data/store/OptionMarketabilityStore;Lcom/robinhood/android/common/options/order/OptionOrderContextFactory;Lcom/robinhood/librobinhood/data/store/OptionOrderCheckStore;Lcom/robinhood/librobinhood/data/store/OptionOrderDiscoveryStore;Lcom/robinhood/librobinhood/data/store/OptionOrderNomenclatureStore;Lcom/robinhood/android/trade/options/util/OptionOrderManager;Lcom/robinhood/librobinhood/data/store/OptionOrderStore;Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;Lcom/robinhood/librobinhood/data/store/OptionTradeSettingsStore;Lcom/robinhood/android/performancelogger/PerformanceLogger;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/EnumPreference;Landroidx/lifecycle/SavedStateHandle;)Lcom/robinhood/android/trade/options/OptionOrderDuxo;", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionOrderDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<AnalyticsLogger> analytics, Provider<Clock> clock, Provider<CryptoPendingAndCancelStore> cryptoPendingAndCancelStore, Provider<TraderEventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<IndexStore> indexStore, Provider<MarketHoursStore> marketHoursStore, Provider<OptionAccountSwitcherStore> optionAccountSwitcherStore, Provider<OptionsBuyingPowerStore> optionBuyingPowerStore, Provider<OptionFeeStore> optionFeeStore, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<OptionMarketabilityStore> optionMarketabilityStore, Provider<OptionOrderContextFactory> optionOrderContextFactory, Provider<OptionOrderCheckStore> optionOrderCheckStore, Provider<OptionOrderDiscoveryStore> optionOrderDiscoveryStore, Provider<OptionOrderNomenclatureStore> optionOrderNomenclatureStore, Provider<OptionOrderManager> optionOrderManager, Provider<OptionOrderStore> optionOrderStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<OptionTradeSettingsStore> optionTradeSettingsStore, Provider<PerformanceLogger> performanceLogger, Provider<QuoteStore> quoteStore, Provider<UserStore> userStore, Provider<OptionsExtendedHoursEnabledStore> optionsExtendedHoursEnabledStore, Provider<BooleanPreference> optionOrderMarketTooltipPref, Provider<EnumPreference<OptionChainLandingPage>> optionChainLandingPagePref, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(cryptoPendingAndCancelStore, "cryptoPendingAndCancelStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
            Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(optionBuyingPowerStore, "optionBuyingPowerStore");
            Intrinsics.checkNotNullParameter(optionFeeStore, "optionFeeStore");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            Intrinsics.checkNotNullParameter(optionMarketabilityStore, "optionMarketabilityStore");
            Intrinsics.checkNotNullParameter(optionOrderContextFactory, "optionOrderContextFactory");
            Intrinsics.checkNotNullParameter(optionOrderCheckStore, "optionOrderCheckStore");
            Intrinsics.checkNotNullParameter(optionOrderDiscoveryStore, "optionOrderDiscoveryStore");
            Intrinsics.checkNotNullParameter(optionOrderNomenclatureStore, "optionOrderNomenclatureStore");
            Intrinsics.checkNotNullParameter(optionOrderManager, "optionOrderManager");
            Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(optionTradeSettingsStore, "optionTradeSettingsStore");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
            Intrinsics.checkNotNullParameter(optionOrderMarketTooltipPref, "optionOrderMarketTooltipPref");
            Intrinsics.checkNotNullParameter(optionChainLandingPagePref, "optionChainLandingPagePref");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new OptionOrderDuxo_Factory(accountProvider, analytics, clock, cryptoPendingAndCancelStore, eventLogger, experimentsStore, indexStore, marketHoursStore, optionAccountSwitcherStore, optionBuyingPowerStore, optionFeeStore, optionMarketHoursStore, optionMarketabilityStore, optionOrderContextFactory, optionOrderCheckStore, optionOrderDiscoveryStore, optionOrderNomenclatureStore, optionOrderManager, optionOrderStore, optionQuoteStore, optionTradeSettingsStore, performanceLogger, quoteStore, userStore, optionsExtendedHoursEnabledStore, optionOrderMarketTooltipPref, optionChainLandingPagePref, savedStateHandle, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final OptionOrderDuxo newInstance(AccountProvider accountProvider, AnalyticsLogger analytics, Clock clock, CryptoPendingAndCancelStore cryptoPendingAndCancelStore, TraderEventLogger eventLogger, ExperimentsStore experimentsStore, IndexStore indexStore, MarketHoursStore marketHoursStore, OptionAccountSwitcherStore optionAccountSwitcherStore, OptionsBuyingPowerStore optionBuyingPowerStore, OptionFeeStore optionFeeStore, OptionMarketHoursStore optionMarketHoursStore, OptionMarketabilityStore optionMarketabilityStore, OptionOrderContextFactory optionOrderContextFactory, OptionOrderCheckStore optionOrderCheckStore, OptionOrderDiscoveryStore optionOrderDiscoveryStore, OptionOrderNomenclatureStore optionOrderNomenclatureStore, OptionOrderManager optionOrderManager, OptionOrderStore optionOrderStore, OptionQuoteStore optionQuoteStore, OptionTradeSettingsStore optionTradeSettingsStore, PerformanceLogger performanceLogger, QuoteStore quoteStore, UserStore userStore, OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore, BooleanPreference optionOrderMarketTooltipPref, EnumPreference<OptionChainLandingPage> optionChainLandingPagePref, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(cryptoPendingAndCancelStore, "cryptoPendingAndCancelStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
            Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(optionBuyingPowerStore, "optionBuyingPowerStore");
            Intrinsics.checkNotNullParameter(optionFeeStore, "optionFeeStore");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            Intrinsics.checkNotNullParameter(optionMarketabilityStore, "optionMarketabilityStore");
            Intrinsics.checkNotNullParameter(optionOrderContextFactory, "optionOrderContextFactory");
            Intrinsics.checkNotNullParameter(optionOrderCheckStore, "optionOrderCheckStore");
            Intrinsics.checkNotNullParameter(optionOrderDiscoveryStore, "optionOrderDiscoveryStore");
            Intrinsics.checkNotNullParameter(optionOrderNomenclatureStore, "optionOrderNomenclatureStore");
            Intrinsics.checkNotNullParameter(optionOrderManager, "optionOrderManager");
            Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(optionTradeSettingsStore, "optionTradeSettingsStore");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
            Intrinsics.checkNotNullParameter(optionOrderMarketTooltipPref, "optionOrderMarketTooltipPref");
            Intrinsics.checkNotNullParameter(optionChainLandingPagePref, "optionChainLandingPagePref");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new OptionOrderDuxo(accountProvider, analytics, clock, cryptoPendingAndCancelStore, eventLogger, experimentsStore, indexStore, marketHoursStore, optionAccountSwitcherStore, optionBuyingPowerStore, optionFeeStore, optionMarketHoursStore, optionMarketabilityStore, optionOrderContextFactory, optionOrderCheckStore, optionOrderDiscoveryStore, optionOrderNomenclatureStore, optionOrderManager, optionOrderStore, optionQuoteStore, optionTradeSettingsStore, performanceLogger, quoteStore, userStore, optionsExtendedHoursEnabledStore, optionOrderMarketTooltipPref, optionChainLandingPagePref, savedStateHandle);
        }
    }
}

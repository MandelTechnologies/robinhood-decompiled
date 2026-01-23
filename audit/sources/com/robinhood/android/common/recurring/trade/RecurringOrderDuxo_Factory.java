package com.robinhood.android.common.recurring.trade;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.recurring.trade.validation.RecurringOrderValidator;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.BalancesStore;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CurrencyPairStore;
import com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.SweepsStatusStore;
import com.robinhood.librobinhood.data.store.TraderDayTradeStore;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementContributionsCombinedSummaryStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.librobinhood.logging.RhyGlobalLoggingContext;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00017B×\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0004\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0004\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0004¢\u0006\u0004\b4\u00105J\b\u00106\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/RecurringOrderDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "unifiedBalancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "cryptoBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/CryptoBuyingPowerStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "marginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "dayTradeStore", "Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore;", "orderManager", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderManager;", "validator", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidator;", "sweepsStatusStore", "Lcom/robinhood/librobinhood/data/store/SweepsStatusStore;", "retirementContributionsCombinedSummaryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementContributionsCombinedSummaryStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "rhyGlobalLoggingContext", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RecurringOrderDuxo_Factory implements Factory<RecurringOrderDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AchRelationshipStore> achRelationshipStore;
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<CryptoAccountStore> cryptoAccountStore;
    private final Provider<CryptoBuyingPowerStore> cryptoBuyingPowerStore;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CurrencyPairStore> currencyPairStore;
    private final Provider<TraderDayTradeStore> dayTradeStore;
    private final Provider<DirectDepositRelationshipStore> directDepositRelationshipStore;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<EventLogger> eventLogger;
    private final Provider<InstrumentBuyingPowerStore> instrumentBuyingPowerStore;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<LeveredMarginSettingsStore> marginSettingsStore;
    private final Provider<RecurringOrderManager> orderManager;
    private final Provider<RetirementContributionsCombinedSummaryStore> retirementContributionsCombinedSummaryStore;
    private final Provider<RhyGlobalLoggingContext> rhyGlobalLoggingContext;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<SweepsStatusStore> sweepsStatusStore;
    private final Provider<UnifiedAccountStore> unifiedAccountStore;
    private final Provider<BalancesStore> unifiedBalancesStore;
    private final Provider<RecurringOrderValidator> validator;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RecurringOrderDuxo_Factory create(Provider<AccountProvider> provider, Provider<UnifiedAccountStore> provider2, Provider<BalancesStore> provider3, Provider<AchRelationshipStore> provider4, Provider<DirectDepositRelationshipStore> provider5, Provider<AnalyticsLogger> provider6, Provider<EventLogger> provider7, Provider<InstrumentStore> provider8, Provider<InstrumentBuyingPowerStore> provider9, Provider<CurrencyPairStore> provider10, Provider<CryptoBuyingPowerStore> provider11, Provider<CryptoAccountStore> provider12, Provider<LeveredMarginSettingsStore> provider13, Provider<TraderDayTradeStore> provider14, Provider<RecurringOrderManager> provider15, Provider<RecurringOrderValidator> provider16, Provider<SweepsStatusStore> provider17, Provider<RetirementContributionsCombinedSummaryStore> provider18, Provider<CryptoExperimentsStore> provider19, Provider<RhyGlobalLoggingContext> provider20, Provider<SavedStateHandle> provider21, Provider<DispatcherProvider> provider22, Provider<RxFactory> provider23, Provider<RxGlobalErrorHandler> provider24) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24);
    }

    @JvmStatic
    public static final RecurringOrderDuxo newInstance(AccountProvider accountProvider, UnifiedAccountStore unifiedAccountStore, BalancesStore balancesStore, AchRelationshipStore achRelationshipStore, DirectDepositRelationshipStore directDepositRelationshipStore, AnalyticsLogger analyticsLogger, EventLogger eventLogger, InstrumentStore instrumentStore, InstrumentBuyingPowerStore instrumentBuyingPowerStore, CurrencyPairStore currencyPairStore, CryptoBuyingPowerStore cryptoBuyingPowerStore, CryptoAccountStore cryptoAccountStore, LeveredMarginSettingsStore leveredMarginSettingsStore, TraderDayTradeStore traderDayTradeStore, RecurringOrderManager recurringOrderManager, RecurringOrderValidator recurringOrderValidator, SweepsStatusStore sweepsStatusStore, RetirementContributionsCombinedSummaryStore retirementContributionsCombinedSummaryStore, CryptoExperimentsStore cryptoExperimentsStore, RhyGlobalLoggingContext rhyGlobalLoggingContext, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(accountProvider, unifiedAccountStore, balancesStore, achRelationshipStore, directDepositRelationshipStore, analyticsLogger, eventLogger, instrumentStore, instrumentBuyingPowerStore, currencyPairStore, cryptoBuyingPowerStore, cryptoAccountStore, leveredMarginSettingsStore, traderDayTradeStore, recurringOrderManager, recurringOrderValidator, sweepsStatusStore, retirementContributionsCombinedSummaryStore, cryptoExperimentsStore, rhyGlobalLoggingContext, savedStateHandle);
    }

    public RecurringOrderDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<UnifiedAccountStore> unifiedAccountStore, Provider<BalancesStore> unifiedBalancesStore, Provider<AchRelationshipStore> achRelationshipStore, Provider<DirectDepositRelationshipStore> directDepositRelationshipStore, Provider<AnalyticsLogger> analytics, Provider<EventLogger> eventLogger, Provider<InstrumentStore> instrumentStore, Provider<InstrumentBuyingPowerStore> instrumentBuyingPowerStore, Provider<CurrencyPairStore> currencyPairStore, Provider<CryptoBuyingPowerStore> cryptoBuyingPowerStore, Provider<CryptoAccountStore> cryptoAccountStore, Provider<LeveredMarginSettingsStore> marginSettingsStore, Provider<TraderDayTradeStore> dayTradeStore, Provider<RecurringOrderManager> orderManager, Provider<RecurringOrderValidator> validator, Provider<SweepsStatusStore> sweepsStatusStore, Provider<RetirementContributionsCombinedSummaryStore> retirementContributionsCombinedSummaryStore, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<RhyGlobalLoggingContext> rhyGlobalLoggingContext, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(unifiedBalancesStore, "unifiedBalancesStore");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(cryptoBuyingPowerStore, "cryptoBuyingPowerStore");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
        Intrinsics.checkNotNullParameter(dayTradeStore, "dayTradeStore");
        Intrinsics.checkNotNullParameter(orderManager, "orderManager");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(sweepsStatusStore, "sweepsStatusStore");
        Intrinsics.checkNotNullParameter(retirementContributionsCombinedSummaryStore, "retirementContributionsCombinedSummaryStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "rhyGlobalLoggingContext");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.accountProvider = accountProvider;
        this.unifiedAccountStore = unifiedAccountStore;
        this.unifiedBalancesStore = unifiedBalancesStore;
        this.achRelationshipStore = achRelationshipStore;
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.analytics = analytics;
        this.eventLogger = eventLogger;
        this.instrumentStore = instrumentStore;
        this.instrumentBuyingPowerStore = instrumentBuyingPowerStore;
        this.currencyPairStore = currencyPairStore;
        this.cryptoBuyingPowerStore = cryptoBuyingPowerStore;
        this.cryptoAccountStore = cryptoAccountStore;
        this.marginSettingsStore = marginSettingsStore;
        this.dayTradeStore = dayTradeStore;
        this.orderManager = orderManager;
        this.validator = validator;
        this.sweepsStatusStore = sweepsStatusStore;
        this.retirementContributionsCombinedSummaryStore = retirementContributionsCombinedSummaryStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.rhyGlobalLoggingContext = rhyGlobalLoggingContext;
        this.savedStateHandle = savedStateHandle;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public RecurringOrderDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        UnifiedAccountStore unifiedAccountStore = this.unifiedAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(unifiedAccountStore, "get(...)");
        BalancesStore balancesStore = this.unifiedBalancesStore.get();
        Intrinsics.checkNotNullExpressionValue(balancesStore, "get(...)");
        AchRelationshipStore achRelationshipStore = this.achRelationshipStore.get();
        Intrinsics.checkNotNullExpressionValue(achRelationshipStore, "get(...)");
        DirectDepositRelationshipStore directDepositRelationshipStore = this.directDepositRelationshipStore.get();
        Intrinsics.checkNotNullExpressionValue(directDepositRelationshipStore, "get(...)");
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        InstrumentBuyingPowerStore instrumentBuyingPowerStore = this.instrumentBuyingPowerStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentBuyingPowerStore, "get(...)");
        CurrencyPairStore currencyPairStore = this.currencyPairStore.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairStore, "get(...)");
        CryptoBuyingPowerStore cryptoBuyingPowerStore = this.cryptoBuyingPowerStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoBuyingPowerStore, "get(...)");
        CryptoAccountStore cryptoAccountStore = this.cryptoAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountStore, "get(...)");
        LeveredMarginSettingsStore leveredMarginSettingsStore = this.marginSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(leveredMarginSettingsStore, "get(...)");
        TraderDayTradeStore traderDayTradeStore = this.dayTradeStore.get();
        Intrinsics.checkNotNullExpressionValue(traderDayTradeStore, "get(...)");
        TraderDayTradeStore traderDayTradeStore2 = traderDayTradeStore;
        RecurringOrderManager recurringOrderManager = this.orderManager.get();
        Intrinsics.checkNotNullExpressionValue(recurringOrderManager, "get(...)");
        RecurringOrderManager recurringOrderManager2 = recurringOrderManager;
        RecurringOrderValidator recurringOrderValidator = this.validator.get();
        Intrinsics.checkNotNullExpressionValue(recurringOrderValidator, "get(...)");
        RecurringOrderValidator recurringOrderValidator2 = recurringOrderValidator;
        SweepsStatusStore sweepsStatusStore = this.sweepsStatusStore.get();
        Intrinsics.checkNotNullExpressionValue(sweepsStatusStore, "get(...)");
        SweepsStatusStore sweepsStatusStore2 = sweepsStatusStore;
        RetirementContributionsCombinedSummaryStore retirementContributionsCombinedSummaryStore = this.retirementContributionsCombinedSummaryStore.get();
        Intrinsics.checkNotNullExpressionValue(retirementContributionsCombinedSummaryStore, "get(...)");
        RetirementContributionsCombinedSummaryStore retirementContributionsCombinedSummaryStore2 = retirementContributionsCombinedSummaryStore;
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore2 = cryptoExperimentsStore;
        RhyGlobalLoggingContext rhyGlobalLoggingContext = this.rhyGlobalLoggingContext.get();
        Intrinsics.checkNotNullExpressionValue(rhyGlobalLoggingContext, "get(...)");
        RhyGlobalLoggingContext rhyGlobalLoggingContext2 = rhyGlobalLoggingContext;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        RecurringOrderDuxo recurringOrderDuxoNewInstance = companion.newInstance(accountProvider, unifiedAccountStore, balancesStore, achRelationshipStore, directDepositRelationshipStore, analyticsLogger, eventLogger, instrumentStore, instrumentBuyingPowerStore, currencyPairStore, cryptoBuyingPowerStore, cryptoAccountStore, leveredMarginSettingsStore, traderDayTradeStore2, recurringOrderManager2, recurringOrderValidator2, sweepsStatusStore2, retirementContributionsCombinedSummaryStore2, cryptoExperimentsStore2, rhyGlobalLoggingContext2, savedStateHandle);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(recurringOrderDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(recurringOrderDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(recurringOrderDuxoNewInstance, rxGlobalErrorHandler);
        return recurringOrderDuxoNewInstance;
    }

    /* compiled from: RecurringOrderDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JØ\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00072\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00072\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00072\f\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00072\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00072\f\u00105\u001a\b\u0012\u0004\u0012\u0002060\u0007H\u0007J°\u0001\u00107\u001a\u0002082\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0007¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/RecurringOrderDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/recurring/trade/RecurringOrderDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "unifiedBalancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "cryptoBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/CryptoBuyingPowerStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "marginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "dayTradeStore", "Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore;", "orderManager", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderManager;", "validator", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidator;", "sweepsStatusStore", "Lcom/robinhood/librobinhood/data/store/SweepsStatusStore;", "retirementContributionsCombinedSummaryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementContributionsCombinedSummaryStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "rhyGlobalLoggingContext", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderDuxo;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RecurringOrderDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<UnifiedAccountStore> unifiedAccountStore, Provider<BalancesStore> unifiedBalancesStore, Provider<AchRelationshipStore> achRelationshipStore, Provider<DirectDepositRelationshipStore> directDepositRelationshipStore, Provider<AnalyticsLogger> analytics, Provider<EventLogger> eventLogger, Provider<InstrumentStore> instrumentStore, Provider<InstrumentBuyingPowerStore> instrumentBuyingPowerStore, Provider<CurrencyPairStore> currencyPairStore, Provider<CryptoBuyingPowerStore> cryptoBuyingPowerStore, Provider<CryptoAccountStore> cryptoAccountStore, Provider<LeveredMarginSettingsStore> marginSettingsStore, Provider<TraderDayTradeStore> dayTradeStore, Provider<RecurringOrderManager> orderManager, Provider<RecurringOrderValidator> validator, Provider<SweepsStatusStore> sweepsStatusStore, Provider<RetirementContributionsCombinedSummaryStore> retirementContributionsCombinedSummaryStore, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<RhyGlobalLoggingContext> rhyGlobalLoggingContext, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            Intrinsics.checkNotNullParameter(unifiedBalancesStore, "unifiedBalancesStore");
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(cryptoBuyingPowerStore, "cryptoBuyingPowerStore");
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
            Intrinsics.checkNotNullParameter(dayTradeStore, "dayTradeStore");
            Intrinsics.checkNotNullParameter(orderManager, "orderManager");
            Intrinsics.checkNotNullParameter(validator, "validator");
            Intrinsics.checkNotNullParameter(sweepsStatusStore, "sweepsStatusStore");
            Intrinsics.checkNotNullParameter(retirementContributionsCombinedSummaryStore, "retirementContributionsCombinedSummaryStore");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "rhyGlobalLoggingContext");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new RecurringOrderDuxo_Factory(accountProvider, unifiedAccountStore, unifiedBalancesStore, achRelationshipStore, directDepositRelationshipStore, analytics, eventLogger, instrumentStore, instrumentBuyingPowerStore, currencyPairStore, cryptoBuyingPowerStore, cryptoAccountStore, marginSettingsStore, dayTradeStore, orderManager, validator, sweepsStatusStore, retirementContributionsCombinedSummaryStore, cryptoExperimentsStore, rhyGlobalLoggingContext, savedStateHandle, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final RecurringOrderDuxo newInstance(AccountProvider accountProvider, UnifiedAccountStore unifiedAccountStore, BalancesStore unifiedBalancesStore, AchRelationshipStore achRelationshipStore, DirectDepositRelationshipStore directDepositRelationshipStore, AnalyticsLogger analytics, EventLogger eventLogger, InstrumentStore instrumentStore, InstrumentBuyingPowerStore instrumentBuyingPowerStore, CurrencyPairStore currencyPairStore, CryptoBuyingPowerStore cryptoBuyingPowerStore, CryptoAccountStore cryptoAccountStore, LeveredMarginSettingsStore marginSettingsStore, TraderDayTradeStore dayTradeStore, RecurringOrderManager orderManager, RecurringOrderValidator validator, SweepsStatusStore sweepsStatusStore, RetirementContributionsCombinedSummaryStore retirementContributionsCombinedSummaryStore, CryptoExperimentsStore cryptoExperimentsStore, RhyGlobalLoggingContext rhyGlobalLoggingContext, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            Intrinsics.checkNotNullParameter(unifiedBalancesStore, "unifiedBalancesStore");
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(cryptoBuyingPowerStore, "cryptoBuyingPowerStore");
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
            Intrinsics.checkNotNullParameter(dayTradeStore, "dayTradeStore");
            Intrinsics.checkNotNullParameter(orderManager, "orderManager");
            Intrinsics.checkNotNullParameter(validator, "validator");
            Intrinsics.checkNotNullParameter(sweepsStatusStore, "sweepsStatusStore");
            Intrinsics.checkNotNullParameter(retirementContributionsCombinedSummaryStore, "retirementContributionsCombinedSummaryStore");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "rhyGlobalLoggingContext");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new RecurringOrderDuxo(accountProvider, unifiedAccountStore, unifiedBalancesStore, achRelationshipStore, directDepositRelationshipStore, analytics, eventLogger, instrumentStore, instrumentBuyingPowerStore, currencyPairStore, cryptoBuyingPowerStore, cryptoAccountStore, marginSettingsStore, dayTradeStore, orderManager, validator, sweepsStatusStore, retirementContributionsCombinedSummaryStore, cryptoExperimentsStore, rhyGlobalLoggingContext, savedStateHandle);
        }
    }
}

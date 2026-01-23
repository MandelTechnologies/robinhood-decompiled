package com.robinhood.android.settings.p254ui.recurring.detail;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.ScheduleAlertStore;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.store.base.InvestmentScheduleEventStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentScheduleSettingsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B½\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010 \u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsDuxo;", "achRelationshipStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "investmentScheduleEventStore", "Lcom/robinhood/store/base/InvestmentScheduleEventStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "scheduleAlertStore", "Lcom/robinhood/librobinhood/data/store/ScheduleAlertStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class InvestmentScheduleSettingsDuxo_Factory implements Factory<InvestmentScheduleSettingsDuxo> {
    private final Provider<AchRelationshipStore> achRelationshipStore;
    private final Provider<CryptoQuoteStore> cryptoQuoteStore;
    private final Provider<DirectDepositRelationshipStore> directDepositRelationshipStore;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<EventLogger> eventLogger;
    private final Provider<InvestmentScheduleEventStore> investmentScheduleEventStore;
    private final Provider<TraderInvestmentScheduleStore> investmentScheduleStore;
    private final Provider<QuoteStore> quoteStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<ScheduleAlertStore> scheduleAlertStore;
    private final Provider<UnifiedAccountStore> unifiedAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final InvestmentScheduleSettingsDuxo_Factory create(Provider<AchRelationshipStore> provider, Provider<CryptoQuoteStore> provider2, Provider<DirectDepositRelationshipStore> provider3, Provider<EventLogger> provider4, Provider<TraderInvestmentScheduleStore> provider5, Provider<InvestmentScheduleEventStore> provider6, Provider<QuoteStore> provider7, Provider<UnifiedAccountStore> provider8, Provider<ScheduleAlertStore> provider9, Provider<SavedStateHandle> provider10, Provider<DispatcherProvider> provider11, Provider<RxFactory> provider12, Provider<RxGlobalErrorHandler> provider13) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    @JvmStatic
    public static final InvestmentScheduleSettingsDuxo newInstance(AchRelationshipStore achRelationshipStore, CryptoQuoteStore cryptoQuoteStore, DirectDepositRelationshipStore directDepositRelationshipStore, EventLogger eventLogger, TraderInvestmentScheduleStore traderInvestmentScheduleStore, InvestmentScheduleEventStore investmentScheduleEventStore, QuoteStore quoteStore, UnifiedAccountStore unifiedAccountStore, ScheduleAlertStore scheduleAlertStore, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(achRelationshipStore, cryptoQuoteStore, directDepositRelationshipStore, eventLogger, traderInvestmentScheduleStore, investmentScheduleEventStore, quoteStore, unifiedAccountStore, scheduleAlertStore, savedStateHandle);
    }

    public InvestmentScheduleSettingsDuxo_Factory(Provider<AchRelationshipStore> achRelationshipStore, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<DirectDepositRelationshipStore> directDepositRelationshipStore, Provider<EventLogger> eventLogger, Provider<TraderInvestmentScheduleStore> investmentScheduleStore, Provider<InvestmentScheduleEventStore> investmentScheduleEventStore, Provider<QuoteStore> quoteStore, Provider<UnifiedAccountStore> unifiedAccountStore, Provider<ScheduleAlertStore> scheduleAlertStore, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(investmentScheduleEventStore, "investmentScheduleEventStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(scheduleAlertStore, "scheduleAlertStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.achRelationshipStore = achRelationshipStore;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.eventLogger = eventLogger;
        this.investmentScheduleStore = investmentScheduleStore;
        this.investmentScheduleEventStore = investmentScheduleEventStore;
        this.quoteStore = quoteStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.scheduleAlertStore = scheduleAlertStore;
        this.savedStateHandle = savedStateHandle;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public InvestmentScheduleSettingsDuxo get() {
        Companion companion = INSTANCE;
        AchRelationshipStore achRelationshipStore = this.achRelationshipStore.get();
        Intrinsics.checkNotNullExpressionValue(achRelationshipStore, "get(...)");
        CryptoQuoteStore cryptoQuoteStore = this.cryptoQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoQuoteStore, "get(...)");
        DirectDepositRelationshipStore directDepositRelationshipStore = this.directDepositRelationshipStore.get();
        Intrinsics.checkNotNullExpressionValue(directDepositRelationshipStore, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        TraderInvestmentScheduleStore traderInvestmentScheduleStore = this.investmentScheduleStore.get();
        Intrinsics.checkNotNullExpressionValue(traderInvestmentScheduleStore, "get(...)");
        InvestmentScheduleEventStore investmentScheduleEventStore = this.investmentScheduleEventStore.get();
        Intrinsics.checkNotNullExpressionValue(investmentScheduleEventStore, "get(...)");
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        UnifiedAccountStore unifiedAccountStore = this.unifiedAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(unifiedAccountStore, "get(...)");
        ScheduleAlertStore scheduleAlertStore = this.scheduleAlertStore.get();
        Intrinsics.checkNotNullExpressionValue(scheduleAlertStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        InvestmentScheduleSettingsDuxo investmentScheduleSettingsDuxoNewInstance = companion.newInstance(achRelationshipStore, cryptoQuoteStore, directDepositRelationshipStore, eventLogger, traderInvestmentScheduleStore, investmentScheduleEventStore, quoteStore, unifiedAccountStore, scheduleAlertStore, savedStateHandle);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(investmentScheduleSettingsDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(investmentScheduleSettingsDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(investmentScheduleSettingsDuxoNewInstance, rxGlobalErrorHandler);
        return investmentScheduleSettingsDuxoNewInstance;
    }

    /* compiled from: InvestmentScheduleSettingsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¾\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0007H\u0007JX\u0010!\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsDuxo_Factory;", "achRelationshipStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "investmentScheduleEventStore", "Lcom/robinhood/store/base/InvestmentScheduleEventStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "scheduleAlertStore", "Lcom/robinhood/librobinhood/data/store/ScheduleAlertStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsDuxo;", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InvestmentScheduleSettingsDuxo_Factory create(Provider<AchRelationshipStore> achRelationshipStore, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<DirectDepositRelationshipStore> directDepositRelationshipStore, Provider<EventLogger> eventLogger, Provider<TraderInvestmentScheduleStore> investmentScheduleStore, Provider<InvestmentScheduleEventStore> investmentScheduleEventStore, Provider<QuoteStore> quoteStore, Provider<UnifiedAccountStore> unifiedAccountStore, Provider<ScheduleAlertStore> scheduleAlertStore, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
            Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
            Intrinsics.checkNotNullParameter(investmentScheduleEventStore, "investmentScheduleEventStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            Intrinsics.checkNotNullParameter(scheduleAlertStore, "scheduleAlertStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new InvestmentScheduleSettingsDuxo_Factory(achRelationshipStore, cryptoQuoteStore, directDepositRelationshipStore, eventLogger, investmentScheduleStore, investmentScheduleEventStore, quoteStore, unifiedAccountStore, scheduleAlertStore, savedStateHandle, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final InvestmentScheduleSettingsDuxo newInstance(AchRelationshipStore achRelationshipStore, CryptoQuoteStore cryptoQuoteStore, DirectDepositRelationshipStore directDepositRelationshipStore, EventLogger eventLogger, TraderInvestmentScheduleStore investmentScheduleStore, InvestmentScheduleEventStore investmentScheduleEventStore, QuoteStore quoteStore, UnifiedAccountStore unifiedAccountStore, ScheduleAlertStore scheduleAlertStore, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
            Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
            Intrinsics.checkNotNullParameter(investmentScheduleEventStore, "investmentScheduleEventStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            Intrinsics.checkNotNullParameter(scheduleAlertStore, "scheduleAlertStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new InvestmentScheduleSettingsDuxo(achRelationshipStore, cryptoQuoteStore, directDepositRelationshipStore, eventLogger, investmentScheduleStore, investmentScheduleEventStore, quoteStore, unifiedAccountStore, scheduleAlertStore, savedStateHandle);
        }
    }
}

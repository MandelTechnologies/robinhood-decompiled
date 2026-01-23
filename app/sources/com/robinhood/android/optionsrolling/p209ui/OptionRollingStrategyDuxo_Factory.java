package com.robinhood.android.optionsrolling.p209ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.instant.p160ui.InstantCashLogger;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionRollingStore;
import com.robinhood.librobinhood.data.store.OptionStrategyInfoStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionRollingStrategyDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BË\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004¢\u0006\u0004\b \u0010!J\b\u0010\"\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "aggregateOptionStrategyQuoteStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionRollingStore", "Lcom/robinhood/librobinhood/data/store/OptionRollingStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "shouldShowRollingLearnMoreCard", "Lcom/robinhood/prefs/BooleanPreference;", "instantCashLogger", "Lcom/robinhood/android/instant/ui/InstantCashLogger;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OptionRollingStrategyDuxo_Factory implements Factory<OptionRollingStrategyDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AggregateOptionStrategyQuoteStore> aggregateOptionStrategyQuoteStore;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<EventLogger> eventLogger;
    private final Provider<InstantCashLogger> instantCashLogger;
    private final Provider<OptionChainStore> optionChainStore;
    private final Provider<OptionQuoteStore> optionQuoteStore;
    private final Provider<OptionRollingStore> optionRollingStore;
    private final Provider<OptionStrategyInfoStore> optionStrategyInfoStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<BooleanPreference> shouldShowRollingLearnMoreCard;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OptionRollingStrategyDuxo_Factory create(Provider<AccountProvider> provider, Provider<AggregateOptionStrategyQuoteStore> provider2, Provider<EventLogger> provider3, Provider<OptionChainStore> provider4, Provider<OptionRollingStore> provider5, Provider<OptionQuoteStore> provider6, Provider<OptionStrategyInfoStore> provider7, Provider<BooleanPreference> provider8, Provider<InstantCashLogger> provider9, Provider<UserStore> provider10, Provider<SavedStateHandle> provider11, Provider<DispatcherProvider> provider12, Provider<RxFactory> provider13, Provider<RxGlobalErrorHandler> provider14) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    @JvmStatic
    public static final OptionRollingStrategyDuxo newInstance(AccountProvider accountProvider, AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore, EventLogger eventLogger, OptionChainStore optionChainStore, OptionRollingStore optionRollingStore, OptionQuoteStore optionQuoteStore, OptionStrategyInfoStore optionStrategyInfoStore, BooleanPreference booleanPreference, InstantCashLogger instantCashLogger, UserStore userStore, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(accountProvider, aggregateOptionStrategyQuoteStore, eventLogger, optionChainStore, optionRollingStore, optionQuoteStore, optionStrategyInfoStore, booleanPreference, instantCashLogger, userStore, savedStateHandle);
    }

    public OptionRollingStrategyDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<AggregateOptionStrategyQuoteStore> aggregateOptionStrategyQuoteStore, Provider<EventLogger> eventLogger, Provider<OptionChainStore> optionChainStore, Provider<OptionRollingStore> optionRollingStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<OptionStrategyInfoStore> optionStrategyInfoStore, Provider<BooleanPreference> shouldShowRollingLearnMoreCard, Provider<InstantCashLogger> instantCashLogger, Provider<UserStore> userStore, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(aggregateOptionStrategyQuoteStore, "aggregateOptionStrategyQuoteStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(optionRollingStore, "optionRollingStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
        Intrinsics.checkNotNullParameter(shouldShowRollingLearnMoreCard, "shouldShowRollingLearnMoreCard");
        Intrinsics.checkNotNullParameter(instantCashLogger, "instantCashLogger");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.accountProvider = accountProvider;
        this.aggregateOptionStrategyQuoteStore = aggregateOptionStrategyQuoteStore;
        this.eventLogger = eventLogger;
        this.optionChainStore = optionChainStore;
        this.optionRollingStore = optionRollingStore;
        this.optionQuoteStore = optionQuoteStore;
        this.optionStrategyInfoStore = optionStrategyInfoStore;
        this.shouldShowRollingLearnMoreCard = shouldShowRollingLearnMoreCard;
        this.instantCashLogger = instantCashLogger;
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public OptionRollingStrategyDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore = this.aggregateOptionStrategyQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(aggregateOptionStrategyQuoteStore, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        OptionChainStore optionChainStore = this.optionChainStore.get();
        Intrinsics.checkNotNullExpressionValue(optionChainStore, "get(...)");
        OptionRollingStore optionRollingStore = this.optionRollingStore.get();
        Intrinsics.checkNotNullExpressionValue(optionRollingStore, "get(...)");
        OptionQuoteStore optionQuoteStore = this.optionQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(optionQuoteStore, "get(...)");
        OptionStrategyInfoStore optionStrategyInfoStore = this.optionStrategyInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(optionStrategyInfoStore, "get(...)");
        BooleanPreference booleanPreference = this.shouldShowRollingLearnMoreCard.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        InstantCashLogger instantCashLogger = this.instantCashLogger.get();
        Intrinsics.checkNotNullExpressionValue(instantCashLogger, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        OptionRollingStrategyDuxo optionRollingStrategyDuxoNewInstance = companion.newInstance(accountProvider, aggregateOptionStrategyQuoteStore, eventLogger, optionChainStore, optionRollingStore, optionQuoteStore, optionStrategyInfoStore, booleanPreference, instantCashLogger, userStore, savedStateHandle);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(optionRollingStrategyDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(optionRollingStrategyDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(optionRollingStrategyDuxoNewInstance, rxGlobalErrorHandler);
        return optionRollingStrategyDuxoNewInstance;
    }

    /* compiled from: OptionRollingStrategyDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÌ\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0007H\u0007J`\u0010#\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "aggregateOptionStrategyQuoteStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionRollingStore", "Lcom/robinhood/librobinhood/data/store/OptionRollingStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "shouldShowRollingLearnMoreCard", "Lcom/robinhood/prefs/BooleanPreference;", "instantCashLogger", "Lcom/robinhood/android/instant/ui/InstantCashLogger;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyDuxo;", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionRollingStrategyDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<AggregateOptionStrategyQuoteStore> aggregateOptionStrategyQuoteStore, Provider<EventLogger> eventLogger, Provider<OptionChainStore> optionChainStore, Provider<OptionRollingStore> optionRollingStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<OptionStrategyInfoStore> optionStrategyInfoStore, Provider<BooleanPreference> shouldShowRollingLearnMoreCard, Provider<InstantCashLogger> instantCashLogger, Provider<UserStore> userStore, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(aggregateOptionStrategyQuoteStore, "aggregateOptionStrategyQuoteStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(optionRollingStore, "optionRollingStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
            Intrinsics.checkNotNullParameter(shouldShowRollingLearnMoreCard, "shouldShowRollingLearnMoreCard");
            Intrinsics.checkNotNullParameter(instantCashLogger, "instantCashLogger");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new OptionRollingStrategyDuxo_Factory(accountProvider, aggregateOptionStrategyQuoteStore, eventLogger, optionChainStore, optionRollingStore, optionQuoteStore, optionStrategyInfoStore, shouldShowRollingLearnMoreCard, instantCashLogger, userStore, savedStateHandle, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final OptionRollingStrategyDuxo newInstance(AccountProvider accountProvider, AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore, EventLogger eventLogger, OptionChainStore optionChainStore, OptionRollingStore optionRollingStore, OptionQuoteStore optionQuoteStore, OptionStrategyInfoStore optionStrategyInfoStore, BooleanPreference shouldShowRollingLearnMoreCard, InstantCashLogger instantCashLogger, UserStore userStore, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(aggregateOptionStrategyQuoteStore, "aggregateOptionStrategyQuoteStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(optionRollingStore, "optionRollingStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
            Intrinsics.checkNotNullParameter(shouldShowRollingLearnMoreCard, "shouldShowRollingLearnMoreCard");
            Intrinsics.checkNotNullParameter(instantCashLogger, "instantCashLogger");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new OptionRollingStrategyDuxo(accountProvider, aggregateOptionStrategyQuoteStore, eventLogger, optionChainStore, optionRollingStore, optionQuoteStore, optionStrategyInfoStore, shouldShowRollingLearnMoreCard, instantCashLogger, userStore, savedStateHandle);
        }
    }
}

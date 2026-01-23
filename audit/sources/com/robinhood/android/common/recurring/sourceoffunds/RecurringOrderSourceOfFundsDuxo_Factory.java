package com.robinhood.android.common.recurring.sourceoffunds;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore;
import com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderSourceOfFundsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0085\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsDuxo;", "achRelationshipStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "instrumentBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "cryptoBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/CryptoBuyingPowerStore;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "marginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RecurringOrderSourceOfFundsDuxo_Factory implements Factory<RecurringOrderSourceOfFundsDuxo> {
    private final Provider<AchRelationshipStore> achRelationshipStore;
    private final Provider<CryptoBuyingPowerStore> cryptoBuyingPowerStore;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<InstrumentBuyingPowerStore> instrumentBuyingPowerStore;
    private final Provider<TraderInvestmentScheduleStore> investmentScheduleStore;
    private final Provider<LeveredMarginSettingsStore> marginSettingsStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RecurringOrderSourceOfFundsDuxo_Factory create(Provider<AchRelationshipStore> provider, Provider<InstrumentBuyingPowerStore> provider2, Provider<CryptoBuyingPowerStore> provider3, Provider<TraderInvestmentScheduleStore> provider4, Provider<LeveredMarginSettingsStore> provider5, Provider<SavedStateHandle> provider6, Provider<DispatcherProvider> provider7, Provider<RxFactory> provider8, Provider<RxGlobalErrorHandler> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final RecurringOrderSourceOfFundsDuxo newInstance(AchRelationshipStore achRelationshipStore, InstrumentBuyingPowerStore instrumentBuyingPowerStore, CryptoBuyingPowerStore cryptoBuyingPowerStore, TraderInvestmentScheduleStore traderInvestmentScheduleStore, LeveredMarginSettingsStore leveredMarginSettingsStore, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(achRelationshipStore, instrumentBuyingPowerStore, cryptoBuyingPowerStore, traderInvestmentScheduleStore, leveredMarginSettingsStore, savedStateHandle);
    }

    public RecurringOrderSourceOfFundsDuxo_Factory(Provider<AchRelationshipStore> achRelationshipStore, Provider<InstrumentBuyingPowerStore> instrumentBuyingPowerStore, Provider<CryptoBuyingPowerStore> cryptoBuyingPowerStore, Provider<TraderInvestmentScheduleStore> investmentScheduleStore, Provider<LeveredMarginSettingsStore> marginSettingsStore, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
        Intrinsics.checkNotNullParameter(cryptoBuyingPowerStore, "cryptoBuyingPowerStore");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.achRelationshipStore = achRelationshipStore;
        this.instrumentBuyingPowerStore = instrumentBuyingPowerStore;
        this.cryptoBuyingPowerStore = cryptoBuyingPowerStore;
        this.investmentScheduleStore = investmentScheduleStore;
        this.marginSettingsStore = marginSettingsStore;
        this.savedStateHandle = savedStateHandle;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public RecurringOrderSourceOfFundsDuxo get() {
        Companion companion = INSTANCE;
        AchRelationshipStore achRelationshipStore = this.achRelationshipStore.get();
        Intrinsics.checkNotNullExpressionValue(achRelationshipStore, "get(...)");
        InstrumentBuyingPowerStore instrumentBuyingPowerStore = this.instrumentBuyingPowerStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentBuyingPowerStore, "get(...)");
        CryptoBuyingPowerStore cryptoBuyingPowerStore = this.cryptoBuyingPowerStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoBuyingPowerStore, "get(...)");
        TraderInvestmentScheduleStore traderInvestmentScheduleStore = this.investmentScheduleStore.get();
        Intrinsics.checkNotNullExpressionValue(traderInvestmentScheduleStore, "get(...)");
        LeveredMarginSettingsStore leveredMarginSettingsStore = this.marginSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(leveredMarginSettingsStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        RecurringOrderSourceOfFundsDuxo recurringOrderSourceOfFundsDuxoNewInstance = companion.newInstance(achRelationshipStore, instrumentBuyingPowerStore, cryptoBuyingPowerStore, traderInvestmentScheduleStore, leveredMarginSettingsStore, savedStateHandle);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(recurringOrderSourceOfFundsDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(recurringOrderSourceOfFundsDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(recurringOrderSourceOfFundsDuxoNewInstance, rxGlobalErrorHandler);
        return recurringOrderSourceOfFundsDuxoNewInstance;
    }

    /* compiled from: RecurringOrderSourceOfFundsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0086\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u0007J8\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsDuxo_Factory;", "achRelationshipStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "instrumentBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "cryptoBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/CryptoBuyingPowerStore;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "marginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsDuxo;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RecurringOrderSourceOfFundsDuxo_Factory create(Provider<AchRelationshipStore> achRelationshipStore, Provider<InstrumentBuyingPowerStore> instrumentBuyingPowerStore, Provider<CryptoBuyingPowerStore> cryptoBuyingPowerStore, Provider<TraderInvestmentScheduleStore> investmentScheduleStore, Provider<LeveredMarginSettingsStore> marginSettingsStore, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
            Intrinsics.checkNotNullParameter(cryptoBuyingPowerStore, "cryptoBuyingPowerStore");
            Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
            Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new RecurringOrderSourceOfFundsDuxo_Factory(achRelationshipStore, instrumentBuyingPowerStore, cryptoBuyingPowerStore, investmentScheduleStore, marginSettingsStore, savedStateHandle, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final RecurringOrderSourceOfFundsDuxo newInstance(AchRelationshipStore achRelationshipStore, InstrumentBuyingPowerStore instrumentBuyingPowerStore, CryptoBuyingPowerStore cryptoBuyingPowerStore, TraderInvestmentScheduleStore investmentScheduleStore, LeveredMarginSettingsStore marginSettingsStore, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
            Intrinsics.checkNotNullParameter(cryptoBuyingPowerStore, "cryptoBuyingPowerStore");
            Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
            Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new RecurringOrderSourceOfFundsDuxo(achRelationshipStore, instrumentBuyingPowerStore, cryptoBuyingPowerStore, investmentScheduleStore, marginSettingsStore, savedStateHandle);
        }
    }
}

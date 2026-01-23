package com.robinhood.android.paycheckhub.p213ui;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.PaycheckInvestmentScheduleStore;
import com.robinhood.librobinhood.data.store.SweepsStatusStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementMatchStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaycheckRecurringInvestmentsHubDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsHubDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsHubDuxo;", "paycheckInvestmentScheduleStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/PaycheckInvestmentScheduleStore;", "sweepsStatusStore", "Lcom/robinhood/librobinhood/data/store/SweepsStatusStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "retirementMatchStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PaycheckRecurringInvestmentsHubDuxo_Factory implements Factory<PaycheckRecurringInvestmentsHubDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<PaycheckInvestmentScheduleStore> paycheckInvestmentScheduleStore;
    private final Provider<RetirementMatchStore> retirementMatchStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SweepsStatusStore> sweepsStatusStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PaycheckRecurringInvestmentsHubDuxo_Factory create(Provider<PaycheckInvestmentScheduleStore> provider, Provider<SweepsStatusStore> provider2, Provider<AccountProvider> provider3, Provider<RetirementMatchStore> provider4, Provider<DispatcherProvider> provider5, Provider<RxFactory> provider6, Provider<RxGlobalErrorHandler> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final PaycheckRecurringInvestmentsHubDuxo newInstance(PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore, SweepsStatusStore sweepsStatusStore, AccountProvider accountProvider, RetirementMatchStore retirementMatchStore) {
        return INSTANCE.newInstance(paycheckInvestmentScheduleStore, sweepsStatusStore, accountProvider, retirementMatchStore);
    }

    public PaycheckRecurringInvestmentsHubDuxo_Factory(Provider<PaycheckInvestmentScheduleStore> paycheckInvestmentScheduleStore, Provider<SweepsStatusStore> sweepsStatusStore, Provider<AccountProvider> accountProvider, Provider<RetirementMatchStore> retirementMatchStore, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(paycheckInvestmentScheduleStore, "paycheckInvestmentScheduleStore");
        Intrinsics.checkNotNullParameter(sweepsStatusStore, "sweepsStatusStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(retirementMatchStore, "retirementMatchStore");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.paycheckInvestmentScheduleStore = paycheckInvestmentScheduleStore;
        this.sweepsStatusStore = sweepsStatusStore;
        this.accountProvider = accountProvider;
        this.retirementMatchStore = retirementMatchStore;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public PaycheckRecurringInvestmentsHubDuxo get() {
        Companion companion = INSTANCE;
        PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore = this.paycheckInvestmentScheduleStore.get();
        Intrinsics.checkNotNullExpressionValue(paycheckInvestmentScheduleStore, "get(...)");
        SweepsStatusStore sweepsStatusStore = this.sweepsStatusStore.get();
        Intrinsics.checkNotNullExpressionValue(sweepsStatusStore, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        RetirementMatchStore retirementMatchStore = this.retirementMatchStore.get();
        Intrinsics.checkNotNullExpressionValue(retirementMatchStore, "get(...)");
        PaycheckRecurringInvestmentsHubDuxo paycheckRecurringInvestmentsHubDuxoNewInstance = companion.newInstance(paycheckInvestmentScheduleStore, sweepsStatusStore, accountProvider, retirementMatchStore);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(paycheckRecurringInvestmentsHubDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(paycheckRecurringInvestmentsHubDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(paycheckRecurringInvestmentsHubDuxoNewInstance, rxGlobalErrorHandler);
        return paycheckRecurringInvestmentsHubDuxoNewInstance;
    }

    /* compiled from: PaycheckRecurringInvestmentsHubDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsHubDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsHubDuxo_Factory;", "paycheckInvestmentScheduleStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/PaycheckInvestmentScheduleStore;", "sweepsStatusStore", "Lcom/robinhood/librobinhood/data/store/SweepsStatusStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "retirementMatchStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsHubDuxo;", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PaycheckRecurringInvestmentsHubDuxo_Factory create(Provider<PaycheckInvestmentScheduleStore> paycheckInvestmentScheduleStore, Provider<SweepsStatusStore> sweepsStatusStore, Provider<AccountProvider> accountProvider, Provider<RetirementMatchStore> retirementMatchStore, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(paycheckInvestmentScheduleStore, "paycheckInvestmentScheduleStore");
            Intrinsics.checkNotNullParameter(sweepsStatusStore, "sweepsStatusStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(retirementMatchStore, "retirementMatchStore");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new PaycheckRecurringInvestmentsHubDuxo_Factory(paycheckInvestmentScheduleStore, sweepsStatusStore, accountProvider, retirementMatchStore, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final PaycheckRecurringInvestmentsHubDuxo newInstance(PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore, SweepsStatusStore sweepsStatusStore, AccountProvider accountProvider, RetirementMatchStore retirementMatchStore) {
            Intrinsics.checkNotNullParameter(paycheckInvestmentScheduleStore, "paycheckInvestmentScheduleStore");
            Intrinsics.checkNotNullParameter(sweepsStatusStore, "sweepsStatusStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(retirementMatchStore, "retirementMatchStore");
            return new PaycheckRecurringInvestmentsHubDuxo(paycheckInvestmentScheduleStore, sweepsStatusStore, accountProvider, retirementMatchStore);
        }
    }
}

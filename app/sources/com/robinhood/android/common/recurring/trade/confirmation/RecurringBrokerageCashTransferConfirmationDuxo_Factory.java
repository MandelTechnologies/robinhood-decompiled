package com.robinhood.android.common.recurring.trade.confirmation;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.recurring.trade.RecurringOrderManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore;
import com.robinhood.librobinhood.data.store.SweepsTimelineSummaryStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementMatchStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringBrokerageCashTransferConfirmationDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0085\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringBrokerageCashTransferConfirmationDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringBrokerageCashTransferConfirmationDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "sweepEnrollmentStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "sweepsTimelineSummaryStore", "Lcom/robinhood/librobinhood/data/store/SweepsTimelineSummaryStore;", "orderManager", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderManager;", "retirementMatchStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RecurringBrokerageCashTransferConfirmationDuxo_Factory implements Factory<RecurringBrokerageCashTransferConfirmationDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RecurringOrderManager> orderManager;
    private final Provider<RetirementMatchStore> retirementMatchStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<SweepEnrollmentStore> sweepEnrollmentStore;
    private final Provider<SweepsTimelineSummaryStore> sweepsTimelineSummaryStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RecurringBrokerageCashTransferConfirmationDuxo_Factory create(Provider<AccountProvider> provider, Provider<SweepEnrollmentStore> provider2, Provider<SweepsTimelineSummaryStore> provider3, Provider<RecurringOrderManager> provider4, Provider<RetirementMatchStore> provider5, Provider<SavedStateHandle> provider6, Provider<DispatcherProvider> provider7, Provider<RxFactory> provider8, Provider<RxGlobalErrorHandler> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final RecurringBrokerageCashTransferConfirmationDuxo newInstance(AccountProvider accountProvider, SweepEnrollmentStore sweepEnrollmentStore, SweepsTimelineSummaryStore sweepsTimelineSummaryStore, RecurringOrderManager recurringOrderManager, RetirementMatchStore retirementMatchStore, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(accountProvider, sweepEnrollmentStore, sweepsTimelineSummaryStore, recurringOrderManager, retirementMatchStore, savedStateHandle);
    }

    public RecurringBrokerageCashTransferConfirmationDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<SweepEnrollmentStore> sweepEnrollmentStore, Provider<SweepsTimelineSummaryStore> sweepsTimelineSummaryStore, Provider<RecurringOrderManager> orderManager, Provider<RetirementMatchStore> retirementMatchStore, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
        Intrinsics.checkNotNullParameter(sweepsTimelineSummaryStore, "sweepsTimelineSummaryStore");
        Intrinsics.checkNotNullParameter(orderManager, "orderManager");
        Intrinsics.checkNotNullParameter(retirementMatchStore, "retirementMatchStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.accountProvider = accountProvider;
        this.sweepEnrollmentStore = sweepEnrollmentStore;
        this.sweepsTimelineSummaryStore = sweepsTimelineSummaryStore;
        this.orderManager = orderManager;
        this.retirementMatchStore = retirementMatchStore;
        this.savedStateHandle = savedStateHandle;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public RecurringBrokerageCashTransferConfirmationDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        SweepEnrollmentStore sweepEnrollmentStore = this.sweepEnrollmentStore.get();
        Intrinsics.checkNotNullExpressionValue(sweepEnrollmentStore, "get(...)");
        SweepsTimelineSummaryStore sweepsTimelineSummaryStore = this.sweepsTimelineSummaryStore.get();
        Intrinsics.checkNotNullExpressionValue(sweepsTimelineSummaryStore, "get(...)");
        RecurringOrderManager recurringOrderManager = this.orderManager.get();
        Intrinsics.checkNotNullExpressionValue(recurringOrderManager, "get(...)");
        RetirementMatchStore retirementMatchStore = this.retirementMatchStore.get();
        Intrinsics.checkNotNullExpressionValue(retirementMatchStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        RecurringBrokerageCashTransferConfirmationDuxo recurringBrokerageCashTransferConfirmationDuxoNewInstance = companion.newInstance(accountProvider, sweepEnrollmentStore, sweepsTimelineSummaryStore, recurringOrderManager, retirementMatchStore, savedStateHandle);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(recurringBrokerageCashTransferConfirmationDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(recurringBrokerageCashTransferConfirmationDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(recurringBrokerageCashTransferConfirmationDuxoNewInstance, rxGlobalErrorHandler);
        return recurringBrokerageCashTransferConfirmationDuxoNewInstance;
    }

    /* compiled from: RecurringBrokerageCashTransferConfirmationDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0086\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u0007J8\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringBrokerageCashTransferConfirmationDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringBrokerageCashTransferConfirmationDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "sweepEnrollmentStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "sweepsTimelineSummaryStore", "Lcom/robinhood/librobinhood/data/store/SweepsTimelineSummaryStore;", "orderManager", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderManager;", "retirementMatchStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringBrokerageCashTransferConfirmationDuxo;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RecurringBrokerageCashTransferConfirmationDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<SweepEnrollmentStore> sweepEnrollmentStore, Provider<SweepsTimelineSummaryStore> sweepsTimelineSummaryStore, Provider<RecurringOrderManager> orderManager, Provider<RetirementMatchStore> retirementMatchStore, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
            Intrinsics.checkNotNullParameter(sweepsTimelineSummaryStore, "sweepsTimelineSummaryStore");
            Intrinsics.checkNotNullParameter(orderManager, "orderManager");
            Intrinsics.checkNotNullParameter(retirementMatchStore, "retirementMatchStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new RecurringBrokerageCashTransferConfirmationDuxo_Factory(accountProvider, sweepEnrollmentStore, sweepsTimelineSummaryStore, orderManager, retirementMatchStore, savedStateHandle, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final RecurringBrokerageCashTransferConfirmationDuxo newInstance(AccountProvider accountProvider, SweepEnrollmentStore sweepEnrollmentStore, SweepsTimelineSummaryStore sweepsTimelineSummaryStore, RecurringOrderManager orderManager, RetirementMatchStore retirementMatchStore, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
            Intrinsics.checkNotNullParameter(sweepsTimelineSummaryStore, "sweepsTimelineSummaryStore");
            Intrinsics.checkNotNullParameter(orderManager, "orderManager");
            Intrinsics.checkNotNullParameter(retirementMatchStore, "retirementMatchStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new RecurringBrokerageCashTransferConfirmationDuxo(accountProvider, sweepEnrollmentStore, sweepsTimelineSummaryStore, orderManager, retirementMatchStore, savedStateHandle);
        }
    }
}

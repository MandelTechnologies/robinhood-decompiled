package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes9.dex */
public final class EnterDepositScheduleAmountDuxo_MembersInjector implements MembersInjector<EnterDepositScheduleAmountDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private EnterDepositScheduleAmountDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(EnterDepositScheduleAmountDuxo enterDepositScheduleAmountDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(enterDepositScheduleAmountDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(enterDepositScheduleAmountDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(enterDepositScheduleAmountDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<EnterDepositScheduleAmountDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new EnterDepositScheduleAmountDuxo_MembersInjector(provider, provider2, provider3);
    }
}

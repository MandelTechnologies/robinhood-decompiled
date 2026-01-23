package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes9.dex */
public final class SetDepositScheduleDuxo_MembersInjector implements MembersInjector<SetDepositScheduleDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private SetDepositScheduleDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SetDepositScheduleDuxo setDepositScheduleDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(setDepositScheduleDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(setDepositScheduleDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(setDepositScheduleDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<SetDepositScheduleDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new SetDepositScheduleDuxo_MembersInjector(provider, provider2, provider3);
    }
}

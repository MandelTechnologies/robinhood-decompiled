package com.robinhood.android.withdrawableamount.p279ui;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes16.dex */
public final class WithdrawableAmountDetailDuxo_MembersInjector implements MembersInjector<WithdrawableAmountDetailDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private WithdrawableAmountDetailDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(WithdrawableAmountDetailDuxo withdrawableAmountDetailDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(withdrawableAmountDetailDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(withdrawableAmountDetailDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(withdrawableAmountDetailDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<WithdrawableAmountDetailDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new WithdrawableAmountDetailDuxo_MembersInjector(provider, provider2, provider3);
    }
}

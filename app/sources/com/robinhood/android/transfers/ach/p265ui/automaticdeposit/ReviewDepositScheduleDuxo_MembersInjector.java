package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes9.dex */
public final class ReviewDepositScheduleDuxo_MembersInjector implements MembersInjector<ReviewDepositScheduleDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private ReviewDepositScheduleDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ReviewDepositScheduleDuxo reviewDepositScheduleDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(reviewDepositScheduleDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(reviewDepositScheduleDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(reviewDepositScheduleDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<ReviewDepositScheduleDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new ReviewDepositScheduleDuxo_MembersInjector(provider, provider2, provider3);
    }
}

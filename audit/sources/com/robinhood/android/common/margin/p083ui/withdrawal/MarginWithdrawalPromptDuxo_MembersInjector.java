package com.robinhood.android.common.margin.p083ui.withdrawal;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes2.dex */
public final class MarginWithdrawalPromptDuxo_MembersInjector implements MembersInjector<MarginWithdrawalPromptDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private MarginWithdrawalPromptDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MarginWithdrawalPromptDuxo marginWithdrawalPromptDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(marginWithdrawalPromptDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(marginWithdrawalPromptDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(marginWithdrawalPromptDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<MarginWithdrawalPromptDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new MarginWithdrawalPromptDuxo_MembersInjector(provider, provider2, provider3);
    }
}

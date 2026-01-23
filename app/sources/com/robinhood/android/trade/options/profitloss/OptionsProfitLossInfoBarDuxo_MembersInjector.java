package com.robinhood.android.trade.options.profitloss;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes9.dex */
public final class OptionsProfitLossInfoBarDuxo_MembersInjector implements MembersInjector<OptionsProfitLossInfoBarDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private OptionsProfitLossInfoBarDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OptionsProfitLossInfoBarDuxo optionsProfitLossInfoBarDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(optionsProfitLossInfoBarDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(optionsProfitLossInfoBarDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(optionsProfitLossInfoBarDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<OptionsProfitLossInfoBarDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new OptionsProfitLossInfoBarDuxo_MembersInjector(provider, provider2, provider3);
    }
}

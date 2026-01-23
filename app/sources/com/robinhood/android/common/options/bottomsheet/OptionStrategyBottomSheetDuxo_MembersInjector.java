package com.robinhood.android.common.options.bottomsheet;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes2.dex */
public final class OptionStrategyBottomSheetDuxo_MembersInjector implements MembersInjector<OptionStrategyBottomSheetDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private OptionStrategyBottomSheetDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OptionStrategyBottomSheetDuxo optionStrategyBottomSheetDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(optionStrategyBottomSheetDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(optionStrategyBottomSheetDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(optionStrategyBottomSheetDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<OptionStrategyBottomSheetDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new OptionStrategyBottomSheetDuxo_MembersInjector(provider, provider2, provider3);
    }
}

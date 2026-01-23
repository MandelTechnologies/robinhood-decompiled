package com.robinhood.android.common.recurring.sourceoffunds;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes2.dex */
public final class RecurringOrderSourceOfFundsDuxo_MembersInjector implements MembersInjector<RecurringOrderSourceOfFundsDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private RecurringOrderSourceOfFundsDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RecurringOrderSourceOfFundsDuxo recurringOrderSourceOfFundsDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(recurringOrderSourceOfFundsDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(recurringOrderSourceOfFundsDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(recurringOrderSourceOfFundsDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<RecurringOrderSourceOfFundsDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new RecurringOrderSourceOfFundsDuxo_MembersInjector(provider, provider2, provider3);
    }
}

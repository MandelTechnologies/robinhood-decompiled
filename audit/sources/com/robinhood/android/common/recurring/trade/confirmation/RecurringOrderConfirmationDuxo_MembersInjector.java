package com.robinhood.android.common.recurring.trade.confirmation;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes2.dex */
public final class RecurringOrderConfirmationDuxo_MembersInjector implements MembersInjector<RecurringOrderConfirmationDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private RecurringOrderConfirmationDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RecurringOrderConfirmationDuxo recurringOrderConfirmationDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(recurringOrderConfirmationDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(recurringOrderConfirmationDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(recurringOrderConfirmationDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<RecurringOrderConfirmationDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new RecurringOrderConfirmationDuxo_MembersInjector(provider, provider2, provider3);
    }
}

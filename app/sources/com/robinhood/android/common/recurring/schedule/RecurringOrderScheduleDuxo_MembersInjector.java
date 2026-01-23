package com.robinhood.android.common.recurring.schedule;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes2.dex */
public final class RecurringOrderScheduleDuxo_MembersInjector implements MembersInjector<RecurringOrderScheduleDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private RecurringOrderScheduleDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RecurringOrderScheduleDuxo recurringOrderScheduleDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(recurringOrderScheduleDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(recurringOrderScheduleDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(recurringOrderScheduleDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<RecurringOrderScheduleDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new RecurringOrderScheduleDuxo_MembersInjector(provider, provider2, provider3);
    }
}

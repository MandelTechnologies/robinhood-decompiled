package com.robinhood.android.common.recurring.amount.type;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes2.dex */
public final class RecurringOrderAmountTypeDuxo_MembersInjector implements MembersInjector<RecurringOrderAmountTypeDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private RecurringOrderAmountTypeDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RecurringOrderAmountTypeDuxo recurringOrderAmountTypeDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(recurringOrderAmountTypeDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(recurringOrderAmountTypeDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(recurringOrderAmountTypeDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<RecurringOrderAmountTypeDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new RecurringOrderAmountTypeDuxo_MembersInjector(provider, provider2, provider3);
    }
}

package com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes9.dex */
public final class DepositScheduleTimelineDuxo_MembersInjector implements MembersInjector<DepositScheduleTimelineDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private DepositScheduleTimelineDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DepositScheduleTimelineDuxo depositScheduleTimelineDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(depositScheduleTimelineDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(depositScheduleTimelineDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(depositScheduleTimelineDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<DepositScheduleTimelineDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new DepositScheduleTimelineDuxo_MembersInjector(provider, provider2, provider3);
    }
}

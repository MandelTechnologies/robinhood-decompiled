package com.robinhood.android.settings.p254ui.recurring.detail;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes5.dex */
public final class InvestmentScheduleSettingsDuxo_MembersInjector implements MembersInjector<InvestmentScheduleSettingsDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private InvestmentScheduleSettingsDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(InvestmentScheduleSettingsDuxo investmentScheduleSettingsDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(investmentScheduleSettingsDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(investmentScheduleSettingsDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(investmentScheduleSettingsDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<InvestmentScheduleSettingsDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new InvestmentScheduleSettingsDuxo_MembersInjector(provider, provider2, provider3);
    }
}

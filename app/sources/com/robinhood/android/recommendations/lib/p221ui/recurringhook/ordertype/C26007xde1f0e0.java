package com.robinhood.android.recommendations.lib.p221ui.recurringhook.ordertype;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* renamed from: com.robinhood.android.recommendations.lib.ui.recurringhook.ordertype.RecommendationsRecurringHookOrderTypeSelectionDuxo_MembersInjector */
/* loaded from: classes11.dex */
public final class C26007xde1f0e0 implements MembersInjector<RecommendationsRecurringHookOrderTypeSelectionDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private C26007xde1f0e0(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RecommendationsRecurringHookOrderTypeSelectionDuxo recommendationsRecurringHookOrderTypeSelectionDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(recommendationsRecurringHookOrderTypeSelectionDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(recommendationsRecurringHookOrderTypeSelectionDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(recommendationsRecurringHookOrderTypeSelectionDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<RecommendationsRecurringHookOrderTypeSelectionDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new C26007xde1f0e0(provider, provider2, provider3);
    }
}

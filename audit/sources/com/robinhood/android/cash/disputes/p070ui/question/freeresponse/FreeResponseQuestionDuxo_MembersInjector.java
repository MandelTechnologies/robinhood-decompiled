package com.robinhood.android.cash.disputes.p070ui.question.freeresponse;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes7.dex */
public final class FreeResponseQuestionDuxo_MembersInjector implements MembersInjector<FreeResponseQuestionDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private FreeResponseQuestionDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FreeResponseQuestionDuxo freeResponseQuestionDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(freeResponseQuestionDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(freeResponseQuestionDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(freeResponseQuestionDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<FreeResponseQuestionDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new FreeResponseQuestionDuxo_MembersInjector(provider, provider2, provider3);
    }
}

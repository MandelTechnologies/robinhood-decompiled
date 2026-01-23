package com.robinhood.android.cash.disputes.p070ui.question.multiplechoice;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes7.dex */
public final class MultipleChoiceQuestionDuxo_MembersInjector implements MembersInjector<MultipleChoiceQuestionDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private MultipleChoiceQuestionDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MultipleChoiceQuestionDuxo multipleChoiceQuestionDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(multipleChoiceQuestionDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(multipleChoiceQuestionDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(multipleChoiceQuestionDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<MultipleChoiceQuestionDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new MultipleChoiceQuestionDuxo_MembersInjector(provider, provider2, provider3);
    }
}

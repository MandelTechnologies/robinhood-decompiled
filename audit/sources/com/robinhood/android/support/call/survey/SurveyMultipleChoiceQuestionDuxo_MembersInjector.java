package com.robinhood.android.support.call.survey;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes9.dex */
public final class SurveyMultipleChoiceQuestionDuxo_MembersInjector implements MembersInjector<SurveyMultipleChoiceQuestionDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private SurveyMultipleChoiceQuestionDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SurveyMultipleChoiceQuestionDuxo surveyMultipleChoiceQuestionDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(surveyMultipleChoiceQuestionDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(surveyMultipleChoiceQuestionDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(surveyMultipleChoiceQuestionDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<SurveyMultipleChoiceQuestionDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new SurveyMultipleChoiceQuestionDuxo_MembersInjector(provider, provider2, provider3);
    }
}

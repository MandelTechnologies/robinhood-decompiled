package com.robinhood.android.support.call.survey;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes9.dex */
public final class SurveyRatingQuestionDuxo_MembersInjector implements MembersInjector<SurveyRatingQuestionDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private SurveyRatingQuestionDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SurveyRatingQuestionDuxo surveyRatingQuestionDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(surveyRatingQuestionDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(surveyRatingQuestionDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(surveyRatingQuestionDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<SurveyRatingQuestionDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new SurveyRatingQuestionDuxo_MembersInjector(provider, provider2, provider3);
    }
}

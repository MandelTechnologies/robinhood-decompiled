package com.robinhood.android.recommendations.retirement.p223ui.results.intro;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes11.dex */
public final class RecsRetirementQuestionnaireResultsIntroDuxo_MembersInjector implements MembersInjector<RecsRetirementQuestionnaireResultsIntroDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private RecsRetirementQuestionnaireResultsIntroDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RecsRetirementQuestionnaireResultsIntroDuxo recsRetirementQuestionnaireResultsIntroDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(recsRetirementQuestionnaireResultsIntroDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(recsRetirementQuestionnaireResultsIntroDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(recsRetirementQuestionnaireResultsIntroDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<RecsRetirementQuestionnaireResultsIntroDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new RecsRetirementQuestionnaireResultsIntroDuxo_MembersInjector(provider, provider2, provider3);
    }
}

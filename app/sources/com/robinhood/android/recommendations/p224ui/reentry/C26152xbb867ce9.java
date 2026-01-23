package com.robinhood.android.recommendations.p224ui.reentry;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* renamed from: com.robinhood.android.recommendations.ui.reentry.RecommendationsReentryQuestionnaireConfirmationDuxo_MembersInjector */
/* loaded from: classes11.dex */
public final class C26152xbb867ce9 implements MembersInjector<RecommendationsReentryQuestionnaireConfirmationDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private C26152xbb867ce9(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RecommendationsReentryQuestionnaireConfirmationDuxo recommendationsReentryQuestionnaireConfirmationDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(recommendationsReentryQuestionnaireConfirmationDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(recommendationsReentryQuestionnaireConfirmationDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(recommendationsReentryQuestionnaireConfirmationDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<RecommendationsReentryQuestionnaireConfirmationDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new C26152xbb867ce9(provider, provider2, provider3);
    }
}

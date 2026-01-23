package com.robinhood.shared.education.p377ui.lessons.cardstack;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes6.dex */
public final class EducationLessonCardStackDuxo_MembersInjector implements MembersInjector<EducationLessonCardStackDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private EducationLessonCardStackDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(EducationLessonCardStackDuxo educationLessonCardStackDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(educationLessonCardStackDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(educationLessonCardStackDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(educationLessonCardStackDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<EducationLessonCardStackDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new EducationLessonCardStackDuxo_MembersInjector(provider, provider2, provider3);
    }
}

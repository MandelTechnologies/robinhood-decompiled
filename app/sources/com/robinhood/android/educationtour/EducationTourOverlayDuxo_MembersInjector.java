package com.robinhood.android.educationtour;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes7.dex */
public final class EducationTourOverlayDuxo_MembersInjector implements MembersInjector<EducationTourOverlayDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private EducationTourOverlayDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(EducationTourOverlayDuxo educationTourOverlayDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(educationTourOverlayDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(educationTourOverlayDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(educationTourOverlayDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<EducationTourOverlayDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new EducationTourOverlayDuxo_MembersInjector(provider, provider2, provider3);
    }
}

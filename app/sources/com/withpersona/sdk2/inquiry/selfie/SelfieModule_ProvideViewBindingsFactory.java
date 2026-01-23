package com.withpersona.sdk2.inquiry.selfie;

import com.squareup.workflow1.p415ui.ViewFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Set;

/* loaded from: classes18.dex */
public final class SelfieModule_ProvideViewBindingsFactory implements Factory<Set<ViewFactory<?>>> {
    private final Provider<OldSelfieCameraScreenViewFactory> oldSelfieCameraScreenViewFactoryProvider;
    private final Provider<SelfieCameraScreenViewFactory> selfieCameraScreenViewFactoryProvider;

    public SelfieModule_ProvideViewBindingsFactory(Provider<OldSelfieCameraScreenViewFactory> provider, Provider<SelfieCameraScreenViewFactory> provider2) {
        this.oldSelfieCameraScreenViewFactoryProvider = provider;
        this.selfieCameraScreenViewFactoryProvider = provider2;
    }

    @Override // javax.inject.Provider
    public Set<ViewFactory<?>> get() {
        return provideViewBindings(this.oldSelfieCameraScreenViewFactoryProvider.get(), this.selfieCameraScreenViewFactoryProvider.get());
    }

    public static SelfieModule_ProvideViewBindingsFactory create(Provider<OldSelfieCameraScreenViewFactory> provider, Provider<SelfieCameraScreenViewFactory> provider2) {
        return new SelfieModule_ProvideViewBindingsFactory(provider, provider2);
    }

    public static Set<ViewFactory<?>> provideViewBindings(OldSelfieCameraScreenViewFactory oldSelfieCameraScreenViewFactory, SelfieCameraScreenViewFactory selfieCameraScreenViewFactory) {
        return (Set) Preconditions.checkNotNullFromProvides(SelfieModule.provideViewBindings(oldSelfieCameraScreenViewFactory, selfieCameraScreenViewFactory));
    }
}

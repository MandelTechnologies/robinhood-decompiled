package com.withpersona.sdk2.inquiry.governmentid;

import com.squareup.workflow1.p415ui.ViewFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Set;

/* loaded from: classes18.dex */
public final class GovernmentIdModule_ProvideViewBindingsFactory implements Factory<Set<ViewFactory<?>>> {
    private final Provider<GovernmentIdCameraScreenViewFactory> governmentIdCameraScreenViewFactoryProvider;

    public GovernmentIdModule_ProvideViewBindingsFactory(Provider<GovernmentIdCameraScreenViewFactory> provider) {
        this.governmentIdCameraScreenViewFactoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public Set<ViewFactory<?>> get() {
        return provideViewBindings(this.governmentIdCameraScreenViewFactoryProvider.get());
    }

    public static GovernmentIdModule_ProvideViewBindingsFactory create(Provider<GovernmentIdCameraScreenViewFactory> provider) {
        return new GovernmentIdModule_ProvideViewBindingsFactory(provider);
    }

    public static Set<ViewFactory<?>> provideViewBindings(GovernmentIdCameraScreenViewFactory governmentIdCameraScreenViewFactory) {
        return (Set) Preconditions.checkNotNullFromProvides(GovernmentIdModule.provideViewBindings(governmentIdCameraScreenViewFactory));
    }
}

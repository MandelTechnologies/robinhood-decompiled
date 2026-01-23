package com.withpersona.sdk2.inquiry.internal.network;

import com.squareup.workflow1.p415ui.ViewFactory;
import com.squareup.workflow1.p415ui.ViewRegistry;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Set;

/* loaded from: classes18.dex */
public final class InquiryModule_ViewRegistryFactory implements Factory<ViewRegistry> {
    private final Provider<Set<ViewFactory<?>>> viewBindingsProvider;

    public InquiryModule_ViewRegistryFactory(Provider<Set<ViewFactory<?>>> provider) {
        this.viewBindingsProvider = provider;
    }

    @Override // javax.inject.Provider
    public ViewRegistry get() {
        return viewRegistry(this.viewBindingsProvider.get());
    }

    public static InquiryModule_ViewRegistryFactory create(Provider<Set<ViewFactory<?>>> provider) {
        return new InquiryModule_ViewRegistryFactory(provider);
    }

    public static ViewRegistry viewRegistry(Set<ViewFactory<?>> set) {
        return (ViewRegistry) Preconditions.checkNotNullFromProvides(InquiryModule.viewRegistry(set));
    }
}

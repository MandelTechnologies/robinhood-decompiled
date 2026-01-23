package com.withpersona.sdk2.inquiry.sandbox;

import com.squareup.workflow1.p415ui.ViewFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

/* loaded from: classes18.dex */
public final class SandboxModule_ProvideViewBindingsFactory implements Factory<Set<ViewFactory<?>>> {

    private static final class InstanceHolder {
        static final SandboxModule_ProvideViewBindingsFactory INSTANCE = new SandboxModule_ProvideViewBindingsFactory();
    }

    @Override // javax.inject.Provider
    public Set<ViewFactory<?>> get() {
        return provideViewBindings();
    }

    public static SandboxModule_ProvideViewBindingsFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<ViewFactory<?>> provideViewBindings() {
        return (Set) Preconditions.checkNotNullFromProvides(SandboxModule.provideViewBindings());
    }
}

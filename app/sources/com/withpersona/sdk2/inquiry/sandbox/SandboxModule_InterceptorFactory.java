package com.withpersona.sdk2.inquiry.sandbox;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import okhttp3.Interceptor;

/* loaded from: classes18.dex */
public final class SandboxModule_InterceptorFactory implements Factory<Interceptor> {
    private final Provider<SandboxFlags> flagsProvider;
    private final SandboxModule module;

    public SandboxModule_InterceptorFactory(SandboxModule sandboxModule, Provider<SandboxFlags> provider) {
        this.module = sandboxModule;
        this.flagsProvider = provider;
    }

    @Override // javax.inject.Provider
    public Interceptor get() {
        return interceptor(this.module, this.flagsProvider.get());
    }

    public static SandboxModule_InterceptorFactory create(SandboxModule sandboxModule, Provider<SandboxFlags> provider) {
        return new SandboxModule_InterceptorFactory(sandboxModule, provider);
    }

    public static Interceptor interceptor(SandboxModule sandboxModule, SandboxFlags sandboxFlags) {
        return (Interceptor) Preconditions.checkNotNullFromProvides(sandboxModule.interceptor(sandboxFlags));
    }
}

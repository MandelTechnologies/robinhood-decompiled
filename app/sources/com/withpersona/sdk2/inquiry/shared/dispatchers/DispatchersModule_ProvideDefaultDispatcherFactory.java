package com.withpersona.sdk2.inquiry.shared.dispatchers;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes18.dex */
public final class DispatchersModule_ProvideDefaultDispatcherFactory implements Factory<CoroutineDispatcher> {
    private final DispatchersModule module;

    public DispatchersModule_ProvideDefaultDispatcherFactory(DispatchersModule dispatchersModule) {
        this.module = dispatchersModule;
    }

    @Override // javax.inject.Provider
    public CoroutineDispatcher get() {
        return provideDefaultDispatcher(this.module);
    }

    public static DispatchersModule_ProvideDefaultDispatcherFactory create(DispatchersModule dispatchersModule) {
        return new DispatchersModule_ProvideDefaultDispatcherFactory(dispatchersModule);
    }

    public static CoroutineDispatcher provideDefaultDispatcher(DispatchersModule dispatchersModule) {
        return (CoroutineDispatcher) Preconditions.checkNotNullFromProvides(dispatchersModule.provideDefaultDispatcher());
    }
}

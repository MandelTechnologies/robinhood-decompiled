package com.google.firebase.perf.injection.modules;

import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* renamed from: com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory */
/* loaded from: classes.dex */
public final class C5448x3dbbb29c implements Factory<Provider<TransportFactory>> {
    private final FirebasePerformanceModule module;

    public C5448x3dbbb29c(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    @Override // javax.inject.Provider
    public Provider<TransportFactory> get() {
        return providesTransportFactoryProvider(this.module);
    }

    public static C5448x3dbbb29c create(FirebasePerformanceModule firebasePerformanceModule) {
        return new C5448x3dbbb29c(firebasePerformanceModule);
    }

    public static Provider<TransportFactory> providesTransportFactoryProvider(FirebasePerformanceModule firebasePerformanceModule) {
        return (Provider) Preconditions.checkNotNull(firebasePerformanceModule.providesTransportFactoryProvider(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

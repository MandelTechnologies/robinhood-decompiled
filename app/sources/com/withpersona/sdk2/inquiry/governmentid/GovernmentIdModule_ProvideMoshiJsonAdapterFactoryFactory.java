package com.withpersona.sdk2.inquiry.governmentid;

import com.squareup.moshi.JsonAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

/* loaded from: classes18.dex */
public final class GovernmentIdModule_ProvideMoshiJsonAdapterFactoryFactory implements Factory<Set<JsonAdapter.Factory>> {

    private static final class InstanceHolder {
        static final GovernmentIdModule_ProvideMoshiJsonAdapterFactoryFactory INSTANCE = new GovernmentIdModule_ProvideMoshiJsonAdapterFactoryFactory();
    }

    @Override // javax.inject.Provider
    public Set<JsonAdapter.Factory> get() {
        return provideMoshiJsonAdapterFactory();
    }

    public static GovernmentIdModule_ProvideMoshiJsonAdapterFactoryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<JsonAdapter.Factory> provideMoshiJsonAdapterFactory() {
        return (Set) Preconditions.checkNotNullFromProvides(GovernmentIdModule.provideMoshiJsonAdapterFactory());
    }
}

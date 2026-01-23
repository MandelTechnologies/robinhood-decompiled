package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.JsonAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

/* renamed from: com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_Companion_ProvideMoshiJsonAdapterFactoryFactory */
/* loaded from: classes18.dex */
public final class C43679x1677dd3d implements Factory<Set<JsonAdapter.Factory>> {

    /* renamed from: com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_Companion_ProvideMoshiJsonAdapterFactoryFactory$InstanceHolder */
    public static final class InstanceHolder {
        static final C43679x1677dd3d INSTANCE = new C43679x1677dd3d();

        private InstanceHolder() {
        }
    }

    public static C43679x1677dd3d create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<JsonAdapter.Factory> provideMoshiJsonAdapterFactory() {
        return (Set) Preconditions.checkNotNullFromProvides(NetworkCoreModule.Companion.provideMoshiJsonAdapterFactory());
    }

    @Override // javax.inject.Provider
    public Set<JsonAdapter.Factory> get() {
        return provideMoshiJsonAdapterFactory();
    }
}

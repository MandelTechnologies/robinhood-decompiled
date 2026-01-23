package com.withpersona.sdk2.inquiry.network.core;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes18.dex */
public final class NetworkCoreModule_UseServerStylesFactory implements Factory<String> {
    private final NetworkCoreModule module;

    public NetworkCoreModule_UseServerStylesFactory(NetworkCoreModule networkCoreModule) {
        this.module = networkCoreModule;
    }

    public static NetworkCoreModule_UseServerStylesFactory create(NetworkCoreModule networkCoreModule) {
        return new NetworkCoreModule_UseServerStylesFactory(networkCoreModule);
    }

    public static String useServerStyles(NetworkCoreModule networkCoreModule) {
        return (String) Preconditions.checkNotNullFromProvides(networkCoreModule.useServerStyles());
    }

    @Override // javax.inject.Provider
    public String get() {
        return useServerStyles(this.module);
    }
}

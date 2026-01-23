package com.withpersona.sdk2.inquiry.network.core;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes18.dex */
public final class NetworkCoreModule_KeyInflectionFactory implements Factory<String> {
    private final NetworkCoreModule module;

    public NetworkCoreModule_KeyInflectionFactory(NetworkCoreModule networkCoreModule) {
        this.module = networkCoreModule;
    }

    public static NetworkCoreModule_KeyInflectionFactory create(NetworkCoreModule networkCoreModule) {
        return new NetworkCoreModule_KeyInflectionFactory(networkCoreModule);
    }

    public static String keyInflection(NetworkCoreModule networkCoreModule) {
        return (String) Preconditions.checkNotNullFromProvides(networkCoreModule.keyInflection());
    }

    @Override // javax.inject.Provider
    public String get() {
        return keyInflection(this.module);
    }
}

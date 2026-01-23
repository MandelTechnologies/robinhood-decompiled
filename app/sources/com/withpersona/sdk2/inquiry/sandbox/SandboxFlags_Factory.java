package com.withpersona.sdk2.inquiry.sandbox;

import dagger.internal.Factory;

/* loaded from: classes18.dex */
public final class SandboxFlags_Factory implements Factory<SandboxFlags> {

    private static final class InstanceHolder {
        static final SandboxFlags_Factory INSTANCE = new SandboxFlags_Factory();
    }

    @Override // javax.inject.Provider
    public SandboxFlags get() {
        return newInstance();
    }

    public static SandboxFlags_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SandboxFlags newInstance() {
        return new SandboxFlags();
    }
}

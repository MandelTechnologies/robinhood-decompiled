package com.withpersona.sdk2.camera;

import dagger.internal.Factory;

/* loaded from: classes26.dex */
public final class SelfieProcessor_Factory implements Factory<SelfieProcessor> {

    private static final class InstanceHolder {
        static final SelfieProcessor_Factory INSTANCE = new SelfieProcessor_Factory();
    }

    @Override // javax.inject.Provider
    public SelfieProcessor get() {
        return newInstance();
    }

    public static SelfieProcessor_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SelfieProcessor newInstance() {
        return new SelfieProcessor();
    }
}

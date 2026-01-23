package com.withpersona.sdk2.inquiry.internal.integrity;

import dagger.internal.Factory;

/* loaded from: classes18.dex */
public final class RealStandardIntegrityManagerFactory_Factory implements Factory<StandardIntegrityManagerFactory2> {

    private static final class InstanceHolder {
        static final RealStandardIntegrityManagerFactory_Factory INSTANCE = new RealStandardIntegrityManagerFactory_Factory();
    }

    @Override // javax.inject.Provider
    public StandardIntegrityManagerFactory2 get() {
        return newInstance();
    }

    public static RealStandardIntegrityManagerFactory_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static StandardIntegrityManagerFactory2 newInstance() {
        return new StandardIntegrityManagerFactory2();
    }
}

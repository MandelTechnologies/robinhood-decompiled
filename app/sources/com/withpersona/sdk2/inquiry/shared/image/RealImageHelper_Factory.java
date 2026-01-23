package com.withpersona.sdk2.inquiry.shared.image;

import dagger.internal.Factory;

/* loaded from: classes18.dex */
public final class RealImageHelper_Factory implements Factory<ImageHelper2> {

    private static final class InstanceHolder {
        static final RealImageHelper_Factory INSTANCE = new RealImageHelper_Factory();
    }

    @Override // javax.inject.Provider
    public ImageHelper2 get() {
        return newInstance();
    }

    public static RealImageHelper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ImageHelper2 newInstance() {
        return new ImageHelper2();
    }
}

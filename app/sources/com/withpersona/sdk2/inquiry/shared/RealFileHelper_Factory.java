package com.withpersona.sdk2.inquiry.shared;

import dagger.internal.Factory;

/* loaded from: classes18.dex */
public final class RealFileHelper_Factory implements Factory<FileHelper2> {

    private static final class InstanceHolder {
        static final RealFileHelper_Factory INSTANCE = new RealFileHelper_Factory();
    }

    @Override // javax.inject.Provider
    public FileHelper2 get() {
        return newInstance();
    }

    public static RealFileHelper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static FileHelper2 newInstance() {
        return new FileHelper2();
    }
}

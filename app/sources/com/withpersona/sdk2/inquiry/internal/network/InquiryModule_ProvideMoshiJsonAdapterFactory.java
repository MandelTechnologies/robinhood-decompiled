package com.withpersona.sdk2.inquiry.internal.network;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

/* loaded from: classes18.dex */
public final class InquiryModule_ProvideMoshiJsonAdapterFactory implements Factory<Set<Object>> {

    private static final class InstanceHolder {
        static final InquiryModule_ProvideMoshiJsonAdapterFactory INSTANCE = new InquiryModule_ProvideMoshiJsonAdapterFactory();
    }

    @Override // javax.inject.Provider
    public Set<Object> get() {
        return provideMoshiJsonAdapter();
    }

    public static InquiryModule_ProvideMoshiJsonAdapterFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<Object> provideMoshiJsonAdapter() {
        return (Set) Preconditions.checkNotNullFromProvides(InquiryModule.provideMoshiJsonAdapter());
    }
}

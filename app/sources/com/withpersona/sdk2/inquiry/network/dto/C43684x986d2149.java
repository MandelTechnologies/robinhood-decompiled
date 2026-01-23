package com.withpersona.sdk2.inquiry.network.dto;

import com.squareup.moshi.JsonAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

/* renamed from: com.withpersona.sdk2.inquiry.network.dto.NetworkInquiryModule_Companion_ProvideMoshiJsonAdapterFactoryFactory */
/* loaded from: classes18.dex */
public final class C43684x986d2149 implements Factory<Set<JsonAdapter.Factory>> {
    @Override // javax.inject.Provider
    public Set<JsonAdapter.Factory> get() {
        return provideMoshiJsonAdapterFactory();
    }

    public static C43684x986d2149 create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<JsonAdapter.Factory> provideMoshiJsonAdapterFactory() {
        return (Set) Preconditions.checkNotNullFromProvides(NetworkInquiryModule.INSTANCE.provideMoshiJsonAdapterFactory());
    }

    /* renamed from: com.withpersona.sdk2.inquiry.network.dto.NetworkInquiryModule_Companion_ProvideMoshiJsonAdapterFactoryFactory$InstanceHolder */
    private static final class InstanceHolder {
        static final C43684x986d2149 INSTANCE = new C43684x986d2149();

        private InstanceHolder() {
        }
    }
}

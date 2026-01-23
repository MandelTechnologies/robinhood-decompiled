package com.withpersona.sdk2.inquiry.internal.network;

import com.withpersona.sdk2.inquiry.network.core.JsonAdapterBinding;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

/* loaded from: classes18.dex */
public final class InquiryModule_ProvideMoshiJsonAdapterBindingFactory implements Factory<Set<JsonAdapterBinding<?>>> {

    private static final class InstanceHolder {
        static final InquiryModule_ProvideMoshiJsonAdapterBindingFactory INSTANCE = new InquiryModule_ProvideMoshiJsonAdapterBindingFactory();
    }

    @Override // javax.inject.Provider
    public Set<JsonAdapterBinding<?>> get() {
        return provideMoshiJsonAdapterBinding();
    }

    public static InquiryModule_ProvideMoshiJsonAdapterBindingFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<JsonAdapterBinding<?>> provideMoshiJsonAdapterBinding() {
        return (Set) Preconditions.checkNotNullFromProvides(InquiryModule.provideMoshiJsonAdapterBinding());
    }
}

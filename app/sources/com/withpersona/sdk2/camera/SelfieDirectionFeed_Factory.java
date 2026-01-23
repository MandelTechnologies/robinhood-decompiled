package com.withpersona.sdk2.camera;

import com.withpersona.sdk2.camera.selfie.SelfieFrameInfo;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.coroutines.flow.SharedFlow2;

/* loaded from: classes26.dex */
public final class SelfieDirectionFeed_Factory implements Factory<SelfieDirectionFeed> {
    private final Provider<SharedFlow2<SelfieFrameInfo>> resultFlowProvider;
    private final Provider<SelfieProcessor> selfieProcessorProvider;

    public SelfieDirectionFeed_Factory(Provider<SelfieProcessor> provider, Provider<SharedFlow2<SelfieFrameInfo>> provider2) {
        this.selfieProcessorProvider = provider;
        this.resultFlowProvider = provider2;
    }

    @Override // javax.inject.Provider
    public SelfieDirectionFeed get() {
        return newInstance(this.selfieProcessorProvider.get(), this.resultFlowProvider.get());
    }

    public static SelfieDirectionFeed_Factory create(Provider<SelfieProcessor> provider, Provider<SharedFlow2<SelfieFrameInfo>> provider2) {
        return new SelfieDirectionFeed_Factory(provider, provider2);
    }

    public static SelfieDirectionFeed newInstance(SelfieProcessor selfieProcessor, SharedFlow2<SelfieFrameInfo> sharedFlow2) {
        return new SelfieDirectionFeed(selfieProcessor, sharedFlow2);
    }
}

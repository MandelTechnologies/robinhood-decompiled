package com.withpersona.sdk2.inquiry.selfie;

import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class SelfieAnalyzeWorker_Factory_Impl implements SelfieAnalyzeWorker.Factory {
    private final C50862SelfieAnalyzeWorker_Factory delegateFactory;

    SelfieAnalyzeWorker_Factory_Impl(C50862SelfieAnalyzeWorker_Factory c50862SelfieAnalyzeWorker_Factory) {
        this.delegateFactory = c50862SelfieAnalyzeWorker_Factory;
    }

    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker.Factory
    public SelfieAnalyzeWorker create(Selfie.Pose pose, boolean z) {
        return this.delegateFactory.get(pose, z);
    }

    public static Provider<SelfieAnalyzeWorker.Factory> createFactoryProvider(C50862SelfieAnalyzeWorker_Factory c50862SelfieAnalyzeWorker_Factory) {
        return InstanceFactory.create(new SelfieAnalyzeWorker_Factory_Impl(c50862SelfieAnalyzeWorker_Factory));
    }
}

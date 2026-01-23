package com.withpersona.sdk2.inquiry.governmentid.network;

import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class SubmitVerificationWorker_Factory_Impl implements SubmitVerificationWorker.Factory {
    private final C50849SubmitVerificationWorker_Factory delegateFactory;

    SubmitVerificationWorker_Factory_Impl(C50849SubmitVerificationWorker_Factory c50849SubmitVerificationWorker_Factory) {
        this.delegateFactory = c50849SubmitVerificationWorker_Factory;
    }

    @Override // com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker.Factory
    public SubmitVerificationWorker create(String str, String str2, String str3, String str4, GovernmentIdRequestArguments governmentIdRequestArguments, String str5, CameraProperties cameraProperties) {
        return this.delegateFactory.get(str, str2, str4, str3, governmentIdRequestArguments, str5, cameraProperties);
    }

    public static Provider<SubmitVerificationWorker.Factory> createFactoryProvider(C50849SubmitVerificationWorker_Factory c50849SubmitVerificationWorker_Factory) {
        return InstanceFactory.create(new SubmitVerificationWorker_Factory_Impl(c50849SubmitVerificationWorker_Factory));
    }
}

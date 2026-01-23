package com.withpersona.sdk2.inquiry.selfie.network;

import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import java.util.List;

/* loaded from: classes18.dex */
public final class SubmitVerificationWorker_Factory_Impl implements SubmitVerificationWorker.Factory {
    private final C50863SubmitVerificationWorker_Factory delegateFactory;

    SubmitVerificationWorker_Factory_Impl(C50863SubmitVerificationWorker_Factory c50863SubmitVerificationWorker_Factory) {
        this.delegateFactory = c50863SubmitVerificationWorker_Factory;
    }

    @Override // com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker.Factory
    public SubmitVerificationWorker create(String str, String str2, String str3, String str4, SelfieType selfieType, String str5, List<? extends Selfie> list, String str6, CameraProperties cameraProperties, long j) {
        return this.delegateFactory.get(str, str2, selfieType, list, str4, str3, str5, str6, cameraProperties, j);
    }

    public static Provider<SubmitVerificationWorker.Factory> createFactoryProvider(C50863SubmitVerificationWorker_Factory c50863SubmitVerificationWorker_Factory) {
        return InstanceFactory.create(new SubmitVerificationWorker_Factory_Impl(c50863SubmitVerificationWorker_Factory));
    }
}

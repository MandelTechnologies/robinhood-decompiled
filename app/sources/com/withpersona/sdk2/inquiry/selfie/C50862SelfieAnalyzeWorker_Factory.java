package com.withpersona.sdk2.inquiry.selfie;

import com.withpersona.sdk2.camera.SelfieDirectionFeed;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import dagger.internal.Provider;

/* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker_Factory, reason: case insensitive filesystem */
/* loaded from: classes18.dex */
public final class C50862SelfieAnalyzeWorker_Factory {
    private final Provider<SdkFilesManager> sdkFilesManagerProvider;
    private final Provider<SelfieDirectionFeed> selfieDirectionFeedProvider;

    public C50862SelfieAnalyzeWorker_Factory(Provider<SelfieDirectionFeed> provider, Provider<SdkFilesManager> provider2) {
        this.selfieDirectionFeedProvider = provider;
        this.sdkFilesManagerProvider = provider2;
    }

    public SelfieAnalyzeWorker get(Selfie.Pose pose, boolean z) {
        return newInstance(this.selfieDirectionFeedProvider.get(), pose, z, this.sdkFilesManagerProvider.get());
    }

    public static C50862SelfieAnalyzeWorker_Factory create(Provider<SelfieDirectionFeed> provider, Provider<SdkFilesManager> provider2) {
        return new C50862SelfieAnalyzeWorker_Factory(provider, provider2);
    }

    public static SelfieAnalyzeWorker newInstance(SelfieDirectionFeed selfieDirectionFeed, Selfie.Pose pose, boolean z, SdkFilesManager sdkFilesManager) {
        return new SelfieAnalyzeWorker(selfieDirectionFeed, pose, z, sdkFilesManager);
    }
}

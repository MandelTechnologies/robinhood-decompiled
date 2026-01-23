package com.withpersona.sdk2.inquiry.governmentid.network;

import android.content.Context;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.stats.CameraStatsManager;
import com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager;
import com.withpersona.sdk2.inquiry.shared.data_collection.DataCollector;
import com.withpersona.sdk2.inquiry.shared.image.ImageHelper;
import dagger.internal.Provider;

/* renamed from: com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker_Factory, reason: case insensitive filesystem */
/* loaded from: classes18.dex */
public final class C50849SubmitVerificationWorker_Factory {
    private final Provider<CameraStatsManager> cameraStatsManagerProvider;
    private final Provider<Context> contextProvider;
    private final Provider<DataCollector> dataCollectorProvider;
    private final Provider<FallbackModeManager> fallbackModeManagerProvider;
    private final Provider<ImageHelper> imageHelperProvider;
    private final Provider<GovernmentIdService> serviceProvider;

    public C50849SubmitVerificationWorker_Factory(Provider<Context> provider, Provider<GovernmentIdService> provider2, Provider<DataCollector> provider3, Provider<FallbackModeManager> provider4, Provider<ImageHelper> provider5, Provider<CameraStatsManager> provider6) {
        this.contextProvider = provider;
        this.serviceProvider = provider2;
        this.dataCollectorProvider = provider3;
        this.fallbackModeManagerProvider = provider4;
        this.imageHelperProvider = provider5;
        this.cameraStatsManagerProvider = provider6;
    }

    public SubmitVerificationWorker get(String str, String str2, String str3, String str4, GovernmentIdRequestArguments governmentIdRequestArguments, String str5, CameraProperties cameraProperties) {
        return newInstance(this.contextProvider.get(), str, str2, str3, str4, this.serviceProvider.get(), governmentIdRequestArguments, this.dataCollectorProvider.get(), this.fallbackModeManagerProvider.get(), this.imageHelperProvider.get(), str5, cameraProperties, this.cameraStatsManagerProvider.get());
    }

    public static C50849SubmitVerificationWorker_Factory create(Provider<Context> provider, Provider<GovernmentIdService> provider2, Provider<DataCollector> provider3, Provider<FallbackModeManager> provider4, Provider<ImageHelper> provider5, Provider<CameraStatsManager> provider6) {
        return new C50849SubmitVerificationWorker_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static SubmitVerificationWorker newInstance(Context context, String str, String str2, String str3, String str4, GovernmentIdService governmentIdService, GovernmentIdRequestArguments governmentIdRequestArguments, DataCollector dataCollector, FallbackModeManager fallbackModeManager, ImageHelper imageHelper, String str5, CameraProperties cameraProperties, CameraStatsManager cameraStatsManager) {
        return new SubmitVerificationWorker(context, str, str2, str3, str4, governmentIdService, governmentIdRequestArguments, dataCollector, fallbackModeManager, imageHelper, str5, cameraProperties, cameraStatsManager);
    }
}

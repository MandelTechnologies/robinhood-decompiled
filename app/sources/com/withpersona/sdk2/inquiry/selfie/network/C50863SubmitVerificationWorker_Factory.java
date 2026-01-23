package com.withpersona.sdk2.inquiry.selfie.network;

import android.content.Context;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.stats.CameraStatsManager;
import com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.shared.data_collection.DataCollector;
import com.withpersona.sdk2.inquiry.shared.image.ImageHelper;
import dagger.internal.Provider;
import java.util.List;

/* renamed from: com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker_Factory, reason: case insensitive filesystem */
/* loaded from: classes18.dex */
public final class C50863SubmitVerificationWorker_Factory {
    private final Provider<CameraStatsManager> cameraStatsManagerProvider;
    private final Provider<Context> contextProvider;
    private final Provider<DataCollector> dataCollectorProvider;
    private final Provider<FallbackModeManager> fallbackModeManagerProvider;
    private final Provider<ImageHelper> imageHelperProvider;
    private final Provider<SelfieService> serviceProvider;

    public C50863SubmitVerificationWorker_Factory(Provider<Context> provider, Provider<SelfieService> provider2, Provider<DataCollector> provider3, Provider<FallbackModeManager> provider4, Provider<ImageHelper> provider5, Provider<CameraStatsManager> provider6) {
        this.contextProvider = provider;
        this.serviceProvider = provider2;
        this.dataCollectorProvider = provider3;
        this.fallbackModeManagerProvider = provider4;
        this.imageHelperProvider = provider5;
        this.cameraStatsManagerProvider = provider6;
    }

    public SubmitVerificationWorker get(String str, String str2, SelfieType selfieType, List<? extends Selfie> list, String str3, String str4, String str5, String str6, CameraProperties cameraProperties, long j) {
        return newInstance(this.contextProvider.get(), str, str2, selfieType, list, this.serviceProvider.get(), str3, str4, str5, this.dataCollectorProvider.get(), this.fallbackModeManagerProvider.get(), this.imageHelperProvider.get(), str6, cameraProperties, this.cameraStatsManagerProvider.get(), j);
    }

    public static C50863SubmitVerificationWorker_Factory create(Provider<Context> provider, Provider<SelfieService> provider2, Provider<DataCollector> provider3, Provider<FallbackModeManager> provider4, Provider<ImageHelper> provider5, Provider<CameraStatsManager> provider6) {
        return new C50863SubmitVerificationWorker_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static SubmitVerificationWorker newInstance(Context context, String str, String str2, SelfieType selfieType, List<? extends Selfie> list, SelfieService selfieService, String str3, String str4, String str5, DataCollector dataCollector, FallbackModeManager fallbackModeManager, ImageHelper imageHelper, String str6, CameraProperties cameraProperties, CameraStatsManager cameraStatsManager, long j) {
        return new SubmitVerificationWorker(context, str, str2, selfieType, list, selfieService, str3, str4, str5, dataCollector, fallbackModeManager, imageHelper, str6, cameraProperties, cameraStatsManager, j);
    }
}

package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import com.withpersona.sdk2.inquiry.device.DeviceId;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager;
import com.withpersona.sdk2.inquiry.internal.network.InquiryService;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.remoteFonts.FontDownloader;
import dagger.internal.Provider;

/* renamed from: com.withpersona.sdk2.inquiry.internal.PollingWorker_Factory, reason: case insensitive filesystem */
/* loaded from: classes18.dex */
public final class C50853PollingWorker_Factory {
    private final Provider<Context> applicationContextProvider;
    private final Provider<DeviceId> deviceIdProvider;
    private final Provider<RealFallbackModeManager> fallbackModeManagerProvider;
    private final Provider<FontDownloader> fontDownloaderProvider;
    private final Provider<SandboxFlags> sandboxFlagsProvider;
    private final Provider<InquiryService> serviceProvider;

    public C50853PollingWorker_Factory(Provider<Context> provider, Provider<InquiryService> provider2, Provider<DeviceId> provider3, Provider<SandboxFlags> provider4, Provider<RealFallbackModeManager> provider5, Provider<FontDownloader> provider6) {
        this.applicationContextProvider = provider;
        this.serviceProvider = provider2;
        this.deviceIdProvider = provider3;
        this.sandboxFlagsProvider = provider4;
        this.fallbackModeManagerProvider = provider5;
        this.fontDownloaderProvider = provider6;
    }

    public PollingWorker get(String str, String str2, PollingMode pollingMode, InquirySessionConfig inquirySessionConfig) {
        return newInstance(str, str2, pollingMode, inquirySessionConfig, this.applicationContextProvider.get(), this.serviceProvider.get(), this.deviceIdProvider.get(), this.sandboxFlagsProvider.get(), this.fallbackModeManagerProvider.get(), this.fontDownloaderProvider.get());
    }

    public static C50853PollingWorker_Factory create(Provider<Context> provider, Provider<InquiryService> provider2, Provider<DeviceId> provider3, Provider<SandboxFlags> provider4, Provider<RealFallbackModeManager> provider5, Provider<FontDownloader> provider6) {
        return new C50853PollingWorker_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static PollingWorker newInstance(String str, String str2, PollingMode pollingMode, InquirySessionConfig inquirySessionConfig, Context context, InquiryService inquiryService, DeviceId deviceId, SandboxFlags sandboxFlags, RealFallbackModeManager realFallbackModeManager, FontDownloader fontDownloader) {
        return new PollingWorker(str, str2, pollingMode, inquirySessionConfig, context, inquiryService, deviceId, sandboxFlags, realFallbackModeManager, fontDownloader);
    }
}

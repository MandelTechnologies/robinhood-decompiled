package com.withpersona.sdk2.inquiry.internal.network;

import android.content.Context;
import com.withpersona.sdk2.inquiry.device.DeviceId;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager;
import com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class InquiryApiHelper_Factory implements Factory<InquiryApiHelper> {
    private final Provider<Context> applicationContextProvider;
    private final Provider<DeviceId> deviceIdProvider;
    private final Provider<RealFallbackModeManager> fallbackModeManagerProvider;
    private final Provider<PlayIntegrityHelper> playIntegrityHelperProvider;
    private final Provider<SandboxFlags> sandboxFlagsProvider;
    private final Provider<InquiryService> serviceProvider;

    public InquiryApiHelper_Factory(Provider<Context> provider, Provider<InquiryService> provider2, Provider<RealFallbackModeManager> provider3, Provider<SandboxFlags> provider4, Provider<DeviceId> provider5, Provider<PlayIntegrityHelper> provider6) {
        this.applicationContextProvider = provider;
        this.serviceProvider = provider2;
        this.fallbackModeManagerProvider = provider3;
        this.sandboxFlagsProvider = provider4;
        this.deviceIdProvider = provider5;
        this.playIntegrityHelperProvider = provider6;
    }

    @Override // javax.inject.Provider
    public InquiryApiHelper get() {
        return newInstance(this.applicationContextProvider.get(), this.serviceProvider.get(), this.fallbackModeManagerProvider.get(), this.sandboxFlagsProvider.get(), this.deviceIdProvider.get(), this.playIntegrityHelperProvider.get());
    }

    public static InquiryApiHelper_Factory create(Provider<Context> provider, Provider<InquiryService> provider2, Provider<RealFallbackModeManager> provider3, Provider<SandboxFlags> provider4, Provider<DeviceId> provider5, Provider<PlayIntegrityHelper> provider6) {
        return new InquiryApiHelper_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static InquiryApiHelper newInstance(Context context, InquiryService inquiryService, RealFallbackModeManager realFallbackModeManager, SandboxFlags sandboxFlags, DeviceId deviceId, PlayIntegrityHelper playIntegrityHelper) {
        return new InquiryApiHelper(context, inquiryService, realFallbackModeManager, sandboxFlags, deviceId, playIntegrityHelper);
    }
}

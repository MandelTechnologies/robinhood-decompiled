package com.withpersona.sdk2.inquiry.p424ui;

import androidx.view.result.ActivityResultLauncher;
import com.withpersona.sdk2.inquiry.device.DeviceId;
import com.withpersona.sdk2.inquiry.launchers.CustomTabsLauncherModule2;
import com.withpersona.sdk2.inquiry.p424ui.network.UiService;
import dagger.internal.Provider;

/* renamed from: com.withpersona.sdk2.inquiry.ui.CreateReusablePersonaWorker_Factory, reason: case insensitive filesystem */
/* loaded from: classes18.dex */
public final class C50864CreateReusablePersonaWorker_Factory {
    private final Provider<ActivityResultLauncher<CustomTabsLauncherModule2>> customTabsLauncherProvider;
    private final Provider<DeviceId> deviceIdProvider;
    private final Provider<UiService> uiServiceProvider;

    public C50864CreateReusablePersonaWorker_Factory(Provider<UiService> provider, Provider<DeviceId> provider2, Provider<ActivityResultLauncher<CustomTabsLauncherModule2>> provider3) {
        this.uiServiceProvider = provider;
        this.deviceIdProvider = provider2;
        this.customTabsLauncherProvider = provider3;
    }

    public CreateReusablePersonaWorker get(String str, String str2, String str3, String str4) {
        return newInstance(this.uiServiceProvider.get(), this.deviceIdProvider.get(), this.customTabsLauncherProvider.get(), str, str2, str3, str4);
    }

    public static C50864CreateReusablePersonaWorker_Factory create(Provider<UiService> provider, Provider<DeviceId> provider2, Provider<ActivityResultLauncher<CustomTabsLauncherModule2>> provider3) {
        return new C50864CreateReusablePersonaWorker_Factory(provider, provider2, provider3);
    }

    public static CreateReusablePersonaWorker newInstance(UiService uiService, DeviceId deviceId, ActivityResultLauncher<CustomTabsLauncherModule2> activityResultLauncher, String str, String str2, String str3, String str4) {
        return new CreateReusablePersonaWorker(uiService, deviceId, activityResultLauncher, str, str2, str3, str4);
    }
}

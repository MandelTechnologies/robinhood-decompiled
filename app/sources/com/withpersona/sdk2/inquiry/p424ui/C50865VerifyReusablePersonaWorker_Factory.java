package com.withpersona.sdk2.inquiry.p424ui;

import androidx.view.result.ActivityResultLauncher;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.launchers.CustomTabsLauncherModule2;
import com.withpersona.sdk2.inquiry.p424ui.network.ComponentParam;
import com.withpersona.sdk2.inquiry.p424ui.network.UiService;
import dagger.internal.Provider;
import java.util.Map;

/* renamed from: com.withpersona.sdk2.inquiry.ui.VerifyReusablePersonaWorker_Factory, reason: case insensitive filesystem */
/* loaded from: classes18.dex */
public final class C50865VerifyReusablePersonaWorker_Factory {
    private final Provider<ActivityResultLauncher<CustomTabsLauncherModule2>> customTabsLauncherProvider;
    private final Provider<Moshi> moshiProvider;
    private final Provider<UiService> uiServiceProvider;

    public C50865VerifyReusablePersonaWorker_Factory(Provider<ActivityResultLauncher<CustomTabsLauncherModule2>> provider, Provider<UiService> provider2, Provider<Moshi> provider3) {
        this.customTabsLauncherProvider = provider;
        this.uiServiceProvider = provider2;
        this.moshiProvider = provider3;
    }

    public VerifyReusablePersonaWorker get(String str, String str2, String str3, String str4, Map<String, ? extends ComponentParam> map) {
        return newInstance(this.customTabsLauncherProvider.get(), this.uiServiceProvider.get(), this.moshiProvider.get(), str, str2, str3, str4, map);
    }

    public static C50865VerifyReusablePersonaWorker_Factory create(Provider<ActivityResultLauncher<CustomTabsLauncherModule2>> provider, Provider<UiService> provider2, Provider<Moshi> provider3) {
        return new C50865VerifyReusablePersonaWorker_Factory(provider, provider2, provider3);
    }

    public static VerifyReusablePersonaWorker newInstance(ActivityResultLauncher<CustomTabsLauncherModule2> activityResultLauncher, UiService uiService, Moshi moshi, String str, String str2, String str3, String str4, Map<String, ? extends ComponentParam> map) {
        return new VerifyReusablePersonaWorker(activityResultLauncher, uiService, moshi, str, str2, str3, str4, map);
    }
}

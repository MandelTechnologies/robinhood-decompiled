package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.IntentSenderRequest;
import dagger.internal.Provider;

/* renamed from: com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker_Factory, reason: case insensitive filesystem */
/* loaded from: classes18.dex */
public final class C50861DeviceFeatureRequestWorker_Factory {
    private final Provider<Context> contextProvider;
    private final Provider<ActivityResultLauncher<IntentSenderRequest>> resolvableApiLauncherProvider;

    public C50861DeviceFeatureRequestWorker_Factory(Provider<ActivityResultLauncher<IntentSenderRequest>> provider, Provider<Context> provider2) {
        this.resolvableApiLauncherProvider = provider;
        this.contextProvider = provider2;
    }

    public DeviceFeatureRequestWorker get() {
        return newInstance(this.resolvableApiLauncherProvider.get(), this.contextProvider.get());
    }

    public static C50861DeviceFeatureRequestWorker_Factory create(Provider<ActivityResultLauncher<IntentSenderRequest>> provider, Provider<Context> provider2) {
        return new C50861DeviceFeatureRequestWorker_Factory(provider, provider2);
    }

    public static DeviceFeatureRequestWorker newInstance(ActivityResultLauncher<IntentSenderRequest> activityResultLauncher, Context context) {
        return new DeviceFeatureRequestWorker(activityResultLauncher, context);
    }
}

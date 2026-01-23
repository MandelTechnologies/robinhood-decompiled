package com.withpersona.sdk2.inquiry.launchers;

import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.IntentSenderRequest;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes18.dex */
public final class ResolvableApiLauncherModule_ResolvableApiLauncherFactory implements Factory<ActivityResultLauncher<IntentSenderRequest>> {
    private final ResolvableApiLauncherModule module;

    public ResolvableApiLauncherModule_ResolvableApiLauncherFactory(ResolvableApiLauncherModule resolvableApiLauncherModule) {
        this.module = resolvableApiLauncherModule;
    }

    @Override // javax.inject.Provider
    public ActivityResultLauncher<IntentSenderRequest> get() {
        return resolvableApiLauncher(this.module);
    }

    public static ResolvableApiLauncherModule_ResolvableApiLauncherFactory create(ResolvableApiLauncherModule resolvableApiLauncherModule) {
        return new ResolvableApiLauncherModule_ResolvableApiLauncherFactory(resolvableApiLauncherModule);
    }

    public static ActivityResultLauncher<IntentSenderRequest> resolvableApiLauncher(ResolvableApiLauncherModule resolvableApiLauncherModule) {
        return (ActivityResultLauncher) Preconditions.checkNotNullFromProvides(resolvableApiLauncherModule.resolvableApiLauncher());
    }
}

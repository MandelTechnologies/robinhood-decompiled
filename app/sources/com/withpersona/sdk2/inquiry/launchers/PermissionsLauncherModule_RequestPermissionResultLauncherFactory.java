package com.withpersona.sdk2.inquiry.launchers;

import androidx.view.result.ActivityResultLauncher;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes18.dex */
public final class PermissionsLauncherModule_RequestPermissionResultLauncherFactory implements Factory<ActivityResultLauncher<String>> {
    private final PermissionsLauncherModule module;

    public PermissionsLauncherModule_RequestPermissionResultLauncherFactory(PermissionsLauncherModule permissionsLauncherModule) {
        this.module = permissionsLauncherModule;
    }

    @Override // javax.inject.Provider
    public ActivityResultLauncher<String> get() {
        return requestPermissionResultLauncher(this.module);
    }

    public static PermissionsLauncherModule_RequestPermissionResultLauncherFactory create(PermissionsLauncherModule permissionsLauncherModule) {
        return new PermissionsLauncherModule_RequestPermissionResultLauncherFactory(permissionsLauncherModule);
    }

    public static ActivityResultLauncher<String> requestPermissionResultLauncher(PermissionsLauncherModule permissionsLauncherModule) {
        return (ActivityResultLauncher) Preconditions.checkNotNullFromProvides(permissionsLauncherModule.requestPermissionResultLauncher());
    }
}

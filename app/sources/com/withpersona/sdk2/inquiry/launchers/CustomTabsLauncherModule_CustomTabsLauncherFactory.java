package com.withpersona.sdk2.inquiry.launchers;

import androidx.view.result.ActivityResultLauncher;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes18.dex */
public final class CustomTabsLauncherModule_CustomTabsLauncherFactory implements Factory<ActivityResultLauncher<CustomTabsLauncherModule2>> {
    private final CustomTabsLauncherModule module;

    public CustomTabsLauncherModule_CustomTabsLauncherFactory(CustomTabsLauncherModule customTabsLauncherModule) {
        this.module = customTabsLauncherModule;
    }

    @Override // javax.inject.Provider
    public ActivityResultLauncher<CustomTabsLauncherModule2> get() {
        return customTabsLauncher(this.module);
    }

    public static CustomTabsLauncherModule_CustomTabsLauncherFactory create(CustomTabsLauncherModule customTabsLauncherModule) {
        return new CustomTabsLauncherModule_CustomTabsLauncherFactory(customTabsLauncherModule);
    }

    public static ActivityResultLauncher<CustomTabsLauncherModule2> customTabsLauncher(CustomTabsLauncherModule customTabsLauncherModule) {
        return (ActivityResultLauncher) Preconditions.checkNotNullFromProvides(customTabsLauncherModule.customTabsLauncher());
    }
}

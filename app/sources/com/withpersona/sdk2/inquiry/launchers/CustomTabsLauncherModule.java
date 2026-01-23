package com.withpersona.sdk2.inquiry.launchers;

import androidx.view.result.ActivityResultLauncher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomTabsLauncherModule.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/launchers/CustomTabsLauncherModule;", "", "customTabsLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/withpersona/sdk2/inquiry/launchers/CustomTabsArguments;", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;)V", "launchers_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class CustomTabsLauncherModule {
    private final ActivityResultLauncher<CustomTabsLauncherModule2> customTabsLauncher;

    public CustomTabsLauncherModule(ActivityResultLauncher<CustomTabsLauncherModule2> customTabsLauncher) {
        Intrinsics.checkNotNullParameter(customTabsLauncher, "customTabsLauncher");
        this.customTabsLauncher = customTabsLauncher;
    }

    public final ActivityResultLauncher<CustomTabsLauncherModule2> customTabsLauncher() {
        return this.customTabsLauncher;
    }
}

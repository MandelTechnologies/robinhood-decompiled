package com.withpersona.sdk2.inquiry.launchers;

import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.IntentSenderRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResolvableApiLauncherModule.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/launchers/ResolvableApiLauncherModule;", "", "resolvableApiLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;)V", "launchers_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ResolvableApiLauncherModule {
    private final ActivityResultLauncher<IntentSenderRequest> resolvableApiLauncher;

    public ResolvableApiLauncherModule(ActivityResultLauncher<IntentSenderRequest> resolvableApiLauncher) {
        Intrinsics.checkNotNullParameter(resolvableApiLauncher, "resolvableApiLauncher");
        this.resolvableApiLauncher = resolvableApiLauncher;
    }

    public final ActivityResultLauncher<IntentSenderRequest> resolvableApiLauncher() {
        return this.resolvableApiLauncher;
    }
}

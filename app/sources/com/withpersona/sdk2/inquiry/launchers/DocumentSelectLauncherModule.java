package com.withpersona.sdk2.inquiry.launchers;

import androidx.view.result.ActivityResultLauncher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocumentSelectLauncherModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u0007R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/launchers/DocumentSelectLauncherModule;", "", "openDocumentResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;)V", "launchers_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class DocumentSelectLauncherModule {
    private final ActivityResultLauncher<String[]> openDocumentResultLauncher;

    public DocumentSelectLauncherModule(ActivityResultLauncher<String[]> openDocumentResultLauncher) {
        Intrinsics.checkNotNullParameter(openDocumentResultLauncher, "openDocumentResultLauncher");
        this.openDocumentResultLauncher = openDocumentResultLauncher;
    }

    public final ActivityResultLauncher<String[]> openDocumentResultLauncher() {
        return this.openDocumentResultLauncher;
    }
}

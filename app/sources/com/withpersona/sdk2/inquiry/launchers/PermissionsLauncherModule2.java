package com.withpersona.sdk2.inquiry.launchers;

import androidx.view.result.ActivityResultCallback;
import androidx.view.result.contract.ActivityResultContracts$RequestPermission;
import kotlin.Metadata;

/* compiled from: PermissionsLauncherModule.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m3636d2 = {"createRequestPermissionResultLauncher", "Lcom/withpersona/sdk2/inquiry/launchers/ReusableActivityResultLauncher;", "", "", "launchers_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.launchers.PermissionsLauncherModuleKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class PermissionsLauncherModule2 {
    public static final ReusableActivityResultLauncher<String, Boolean> createRequestPermissionResultLauncher() {
        return ReusableActivityResultLauncher2.createLauncherForActivityResult(new ActivityResultContracts$RequestPermission(), new ActivityResultCallback() { // from class: com.withpersona.sdk2.inquiry.launchers.PermissionsLauncherModuleKt$$ExternalSyntheticLambda0
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                PermissionsLauncherModule2.createRequestPermissionResultLauncher$lambda$0(((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createRequestPermissionResultLauncher$lambda$0(boolean z) {
        new RequestPermissionResult().sendResults(z);
    }
}

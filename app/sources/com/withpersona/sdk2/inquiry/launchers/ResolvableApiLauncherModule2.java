package com.withpersona.sdk2.inquiry.launchers;

import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.IntentSenderRequest;
import androidx.view.result.contract.ActivityResultContracts$StartIntentSenderForResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResolvableApiLauncherModule.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m3636d2 = {"createResolvableApiLauncher", "Lcom/withpersona/sdk2/inquiry/launchers/ReusableActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", "launchers_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.launchers.ResolvableApiLauncherModuleKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class ResolvableApiLauncherModule2 {
    public static final ReusableActivityResultLauncher<IntentSenderRequest, ActivityResult> createResolvableApiLauncher() {
        return new ReusableActivityResultLauncher<>(new ActivityResultContracts$StartIntentSenderForResult(), new ActivityResultCallback() { // from class: com.withpersona.sdk2.inquiry.launchers.ResolvableApiLauncherModuleKt$$ExternalSyntheticLambda0
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ResolvableApiLauncherModule2.createResolvableApiLauncher$lambda$0((ActivityResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createResolvableApiLauncher$lambda$0(ActivityResult success) {
        Intrinsics.checkNotNullParameter(success, "success");
        new ResolvableApiLauncherResult().sendResult(success);
    }
}

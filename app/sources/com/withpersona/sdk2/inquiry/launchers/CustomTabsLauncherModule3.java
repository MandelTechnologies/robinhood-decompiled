package com.withpersona.sdk2.inquiry.launchers;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.contract.ActivityResultContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomTabsLauncherModule.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m3636d2 = {"createCustomTabsLauncher", "Lcom/withpersona/sdk2/inquiry/launchers/ReusableActivityResultLauncher;", "Lcom/withpersona/sdk2/inquiry/launchers/CustomTabsArguments;", "", "launchers_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.launchers.CustomTabsLauncherModuleKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class CustomTabsLauncherModule3 {
    public static final ReusableActivityResultLauncher<CustomTabsLauncherModule2, Integer> createCustomTabsLauncher() {
        return new ReusableActivityResultLauncher<>(new ActivityResultContract<CustomTabsLauncherModule2, Integer>() { // from class: com.withpersona.sdk2.inquiry.launchers.CustomTabsLauncherModuleKt.createCustomTabsLauncher.1
            @Override // androidx.view.result.contract.ActivityResultContract
            public Intent createIntent(Context context, CustomTabsLauncherModule2 input) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                Intent intent = input.getIntent().intent;
                Intrinsics.checkNotNullExpressionValue(intent, "intent");
                intent.setData(Uri.parse(input.getUrl()));
                return intent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.view.result.contract.ActivityResultContract
            public Integer parseResult(int resultCode, Intent intent) {
                return Integer.valueOf(resultCode);
            }
        }, new ActivityResultCallback() { // from class: com.withpersona.sdk2.inquiry.launchers.CustomTabsLauncherModuleKt$$ExternalSyntheticLambda0
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                CustomTabsLauncherModule3.createCustomTabsLauncher$lambda$0(((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCustomTabsLauncher$lambda$0(int i) {
        new CustomTabsLauncherModule4().sendResult(i);
    }
}

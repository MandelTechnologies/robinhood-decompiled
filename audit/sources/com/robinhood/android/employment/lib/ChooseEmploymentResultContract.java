package com.robinhood.android.employment.lib;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.view.result.contract.ActivityResultContract;
import com.robinhood.models.p355ui.identi.UiEmploymentInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChooseEmploymentResultContract.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/employment/lib/ChooseEmploymentResultContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/content/Intent;", "Lcom/robinhood/models/ui/identi/UiEmploymentInfo;", "<init>", "()V", "createIntent", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "feature-lib-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ChooseEmploymentResultContract extends ActivityResultContract<Intent, UiEmploymentInfo> {
    @Override // androidx.view.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Intent input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return input;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.view.result.contract.ActivityResultContract
    public UiEmploymentInfo parseResult(int resultCode, Intent intent) {
        Bundle extras;
        if (resultCode != -1 || intent == null || (extras = intent.getExtras()) == null) {
            return null;
        }
        return (UiEmploymentInfo) extras.getParcelable(ChooseEmploymentResult.EXTRA_EMPLOYMENT_RESULT);
    }
}

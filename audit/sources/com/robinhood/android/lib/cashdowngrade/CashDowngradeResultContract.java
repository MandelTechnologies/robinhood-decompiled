package com.robinhood.android.lib.cashdowngrade;

import android.content.Context;
import android.content.Intent;
import androidx.view.result.contract.ActivityResultContract;
import com.robinhood.android.models.cashdowngrade.CashDowngradeResult;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStateResultContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CashDowngradeResultContract.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u000e2\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/lib/cashdowngrade/CashDowngradeResultContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/content/Intent;", "Lcom/robinhood/android/models/cashdowngrade/CashDowngradeResult;", "<init>", "()V", "createIntent", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Companion", "lib-cash-downgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CashDowngradeResultContract extends ActivityResultContract<Intent, CashDowngradeResult> {
    public static final String EXTRA_PATHFINDER_RESULT = "pathfinder_result";

    @Override // androidx.view.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Intent input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return input;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.view.result.contract.ActivityResultContract
    public CashDowngradeResult parseResult(int resultCode, Intent intent) {
        UserViewStateResultContext.CashDowngradeResultContext cashDowngradeResultContext;
        if (intent == null || (cashDowngradeResultContext = (UserViewStateResultContext.CashDowngradeResultContext) intent.getParcelableExtra("pathfinder_result")) == null) {
            return null;
        }
        return cashDowngradeResultContext.getResult();
    }
}

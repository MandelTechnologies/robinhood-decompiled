package com.robinhood.android.lib.stepupverification;

import android.content.Context;
import android.content.Intent;
import androidx.view.result.contract.ActivityResultContract;
import com.robinhood.android.models.stepupverification.VerificationWorkflowResult;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStateResultContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerificationWorkflowResultContract.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/lib/stepupverification/VerificationWorkflowResultContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/robinhood/android/lib/stepupverification/VerificationWorkflow;", "Lcom/robinhood/android/models/stepupverification/VerificationWorkflowResult;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Companion", "lib-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class VerificationWorkflowResultContract extends ActivityResultContract<VerificationWorkflow, VerificationWorkflowResult> {
    public static final String EXTRA_PATHFINDER_RESULT = "pathfinder_result";
    public static final int $stable = 8;

    @Override // androidx.view.result.contract.ActivityResultContract
    public Intent createIntent(Context context, VerificationWorkflow input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intentPutExtra = new Intent(context, (Class<?>) VerificationWorkflowActivity.class).putExtra(VerificationWorkflowActivity.EXTRA_VERIFICATION_WORKFLOW, input);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.view.result.contract.ActivityResultContract
    public VerificationWorkflowResult parseResult(int resultCode, Intent intent) {
        UserViewStateResultContext.VerificationWorkflowResultContext verificationWorkflowResultContext;
        if (intent == null || (verificationWorkflowResultContext = (UserViewStateResultContext.VerificationWorkflowResultContext) intent.getParcelableExtra("pathfinder_result")) == null) {
            return null;
        }
        return verificationWorkflowResultContext.getResult();
    }
}

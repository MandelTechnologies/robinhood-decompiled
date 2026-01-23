package com.robinhood.shared.security.workflow;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DeepLinkIntentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.shared.security.contracts.WorkflowIntentKey;
import com.robinhood.shared.user.contracts.auth.Login;
import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WorkflowDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/security/workflow/WorkflowDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class WorkflowDeeplinkTarget extends DeeplinkTarget4 {
    public static final WorkflowDeeplinkTarget INSTANCE = new WorkflowDeeplinkTarget();
    public static final int $stable = 8;

    private WorkflowDeeplinkTarget() {
        super("workflow", false, false, true, false, false, null, 102, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        IntentKey login;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("id");
        if (queryParameter == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        UUID uuid = StringsKt.toUuid(queryParameter);
        Navigator navigator = deeplinkContext.getNavigator();
        Context context = deeplinkContext.getContext();
        if (deeplinkContext.getDeviceIdExperimentState(WorkflowExperiments.INSTANCE)) {
            login = new DeepLinkIntentKey.UnrecognizedDeepLink(false, false, null, 6, null);
        } else {
            login = !deeplinkContext.isLoggedIn() ? new Login(null, deeplinkContext.getUri(), false, 5, null) : new WorkflowIntentKey(uuid);
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(navigator, context, login, null, false, 12, null)};
    }
}

package com.robinhood.shared.onboarding.tin;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.onboarding.contracts.TinsOverviewIntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TinsOverviewDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/tin/TinsOverviewDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-tin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class TinsOverviewDeeplinkTarget extends DeeplinkTarget4 {
    public static final TinsOverviewDeeplinkTarget INSTANCE = new TinsOverviewDeeplinkTarget();
    public static final int $stable = 8;

    private TinsOverviewDeeplinkTarget() {
        super("onboarding_tins_overview", false, false, false, false, false, null, 110, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        Uri uri = deeplinkContext.getUri();
        String queryParameter = uri.getQueryParameter("completion_checkpoint");
        String queryParameter2 = uri.getQueryParameter("endpoint");
        Navigator navigator = deeplinkContext.getNavigator();
        Context context = deeplinkContext.getContext();
        if (queryParameter == null) {
            queryParameter = "native_deeplink_completed";
        }
        if (queryParameter2 == null) {
            queryParameter2 = "onboarding";
        }
        String queryParameter3 = uri.getQueryParameter("onboarding_id");
        if (queryParameter3 == null) {
            queryParameter3 = "apac_onboarding";
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(navigator, context, new TinsOverviewIntentKey(queryParameter, queryParameter2, queryParameter3), null, false, 12, null)};
    }
}

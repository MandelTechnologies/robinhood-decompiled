package com.robinhood.shared.support;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DeepLinkIntentKey;
import com.robinhood.shared.support.contracts.InAppSurveyFragmentKey;
import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InAppSurveyDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/support/InAppSurveyDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class InAppSurveyDeeplinkTarget extends DeeplinkTarget4 {
    public static final InAppSurveyDeeplinkTarget INSTANCE = new InAppSurveyDeeplinkTarget();
    public static final int $stable = 8;

    private InAppSurveyDeeplinkTarget() {
        super("in_app_survey_v1", false, false, false, false, false, null, 102, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intent intentCreateIntent$default;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        Intent mainIntent = deeplinkContext.getMainIntent();
        String queryParameter = deeplinkContext.getUri().getQueryParameter("id");
        UUID uuid = queryParameter != null ? StringsKt.toUuid(queryParameter) : null;
        if (uuid != null) {
            intentCreateIntent$default = Navigator.DefaultImpls.createIntentForDialogFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new InAppSurveyFragmentKey(uuid), null, 4, null);
        } else {
            intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new DeepLinkIntentKey.UnrecognizedDeepLink(false, false, null, 7, null), null, false, 12, null);
        }
        return new Intent[]{mainIntent, intentCreateIntent$default};
    }
}

package com.robinhood.android.oauth.targets;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DeepLinkIntentKey;
import com.robinhood.android.oauth.OAuthDeeplinkExperiment;
import com.robinhood.android.security.contracts.OAuthWaitingFragmentKey;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.utils.logging.CrashReporter;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OAuthDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/oauth/targets/OAuthDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-oauth_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class OAuthDeeplinkTarget extends DeeplinkTarget4 {
    public static final OAuthDeeplinkTarget INSTANCE = new OAuthDeeplinkTarget();
    public static final int $stable = 8;

    private OAuthDeeplinkTarget() {
        super("oauth", (ExperimentDeclaration) OAuthDeeplinkExperiment.INSTANCE, false, 4, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("client_id");
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("redirect_uri");
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("scope");
        String queryParameter4 = deeplinkContext.getUri().getQueryParameter("state");
        if (queryParameter == null || queryParameter2 == null || queryParameter3 == null) {
            CrashReporter.Companion companion = CrashReporter.INSTANCE;
            companion.log("clientId: " + queryParameter + ", redirectUri: " + queryParameter2 + ", scope: " + queryParameter3);
            CrashReporter.DefaultImpls.reportNonFatal$default(companion, new Exception("Missing parameter in OAuth deeplink"), false, null, 6, null);
            return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new DeepLinkIntentKey.UnrecognizedDeepLink(false, false, null, 7, null), null, false, 12, null)};
        }
        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new OAuthWaitingFragmentKey(queryParameter, queryParameter2, string2, queryParameter3, queryParameter4), false, false, false, null, false, true, false, false, false, null, false, 8052, null)};
    }
}

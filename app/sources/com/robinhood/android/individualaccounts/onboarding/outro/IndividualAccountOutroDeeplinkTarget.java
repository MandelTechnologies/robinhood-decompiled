package com.robinhood.android.individualaccounts.onboarding.outro;

import android.content.Intent;
import android.net.Uri;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.lib.accounts.MultipleIndividualAccountsExperiment2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IndividualAccountOutroDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "APPLICATION_ID_QUERY_PARAM", "", "SOURCE_QUERY_PARAM", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "build", "Landroid/net/Uri;", "applicationId", "source", "feature-individual-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class IndividualAccountOutroDeeplinkTarget extends DeeplinkTarget4 {
    private static final String APPLICATION_ID_QUERY_PARAM = "application_id";
    private static final String SOURCE_QUERY_PARAM = "source";
    public static final IndividualAccountOutroDeeplinkTarget INSTANCE = new IndividualAccountOutroDeeplinkTarget();
    public static final int $stable = 8;

    private IndividualAccountOutroDeeplinkTarget() {
        super("individual_account_outro", (ExperimentDeclaration) MultipleIndividualAccountsExperiment2.INSTANCE, false, 4, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("application_id");
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("source");
        if (queryParameter == null) {
            CrashReporter.INSTANCE.reportNonFatal(new IllegalStateException("Launched individual account outro without an id"), true, new EventMetadata(SentryTeam.RAD, null, null, 6, null));
            return new Intent[]{deeplinkContext.getMainIntent()};
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new HostIntentKey.ShowFragmentInStandaloneRdsActivity(new IndividualAccountOutroFragmentKey(queryParameter, queryParameter2), false, false, false, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, false, 12, null)};
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Uri build(String applicationId, String source) {
        String str;
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        if (source != null) {
            str = "&source=" + source;
            if (str == null) {
                str = "";
            }
        }
        return Uri.parse("robinhood://" + getPath() + "?application_id=" + applicationId + str);
    }
}

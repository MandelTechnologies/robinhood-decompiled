package com.robinhood.android.investorprofile.targets;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.investorprofile.questionnaire.QuestionnaireLoggingParams;
import com.robinhood.shared.questionnaire.contracts.Questionnaire;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Targets.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/targets/InvestmentProfileDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InvestmentProfileDeeplinkTarget extends DeeplinkTarget4 {
    public static final InvestmentProfileDeeplinkTarget INSTANCE = new InvestmentProfileDeeplinkTarget();
    public static final int $stable = 8;

    private InvestmentProfileDeeplinkTarget() {
        super("investment_profile", false, false, false, true, false, null, 102, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("context");
        if (queryParameter == null) {
            return new Intent[0];
        }
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("account_number");
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("reference_key");
        String queryParameter4 = deeplinkContext.getUri().getQueryParameter("required");
        boolean z = queryParameter4 != null && Boolean.parseBoolean(queryParameter4);
        String queryParameter5 = deeplinkContext.getUri().getQueryParameter("include_questions_already_answered");
        boolean z2 = queryParameter5 != null && Boolean.parseBoolean(queryParameter5);
        String queryParameter6 = deeplinkContext.getUri().getQueryParameter("source");
        if (queryParameter6 == null) {
            queryParameter6 = "";
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new Questionnaire(z, queryParameter, queryParameter2 == null ? "" : queryParameter2, null, queryParameter3, null, false, false, false, false, false, new QuestionnaireLoggingParams(queryParameter6, null, 2, null), null, z2, false, false, false, false, null, null, 1038312, null), null, false, 12, null)};
    }
}

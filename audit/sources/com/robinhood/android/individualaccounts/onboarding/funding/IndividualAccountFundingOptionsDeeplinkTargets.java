package com.robinhood.android.individualaccounts.onboarding.funding;

import android.content.Intent;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndividualAccountFundingOptionsDeeplinkTargets.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/individualaccounts/onboarding/funding/IndividualAccountFundingOptionsSheetDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "ACCOUNT_NUMBER_QUERY_PARAM", "", "TRANSFER_TYPE_QUERY_PARAM", "ENTRY_POINT_QUERY_PARAM", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-individual-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.individualaccounts.onboarding.funding.IndividualAccountFundingOptionsSheetDeeplinkTarget, reason: use source file name */
/* loaded from: classes10.dex */
public final class IndividualAccountFundingOptionsDeeplinkTargets extends DeeplinkTarget4 {
    private static final String ACCOUNT_NUMBER_QUERY_PARAM = "account_number";
    private static final String ENTRY_POINT_QUERY_PARAM = "entry_point";
    private static final String TRANSFER_TYPE_QUERY_PARAM = "transfer_type";
    public static final IndividualAccountFundingOptionsDeeplinkTargets INSTANCE = new IndividualAccountFundingOptionsDeeplinkTargets();
    public static final int $stable = 8;

    private IndividualAccountFundingOptionsDeeplinkTargets() {
        super("add_funds_bottom_sheet", false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("account_number");
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter(TRANSFER_TYPE_QUERY_PARAM);
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter(ENTRY_POINT_QUERY_PARAM);
        IndividualAccountFundingBottomSheetKey2 individualAccountFundingBottomSheetKey2 = null;
        if (queryParameter2 != null) {
            lowerCase = queryParameter2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        if (Intrinsics.areEqual(lowerCase, "assets")) {
            individualAccountFundingBottomSheetKey2 = IndividualAccountFundingBottomSheetKey2.ASSETS;
        } else if (Intrinsics.areEqual(lowerCase, AnalyticsStrings.BUTTON_GROUP_TITLE_CASH)) {
            individualAccountFundingBottomSheetKey2 = IndividualAccountFundingBottomSheetKey2.CASH;
        }
        if (queryParameter == null || individualAccountFundingBottomSheetKey2 == null) {
            CrashReporter.INSTANCE.reportNonFatal(new IllegalStateException("Launched funding options sheet without an account number"), true, new EventMetadata(SentryTeam.RAD, null, null, 6, null));
            return new Intent[]{deeplinkContext.getMainIntent()};
        }
        return new Intent[]{Navigator.DefaultImpls.createIntentForDialogFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new IndividualAccountFundingBottomSheetKey(queryParameter, individualAccountFundingBottomSheetKey2, queryParameter3), null, 4, null)};
    }
}

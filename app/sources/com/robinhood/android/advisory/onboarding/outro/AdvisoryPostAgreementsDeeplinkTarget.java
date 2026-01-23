package com.robinhood.android.advisory.onboarding.outro;

import android.content.Intent;
import android.net.Uri;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.contracts.AdvisoryPostAgreementsKey;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.regiongate.AdvisoryRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.logging.CrashReporter;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AdvisoryPostAgreementsDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rJ \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "APPLICATION_ID_QUERY_PARAM", "", "ACCOUNT_TYPE_QUERY_PARAM", "SOURCE_QUERY_PARAM", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "construct", "Landroid/net/Uri;", "applicationId", "Ljava/util/UUID;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "source", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AdvisoryPostAgreementsDeeplinkTarget extends DeeplinkTarget4 {
    public static final String ACCOUNT_TYPE_QUERY_PARAM = "brokerage_account_type";
    public static final String APPLICATION_ID_QUERY_PARAM = "application_id";
    public static final String SOURCE_QUERY_PARAM = "source";
    public static final AdvisoryPostAgreementsDeeplinkTarget INSTANCE = new AdvisoryPostAgreementsDeeplinkTarget();
    public static final int $stable = 8;

    private AdvisoryPostAgreementsDeeplinkTarget() {
        super("advisory_post_agreements", (RegionGate) AdvisoryRegionGate.INSTANCE, (ExperimentDeclaration) null, false, true, 4, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("application_id");
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter(ACCOUNT_TYPE_QUERY_PARAM);
        BrokerageAccountType brokerageAccountTypeFromServerValue = queryParameter2 != null ? BrokerageAccountType.INSTANCE.fromServerValue(queryParameter2) : null;
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("source");
        if (queryParameter == null || brokerageAccountTypeFromServerValue == null) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Launched advisory post agreements without an id"), true, null, 4, null);
            return new Intent[0];
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new HostIntentKey.ShowFragmentInStandaloneRdsActivity(new AdvisoryPostAgreementsKey(brokerageAccountTypeFromServerValue, StringsKt.toUuid(queryParameter), queryParameter3), false, false, false, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, false, 12, null)};
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Uri construct(UUID applicationId, BrokerageAccountType brokerageAccountType, String source) {
        String str;
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        if (source != null) {
            str = "&source=" + source;
            if (str == null) {
                str = "";
            }
        }
        return Uri.parse("robinhood://" + getPath() + "?application_id=" + applicationId + "&brokerage_account_type=" + brokerageAccountType.getServerValue() + str);
    }
}

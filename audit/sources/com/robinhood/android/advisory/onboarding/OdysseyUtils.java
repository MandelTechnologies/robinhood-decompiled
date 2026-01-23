package com.robinhood.android.advisory.onboarding;

import android.content.Context;
import com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDeeplinkTarget;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onboarding.contracts.GenericSdFlowIntentKey;
import com.robinhood.models.api.BrokerageAccountType;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OdysseyUtils.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"ADVISORY_AGREEMENT_ODYSSEY_FLOW", "", "APPLICATION_ID_QUERY_PARAM", "APPLICATION_TYPE_QUERY_PARAM", "RETIREMENT_APPLICATION_TYPE_VALUE", "launchManagedAgreements", "", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "applicationId", "Ljava/util/UUID;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "source", "feature-advisory-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.OdysseyUtilsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class OdysseyUtils {
    public static final String ADVISORY_AGREEMENT_ODYSSEY_FLOW = "advisory_agreement";
    public static final String APPLICATION_ID_QUERY_PARAM = "application_id";
    public static final String APPLICATION_TYPE_QUERY_PARAM = "application_type";
    public static final String RETIREMENT_APPLICATION_TYPE_VALUE = "retirement";

    public static final void launchManagedAgreements(Navigator navigator, Context context, UUID applicationId, BrokerageAccountType brokerageAccountType, String str) {
        Map mapMapOf;
        Intrinsics.checkNotNullParameter(navigator, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        if (brokerageAccountType.isRetirement()) {
            mapMapOf = MapsKt.mapOf(Tuples4.m3642to("application_id", applicationId.toString()), Tuples4.m3642to(APPLICATION_TYPE_QUERY_PARAM, "retirement"));
        } else {
            mapMapOf = MapsKt.mapOf(Tuples4.m3642to("application_id", applicationId.toString()));
        }
        Navigator.DefaultImpls.startActivity$default(navigator, context, new GenericSdFlowIntentKey(ADVISORY_AGREEMENT_ODYSSEY_FLOW, false, null, AdvisoryPostAgreementsDeeplinkTarget.INSTANCE.construct(applicationId, brokerageAccountType, str), mapMapOf, null, false, null, null, 486, null), null, false, null, null, 60, null);
    }
}

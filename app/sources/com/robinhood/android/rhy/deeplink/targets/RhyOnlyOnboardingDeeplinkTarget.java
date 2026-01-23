package com.robinhood.android.rhy.deeplink.targets;

import android.content.Intent;
import android.net.Uri;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DeepLinkIntentKey;
import com.robinhood.android.onboarding.contracts.GenericSdFlowIntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyTargets.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/rhy/deeplink/targets/RhyOnlyOnboardingDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyOnlyOnboardingDeeplinkTarget extends DeeplinkTarget4 {
    public static final RhyOnlyOnboardingDeeplinkTarget INSTANCE = new RhyOnlyOnboardingDeeplinkTarget();

    private RhyOnlyOnboardingDeeplinkTarget() {
        super(DeepLinkPath.RHY_ONLY_ONBOARDING.getPath(), (RegionGate) SpendingRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Uri uri;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        try {
            uri = Uri.parse(deeplinkContext.getUri().getQueryParameter("exit_deep_link_override"));
        } catch (Throwable unused) {
            uri = null;
        }
        String queryParameter = deeplinkContext.getUri().getQueryParameter("path");
        if (queryParameter == null) {
            return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new DeepLinkIntentKey.UnrecognizedDeepLink(false, false, null, 7, null), null, false, 12, null)};
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new GenericSdFlowIntentKey(queryParameter, false, null, DeepLinkPath.RHY_NON_DEBIT_CARD_POST_SIGN_UP.buildUri(MapsKt.mapOf(Tuples4.m3642to("exit_deep_link_override", String.valueOf(uri)))), null, null, false, null, null, HttpStatusCode.BAD_GATEWAY_502, null), null, false, 12, null)};
    }
}

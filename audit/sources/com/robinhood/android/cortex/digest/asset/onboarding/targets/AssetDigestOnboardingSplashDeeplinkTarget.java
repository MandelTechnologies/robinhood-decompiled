package com.robinhood.android.cortex.digest.asset.onboarding.targets;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.cortex.contracts.AssetDigestOnboardingFlowType;
import com.robinhood.android.cortex.contracts.AssetDigestOnboardingFragmentKey;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.AssetDigestsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AssetDigestOnboardingSplashDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/onboarding/targets/AssetDigestOnboardingSplashDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-cortex-digest-asset-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AssetDigestOnboardingSplashDeeplinkTarget extends DeeplinkTarget4 {
    public static final AssetDigestOnboardingSplashDeeplinkTarget INSTANCE = new AssetDigestOnboardingSplashDeeplinkTarget();
    public static final int $stable = 8;

    private AssetDigestOnboardingSplashDeeplinkTarget() {
        super("cortex_digest_onboarding", (RegionGate) AssetDigestsRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        AssetDigestOnboardingFlowType assetDigestOnboardingFlowType;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        Navigator navigator = deeplinkContext.getNavigator();
        Context context = deeplinkContext.getContext();
        String queryParameter = deeplinkContext.getUri().getQueryParameter("source");
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("flow_type");
        if (queryParameter2 == null || (assetDigestOnboardingFlowType = (AssetDigestOnboardingFlowType) AssetDigestOnboardingFlowType.INSTANCE.fromServerValue(queryParameter2)) == null) {
            assetDigestOnboardingFlowType = AssetDigestOnboardingFlowType.UNSPECIFIED;
        }
        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, new AssetDigestOnboardingFragmentKey(false, queryParameter, assetDigestOnboardingFlowType, 1, null), false, false, false, null, false, true, false, false, false, null, false, 8052, null)};
    }
}

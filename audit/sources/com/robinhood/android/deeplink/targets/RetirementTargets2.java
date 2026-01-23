package com.robinhood.android.deeplink.targets;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.retirement.contracts.RetirementLearnAndEarnReward;
import com.robinhood.experiments.ExperimentDeclaration;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementTargets.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/RetirementLearnAndEarnRewardDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.deeplink.targets.RetirementLearnAndEarnRewardDeeplinkTarget, reason: use source file name */
/* loaded from: classes2.dex */
public final class RetirementTargets2 extends DeeplinkTarget4 {
    public static final RetirementTargets2 INSTANCE = new RetirementTargets2();
    public static final int $stable = 8;

    private RetirementTargets2() {
        super(DeepLinkPath.RETIREMENT_LEARN_AND_EARN_REWARD.getPath(), (RegionGate) RetirementRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intent mainIntent;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("reward_id");
        if (queryParameter != null) {
            Navigator navigator = deeplinkContext.getNavigator();
            Context context = deeplinkContext.getContext();
            UUID uuidFromString = UUID.fromString(queryParameter);
            Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
            mainIntent = Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, new RetirementLearnAndEarnReward(uuidFromString), false, false, false, null, false, true, false, false, false, null, false, 8052, null);
        } else {
            mainIntent = deeplinkContext.getMainIntent();
        }
        return new Intent[]{mainIntent};
    }
}

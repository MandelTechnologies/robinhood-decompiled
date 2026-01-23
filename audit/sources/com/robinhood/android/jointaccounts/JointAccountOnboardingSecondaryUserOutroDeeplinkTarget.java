package com.robinhood.android.jointaccounts;

import android.content.Intent;
import com.robinhood.android.account.contracts.jointaccounts.JointAccountOnboardingSecondaryOutro;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.regiongate.JointAccountsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeeplinkTargets.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/JointAccountOnboardingSecondaryUserOutroDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class JointAccountOnboardingSecondaryUserOutroDeeplinkTarget extends DeeplinkTarget4 {
    public static final JointAccountOnboardingSecondaryUserOutroDeeplinkTarget INSTANCE = new JointAccountOnboardingSecondaryUserOutroDeeplinkTarget();
    public static final int $stable = 8;

    private JointAccountOnboardingSecondaryUserOutroDeeplinkTarget() {
        super("joint_account_onboarding_secondary_post_agreements", (RegionGate) JointAccountsRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        return DeeplinkTargetsKt.createIntentsForFragmentWithInvitationId(deeplinkContext, new Function1() { // from class: com.robinhood.android.jointaccounts.JointAccountOnboardingSecondaryUserOutroDeeplinkTarget$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JointAccountOnboardingSecondaryUserOutroDeeplinkTarget.getIntents$lambda$0((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FragmentKey getIntents$lambda$0(String invitationId) {
        Intrinsics.checkNotNullParameter(invitationId, "invitationId");
        return new JointAccountOnboardingSecondaryOutro(invitationId);
    }
}

package com.robinhood.android.jointaccounts;

import android.content.Intent;
import com.robinhood.android.account.contracts.jointaccounts.JointAccountOnboardingSecondaryIntroShim;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeeplinkTargets.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/JointAccountOnboardingSecondaryUserIntroDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class JointAccountOnboardingSecondaryUserIntroDeeplinkTarget extends DeeplinkTarget4 {
    public static final JointAccountOnboardingSecondaryUserIntroDeeplinkTarget INSTANCE = new JointAccountOnboardingSecondaryUserIntroDeeplinkTarget();
    public static final int $stable = 8;

    private JointAccountOnboardingSecondaryUserIntroDeeplinkTarget() {
        super(DeeplinkTargetsKt.ACCEPT_JOINT_ACCOUNT_DEEPLINK_PATH, false, true, false, false, false, null, 106, null);
    }

    /* compiled from: DeeplinkTargets.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.jointaccounts.JointAccountOnboardingSecondaryUserIntroDeeplinkTarget$getIntents$1 */
    /* synthetic */ class C199821 extends FunctionReferenceImpl implements Function1<String, JointAccountOnboardingSecondaryIntroShim> {
        public static final C199821 INSTANCE = new C199821();

        C199821() {
            super(1, JointAccountOnboardingSecondaryIntroShim.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final JointAccountOnboardingSecondaryIntroShim invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return new JointAccountOnboardingSecondaryIntroShim(p0);
        }
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        return DeeplinkTargetsKt.createIntentsForActivityWithInvitationId(deeplinkContext, C199821.INSTANCE);
    }
}

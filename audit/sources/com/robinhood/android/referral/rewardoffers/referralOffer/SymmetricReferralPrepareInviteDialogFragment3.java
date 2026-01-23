package com.robinhood.android.referral.rewardoffers.referralOffer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SymmetricReferralPrepareInviteDialogFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.ComposableSingletons$SymmetricReferralPrepareInviteDialogFragmentKt$lambda$1585655647$1, reason: use source file name */
/* loaded from: classes5.dex */
final class SymmetricReferralPrepareInviteDialogFragment3 implements Function2<Composer, Integer, Unit> {
    public static final SymmetricReferralPrepareInviteDialogFragment3 INSTANCE = new SymmetricReferralPrepareInviteDialogFragment3();

    SymmetricReferralPrepareInviteDialogFragment3() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1585655647, i, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.ComposableSingletons$SymmetricReferralPrepareInviteDialogFragmentKt.lambda$1585655647.<anonymous> (SymmetricReferralPrepareInviteDialogFragment.kt:95)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.ComposableSingletons$SymmetricReferralPrepareInviteDialogFragmentKt$lambda$1585655647$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        SymmetricReferralPrepareInviteDialogFragment5.ReferralInviteDialog("Preparing Bob's invite", "Cancel", (Function0) objRememberedValue, composer, 438);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

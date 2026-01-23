package com.robinhood.android.referral.rewardoffers.referralOffer.sdui;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ReferralOfferV2SduiFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ComposableSingletons$ReferralOfferV2SduiFragmentKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ReferralOfferV2SduiFragment2 {
    public static final ReferralOfferV2SduiFragment2 INSTANCE = new ReferralOfferV2SduiFragment2();

    /* renamed from: lambda$-1550515367, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9209lambda$1550515367 = ComposableLambda3.composableLambdaInstance(-1550515367, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ComposableSingletons$ReferralOfferV2SduiFragmentKt$lambda$-1550515367$1
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
                ComposerKt.traceEventStart(-1550515367, i, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ComposableSingletons$ReferralOfferV2SduiFragmentKt.lambda$-1550515367.<anonymous> (ReferralOfferV2SduiFragment.kt:120)");
            }
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.HISTORY_24), StringResources_androidKt.stringResource(C11048R.string.general_action_search, composer, 0), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size24.$stable, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1550515367$feature_referral_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m18088getLambda$1550515367$feature_referral_externalDebug() {
        return f9209lambda$1550515367;
    }
}

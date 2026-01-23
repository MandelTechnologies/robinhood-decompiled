package com.robinhood.android.referral.lib.rewardOfferDetail.p235ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RewardOfferDetailsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.referral.lib.rewardOfferDetail.ui.ComposableSingletons$RewardOfferDetailsComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RewardOfferDetailsComposable {
    public static final RewardOfferDetailsComposable INSTANCE = new RewardOfferDetailsComposable();

    /* renamed from: lambda$-992363600, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9207lambda$992363600 = ComposableLambda3.composableLambdaInstance(-992363600, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.lib.rewardOfferDetail.ui.ComposableSingletons$RewardOfferDetailsComposableKt$lambda$-992363600$1
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
                ComposerKt.traceEventStart(-992363600, i, -1, "com.robinhood.android.referral.lib.rewardOfferDetail.ui.ComposableSingletons$RewardOfferDetailsComposableKt.lambda$-992363600.<anonymous> (RewardOfferDetailsComposable.kt:176)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-992363600$feature_lib_referral_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m18039getLambda$992363600$feature_lib_referral_externalDebug() {
        return f9207lambda$992363600;
    }
}

package com.robinhood.android.referral.rewardoffers.offersList;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.referral.C26659R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RewardOffersListComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.referral.rewardoffers.offersList.ComposableSingletons$RewardOffersListComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RewardOffersListComposable {
    public static final RewardOffersListComposable INSTANCE = new RewardOffersListComposable();

    /* renamed from: lambda$-526833735, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9208lambda$526833735 = ComposableLambda3.composableLambdaInstance(-526833735, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.offersList.ComposableSingletons$RewardOffersListComposableKt$lambda$-526833735$1
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
                ComposerKt.traceEventStart(-526833735, i, -1, "com.robinhood.android.referral.rewardoffers.offersList.ComposableSingletons$RewardOffersListComposableKt.lambda$-526833735.<anonymous> (RewardOffersListComposable.kt:67)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C26659R.string.reward_offers_activity_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-526833735$feature_referral_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m18057getLambda$526833735$feature_referral_externalDebug() {
        return f9208lambda$526833735;
    }
}

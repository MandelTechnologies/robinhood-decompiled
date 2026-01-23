package com.robinhood.android.engagement.depositincentive;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.engagement.depositincentive.model.DepositIncentivePillData;
import com.robinhood.models.api.bonfire.transfer.rewarddetail.ApiTransferRewardDetailResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: DepositIncentivePillComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.engagement.depositincentive.ComposableSingletons$DepositIncentivePillComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class DepositIncentivePillComposable {
    public static final DepositIncentivePillComposable INSTANCE = new DepositIncentivePillComposable();
    private static Function2<Composer, Integer, Unit> lambda$1953785920 = ComposableLambda3.composableLambdaInstance(1953785920, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.engagement.depositincentive.ComposableSingletons$DepositIncentivePillComposableKt$lambda$1953785920$1
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
                ComposerKt.traceEventStart(1953785920, i, -1, "com.robinhood.android.engagement.depositincentive.ComposableSingletons$DepositIncentivePillComposableKt.lambda$1953785920.<anonymous> (DepositIncentivePillComposable.kt:126)");
            }
            DepositIncentivePillComposable3.DepositIncentivePillComposable(new DepositIncentivePillData("$5 reward", "gift_16", "deposit_incentive_pill", ApiTransferRewardDetailResponse.Pill.RewardPillType.INFO_TAG), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1953785920$lib_deposit_incentive_externalRelease() {
        return lambda$1953785920;
    }
}

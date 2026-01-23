package com.robinhood.android.referral.rewardclaims;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardClaimingComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.referral.rewardclaims.ComposableSingletons$RewardClaimingComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RewardClaimingComposable {
    public static final RewardClaimingComposable INSTANCE = new RewardClaimingComposable();
    private static Function2<Composer, Integer, Unit> lambda$1103142514 = ComposableLambda3.composableLambdaInstance(1103142514, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardclaims.ComposableSingletons$RewardClaimingComposableKt$lambda$1103142514$1
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
                ComposerKt.traceEventStart(1103142514, i, -1, "com.robinhood.android.referral.rewardclaims.ComposableSingletons$RewardClaimingComposableKt.lambda$1103142514.<anonymous> (RewardClaimingComposable.kt:82)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$828286689 = ComposableLambda3.composableLambdaInstance(828286689, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardclaims.ComposableSingletons$RewardClaimingComposableKt$lambda$828286689$1
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
                ComposerKt.traceEventStart(828286689, i, -1, "com.robinhood.android.referral.rewardclaims.ComposableSingletons$RewardClaimingComposableKt.lambda$828286689.<anonymous> (RewardClaimingComposable.kt:142)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<Row5, Composer, Integer, Unit> lambda$1920284364 = ComposableLambda3.composableLambdaInstance(1920284364, false, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardclaims.ComposableSingletons$RewardClaimingComposableKt$lambda$1920284364$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1920284364, i, -1, "com.robinhood.android.referral.rewardclaims.ComposableSingletons$RewardClaimingComposableKt.lambda$1920284364.<anonymous> (RewardClaimingComposable.kt:143)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1103142514$feature_referral_externalDebug() {
        return lambda$1103142514;
    }

    public final Function3<Row5, Composer, Integer, Unit> getLambda$1920284364$feature_referral_externalDebug() {
        return lambda$1920284364;
    }

    public final Function2<Composer, Integer, Unit> getLambda$828286689$feature_referral_externalDebug() {
        return lambda$828286689;
    }
}

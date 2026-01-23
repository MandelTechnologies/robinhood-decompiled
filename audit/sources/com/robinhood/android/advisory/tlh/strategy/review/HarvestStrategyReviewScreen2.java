package com.robinhood.android.advisory.tlh.strategy.review;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.advisory.tlh.Components2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HarvestStrategyReviewScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.tlh.strategy.review.ComposableSingletons$HarvestStrategyReviewScreenKt$lambda$303180762$1, reason: use source file name */
/* loaded from: classes7.dex */
final class HarvestStrategyReviewScreen2 implements Function2<Composer, Integer, Unit> {
    public static final HarvestStrategyReviewScreen2 INSTANCE = new HarvestStrategyReviewScreen2();

    HarvestStrategyReviewScreen2() {
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
            ComposerKt.traceEventStart(303180762, i, -1, "com.robinhood.android.advisory.tlh.strategy.review.ComposableSingletons$HarvestStrategyReviewScreenKt.lambda$303180762.<anonymous> (HarvestStrategyReviewScreen.kt:120)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.tlh.strategy.review.ComposableSingletons$HarvestStrategyReviewScreenKt$lambda$303180762$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Components2.TaxLossHarvestingScaffold((Function0) objRememberedValue, null, false, false, null, null, HarvestStrategyReviewScreen.INSTANCE.getLambda$322147395$feature_tax_loss_harvesting_externalDebug(), composer, 1572870, 62);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

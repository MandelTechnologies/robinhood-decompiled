package com.robinhood.android.advisory.tlh.strategy.review;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategyReview;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategyReviewRow;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HarvestStrategyReviewScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.tlh.strategy.review.ComposableSingletons$HarvestStrategyReviewScreenKt$lambda$322147395$1, reason: use source file name */
/* loaded from: classes7.dex */
final class HarvestStrategyReviewScreen3 implements Function3<PaddingValues, Composer, Integer, Unit> {
    public static final HarvestStrategyReviewScreen3 INSTANCE = new HarvestStrategyReviewScreen3();

    HarvestStrategyReviewScreen3() {
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
        invoke(paddingValues, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        if ((i & 6) == 0) {
            i |= composer.changed(paddingValues) ? 4 : 2;
        }
        if ((i & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(322147395, i, -1, "com.robinhood.android.advisory.tlh.strategy.review.ComposableSingletons$HarvestStrategyReviewScreenKt.lambda$322147395.<anonymous> (HarvestStrategyReviewScreen.kt:123)");
        }
        TaxLossHarvestStrategyReview taxLossHarvestStrategyReview = new TaxLossHarvestStrategyReview("Review trade estimates", "We’ll sell as many managed holdings as possible to maximize your potential tax savings. This typically takes 1 business day.", CollectionsKt.listOf((Object[]) new TaxLossHarvestStrategyReviewRow[]{new TaxLossHarvestStrategyReviewRow("Net realized gain", "Across selected accounts", "$2,000"), new TaxLossHarvestStrategyReviewRow("Est losses we’ll harvest", "Managed individual", "-$3950")}), new TaxLossHarvestStrategyReviewRow("Est net loss", null, "-$1,950"), "After we harvest losses, we’ll reinvest your money in ETFs for 30 days to maintain your current portfolio allocation and avoid wash sales. [Learn more]()", "Confirm");
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.tlh.strategy.review.ComposableSingletons$HarvestStrategyReviewScreenKt$lambda$322147395$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        HarvestStrategyReviewScreen4.HarvestStrategyReviewScreen(taxLossHarvestStrategyReview, (Function0) objRememberedValue, SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, paddingValues), 0.0f, 1, null), composer, 48, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

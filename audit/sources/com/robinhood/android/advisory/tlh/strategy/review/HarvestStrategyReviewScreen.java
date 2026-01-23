package com.robinhood.android.advisory.tlh.strategy.review;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: HarvestStrategyReviewScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.tlh.strategy.review.ComposableSingletons$HarvestStrategyReviewScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class HarvestStrategyReviewScreen {
    public static final HarvestStrategyReviewScreen INSTANCE = new HarvestStrategyReviewScreen();
    private static Function3<PaddingValues, Composer, Integer, Unit> lambda$322147395 = ComposableLambda3.composableLambdaInstance(322147395, false, HarvestStrategyReviewScreen3.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$303180762 = ComposableLambda3.composableLambdaInstance(303180762, false, HarvestStrategyReviewScreen2.INSTANCE);

    public final Function2<Composer, Integer, Unit> getLambda$303180762$feature_tax_loss_harvesting_externalDebug() {
        return lambda$303180762;
    }

    public final Function3<PaddingValues, Composer, Integer, Unit> getLambda$322147395$feature_tax_loss_harvesting_externalDebug() {
        return lambda$322147395;
    }
}

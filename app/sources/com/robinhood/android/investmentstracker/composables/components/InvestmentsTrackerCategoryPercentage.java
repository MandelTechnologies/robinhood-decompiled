package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: InvestmentsTrackerCategoryPercentage.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerCategoryPercentageKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestmentsTrackerCategoryPercentage {
    public static final InvestmentsTrackerCategoryPercentage INSTANCE = new InvestmentsTrackerCategoryPercentage();
    private static Function2<Composer, Integer, Unit> lambda$1407880995 = ComposableLambda3.composableLambdaInstance(1407880995, false, InvestmentsTrackerCategoryPercentage3.INSTANCE);

    /* renamed from: lambda$-934783346, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9070lambda$934783346 = ComposableLambda3.composableLambdaInstance(-934783346, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerCategoryPercentageKt$lambda$-934783346$1
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
                ComposerKt.traceEventStart(-934783346, i, -1, "com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerCategoryPercentageKt.lambda$-934783346.<anonymous> (InvestmentsTrackerCategoryPercentage.kt:35)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(InvestmentsTrackerCategoryPercentage.INSTANCE.getLambda$1407880995$feature_investments_tracker_externalDebug(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-934783346$feature_investments_tracker_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15595getLambda$934783346$feature_investments_tracker_externalDebug() {
        return f9070lambda$934783346;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1407880995$feature_investments_tracker_externalDebug() {
        return lambda$1407880995;
    }
}

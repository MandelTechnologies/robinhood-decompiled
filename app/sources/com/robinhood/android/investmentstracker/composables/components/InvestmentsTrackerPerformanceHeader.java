package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: InvestmentsTrackerPerformanceHeader.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerPerformanceHeaderKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestmentsTrackerPerformanceHeader {
    public static final InvestmentsTrackerPerformanceHeader INSTANCE = new InvestmentsTrackerPerformanceHeader();
    private static Function2<Composer, Integer, Unit> lambda$831275639 = ComposableLambda3.composableLambdaInstance(831275639, false, InvestmentsTrackerPerformanceHeader3.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$1190848674 = ComposableLambda3.composableLambdaInstance(1190848674, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerPerformanceHeaderKt$lambda$1190848674$1
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
                ComposerKt.traceEventStart(1190848674, i, -1, "com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerPerformanceHeaderKt.lambda$1190848674.<anonymous> (InvestmentsTrackerPerformanceHeader.kt:29)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(InvestmentsTrackerPerformanceHeader.INSTANCE.getLambda$831275639$feature_investments_tracker_externalDebug(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1190848674$feature_investments_tracker_externalDebug() {
        return lambda$1190848674;
    }

    public final Function2<Composer, Integer, Unit> getLambda$831275639$feature_investments_tracker_externalDebug() {
        return lambda$831275639;
    }
}

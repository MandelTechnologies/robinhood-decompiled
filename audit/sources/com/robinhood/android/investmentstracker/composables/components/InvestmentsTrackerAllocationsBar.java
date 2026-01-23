package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: InvestmentsTrackerAllocationsBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerAllocationsBarKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestmentsTrackerAllocationsBar {
    public static final InvestmentsTrackerAllocationsBar INSTANCE = new InvestmentsTrackerAllocationsBar();
    private static Function2<Composer, Integer, Unit> lambda$1174035363 = ComposableLambda3.composableLambdaInstance(1174035363, false, InvestmentsTrackerAllocationsBar3.INSTANCE);

    /* renamed from: lambda$-1539326450, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9069lambda$1539326450 = ComposableLambda3.composableLambdaInstance(-1539326450, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerAllocationsBarKt$lambda$-1539326450$1
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
                ComposerKt.traceEventStart(-1539326450, i, -1, "com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerAllocationsBarKt.lambda$-1539326450.<anonymous> (InvestmentsTrackerAllocationsBar.kt:23)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(InvestmentsTrackerAllocationsBar.INSTANCE.getLambda$1174035363$feature_investments_tracker_externalDebug(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1539326450$feature_investments_tracker_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15593getLambda$1539326450$feature_investments_tracker_externalDebug() {
        return f9069lambda$1539326450;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1174035363$feature_investments_tracker_externalDebug() {
        return lambda$1174035363;
    }
}

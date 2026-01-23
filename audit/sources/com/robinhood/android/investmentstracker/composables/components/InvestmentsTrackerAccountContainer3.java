package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: InvestmentsTrackerAccountContainer.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerAccountContainerKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestmentsTrackerAccountContainer3 {
    public static final InvestmentsTrackerAccountContainer3 INSTANCE = new InvestmentsTrackerAccountContainer3();

    /* renamed from: lambda$-2055320221, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9066lambda$2055320221 = ComposableLambda3.composableLambdaInstance(-2055320221, false, InvestmentsTrackerAccountContainer5.INSTANCE);

    /* renamed from: lambda$-1540980146, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9065lambda$1540980146 = ComposableLambda3.composableLambdaInstance(-1540980146, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerAccountContainerKt$lambda$-1540980146$1
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
                ComposerKt.traceEventStart(-1540980146, i, -1, "com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerAccountContainerKt.lambda$-1540980146.<anonymous> (InvestmentsTrackerAccountContainer.kt:68)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(InvestmentsTrackerAccountContainer3.INSTANCE.m15586getLambda$2055320221$feature_investments_tracker_externalDebug(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1540980146$feature_investments_tracker_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15585getLambda$1540980146$feature_investments_tracker_externalDebug() {
        return f9065lambda$1540980146;
    }

    /* renamed from: getLambda$-2055320221$feature_investments_tracker_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15586getLambda$2055320221$feature_investments_tracker_externalDebug() {
        return f9066lambda$2055320221;
    }
}

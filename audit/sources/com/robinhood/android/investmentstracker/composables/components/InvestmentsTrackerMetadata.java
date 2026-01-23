package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: InvestmentsTrackerMetadata.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerMetadataKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestmentsTrackerMetadata {
    public static final InvestmentsTrackerMetadata INSTANCE = new InvestmentsTrackerMetadata();

    /* renamed from: lambda$-1165705469, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9071lambda$1165705469 = ComposableLambda3.composableLambdaInstance(-1165705469, false, InvestmentsTrackerMetadata2.INSTANCE);

    /* renamed from: lambda$-1320015378, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9072lambda$1320015378 = ComposableLambda3.composableLambdaInstance(-1320015378, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerMetadataKt$lambda$-1320015378$1
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
                ComposerKt.traceEventStart(-1320015378, i, -1, "com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerMetadataKt.lambda$-1320015378.<anonymous> (InvestmentsTrackerMetadata.kt:38)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(InvestmentsTrackerMetadata.INSTANCE.m15600getLambda$1165705469$feature_investments_tracker_externalDebug(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1165705469$feature_investments_tracker_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15600getLambda$1165705469$feature_investments_tracker_externalDebug() {
        return f9071lambda$1165705469;
    }

    /* renamed from: getLambda$-1320015378$feature_investments_tracker_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15601getLambda$1320015378$feature_investments_tracker_externalDebug() {
        return f9072lambda$1320015378;
    }
}

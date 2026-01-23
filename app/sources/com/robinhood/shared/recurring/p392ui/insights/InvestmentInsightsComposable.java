package com.robinhood.shared.recurring.p392ui.insights;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: InvestmentInsightsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.recurring.ui.insights.ComposableSingletons$InvestmentInsightsComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class InvestmentInsightsComposable {
    public static final InvestmentInsightsComposable INSTANCE = new InvestmentInsightsComposable();

    /* renamed from: lambda$-1563608387, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9475lambda$1563608387 = ComposableLambda3.composableLambdaInstance(-1563608387, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.insights.ComposableSingletons$InvestmentInsightsComposableKt$lambda$-1563608387$1
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
                ComposerKt.traceEventStart(-1563608387, i, -1, "com.robinhood.shared.recurring.ui.insights.ComposableSingletons$InvestmentInsightsComposableKt.lambda$-1563608387.<anonymous> (InvestmentInsightsComposable.kt:85)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1563608387$lib_recurring_ui_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25648getLambda$1563608387$lib_recurring_ui_externalDebug() {
        return f9475lambda$1563608387;
    }
}

package com.robinhood.android.options.portfolioriskanalyzer.components.position;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerEquityPositionRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.ComposableSingletons$OptionsPortfolioRiskAnalyzerEquityPositionRowKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerEquityPositionRow {
    public static final OptionsPortfolioRiskAnalyzerEquityPositionRow INSTANCE = new OptionsPortfolioRiskAnalyzerEquityPositionRow();
    private static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> lambda$178180682 = ComposableLambda3.composableLambdaInstance(178180682, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.ComposableSingletons$OptionsPortfolioRiskAnalyzerEquityPositionRowKt$lambda$178180682$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(178180682, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.position.ComposableSingletons$OptionsPortfolioRiskAnalyzerEquityPositionRowKt.lambda$178180682.<anonymous> (OptionsPortfolioRiskAnalyzerEquityPositionRow.kt:160)");
            }
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer, 0, 5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$178180682$feature_options_portfolio_risk_analyzer_externalDebug */
    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> m2264x803ac32c() {
        return lambda$178180682;
    }
}

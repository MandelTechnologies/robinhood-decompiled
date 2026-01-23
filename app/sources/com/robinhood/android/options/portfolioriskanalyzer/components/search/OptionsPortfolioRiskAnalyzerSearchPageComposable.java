package com.robinhood.android.options.portfolioriskanalyzer.components.search;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.options.portfolioriskanalyzer.C23462R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionsPortfolioRiskAnalyzerSearchPageComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.ComposableSingletons$OptionsPortfolioRiskAnalyzerSearchPageComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerSearchPageComposable {
    public static final OptionsPortfolioRiskAnalyzerSearchPageComposable INSTANCE = new OptionsPortfolioRiskAnalyzerSearchPageComposable();

    /* renamed from: lambda$-92789392, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9148lambda$92789392 = ComposableLambda3.composableLambdaInstance(-92789392, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.ComposableSingletons$OptionsPortfolioRiskAnalyzerSearchPageComposableKt$lambda$-92789392$1
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
                ComposerKt.traceEventStart(-92789392, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.search.ComposableSingletons$OptionsPortfolioRiskAnalyzerSearchPageComposableKt.lambda$-92789392.<anonymous> (OptionsPortfolioRiskAnalyzerSearchPageComposable.kt:68)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C23462R.string.options_pra_search_topbar_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-92789392$feature_options_portfolio_risk_analyzer_externalDebug */
    public final Function2<Composer, Integer, Unit> m2270x249e9a8d() {
        return f9148lambda$92789392;
    }
}

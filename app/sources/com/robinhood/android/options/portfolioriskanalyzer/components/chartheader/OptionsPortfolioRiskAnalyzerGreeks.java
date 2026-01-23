package com.robinhood.android.options.portfolioriskanalyzer.components.chartheader;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.options.calculation.greeks.OptionsGreeks;
import com.robinhood.android.options.portfolioriskanalyzer.C23462R;
import com.robinhood.android.options.portfolioriskanalyzer.components.OptionsPortfolioRiskAnalyzerDataCellRow;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: OptionsPortfolioRiskAnalyzerGreeks.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"OptionsPortfolioRiskAnalyzerGreeks", "", "optionsGreeks", "Lcom/robinhood/android/options/calculation/greeks/OptionsGreeks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/options/calculation/greeks/OptionsGreeks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerGreeksKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerGreeks {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsPortfolioRiskAnalyzerGreeks$lambda$0(OptionsGreeks optionsGreeks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OptionsPortfolioRiskAnalyzerGreeks(optionsGreeks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void OptionsPortfolioRiskAnalyzerGreeks(final OptionsGreeks optionsGreeks, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(optionsGreeks, "optionsGreeks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1794916578);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(optionsGreeks) : composerStartRestartGroup.changedInstance(optionsGreeks) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1794916578, i3, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerGreeks (OptionsPortfolioRiskAnalyzerGreeks.kt:15)");
            }
            OptionsPortfolioRiskAnalyzerDataCellRow.OptionsPortfolioRiskAnalyzerDataCellRow(extensions2.persistentListOf(Tuples4.m3642to(StringResources_androidKt.stringResource(C23462R.string.options_pra_greek_label_delta, composerStartRestartGroup, 0), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), optionsGreeks.getDelta(), null, 2, null)), Tuples4.m3642to(StringResources_androidKt.stringResource(C23462R.string.options_pra_greek_label_gamma, composerStartRestartGroup, 0), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), optionsGreeks.getGamma(), null, 2, null)), Tuples4.m3642to(StringResources_androidKt.stringResource(C23462R.string.options_pra_greek_label_theta, composerStartRestartGroup, 0), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), optionsGreeks.getTheta(), null, 2, null)), Tuples4.m3642to(StringResources_androidKt.stringResource(C23462R.string.options_pra_greek_label_vega, composerStartRestartGroup, 0), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), optionsGreeks.getVega(), null, 2, null))), modifier, composerStartRestartGroup, i3 & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerGreeksKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionsPortfolioRiskAnalyzerGreeks.OptionsPortfolioRiskAnalyzerGreeks$lambda$0(optionsGreeks, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

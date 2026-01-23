package com.robinhood.android.options.portfolioriskanalyzer;

import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: OptionsPortfolioRiskAnalyzerComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$9$1$1$2$2$1 */
/* loaded from: classes11.dex */
/* synthetic */ class C23439xe47eba79 extends AdaptedFunctionReference implements Function0<Unit> {
    C23439xe47eba79(Object obj) {
        super(0, obj, OptionsProfitAndLossChartDuxo.class, "resetScrubState", "resetScrubState(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OptionsProfitAndLossChartDuxo.resetScrubState$default((OptionsProfitAndLossChartDuxo) this.receiver, false, 1, null);
    }
}

package com.robinhood.android.options.portfolioriskanalyzer;

import com.robinhood.android.charts.model.Point;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$9$1$1$2$5$1 */
/* loaded from: classes11.dex */
/* synthetic */ class C23440xe47ec5bc extends FunctionReferenceImpl implements Function1<Point, Unit> {
    C23440xe47ec5bc(Object obj) {
        super(1, obj, OptionsProfitAndLossChartDuxo.class, "onScrubPointUpdated", "onScrubPointUpdated(Lcom/robinhood/android/charts/model/Point;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Point point) {
        invoke2(point);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Point p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((OptionsProfitAndLossChartDuxo) this.receiver).onScrubPointUpdated(p0);
    }
}

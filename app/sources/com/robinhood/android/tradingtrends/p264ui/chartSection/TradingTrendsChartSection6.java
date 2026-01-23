package com.robinhood.android.tradingtrends.p264ui.chartSection;

import com.robinhood.android.tradingtrends.p264ui.chartSection.TradingTrendsChartSectionState3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: TradingTrendsChartSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionKt$TradingTrendsChartSection$2$5$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class TradingTrendsChartSection6 implements Function0<Unit> {
    final /* synthetic */ Function2<String, String, Unit> $expandTradingTrendsDetails;
    final /* synthetic */ String $instrumentId;
    final /* synthetic */ TradingTrendsChartSectionState3 $viewState;

    /* JADX WARN: Multi-variable type inference failed */
    TradingTrendsChartSection6(Function2<? super String, ? super String, Unit> function2, String str, TradingTrendsChartSectionState3 tradingTrendsChartSectionState3) {
        this.$expandTradingTrendsDetails = function2;
        this.$instrumentId = str;
        this.$viewState = tradingTrendsChartSectionState3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function2<String, String, Unit> function2 = this.$expandTradingTrendsDetails;
        if (function2 == null) {
            return null;
        }
        function2.invoke(this.$instrumentId, ((TradingTrendsChartSectionState3.Ready) this.$viewState).getData().getSelectedType());
        return Unit.INSTANCE;
    }
}

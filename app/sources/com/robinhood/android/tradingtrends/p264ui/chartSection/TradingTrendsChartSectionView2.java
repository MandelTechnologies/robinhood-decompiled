package com.robinhood.android.tradingtrends.p264ui.chartSection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TradingTrendsChartSectionView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionView$Content$1$1$1$2$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class TradingTrendsChartSectionView2 extends FunctionReferenceImpl implements Function2<String, String, Unit> {
    TradingTrendsChartSectionView2(Object obj) {
        super(2, obj, TradingTrendsChartSectionView.class, "handleOnExpandTradingTrendsDetails", "handleOnExpandTradingTrendsDetails(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((TradingTrendsChartSectionView) this.receiver).handleOnExpandTradingTrendsDetails(p0, p1);
    }
}

package com.robinhood.android.futures.detail.p140ui.chart;

import com.robinhood.store.futures.ChartType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesDetailChartSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class FuturesDetailChartSectionKt$FuturesDetailChartSection$4$9$1 extends FunctionReferenceImpl implements Function1<ChartType, Unit> {
    FuturesDetailChartSectionKt$FuturesDetailChartSection$4$9$1(Object obj) {
        super(1, obj, FuturesDetailChartCallbacks.class, "onChartTypeSelected", "onChartTypeSelected(Lcom/robinhood/store/futures/ChartType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ChartType chartType) {
        invoke2(chartType);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ChartType p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((FuturesDetailChartCallbacks) this.receiver).onChartTypeSelected(p0);
    }
}

package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets;

import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChartBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class ChartBottomSheetKt$ChartBottomSheet$2$13$1$1 extends FunctionReferenceImpl implements Function1<InstrumentOrderState4, Unit> {
    ChartBottomSheetKt$ChartBottomSheet$2$13$1$1(Object obj) {
        super(1, obj, AdvanceChartOrderDuxo4.class, "onTradeAmountUpdated", "onTradeAmountUpdated(Lcom/robinhood/shared/trading/orderstate/InstrumentTradeAmount;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InstrumentOrderState4 instrumentOrderState4) {
        invoke2(instrumentOrderState4);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InstrumentOrderState4 p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((AdvanceChartOrderDuxo4) this.receiver).onTradeAmountUpdated(p0);
    }
}

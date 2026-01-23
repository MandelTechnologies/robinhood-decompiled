package com.robinhood.android.chart.blackwidowadvancedchart.composables.event;

import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.GenericAdvanceChartOrderAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HandleAdvanceChartEvents.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.event.HandleAdvanceChartEventsKt$HandleAdvanceChartEvents$9$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class HandleAdvanceChartEvents4 extends FunctionReferenceImpl implements Function1<GenericAdvanceChartOrderAction, Unit> {
    HandleAdvanceChartEvents4(Object obj) {
        super(1, obj, AdvanceChartOrderDuxo4.class, "handleGenericAdvanceChartOrderAction", "handleGenericAdvanceChartOrderAction(Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/GenericAdvanceChartOrderAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GenericAdvanceChartOrderAction genericAdvanceChartOrderAction) {
        invoke2(genericAdvanceChartOrderAction);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GenericAdvanceChartOrderAction p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((AdvanceChartOrderDuxo4) this.receiver).handleGenericAdvanceChartOrderAction(p0);
    }
}

package com.robinhood.android.options.lib.simulatedreturn.chart;

import com.robinhood.android.charts.model.Point;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedReturnChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class OptionsSimulatedReturnChartKt$OptionsSimulatedReturnChart$2$3$1 extends FunctionReferenceImpl implements Function1<Point, Unit> {
    OptionsSimulatedReturnChartKt$OptionsSimulatedReturnChart$2$3$1(Object obj) {
        super(1, obj, OptionsSimulatedReturnChartDuxo.class, "onScrubPointUpdated", "onScrubPointUpdated(Lcom/robinhood/android/charts/model/Point;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Point point) {
        invoke2(point);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Point p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((OptionsSimulatedReturnChartDuxo) this.receiver).onScrubPointUpdated(p0);
    }
}

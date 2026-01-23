package com.robinhood.android.equitydetail.p123ui.chart;

import com.robinhood.android.equitydetail.p123ui.chart.InstrumentChartView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentChartView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartView$Content$2$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class InstrumentChartView2 extends FunctionReferenceImpl implements Function2<String, Function0<? extends Unit>, Unit> {
    InstrumentChartView2(Object obj) {
        super(2, obj, InstrumentChartView.Callbacks.class, "launchChartEducationTour", "launchChartEducationTour(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Function0<? extends Unit> function0) {
        invoke2(str, (Function0<Unit>) function0);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0, Function0<Unit> p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((InstrumentChartView.Callbacks) this.receiver).launchChartEducationTour(p0, p1);
    }
}

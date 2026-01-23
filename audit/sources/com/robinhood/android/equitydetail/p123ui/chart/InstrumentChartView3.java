package com.robinhood.android.equitydetail.p123ui.chart;

import com.robinhood.android.equitydetail.p123ui.chart.InstrumentChartView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentChartView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartView$Content$2$1$2$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class InstrumentChartView3 extends FunctionReferenceImpl implements Function1<String, Unit> {
    InstrumentChartView3(Object obj) {
        super(1, obj, InstrumentChartView.Callbacks.class, "onSpanChanged", "onSpanChanged(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((InstrumentChartView.Callbacks) this.receiver).onSpanChanged(p0);
    }
}

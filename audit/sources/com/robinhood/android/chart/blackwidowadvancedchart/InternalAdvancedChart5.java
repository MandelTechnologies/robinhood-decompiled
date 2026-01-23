package com.robinhood.android.chart.blackwidowadvancedchart;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: InternalAdvancedChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChartKt$InternalAdvancedChart$3$1$1$3$2$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class InternalAdvancedChart5 extends FunctionReferenceImpl implements Function0<Unit> {
    InternalAdvancedChart5(Object obj) {
        super(0, obj, BlackWidowAdvanceChartCallbacks.class, "hideIndicatorsRow", "hideIndicatorsRow()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((BlackWidowAdvanceChartCallbacks) this.receiver).hideIndicatorsRow();
    }
}

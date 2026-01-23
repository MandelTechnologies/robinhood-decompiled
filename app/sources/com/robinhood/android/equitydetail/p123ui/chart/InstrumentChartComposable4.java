package com.robinhood.android.equitydetail.p123ui.chart;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: InstrumentChartComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$InstrumentChartComposable$2$1$1$6$2$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class InstrumentChartComposable4 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    InstrumentChartComposable4(Object obj) {
        super(1, obj, InstrumentChartDuxo.class, "onShowAllHoursToggled", "onShowAllHoursToggled(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((InstrumentChartDuxo) this.receiver).onShowAllHoursToggled(z);
    }
}

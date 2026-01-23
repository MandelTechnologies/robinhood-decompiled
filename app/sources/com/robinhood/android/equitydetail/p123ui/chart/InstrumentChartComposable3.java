package com.robinhood.android.equitydetail.p123ui.chart;

import com.robinhood.android.equitydetail.p123ui.chartsettings.ChartSettingsBottomSheetComposable2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentChartComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$InstrumentChartComposable$2$1$1$6$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class InstrumentChartComposable3 extends FunctionReferenceImpl implements Function1<ChartSettingsBottomSheetComposable2, Unit> {
    InstrumentChartComposable3(Object obj) {
        super(1, obj, InstrumentChartDuxo.class, "onChartTypeSelected", "onChartTypeSelected(Lcom/robinhood/android/equitydetail/ui/chartsettings/ChartType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ChartSettingsBottomSheetComposable2 chartSettingsBottomSheetComposable2) {
        invoke2(chartSettingsBottomSheetComposable2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ChartSettingsBottomSheetComposable2 p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((InstrumentChartDuxo) this.receiver).onChartTypeSelected(p0);
    }
}

package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets;

import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ChartBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class ChartBottomSheetKt$ChartBottomSheet$2$14$2$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    ChartBottomSheetKt$ChartBottomSheet$2$14$2$1(Object obj) {
        super(1, obj, AdvanceChartOrderDuxo4.class, "onAutoSendToggled", "onAutoSendToggled(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((AdvanceChartOrderDuxo4) this.receiver).onAutoSendToggled(z);
    }
}

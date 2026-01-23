package com.robinhood.android.chart.blackwidowadvancedchart.composables;

import com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: SlideUpScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.SlideUpScreenKt$SlideUpScreen$1$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class SlideUpScreen2 extends AdaptedFunctionReference implements Function0<Unit> {
    SlideUpScreen2(Object obj) {
        super(0, obj, BlackWidowAdvanceChartCallbacks.class, "advanceScreenState", "advanceScreenState(Lcom/robinhood/android/chart/blackwidowadvancedchart/models/ChartScreenState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        BlackWidowAdvanceChartCallbacks.DefaultImpls.advanceScreenState$default((BlackWidowAdvanceChartCallbacks) this.receiver, null, 1, null);
    }
}

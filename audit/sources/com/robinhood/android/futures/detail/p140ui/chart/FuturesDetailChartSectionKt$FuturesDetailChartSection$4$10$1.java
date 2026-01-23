package com.robinhood.android.futures.detail.p140ui.chart;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FuturesDetailChartSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class FuturesDetailChartSectionKt$FuturesDetailChartSection$4$10$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    FuturesDetailChartSectionKt$FuturesDetailChartSection$4$10$1(Object obj) {
        super(1, obj, FuturesDetailChartCallbacks.class, "onContinuousChartSelected", "onContinuousChartSelected(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((FuturesDetailChartCallbacks) this.receiver).onContinuousChartSelected(z);
    }
}

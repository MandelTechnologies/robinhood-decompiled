package com.robinhood.android.futures.detail.p140ui.chart;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FuturesDetailChartSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class FuturesDetailChartSectionKt$FuturesDetailChartSection$4$8$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    FuturesDetailChartSectionKt$FuturesDetailChartSection$4$8$2$1(Object obj) {
        super(0, obj, FuturesDetailChartCallbacks.class, "onChartSettingsClicked", "onChartSettingsClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((FuturesDetailChartCallbacks) this.receiver).onChartSettingsClicked();
    }
}

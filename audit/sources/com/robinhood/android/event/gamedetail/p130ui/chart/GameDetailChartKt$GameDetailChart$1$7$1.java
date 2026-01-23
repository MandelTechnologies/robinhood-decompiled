package com.robinhood.android.event.gamedetail.p130ui.chart;

import com.robinhood.android.event.gamedetail.callbacks.ChartCallbacks;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GameDetailChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class GameDetailChartKt$GameDetailChart$1$7$1 extends FunctionReferenceImpl implements Function1<DisplaySpan, Unit> {
    GameDetailChartKt$GameDetailChart$1$7$1(Object obj) {
        super(1, obj, ChartCallbacks.class, "onSpanSelected", "onSpanSelected(Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DisplaySpan displaySpan) {
        invoke2(displaySpan);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DisplaySpan p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((ChartCallbacks) this.receiver).onSpanSelected(p0);
    }
}

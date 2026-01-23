package com.robinhood.android.charts;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: Chart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.charts.ChartKt$Chart$boxModifier$2$2$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class Chart3 extends FunctionReferenceImpl implements Function0<Unit> {
    Chart3(Object obj) {
        super(0, obj, Interactions5.class, "onScrubStopped", "onScrubStopped()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((Interactions5) this.receiver).onScrubStopped();
    }
}

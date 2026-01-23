package com.robinhood.android.gold.upgrade.unified.screen;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GoldUnifiedValuePropsPromoComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposableKt$GoldUnifiedValuePropsPromoComposable$1$2$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class GoldUnifiedValuePropsPromoComposable4 extends FunctionReferenceImpl implements Function0<Unit> {
    GoldUnifiedValuePropsPromoComposable4(Object obj) {
        super(0, obj, GoldUnifiedValuePropsPromoDuxo.class, "failPerformanceMetrics", "failPerformanceMetrics()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((GoldUnifiedValuePropsPromoDuxo) this.receiver).failPerformanceMetrics();
    }
}

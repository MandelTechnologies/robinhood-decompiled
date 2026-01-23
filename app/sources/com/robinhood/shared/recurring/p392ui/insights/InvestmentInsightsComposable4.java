package com.robinhood.shared.recurring.p392ui.insights;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: InvestmentInsightsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsComposableKt$InvestmentInsightsComposable$1$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class InvestmentInsightsComposable4 extends FunctionReferenceImpl implements Function0<Unit> {
    InvestmentInsightsComposable4(Object obj) {
        super(0, obj, InvestmentInsightsDuxo.class, "update", "update()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((InvestmentInsightsDuxo) this.receiver).update();
    }
}

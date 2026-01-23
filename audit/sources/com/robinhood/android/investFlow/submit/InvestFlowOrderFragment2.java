package com.robinhood.android.investFlow.submit;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: InvestFlowOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.submit.InvestFlowOrderFragment$bindOneTimeSingleViewState$1$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class InvestFlowOrderFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    InvestFlowOrderFragment2(Object obj) {
        super(0, obj, InvestFlowOrderDuxo.class, "refreshNbbo", "refreshNbbo()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((InvestFlowOrderDuxo) this.receiver).refreshNbbo();
    }
}

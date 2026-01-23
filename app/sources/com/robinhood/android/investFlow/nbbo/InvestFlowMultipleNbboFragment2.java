package com.robinhood.android.investFlow.nbbo;

import com.robinhood.investflow.models.api.ApiInvestFlowNbboRow;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowMultipleNbboFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.nbbo.InvestFlowMultipleNbboFragment$adapter$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class InvestFlowMultipleNbboFragment2 extends FunctionReferenceImpl implements Function2<InvestFlowNbboRowView, ApiInvestFlowNbboRow, Unit> {
    public static final InvestFlowMultipleNbboFragment2 INSTANCE = new InvestFlowMultipleNbboFragment2();

    InvestFlowMultipleNbboFragment2() {
        super(2, InvestFlowNbboRowView.class, "bind", "bind(Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboRow;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InvestFlowNbboRowView investFlowNbboRowView, ApiInvestFlowNbboRow apiInvestFlowNbboRow) {
        invoke2(investFlowNbboRowView, apiInvestFlowNbboRow);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InvestFlowNbboRowView p0, ApiInvestFlowNbboRow p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        p0.bind(p1);
    }
}

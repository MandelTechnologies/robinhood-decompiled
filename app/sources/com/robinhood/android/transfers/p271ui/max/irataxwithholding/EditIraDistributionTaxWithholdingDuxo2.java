package com.robinhood.android.transfers.p271ui.max.irataxwithholding;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: EditIraDistributionTaxWithholdingDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingDuxo", m3645f = "EditIraDistributionTaxWithholdingDuxo.kt", m3646l = {120}, m3647m = "getIraDistributionTaxWithholding-0E7RQCE")
/* renamed from: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingDuxo$getIraDistributionTaxWithholding$1, reason: use source file name */
/* loaded from: classes9.dex */
final class EditIraDistributionTaxWithholdingDuxo2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EditIraDistributionTaxWithholdingDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EditIraDistributionTaxWithholdingDuxo2(EditIraDistributionTaxWithholdingDuxo editIraDistributionTaxWithholdingDuxo, Continuation<? super EditIraDistributionTaxWithholdingDuxo2> continuation) {
        super(continuation);
        this.this$0 = editIraDistributionTaxWithholdingDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM19905getIraDistributionTaxWithholding0E7RQCE = this.this$0.m19905getIraDistributionTaxWithholding0E7RQCE(null, null, this);
        return objM19905getIraDistributionTaxWithholding0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM19905getIraDistributionTaxWithholding0E7RQCE : Result.m28549boximpl(objM19905getIraDistributionTaxWithholding0E7RQCE);
    }
}

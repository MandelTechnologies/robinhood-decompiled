package com.robinhood.android.transfers.p271ui.max.irataxwithholding;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EditIraDistributionTaxWithholdingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingDuxo$onCreate$2$2$2$1", m3645f = "EditIraDistributionTaxWithholdingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingDuxo$onCreate$2$2$2$1, reason: use source file name */
/* loaded from: classes9.dex */
final class EditIraDistributionTaxWithholdingDuxo4 extends ContinuationImpl7 implements Function2<EditIraDistributionTaxWithholdingViewState, Continuation<? super EditIraDistributionTaxWithholdingViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    EditIraDistributionTaxWithholdingDuxo4(Continuation<? super EditIraDistributionTaxWithholdingDuxo4> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EditIraDistributionTaxWithholdingDuxo4 editIraDistributionTaxWithholdingDuxo4 = new EditIraDistributionTaxWithholdingDuxo4(continuation);
        editIraDistributionTaxWithholdingDuxo4.L$0 = obj;
        return editIraDistributionTaxWithholdingDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EditIraDistributionTaxWithholdingViewState editIraDistributionTaxWithholdingViewState, Continuation<? super EditIraDistributionTaxWithholdingViewState> continuation) {
        return ((EditIraDistributionTaxWithholdingDuxo4) create(editIraDistributionTaxWithholdingViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return EditIraDistributionTaxWithholdingViewState.copy$default((EditIraDistributionTaxWithholdingViewState) this.L$0, null, null, false, null, 7, null);
    }
}

package com.robinhood.android.transfers.nonoriginated.p268ui;

import com.robinhood.models.p320db.bonfire.RhyAccount;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: NonOriginatedTransferInfoAccountSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/nonoriginated/ui/NonOriginatedTransferInfoAccountSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionDuxo$onCreate$2$1", m3645f = "NonOriginatedTransferInfoAccountSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionDuxo$onCreate$2$1, reason: use source file name */
/* loaded from: classes9.dex */
final class NonOriginatedTransferInfoAccountSelectionDuxo3 extends ContinuationImpl7 implements Function2<NonOriginatedTransferInfoAccountSelectionDataState, Continuation<? super NonOriginatedTransferInfoAccountSelectionDataState>, Object> {
    final /* synthetic */ RhyAccount $rhyAccount;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NonOriginatedTransferInfoAccountSelectionDuxo3(RhyAccount rhyAccount, Continuation<? super NonOriginatedTransferInfoAccountSelectionDuxo3> continuation) {
        super(2, continuation);
        this.$rhyAccount = rhyAccount;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NonOriginatedTransferInfoAccountSelectionDuxo3 nonOriginatedTransferInfoAccountSelectionDuxo3 = new NonOriginatedTransferInfoAccountSelectionDuxo3(this.$rhyAccount, continuation);
        nonOriginatedTransferInfoAccountSelectionDuxo3.L$0 = obj;
        return nonOriginatedTransferInfoAccountSelectionDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(NonOriginatedTransferInfoAccountSelectionDataState nonOriginatedTransferInfoAccountSelectionDataState, Continuation<? super NonOriginatedTransferInfoAccountSelectionDataState> continuation) {
        return ((NonOriginatedTransferInfoAccountSelectionDuxo3) create(nonOriginatedTransferInfoAccountSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return NonOriginatedTransferInfoAccountSelectionDataState.copy$default((NonOriginatedTransferInfoAccountSelectionDataState) this.L$0, null, this.$rhyAccount, null, 5, null);
    }
}

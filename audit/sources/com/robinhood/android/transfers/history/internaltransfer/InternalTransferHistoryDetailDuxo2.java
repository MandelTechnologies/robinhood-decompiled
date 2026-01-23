package com.robinhood.android.transfers.history.internaltransfer;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InternalTransferHistoryDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/history/internaltransfer/InternalTransferHistoryDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.history.internaltransfer.InternalTransferHistoryDetailDuxo$cancelTransfer$1$1", m3645f = "InternalTransferHistoryDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.history.internaltransfer.InternalTransferHistoryDetailDuxo$cancelTransfer$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class InternalTransferHistoryDetailDuxo2 extends ContinuationImpl7 implements Function2<InternalTransferHistoryDetailDataState, Continuation<? super InternalTransferHistoryDetailDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    InternalTransferHistoryDetailDuxo2(Continuation<? super InternalTransferHistoryDetailDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InternalTransferHistoryDetailDuxo2 internalTransferHistoryDetailDuxo2 = new InternalTransferHistoryDetailDuxo2(continuation);
        internalTransferHistoryDetailDuxo2.L$0 = obj;
        return internalTransferHistoryDetailDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InternalTransferHistoryDetailDataState internalTransferHistoryDetailDataState, Continuation<? super InternalTransferHistoryDetailDataState> continuation) {
        return ((InternalTransferHistoryDetailDuxo2) create(internalTransferHistoryDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return InternalTransferHistoryDetailDataState.copy$default((InternalTransferHistoryDetailDataState) this.L$0, null, null, null, null, false, false, true, null, null, null, 959, null);
    }
}

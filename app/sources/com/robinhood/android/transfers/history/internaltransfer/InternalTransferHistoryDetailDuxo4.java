package com.robinhood.android.transfers.history.internaltransfer;

import com.robinhood.udf.UiEvent;
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
@DebugMetadata(m3644c = "com.robinhood.android.transfers.history.internaltransfer.InternalTransferHistoryDetailDuxo$cancelTransfer$1$3$1", m3645f = "InternalTransferHistoryDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.history.internaltransfer.InternalTransferHistoryDetailDuxo$cancelTransfer$1$3$1, reason: use source file name */
/* loaded from: classes9.dex */
final class InternalTransferHistoryDetailDuxo4 extends ContinuationImpl7 implements Function2<InternalTransferHistoryDetailDataState, Continuation<? super InternalTransferHistoryDetailDataState>, Object> {
    final /* synthetic */ Throwable $throwable;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalTransferHistoryDetailDuxo4(Throwable th, Continuation<? super InternalTransferHistoryDetailDuxo4> continuation) {
        super(2, continuation);
        this.$throwable = th;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InternalTransferHistoryDetailDuxo4 internalTransferHistoryDetailDuxo4 = new InternalTransferHistoryDetailDuxo4(this.$throwable, continuation);
        internalTransferHistoryDetailDuxo4.L$0 = obj;
        return internalTransferHistoryDetailDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InternalTransferHistoryDetailDataState internalTransferHistoryDetailDataState, Continuation<? super InternalTransferHistoryDetailDataState> continuation) {
        return ((InternalTransferHistoryDetailDuxo4) create(internalTransferHistoryDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return InternalTransferHistoryDetailDataState.copy$default((InternalTransferHistoryDetailDataState) this.L$0, null, null, null, null, false, false, false, null, new UiEvent(this.$throwable), null, 703, null);
    }
}

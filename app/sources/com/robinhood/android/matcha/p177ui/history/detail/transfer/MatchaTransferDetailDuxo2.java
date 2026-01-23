package com.robinhood.android.matcha.p177ui.history.detail.transfer;

import com.robinhood.models.p320db.matcha.MatchaTransfer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MatchaTransferDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailDuxo$onResume$1$1", m3645f = "MatchaTransferDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailDuxo$onResume$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MatchaTransferDetailDuxo2 extends ContinuationImpl7 implements Function2<MatchaTransferDetailDataState, Continuation<? super MatchaTransferDetailDataState>, Object> {
    final /* synthetic */ MatchaTransfer $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchaTransferDetailDuxo2(MatchaTransfer matchaTransfer, Continuation<? super MatchaTransferDetailDuxo2> continuation) {
        super(2, continuation);
        this.$it = matchaTransfer;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MatchaTransferDetailDuxo2 matchaTransferDetailDuxo2 = new MatchaTransferDetailDuxo2(this.$it, continuation);
        matchaTransferDetailDuxo2.L$0 = obj;
        return matchaTransferDetailDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MatchaTransferDetailDataState matchaTransferDetailDataState, Continuation<? super MatchaTransferDetailDataState> continuation) {
        return ((MatchaTransferDetailDuxo2) create(matchaTransferDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return MatchaTransferDetailDataState.copy$default((MatchaTransferDetailDataState) this.L$0, this.$it, null, null, null, null, 30, null);
    }
}

package com.robinhood.android.matcha.p177ui.history.detail.transfer;

import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MatchaTransferDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailDuxo$toggleBlockState$1$3$1", m3645f = "MatchaTransferDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailDuxo$toggleBlockState$1$3$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MatchaTransferDetailDuxo4 extends ContinuationImpl7 implements Function2<MatchaTransferDetailDataState, Continuation<? super MatchaTransferDetailDataState>, Object> {
    final /* synthetic */ Throwable $throwable;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchaTransferDetailDuxo4(Throwable th, Continuation<? super MatchaTransferDetailDuxo4> continuation) {
        super(2, continuation);
        this.$throwable = th;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MatchaTransferDetailDuxo4 matchaTransferDetailDuxo4 = new MatchaTransferDetailDuxo4(this.$throwable, continuation);
        matchaTransferDetailDuxo4.L$0 = obj;
        return matchaTransferDetailDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MatchaTransferDetailDataState matchaTransferDetailDataState, Continuation<? super MatchaTransferDetailDataState> continuation) {
        return ((MatchaTransferDetailDuxo4) create(matchaTransferDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MatchaTransferDetailDataState matchaTransferDetailDataState = (MatchaTransferDetailDataState) this.L$0;
        Result.Companion companion = Result.INSTANCE;
        return MatchaTransferDetailDataState.copy$default(matchaTransferDetailDataState, null, null, null, null, new UiEvent(Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(this.$throwable)))), 15, null);
    }
}

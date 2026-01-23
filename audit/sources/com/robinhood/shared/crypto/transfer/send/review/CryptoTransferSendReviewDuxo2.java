package com.robinhood.shared.crypto.transfer.send.review;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoTransferSendReviewDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewDuxo$submitWithdrawal$3$1", m3645f = "CryptoTransferSendReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewDuxo$submitWithdrawal$3$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoTransferSendReviewDuxo2 extends ContinuationImpl7 implements Function2<CryptoTransferSendReviewDataState, Continuation<? super CryptoTransferSendReviewDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    CryptoTransferSendReviewDuxo2(Continuation<? super CryptoTransferSendReviewDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoTransferSendReviewDuxo2 cryptoTransferSendReviewDuxo2 = new CryptoTransferSendReviewDuxo2(continuation);
        cryptoTransferSendReviewDuxo2.L$0 = obj;
        return cryptoTransferSendReviewDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoTransferSendReviewDataState cryptoTransferSendReviewDataState, Continuation<? super CryptoTransferSendReviewDataState> continuation) {
        return ((CryptoTransferSendReviewDuxo2) create(cryptoTransferSendReviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CryptoTransferSendReviewDataState.copy$default((CryptoTransferSendReviewDataState) this.L$0, null, false, null, null, 13, null);
    }
}

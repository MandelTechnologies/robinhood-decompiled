package com.robinhood.shared.crypto.transfer.send.amount;

import com.robinhood.models.crypto.p314db.CryptoQuote;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoTransferSendAmountDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountDuxo$onStart$4$1", m3645f = "CryptoTransferSendAmountDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountDuxo$onStart$4$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoTransferSendAmountDuxo3 extends ContinuationImpl7 implements Function2<CryptoTransferSendAmountViewState, Continuation<? super CryptoTransferSendAmountViewState>, Object> {
    final /* synthetic */ CryptoQuote $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoTransferSendAmountDuxo3(CryptoQuote cryptoQuote, Continuation<? super CryptoTransferSendAmountDuxo3> continuation) {
        super(2, continuation);
        this.$it = cryptoQuote;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoTransferSendAmountDuxo3 cryptoTransferSendAmountDuxo3 = new CryptoTransferSendAmountDuxo3(this.$it, continuation);
        cryptoTransferSendAmountDuxo3.L$0 = obj;
        return cryptoTransferSendAmountDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoTransferSendAmountViewState cryptoTransferSendAmountViewState, Continuation<? super CryptoTransferSendAmountViewState> continuation) {
        return ((CryptoTransferSendAmountDuxo3) create(cryptoTransferSendAmountViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CryptoTransferSendAmountViewState.copy$default((CryptoTransferSendAmountViewState) this.L$0, false, 0, null, null, null, null, null, false, null, null, null, this.$it, null, null, null, null, 63487, null);
    }
}

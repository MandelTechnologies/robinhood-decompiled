package com.robinhood.shared.crypto.transfer.verification.exchange;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ExchangeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$onCreate$1$2$1", m3645f = "ExchangeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$onCreate$1$2$1, reason: use source file name */
/* loaded from: classes6.dex */
final class ExchangeDuxo3 extends ContinuationImpl7 implements Function2<ExchangeDataState, Continuation<? super ExchangeDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    ExchangeDuxo3(Continuation<? super ExchangeDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ExchangeDuxo3 exchangeDuxo3 = new ExchangeDuxo3(continuation);
        exchangeDuxo3.L$0 = obj;
        return exchangeDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ExchangeDataState exchangeDataState, Continuation<? super ExchangeDataState> continuation) {
        return ((ExchangeDuxo3) create(exchangeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ExchangeDataState.copy$default((ExchangeDataState) this.L$0, true, null, null, null, 14, null);
    }
}

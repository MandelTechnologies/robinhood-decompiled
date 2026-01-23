package com.robinhood.shared.trade.crypto.p397ui.orderDetail;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoOrderDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCancelOrderTapped$4$1", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCancelOrderTapped$4$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoOrderDetailDuxo2 extends ContinuationImpl7 implements Function2<CryptoOrderDetailDataState, Continuation<? super CryptoOrderDetailDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    CryptoOrderDetailDuxo2(Continuation<? super CryptoOrderDetailDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoOrderDetailDuxo2 cryptoOrderDetailDuxo2 = new CryptoOrderDetailDuxo2(continuation);
        cryptoOrderDetailDuxo2.L$0 = obj;
        return cryptoOrderDetailDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoOrderDetailDataState cryptoOrderDetailDataState, Continuation<? super CryptoOrderDetailDataState> continuation) {
        return ((CryptoOrderDetailDuxo2) create(cryptoOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CryptoOrderDetailDataState.m25899copyaYVmwo0$default((CryptoOrderDetailDataState) this.L$0, null, null, null, false, false, false, false, null, false, null, false, null, null, 8183, null);
    }
}

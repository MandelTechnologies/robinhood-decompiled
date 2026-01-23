package com.robinhood.shared.trade.crypto.p397ui.orderDetail;

import androidx.compose.p011ui.graphics.Color;
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
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$setFg2Color$1", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$setFg2Color$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoOrderDetailDuxo6 extends ContinuationImpl7 implements Function2<CryptoOrderDetailDataState, Continuation<? super CryptoOrderDetailDataState>, Object> {
    final /* synthetic */ long $fg2;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoOrderDetailDuxo6(long j, Continuation<? super CryptoOrderDetailDuxo6> continuation) {
        super(2, continuation);
        this.$fg2 = j;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoOrderDetailDuxo6 cryptoOrderDetailDuxo6 = new CryptoOrderDetailDuxo6(this.$fg2, continuation);
        cryptoOrderDetailDuxo6.L$0 = obj;
        return cryptoOrderDetailDuxo6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoOrderDetailDataState cryptoOrderDetailDataState, Continuation<? super CryptoOrderDetailDataState> continuation) {
        return ((CryptoOrderDetailDuxo6) create(cryptoOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CryptoOrderDetailDataState.m25899copyaYVmwo0$default((CryptoOrderDetailDataState) this.L$0, null, null, null, false, false, false, false, null, false, null, false, null, Color.m6701boximpl(this.$fg2), 4095, null);
    }
}

package com.robinhood.shared.trade.crypto.p397ui.orderDetail;

import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Some;
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
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCancelOrderTapped$4$2", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCancelOrderTapped$4$2, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoOrderDetailDuxo3 extends ContinuationImpl7 implements Function2<CryptoOrderDetailDataState, Continuation<? super CryptoOrderDetailDataState>, Object> {
    final /* synthetic */ Optional<UiCryptoOrder> $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoOrderDetailDuxo3(Optional<UiCryptoOrder> optional, Continuation<? super CryptoOrderDetailDuxo3> continuation) {
        super(2, continuation);
        this.$it = optional;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoOrderDetailDuxo3 cryptoOrderDetailDuxo3 = new CryptoOrderDetailDuxo3(this.$it, continuation);
        cryptoOrderDetailDuxo3.L$0 = obj;
        return cryptoOrderDetailDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoOrderDetailDataState cryptoOrderDetailDataState, Continuation<? super CryptoOrderDetailDataState> continuation) {
        return ((CryptoOrderDetailDuxo3) create(cryptoOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CryptoOrderDetailDataState.m25899copyaYVmwo0$default((CryptoOrderDetailDataState) this.L$0, null, null, (UiCryptoOrder) ((Some) this.$it).getValue(), false, false, false, false, null, false, null, false, null, null, 8179, null);
    }
}

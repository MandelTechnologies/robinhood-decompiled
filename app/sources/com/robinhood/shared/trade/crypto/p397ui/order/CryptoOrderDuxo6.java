package com.robinhood.shared.trade.crypto.p397ui.order;

import com.plaid.internal.EnumC7081g;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderViewState;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$setOrderSize$1$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$setOrderSize$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoOrderDuxo6 extends ContinuationImpl7 implements Function2<CryptoOrderViewState, Continuation<? super CryptoOrderViewState>, Object> {
    final /* synthetic */ BigDecimal $newAmount;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoOrderDuxo6(BigDecimal bigDecimal, Continuation<? super CryptoOrderDuxo6> continuation) {
        super(2, continuation);
        this.$newAmount = bigDecimal;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoOrderDuxo6 cryptoOrderDuxo6 = new CryptoOrderDuxo6(this.$newAmount, continuation);
        cryptoOrderDuxo6.L$0 = obj;
        return cryptoOrderDuxo6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoOrderViewState cryptoOrderViewState, Continuation<? super CryptoOrderViewState> continuation) {
        return ((CryptoOrderDuxo6) create(cryptoOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CryptoOrderViewState cryptoOrderViewState = (CryptoOrderViewState) this.L$0;
        return CryptoOrderViewState.copy$default(cryptoOrderViewState, CryptoOrderViewState.InputState.copy$default(cryptoOrderViewState.getInputState(), null, null, false, null, null, this.$newAmount, null, null, false, null, false, null, false, false, null, false, false, 131039, null), null, null, false, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
    }
}

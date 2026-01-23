package com.robinhood.shared.trade.crypto.p397ui.order;

import com.plaid.internal.EnumC7081g;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderViewState;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderUiEvent;
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
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$sellAll$1$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$sellAll$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoOrderDuxo5 extends ContinuationImpl7 implements Function2<CryptoOrderViewState, Continuation<? super CryptoOrderViewState>, Object> {
    final /* synthetic */ BigDecimal $amount;
    final /* synthetic */ CryptoOrderViewState $dataState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoOrderDuxo5(CryptoOrderViewState cryptoOrderViewState, BigDecimal bigDecimal, Continuation<? super CryptoOrderDuxo5> continuation) {
        super(2, continuation);
        this.$dataState = cryptoOrderViewState;
        this.$amount = bigDecimal;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoOrderDuxo5 cryptoOrderDuxo5 = new CryptoOrderDuxo5(this.$dataState, this.$amount, continuation);
        cryptoOrderDuxo5.L$0 = obj;
        return cryptoOrderDuxo5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoOrderViewState cryptoOrderViewState, Continuation<? super CryptoOrderViewState> continuation) {
        return ((CryptoOrderDuxo5) create(cryptoOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CryptoOrderViewState.copy$default((CryptoOrderViewState) this.L$0, CryptoOrderViewState.InputState.copy$default(this.$dataState.getInputState(), null, CryptoInputMode.ASSET_CURRENCY, false, null, null, this.$amount, null, null, true, null, false, new CryptoOrderUiEvent(null, 1, null), false, false, null, false, false, 128733, null), null, null, false, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
    }
}

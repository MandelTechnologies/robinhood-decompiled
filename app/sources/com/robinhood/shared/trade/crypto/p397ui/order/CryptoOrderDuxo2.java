package com.robinhood.shared.trade.crypto.p397ui.order;

import com.plaid.internal.EnumC7081g;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderViewState;
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
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$changeInputMode$1$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$changeInputMode$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoOrderDuxo2 extends ContinuationImpl7 implements Function2<CryptoOrderViewState, Continuation<? super CryptoOrderViewState>, Object> {
    final /* synthetic */ CryptoInputMode $newInputMode;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoOrderDuxo2(CryptoInputMode cryptoInputMode, Continuation<? super CryptoOrderDuxo2> continuation) {
        super(2, continuation);
        this.$newInputMode = cryptoInputMode;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoOrderDuxo2 cryptoOrderDuxo2 = new CryptoOrderDuxo2(this.$newInputMode, continuation);
        cryptoOrderDuxo2.L$0 = obj;
        return cryptoOrderDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoOrderViewState cryptoOrderViewState, Continuation<? super CryptoOrderViewState> continuation) {
        return ((CryptoOrderDuxo2) create(cryptoOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CryptoOrderViewState cryptoOrderViewState = (CryptoOrderViewState) this.L$0;
        return CryptoOrderViewState.copy$default(cryptoOrderViewState, CryptoOrderViewState.InputState.copy$default(cryptoOrderViewState.getInputState(), null, this.$newInputMode, false, null, null, null, null, null, false, null, false, null, false, false, null, false, false, 131037, null), null, null, false, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
    }
}

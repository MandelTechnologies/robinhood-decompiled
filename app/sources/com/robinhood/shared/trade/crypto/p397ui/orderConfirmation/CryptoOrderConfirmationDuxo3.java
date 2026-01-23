package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation;

import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoOrderConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onStandardOrderUpdated$3$1", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onStandardOrderUpdated$3$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoOrderConfirmationDuxo3 extends ContinuationImpl7 implements Function2<CryptoOrderConfirmationViewState, Continuation<? super CryptoOrderConfirmationViewState>, Object> {
    final /* synthetic */ UiCurrencyPair $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoOrderConfirmationDuxo3(UiCurrencyPair uiCurrencyPair, Continuation<? super CryptoOrderConfirmationDuxo3> continuation) {
        super(2, continuation);
        this.$it = uiCurrencyPair;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoOrderConfirmationDuxo3 cryptoOrderConfirmationDuxo3 = new CryptoOrderConfirmationDuxo3(this.$it, continuation);
        cryptoOrderConfirmationDuxo3.L$0 = obj;
        return cryptoOrderConfirmationDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoOrderConfirmationViewState cryptoOrderConfirmationViewState, Continuation<? super CryptoOrderConfirmationViewState> continuation) {
        return ((CryptoOrderConfirmationDuxo3) create(cryptoOrderConfirmationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CryptoOrderConfirmationViewState.copy$default((CryptoOrderConfirmationViewState) this.L$0, null, null, null, false, null, null, null, false, null, this.$it, null, false, null, null, false, false, null, 130559, null);
    }
}

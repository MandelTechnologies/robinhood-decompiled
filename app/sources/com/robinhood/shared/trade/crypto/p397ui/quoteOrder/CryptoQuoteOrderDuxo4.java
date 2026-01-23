package com.robinhood.shared.trade.crypto.p397ui.quoteOrder;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoQuoteOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onResume$2$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onResume$2$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoQuoteOrderDuxo4 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
    final /* synthetic */ Boolean $isRecurringHookEnabled;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoQuoteOrderDuxo4(Boolean bool, Continuation<? super CryptoQuoteOrderDuxo4> continuation) {
        super(2, continuation);
        this.$isRecurringHookEnabled = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoQuoteOrderDuxo4 cryptoQuoteOrderDuxo4 = new CryptoQuoteOrderDuxo4(this.$isRecurringHookEnabled, continuation);
        cryptoQuoteOrderDuxo4.L$0 = obj;
        return cryptoQuoteOrderDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
        return ((CryptoQuoteOrderDuxo4) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CryptoQuoteOrderViewState cryptoQuoteOrderViewState = (CryptoQuoteOrderViewState) this.L$0;
        Boolean bool = this.$isRecurringHookEnabled;
        Intrinsics.checkNotNull(bool);
        return CryptoQuoteOrderViewState.copy$default(cryptoQuoteOrderViewState, null, null, null, null, null, false, null, null, false, bool.booleanValue(), false, null, null, null, false, null, false, false, false, null, null, false, false, 8388095, null);
    }
}

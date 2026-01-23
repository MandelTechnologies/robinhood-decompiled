package com.robinhood.shared.trade.crypto.p397ui.limitOrder;

import com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderDataState;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderPrices;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlow2;

/* compiled from: CryptoLimitOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$validateAndReviewOrder$1$1", m3645f = "CryptoLimitOrderDuxo.kt", m3646l = {417}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$validateAndReviewOrder$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoLimitOrderDuxo4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CryptoLimitOrderDataState.Loaded $newState;
    int label;
    final /* synthetic */ CryptoLimitOrderDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoLimitOrderDuxo4(CryptoLimitOrderDataState.Loaded loaded, CryptoLimitOrderDuxo cryptoLimitOrderDuxo, Continuation<? super CryptoLimitOrderDuxo4> continuation) {
        super(2, continuation);
        this.$newState = loaded;
        this.this$0 = cryptoLimitOrderDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoLimitOrderDuxo4(this.$newState, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoLimitOrderDuxo4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CryptoOrderPrices.Limit orderPrices = this.$newState.getOrderPrices();
            if (orderPrices != null) {
                SharedFlow2 sharedFlow2 = this.this$0.validateAndSubmitOrderTrigger;
                BigDecimal limitPrice = orderPrices.getLimitPrice();
                this.label = 1;
                if (sharedFlow2.emit(limitPrice, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}

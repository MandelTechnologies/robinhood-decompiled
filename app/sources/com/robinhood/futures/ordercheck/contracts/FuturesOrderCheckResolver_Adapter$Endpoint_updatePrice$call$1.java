package com.robinhood.futures.ordercheck.contracts;

import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver_Adapter;
import com.robinhood.futures.ordercheck.contracts.models.FuturesOrderPriceType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesOrderCheckResolver_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver_Adapter$Endpoint_updatePrice$Arguments;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver_Adapter$Endpoint_updatePrice$call$1", m3645f = "FuturesOrderCheckResolver_Adapter.kt", m3646l = {119}, m3647m = "invokeSuspend")
/* loaded from: classes15.dex */
final class FuturesOrderCheckResolver_Adapter$Endpoint_updatePrice$call$1 extends ContinuationImpl7 implements Function2<FuturesOrderCheckResolver_Adapter.Endpoint_updatePrice.Arguments, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesOrderCheckResolver_Adapter.Endpoint_updatePrice this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesOrderCheckResolver_Adapter$Endpoint_updatePrice$call$1(FuturesOrderCheckResolver_Adapter.Endpoint_updatePrice endpoint_updatePrice, Continuation<? super FuturesOrderCheckResolver_Adapter$Endpoint_updatePrice$call$1> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_updatePrice;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesOrderCheckResolver_Adapter$Endpoint_updatePrice$call$1 futuresOrderCheckResolver_Adapter$Endpoint_updatePrice$call$1 = new FuturesOrderCheckResolver_Adapter$Endpoint_updatePrice$call$1(this.this$0, continuation);
        futuresOrderCheckResolver_Adapter$Endpoint_updatePrice$call$1.L$0 = obj;
        return futuresOrderCheckResolver_Adapter$Endpoint_updatePrice$call$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FuturesOrderCheckResolver_Adapter.Endpoint_updatePrice.Arguments arguments, Continuation<? super Unit> continuation) {
        return ((FuturesOrderCheckResolver_Adapter$Endpoint_updatePrice$call$1) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FuturesOrderCheckResolver_Adapter.Endpoint_updatePrice.Arguments arguments = (FuturesOrderCheckResolver_Adapter.Endpoint_updatePrice.Arguments) this.L$0;
            FuturesOrderCheckResolver futuresOrderCheckResolver = this.this$0.service;
            FuturesOrderPriceType priceType = arguments.getPriceType();
            BigDecimal newPrice = arguments.getNewPrice();
            this.label = 1;
            if (futuresOrderCheckResolver.updatePrice(priceType, newPrice, this) == coroutine_suspended) {
                return coroutine_suspended;
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

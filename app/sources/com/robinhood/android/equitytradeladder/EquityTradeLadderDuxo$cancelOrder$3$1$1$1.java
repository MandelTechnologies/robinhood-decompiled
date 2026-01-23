package com.robinhood.android.equitytradeladder;

import com.robinhood.models.p320db.Order;
import io.reactivex.Completable;
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
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: EquityTradeLadderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$cancelOrder$3$1$1$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {2196}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class EquityTradeLadderDuxo$cancelOrder$3$1$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Order $order;
    int label;
    final /* synthetic */ EquityTradeLadderDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityTradeLadderDuxo$cancelOrder$3$1$1$1(EquityTradeLadderDuxo equityTradeLadderDuxo, Order order, Continuation<? super EquityTradeLadderDuxo$cancelOrder$3$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = equityTradeLadderDuxo;
        this.$order = order;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EquityTradeLadderDuxo$cancelOrder$3$1$1$1(this.this$0, this.$order, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EquityTradeLadderDuxo$cancelOrder$3$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Completable completableCancelOrder = this.this$0.orderStore.cancelOrder(this.$order.getId());
            this.label = 1;
            if (RxAwait3.await(completableCancelOrder, this) == coroutine_suspended) {
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

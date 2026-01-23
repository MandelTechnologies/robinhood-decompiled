package com.robinhood.android.equities.orderactions;

import com.robinhood.models.api.EquityOrderState;
import com.robinhood.models.p320db.Order;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: EquityPendingOrderActionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/Order;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equities.orderactions.EquityPendingOrderActionDuxo$cancelOrder$2$1", m3645f = "EquityPendingOrderActionDuxo.kt", m3646l = {88}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.orderactions.EquityPendingOrderActionDuxo$cancelOrder$2$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityPendingOrderActionDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends Order>>, Object> {
    final /* synthetic */ EquityPendingOrderActionDuxo $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityPendingOrderActionDuxo2(EquityPendingOrderActionDuxo equityPendingOrderActionDuxo, Continuation<? super EquityPendingOrderActionDuxo2> continuation) {
        super(2, continuation);
        this.$this_runCatching = equityPendingOrderActionDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EquityPendingOrderActionDuxo2(this.$this_runCatching, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends Order>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Optional<Order>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<Order>> continuation) {
        return ((EquityPendingOrderActionDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.$this_runCatching.orderStore.cancelOrderAndPoll(this.$this_runCatching.args.getEquityOrderId())), Integer.MAX_VALUE, null, 2, null);
        C147361 c147361 = new C147361(null);
        this.label = 1;
        Object objFirst = FlowKt.first(flowBuffer$default, c147361, this);
        return objFirst == coroutine_suspended ? coroutine_suspended : objFirst;
    }

    /* compiled from: EquityPendingOrderActionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/Order;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.orderactions.EquityPendingOrderActionDuxo$cancelOrder$2$1$1", m3645f = "EquityPendingOrderActionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.orderactions.EquityPendingOrderActionDuxo$cancelOrder$2$1$1 */
    static final class C147361 extends ContinuationImpl7 implements Function2<Optional<? extends Order>, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C147361(Continuation<? super C147361> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C147361 c147361 = new C147361(continuation);
            c147361.L$0 = obj;
            return c147361;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Optional<Order> optional, Continuation<? super Boolean> continuation) {
            return ((C147361) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Optional<? extends Order> optional, Continuation<? super Boolean> continuation) {
            return invoke2((Optional<Order>) optional, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            EquityOrderState state;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Order order = (Order) ((Optional) this.L$0).getOrNull();
            boolean z = false;
            if (order != null && (state = order.getState()) != null && state.isCancelled()) {
                z = true;
            }
            return boxing.boxBoolean(z);
        }
    }
}

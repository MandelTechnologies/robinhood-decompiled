package com.robinhood.librobinhood.data.store;

import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.models.api.ApiOrder;
import com.robinhood.models.api.OrderUpdateRequest;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OrderStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiOrder;", "<destruct>", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/models/api/OrderUpdateRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OrderStore$patchOrder$1", m3645f = "OrderStore.kt", m3646l = {97}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class OrderStore$patchOrder$1 extends ContinuationImpl7 implements Function2<Tuples2<? extends UUID, ? extends OrderUpdateRequest>, Continuation<? super ApiOrder>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderStore$patchOrder$1(OrderStore orderStore, Continuation<? super OrderStore$patchOrder$1> continuation) {
        super(2, continuation);
        this.this$0 = orderStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OrderStore$patchOrder$1 orderStore$patchOrder$1 = new OrderStore$patchOrder$1(this.this$0, continuation);
        orderStore$patchOrder$1.L$0 = obj;
        return orderStore$patchOrder$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends OrderUpdateRequest> tuples2, Continuation<? super ApiOrder> continuation) {
        return invoke2((Tuples2<UUID, OrderUpdateRequest>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<UUID, OrderUpdateRequest> tuples2, Continuation<? super ApiOrder> continuation) {
        return ((OrderStore$patchOrder$1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Tuples2 tuples2 = (Tuples2) this.L$0;
        UUID uuid = (UUID) tuples2.component1();
        OrderUpdateRequest orderUpdateRequest = (OrderUpdateRequest) tuples2.component2();
        EquitiesBrokeback equitiesBrokeback = this.this$0.equitiesBrokeback;
        this.label = 1;
        Object objPatchOrder = equitiesBrokeback.patchOrder(uuid, orderUpdateRequest, this);
        return objPatchOrder == coroutine_suspended ? coroutine_suspended : objPatchOrder;
    }
}

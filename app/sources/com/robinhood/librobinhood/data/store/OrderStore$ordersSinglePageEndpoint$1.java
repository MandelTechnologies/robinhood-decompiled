package com.robinhood.librobinhood.data.store;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiOrder;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OrderStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiOrder;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OrderStore$ordersSinglePageEndpoint$1", m3645f = "OrderStore.kt", m3646l = {111}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class OrderStore$ordersSinglePageEndpoint$1 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super PaginatedResult<? extends ApiOrder>>, Object> {
    int label;
    final /* synthetic */ OrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderStore$ordersSinglePageEndpoint$1(OrderStore orderStore, Continuation<? super OrderStore$ordersSinglePageEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = orderStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderStore$ordersSinglePageEndpoint$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Unit unit, Continuation<? super PaginatedResult<? extends ApiOrder>> continuation) {
        return invoke2(unit, (Continuation<? super PaginatedResult<ApiOrder>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Unit unit, Continuation<? super PaginatedResult<ApiOrder>> continuation) {
        return ((OrderStore$ordersSinglePageEndpoint$1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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
        OrderStore orderStore = this.this$0;
        this.label = 1;
        Object objFetchOrdersWithCursor = orderStore.fetchOrdersWithCursor(null, this);
        return objFetchOrdersWithCursor == coroutine_suspended ? coroutine_suspended : objFetchOrdersWithCursor;
    }
}

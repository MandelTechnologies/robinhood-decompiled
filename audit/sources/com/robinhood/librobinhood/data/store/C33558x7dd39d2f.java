package com.robinhood.librobinhood.data.store;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiAggregateOptionPosition;
import com.robinhood.models.api.ApiAggregateOptionPositionRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: AggregateOptionPositionStore.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/api/ApiAggregateOptionPositionRequest;", "Lcom/robinhood/models/PaginationCursor;", "result", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiAggregateOptionPosition;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$getAggregateOptionPositionsEndpoint$2", m3645f = "AggregateOptionPositionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$getAggregateOptionPositionsEndpoint$2 */
/* loaded from: classes13.dex */
final class C33558x7dd39d2f extends ContinuationImpl7 implements Function3<Tuples2<? extends ApiAggregateOptionPositionRequest, ? extends PaginationCursor>, PaginatedResult<? extends ApiAggregateOptionPosition>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AggregateOptionPositionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C33558x7dd39d2f(AggregateOptionPositionStore aggregateOptionPositionStore, Continuation<? super C33558x7dd39d2f> continuation) {
        super(3, continuation);
        this.this$0 = aggregateOptionPositionStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends ApiAggregateOptionPositionRequest, ? extends PaginationCursor> tuples2, PaginatedResult<? extends ApiAggregateOptionPosition> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<ApiAggregateOptionPositionRequest, PaginationCursor>) tuples2, (PaginatedResult<ApiAggregateOptionPosition>) paginatedResult, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<ApiAggregateOptionPositionRequest, PaginationCursor> tuples2, PaginatedResult<ApiAggregateOptionPosition> paginatedResult, Continuation<? super Unit> continuation) {
        C33558x7dd39d2f c33558x7dd39d2f = new C33558x7dd39d2f(this.this$0, continuation);
        c33558x7dd39d2f.L$0 = tuples2;
        c33558x7dd39d2f.L$1 = paginatedResult;
        return c33558x7dd39d2f.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Tuples2 tuples2 = (Tuples2) this.L$0;
        PaginatedResult<ApiAggregateOptionPosition> paginatedResult = (PaginatedResult) this.L$1;
        ApiAggregateOptionPositionRequest apiAggregateOptionPositionRequest = (ApiAggregateOptionPositionRequest) tuples2.component1();
        this.this$0.dao.insertAll(paginatedResult, apiAggregateOptionPositionRequest.getAccountNumbers(), apiAggregateOptionPositionRequest.getOptionChainIds());
        return Unit.INSTANCE;
    }
}

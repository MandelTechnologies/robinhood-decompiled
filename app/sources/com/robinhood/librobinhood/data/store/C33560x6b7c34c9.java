package com.robinhood.librobinhood.data.store;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiAggregateOptionPosition;
import com.robinhood.models.api.ApiAggregateOptionPositionWithIdsRequest;
import com.robinhood.models.dao.AggregateOptionPositionDao;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AggregateOptionPositionStore.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Lkotlin/Pair;", "Lcom/robinhood/models/api/ApiAggregateOptionPositionWithIdsRequest;", "Lcom/robinhood/models/PaginationCursor;", "result", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiAggregateOptionPosition;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$getAggregateOptionPositionsWithIdsEndpoint$2", m3645f = "AggregateOptionPositionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$getAggregateOptionPositionsWithIdsEndpoint$2 */
/* loaded from: classes13.dex */
final class C33560x6b7c34c9 extends ContinuationImpl7 implements Function3<Tuples2<? extends ApiAggregateOptionPositionWithIdsRequest, ? extends PaginationCursor>, PaginatedResult<? extends ApiAggregateOptionPosition>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AggregateOptionPositionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C33560x6b7c34c9(AggregateOptionPositionStore aggregateOptionPositionStore, Continuation<? super C33560x6b7c34c9> continuation) {
        super(3, continuation);
        this.this$0 = aggregateOptionPositionStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends ApiAggregateOptionPositionWithIdsRequest, ? extends PaginationCursor> tuples2, PaginatedResult<? extends ApiAggregateOptionPosition> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<ApiAggregateOptionPositionWithIdsRequest, PaginationCursor>) tuples2, (PaginatedResult<ApiAggregateOptionPosition>) paginatedResult, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<ApiAggregateOptionPositionWithIdsRequest, PaginationCursor> tuples2, PaginatedResult<ApiAggregateOptionPosition> paginatedResult, Continuation<? super Unit> continuation) {
        C33560x6b7c34c9 c33560x6b7c34c9 = new C33560x6b7c34c9(this.this$0, continuation);
        c33560x6b7c34c9.L$0 = paginatedResult;
        return c33560x6b7c34c9.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List results = ((PaginatedResult) this.L$0).getResults();
        AggregateOptionPositionDao aggregateOptionPositionDao = this.this$0.dao;
        Iterator it = results.iterator();
        while (it.hasNext()) {
            aggregateOptionPositionDao.insert((ApiAggregateOptionPosition) it.next());
        }
        return Unit.INSTANCE;
    }
}

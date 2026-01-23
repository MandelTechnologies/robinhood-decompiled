package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiAggregateOptionPosition;
import com.robinhood.models.api.ApiAggregateOptionPositionWithIdsRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AggregateOptionPositionStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiAggregateOptionPosition;", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/api/ApiAggregateOptionPositionWithIdsRequest;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$getAggregateOptionPositionsWithIdsEndpoint$1", m3645f = "AggregateOptionPositionStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$getAggregateOptionPositionsWithIdsEndpoint$1 */
/* loaded from: classes13.dex */
final class C33559x6b7c34c8 extends ContinuationImpl7 implements Function2<Tuples2<? extends ApiAggregateOptionPositionWithIdsRequest, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiAggregateOptionPosition>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AggregateOptionPositionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C33559x6b7c34c8(AggregateOptionPositionStore aggregateOptionPositionStore, Continuation<? super C33559x6b7c34c8> continuation) {
        super(2, continuation);
        this.this$0 = aggregateOptionPositionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C33559x6b7c34c8 c33559x6b7c34c8 = new C33559x6b7c34c8(this.this$0, continuation);
        c33559x6b7c34c8.L$0 = obj;
        return c33559x6b7c34c8;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends ApiAggregateOptionPositionWithIdsRequest, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiAggregateOptionPosition>> continuation) {
        return invoke2((Tuples2<ApiAggregateOptionPositionWithIdsRequest, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiAggregateOptionPosition>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<ApiAggregateOptionPositionWithIdsRequest, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiAggregateOptionPosition>> continuation) {
        return ((C33559x6b7c34c8) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiAggregateOptionPositionWithIdsRequest apiAggregateOptionPositionWithIdsRequest = (ApiAggregateOptionPositionWithIdsRequest) tuples2.component1();
        PaginationCursor paginationCursor = (PaginationCursor) tuples2.component2();
        OptionsApi optionsApi = this.this$0.optionsApi;
        List<String> accountNumbers = apiAggregateOptionPositionWithIdsRequest.getAccountNumbers();
        CommaSeparatedList<String> commaSeparatedList = accountNumbers != null ? new CommaSeparatedList<>(accountNumbers) : null;
        List<UUID> aggregatePositionIds = apiAggregateOptionPositionWithIdsRequest.getAggregatePositionIds();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(aggregatePositionIds, 10));
        Iterator<T> it = aggregatePositionIds.iterator();
        while (it.hasNext()) {
            String string2 = ((UUID) it.next()).toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            arrayList.add(string2);
        }
        CommaSeparatedList<String> commaSeparatedList2 = new CommaSeparatedList<>(arrayList);
        boolean nonzero = apiAggregateOptionPositionWithIdsRequest.getNonzero();
        String value = paginationCursor != null ? paginationCursor.getValue() : null;
        this.label = 1;
        Object aggregateOptionPositions = optionsApi.getAggregateOptionPositions(commaSeparatedList, commaSeparatedList2, nonzero, value, this);
        return aggregateOptionPositions == coroutine_suspended ? coroutine_suspended : aggregateOptionPositions;
    }
}

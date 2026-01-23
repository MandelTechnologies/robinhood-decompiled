package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiAggregateOptionPosition;
import com.robinhood.models.api.ApiAggregateOptionPositionRequest;
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
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiAggregateOptionPosition;", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/api/ApiAggregateOptionPositionRequest;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$getAggregateOptionPositionsEndpoint$1", m3645f = "AggregateOptionPositionStore.kt", m3646l = {123}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$getAggregateOptionPositionsEndpoint$1 */
/* loaded from: classes13.dex */
final class C33557x7dd39d2e extends ContinuationImpl7 implements Function2<Tuples2<? extends ApiAggregateOptionPositionRequest, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiAggregateOptionPosition>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AggregateOptionPositionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C33557x7dd39d2e(AggregateOptionPositionStore aggregateOptionPositionStore, Continuation<? super C33557x7dd39d2e> continuation) {
        super(2, continuation);
        this.this$0 = aggregateOptionPositionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C33557x7dd39d2e c33557x7dd39d2e = new C33557x7dd39d2e(this.this$0, continuation);
        c33557x7dd39d2e.L$0 = obj;
        return c33557x7dd39d2e;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends ApiAggregateOptionPositionRequest, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiAggregateOptionPosition>> continuation) {
        return invoke2((Tuples2<ApiAggregateOptionPositionRequest, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiAggregateOptionPosition>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<ApiAggregateOptionPositionRequest, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiAggregateOptionPosition>> continuation) {
        return ((C33557x7dd39d2e) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        CommaSeparatedList<String> commaSeparatedList;
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
        ApiAggregateOptionPositionRequest apiAggregateOptionPositionRequest = (ApiAggregateOptionPositionRequest) tuples2.component1();
        PaginationCursor paginationCursor = (PaginationCursor) tuples2.component2();
        OptionsApi optionsApi = this.this$0.optionsApi;
        CommaSeparatedList<String> commaSeparatedList2 = new CommaSeparatedList<>(apiAggregateOptionPositionRequest.getAccountNumbers());
        List<UUID> optionChainIds = apiAggregateOptionPositionRequest.getOptionChainIds();
        if (optionChainIds != null) {
            List<UUID> list = optionChainIds;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String string2 = ((UUID) it.next()).toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                arrayList.add(string2);
            }
            commaSeparatedList = new CommaSeparatedList<>(arrayList);
        } else {
            commaSeparatedList = null;
        }
        String value = paginationCursor != null ? paginationCursor.getValue() : null;
        this.label = 1;
        Object aggregateOptionPositions = optionsApi.getAggregateOptionPositions(commaSeparatedList2, commaSeparatedList, value, this);
        return aggregateOptionPositions == coroutine_suspended ? coroutine_suspended : aggregateOptionPositions;
    }
}

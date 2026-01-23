package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiAggregateOptionQuote;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: AggregateOptionQuoteStore.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiAggregateOptionQuote;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore$PositionRequest;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$endpoint$2", m3645f = "AggregateOptionQuoteStore.kt", m3646l = {53}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class AggregateOptionQuoteStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends Iterable<? extends AggregateOptionQuoteStore.PositionRequest>, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiAggregateOptionQuote>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AggregateOptionQuoteStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AggregateOptionQuoteStore2(AggregateOptionQuoteStore aggregateOptionQuoteStore, Continuation<? super AggregateOptionQuoteStore2> continuation) {
        super(2, continuation);
        this.this$0 = aggregateOptionQuoteStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AggregateOptionQuoteStore2 aggregateOptionQuoteStore2 = new AggregateOptionQuoteStore2(this.this$0, continuation);
        aggregateOptionQuoteStore2.L$0 = obj;
        return aggregateOptionQuoteStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Iterable<? extends AggregateOptionQuoteStore.PositionRequest>, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiAggregateOptionQuote>> continuation) {
        return invoke2((Tuples2<? extends Iterable<AggregateOptionQuoteStore.PositionRequest>, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiAggregateOptionQuote>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<? extends Iterable<AggregateOptionQuoteStore.PositionRequest>, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiAggregateOptionQuote>> continuation) {
        return ((AggregateOptionQuoteStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Iterable iterable = (Iterable) tuples2.component1();
        OptionsApi optionsApi = this.this$0.optionsApi;
        String strJoinToString$default = CollectionsKt.joinToString$default(iterable, ",", null, null, 0, null, new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$endpoint$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ((AggregateOptionQuoteStore.PositionRequest) obj2).getInstrumentIds();
            }
        }, 30, null);
        String strJoinToString$default2 = CollectionsKt.joinToString$default(iterable, ",", null, null, 0, null, new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$endpoint$2$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ((AggregateOptionQuoteStore.PositionRequest) obj2).getRatios();
            }
        }, 30, null);
        String strJoinToString$default3 = CollectionsKt.joinToString$default(iterable, ",", null, null, 0, null, new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$endpoint$2$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ((AggregateOptionQuoteStore.PositionRequest) obj2).getStrategyIds();
            }
        }, 30, null);
        String strJoinToString$default4 = CollectionsKt.joinToString$default(iterable, ",", null, null, 0, null, new Function1() { // from class: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$endpoint$2$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ((AggregateOptionQuoteStore.PositionRequest) obj2).getTypes();
            }
        }, 30, null);
        this.label = 1;
        Object aggregateOptionQuotes = optionsApi.getAggregateOptionQuotes(strJoinToString$default, strJoinToString$default2, strJoinToString$default4, strJoinToString$default3, false, this);
        return aggregateOptionQuotes == coroutine_suspended ? coroutine_suspended : aggregateOptionQuotes;
    }
}

package com.robinhood.librobinhood.data.store;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiAggregateOptionQuote;
import com.robinhood.models.dao.AggregateOptionStrategyQuoteDao;
import com.robinhood.models.p320db.AggregateOptionStrategyQuote;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: AggregateOptionStrategyQuoteStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiAggregateOptionQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore$endpoint$3", m3645f = "AggregateOptionStrategyQuoteStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore$endpoint$3, reason: use source file name */
/* loaded from: classes13.dex */
final class AggregateOptionStrategyQuoteStore3 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends ApiAggregateOptionQuote>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Clock $clock;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AggregateOptionStrategyQuoteStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AggregateOptionStrategyQuoteStore3(AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore, Clock clock, Continuation<? super AggregateOptionStrategyQuoteStore3> continuation) {
        super(2, continuation);
        this.this$0 = aggregateOptionStrategyQuoteStore;
        this.$clock = clock;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AggregateOptionStrategyQuoteStore3 aggregateOptionStrategyQuoteStore3 = new AggregateOptionStrategyQuoteStore3(this.this$0, this.$clock, continuation);
        aggregateOptionStrategyQuoteStore3.L$0 = obj;
        return aggregateOptionStrategyQuoteStore3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiAggregateOptionQuote> paginatedResult, Continuation<? super Unit> continuation) {
        return ((AggregateOptionStrategyQuoteStore3) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiAggregateOptionQuote> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiAggregateOptionQuote>) paginatedResult, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        AggregateOptionStrategyQuote dbAggregateOptionStrategyQuote;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            PaginatedResult paginatedResult = (PaginatedResult) this.L$0;
            AggregateOptionStrategyQuoteDao aggregateOptionStrategyQuoteDao = this.this$0.dao;
            List<ApiAggregateOptionQuote> results = paginatedResult.getResults();
            Clock clock = this.$clock;
            ArrayList arrayList = new ArrayList();
            for (ApiAggregateOptionQuote apiAggregateOptionQuote : results) {
                if (apiAggregateOptionQuote != null) {
                    Instant instant = clock.instant();
                    Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
                    dbAggregateOptionStrategyQuote = apiAggregateOptionQuote.toDbAggregateOptionStrategyQuote(instant);
                } else {
                    dbAggregateOptionStrategyQuote = null;
                }
                if (dbAggregateOptionStrategyQuote != null) {
                    arrayList.add(dbAggregateOptionStrategyQuote);
                }
            }
            aggregateOptionStrategyQuoteDao.insert(arrayList);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

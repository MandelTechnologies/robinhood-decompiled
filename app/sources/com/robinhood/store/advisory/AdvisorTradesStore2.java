package com.robinhood.store.advisory;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.advisory.p304db.trade.AdvisorTrade;
import com.robinhood.models.advisory.p304db.trade.AdvisorTrade2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.internal.SourceDebugExtension;
import yoda.service.RestYoda;
import yoda.service.dashboard.AdvisorTradeDto;
import yoda.service.dashboard.ListAdvisorTradesRequestDto;
import yoda.service.dashboard.ListAdvisorTradesResponseDto;

/* compiled from: AdvisorTradesStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/advisory/db/trade/AdvisorTrade;", "<destruct>", "Lkotlin/Pair;", "Lyoda/service/dashboard/ListAdvisorTradesRequestDto;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.AdvisorTradesStore$advisorTradesEndpoint$1", m3645f = "AdvisorTradesStore.kt", m3646l = {44}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.store.advisory.AdvisorTradesStore$advisorTradesEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class AdvisorTradesStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends ListAdvisorTradesRequestDto, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends AdvisorTrade>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvisorTradesStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisorTradesStore2(AdvisorTradesStore advisorTradesStore, Continuation<? super AdvisorTradesStore2> continuation) {
        super(2, continuation);
        this.this$0 = advisorTradesStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvisorTradesStore2 advisorTradesStore2 = new AdvisorTradesStore2(this.this$0, continuation);
        advisorTradesStore2.L$0 = obj;
        return advisorTradesStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends ListAdvisorTradesRequestDto, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends AdvisorTrade>> continuation) {
        return invoke2((Tuples2<ListAdvisorTradesRequestDto, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<AdvisorTrade>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<ListAdvisorTradesRequestDto, PaginationCursor> tuples2, Continuation<? super PaginatedResult<AdvisorTrade>> continuation) {
        return ((AdvisorTradesStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ListAdvisorTradesRequestDto listAdvisorTradesRequestDto = (ListAdvisorTradesRequestDto) ((Tuples2) this.L$0).component1();
            RestYoda restYoda = this.this$0.yodaApi;
            this.label = 1;
            obj = restYoda.ListAdvisorTrades(listAdvisorTradesRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ListAdvisorTradesResponseDto listAdvisorTradesResponseDto = (ListAdvisorTradesResponseDto) obj;
        List<AdvisorTradeDto> advisor_trades = listAdvisorTradesResponseDto.getAdvisor_trades();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(advisor_trades, 10));
        Iterator<T> it = advisor_trades.iterator();
        while (it.hasNext()) {
            arrayList.add(AdvisorTrade2.toDbModel((AdvisorTradeDto) it.next()));
        }
        String next = listAdvisorTradesResponseDto.getNext();
        PaginationCursor paginationCursor = next != null ? new PaginationCursor(next) : null;
        String previous = listAdvisorTradesResponseDto.getPrevious();
        return new PaginatedResult(arrayList, previous != null ? new PaginationCursor(previous) : null, paginationCursor);
    }
}

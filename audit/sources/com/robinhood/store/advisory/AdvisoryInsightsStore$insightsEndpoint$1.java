package com.robinhood.store.advisory;

import advisory.proto.p008v1.AdvisoryInsightDto;
import advisory.proto.p008v1.AdvisoryService;
import advisory.proto.p008v1.GetAdvisoryInsightsRequestDto;
import advisory.proto.p008v1.GetAdvisoryInsightsResponseDto;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsight;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsightKt;
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
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AdvisoryInsightsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight;", "<destruct>", "Lkotlin/Pair;", "Ladvisory/proto/v1/GetAdvisoryInsightsRequestDto;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.AdvisoryInsightsStore$insightsEndpoint$1", m3645f = "AdvisoryInsightsStore.kt", m3646l = {48}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes12.dex */
final class AdvisoryInsightsStore$insightsEndpoint$1 extends ContinuationImpl7 implements Function2<Tuples2<? extends GetAdvisoryInsightsRequestDto, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends AdvisoryInsight>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvisoryInsightsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisoryInsightsStore$insightsEndpoint$1(AdvisoryInsightsStore advisoryInsightsStore, Continuation<? super AdvisoryInsightsStore$insightsEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = advisoryInsightsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvisoryInsightsStore$insightsEndpoint$1 advisoryInsightsStore$insightsEndpoint$1 = new AdvisoryInsightsStore$insightsEndpoint$1(this.this$0, continuation);
        advisoryInsightsStore$insightsEndpoint$1.L$0 = obj;
        return advisoryInsightsStore$insightsEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends GetAdvisoryInsightsRequestDto, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends AdvisoryInsight>> continuation) {
        return invoke2((Tuples2<GetAdvisoryInsightsRequestDto, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<AdvisoryInsight>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<GetAdvisoryInsightsRequestDto, PaginationCursor> tuples2, Continuation<? super PaginatedResult<AdvisoryInsight>> continuation) {
        return ((AdvisoryInsightsStore$insightsEndpoint$1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        GetAdvisoryInsightsRequestDto getAdvisoryInsightsRequestDto;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            GetAdvisoryInsightsRequestDto getAdvisoryInsightsRequestDto2 = (GetAdvisoryInsightsRequestDto) tuples2.component1();
            PaginationCursor paginationCursor = (PaginationCursor) tuples2.component2();
            AdvisoryService advisoryService = this.this$0.advisoryService;
            String account_number = getAdvisoryInsightsRequestDto2.getAccount_number();
            String value = paginationCursor != null ? paginationCursor.getValue() : null;
            Integer page_size = getAdvisoryInsightsRequestDto2.getPage_size();
            GetAdvisoryInsightsRequestDto getAdvisoryInsightsRequestDto3 = new GetAdvisoryInsightsRequestDto(value, boxing.boxInt(page_size != null ? page_size.intValue() : 10), account_number, getAdvisoryInsightsRequestDto2.getInsight_type());
            this.L$0 = getAdvisoryInsightsRequestDto2;
            this.label = 1;
            obj = advisoryService.GetAdvisoryInsights(getAdvisoryInsightsRequestDto3, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            getAdvisoryInsightsRequestDto = getAdvisoryInsightsRequestDto2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            getAdvisoryInsightsRequestDto = (GetAdvisoryInsightsRequestDto) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        AdvisoryInsightsStore advisoryInsightsStore = this.this$0;
        GetAdvisoryInsightsResponseDto getAdvisoryInsightsResponseDto = (GetAdvisoryInsightsResponseDto) obj;
        String prev = getAdvisoryInsightsResponseDto.getPrev();
        PaginationCursor paginationCursor2 = prev != null ? new PaginationCursor(prev) : null;
        String next = getAdvisoryInsightsResponseDto.getNext();
        PaginationCursor paginationCursor3 = next != null ? new PaginationCursor(next) : null;
        List<AdvisoryInsightDto> results = getAdvisoryInsightsResponseDto.getResults();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        Iterator<T> it = results.iterator();
        while (it.hasNext()) {
            arrayList.add(AdvisoryInsightKt.toDbModel$default((AdvisoryInsightDto) it.next(), getAdvisoryInsightsRequestDto.getAccount_number(), advisoryInsightsStore.clock, null, 0, 12, null));
        }
        return new PaginatedResult(arrayList, paginationCursor2, paginationCursor3);
    }
}

package com.robinhood.store.advisory;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsight;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AdvisoryInsightsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "paginatedResult", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.AdvisoryInsightsStore$insightsEndpoint$2", m3645f = "AdvisoryInsightsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AdvisoryInsightsStore$insightsEndpoint$2 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends AdvisoryInsight>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvisoryInsightsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisoryInsightsStore$insightsEndpoint$2(AdvisoryInsightsStore advisoryInsightsStore, Continuation<? super AdvisoryInsightsStore$insightsEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = advisoryInsightsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvisoryInsightsStore$insightsEndpoint$2 advisoryInsightsStore$insightsEndpoint$2 = new AdvisoryInsightsStore$insightsEndpoint$2(this.this$0, continuation);
        advisoryInsightsStore$insightsEndpoint$2.L$0 = obj;
        return advisoryInsightsStore$insightsEndpoint$2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<AdvisoryInsight> paginatedResult, Continuation<? super Unit> continuation) {
        return ((AdvisoryInsightsStore$insightsEndpoint$2) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends AdvisoryInsight> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<AdvisoryInsight>) paginatedResult, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.advisorInsightsDao.insert((Iterable) ((PaginatedResult) this.L$0).getResults());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

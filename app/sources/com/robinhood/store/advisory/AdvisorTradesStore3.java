package com.robinhood.store.advisory;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.advisory.p304db.trade.AdvisorTrade;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import yoda.service.dashboard.ListAdvisorTradesRequestDto;

/* compiled from: AdvisorTradesStore.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Lkotlin/Pair;", "Lyoda/service/dashboard/ListAdvisorTradesRequestDto;", "Lcom/robinhood/models/PaginationCursor;", "response", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/advisory/db/trade/AdvisorTrade;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.AdvisorTradesStore$advisorTradesEndpoint$2", m3645f = "AdvisorTradesStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.advisory.AdvisorTradesStore$advisorTradesEndpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class AdvisorTradesStore3 extends ContinuationImpl7 implements Function3<Tuples2<? extends ListAdvisorTradesRequestDto, ? extends PaginationCursor>, PaginatedResult<? extends AdvisorTrade>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvisorTradesStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisorTradesStore3(AdvisorTradesStore advisorTradesStore, Continuation<? super AdvisorTradesStore3> continuation) {
        super(3, continuation);
        this.this$0 = advisorTradesStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends ListAdvisorTradesRequestDto, ? extends PaginationCursor> tuples2, PaginatedResult<? extends AdvisorTrade> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<ListAdvisorTradesRequestDto, PaginationCursor>) tuples2, (PaginatedResult<AdvisorTrade>) paginatedResult, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<ListAdvisorTradesRequestDto, PaginationCursor> tuples2, PaginatedResult<AdvisorTrade> paginatedResult, Continuation<? super Unit> continuation) {
        AdvisorTradesStore3 advisorTradesStore3 = new AdvisorTradesStore3(this.this$0, continuation);
        advisorTradesStore3.L$0 = paginatedResult;
        return advisorTradesStore3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.dao.insert((Iterable) ((PaginatedResult) this.L$0).getResults());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

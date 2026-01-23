package com.robinhood.librobinhood.data.store;

import com.robinhood.models.PaginatedResult;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.dao.InvestmentScheduleDao;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: TraderInvestmentScheduleStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$getIndividualAccountInvestmentSchedules$2", m3645f = "TraderInvestmentScheduleStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$getIndividualAccountInvestmentSchedules$2 */
/* loaded from: classes13.dex */
final class C34409x7924097e extends ContinuationImpl7 implements Function2<PaginatedResult<? extends ApiInvestmentSchedule>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TraderInvestmentScheduleStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C34409x7924097e(TraderInvestmentScheduleStore traderInvestmentScheduleStore, Continuation<? super C34409x7924097e> continuation) {
        super(2, continuation);
        this.this$0 = traderInvestmentScheduleStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C34409x7924097e c34409x7924097e = new C34409x7924097e(this.this$0, continuation);
        c34409x7924097e.L$0 = obj;
        return c34409x7924097e;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiInvestmentSchedule> paginatedResult, Continuation<? super Unit> continuation) {
        return ((C34409x7924097e) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiInvestmentSchedule> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiInvestmentSchedule>) paginatedResult, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InvestmentScheduleDao.insertPaginated$default(this.this$0.dao, (PaginatedResult) this.L$0, null, null, 6, null);
        return Unit.INSTANCE;
    }
}

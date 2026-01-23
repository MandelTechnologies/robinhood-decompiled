package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.recurring.retrofit.RecurringApi;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: TraderInvestmentScheduleStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule;", "<unused var>", "", "cursor", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$getSelectedAccountInvestmentSchedules$1$results$1", m3645f = "TraderInvestmentScheduleStore.kt", m3646l = {495}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$getSelectedAccountInvestmentSchedules$1$results$1 */
/* loaded from: classes13.dex */
final class C34415x790ce5de extends ContinuationImpl7 implements Function3<String, PaginationCursor, Continuation<? super PaginatedResult<? extends ApiInvestmentSchedule>>, Object> {
    final /* synthetic */ String $accountNumber;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TraderInvestmentScheduleStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C34415x790ce5de(TraderInvestmentScheduleStore traderInvestmentScheduleStore, String str, Continuation<? super C34415x790ce5de> continuation) {
        super(3, continuation);
        this.this$0 = traderInvestmentScheduleStore;
        this.$accountNumber = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(String str, PaginationCursor paginationCursor, Continuation<? super PaginatedResult<? extends ApiInvestmentSchedule>> continuation) {
        return invoke2(str, paginationCursor, (Continuation<? super PaginatedResult<ApiInvestmentSchedule>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, PaginationCursor paginationCursor, Continuation<? super PaginatedResult<ApiInvestmentSchedule>> continuation) {
        C34415x790ce5de c34415x790ce5de = new C34415x790ce5de(this.this$0, this.$accountNumber, continuation);
        c34415x790ce5de.L$0 = paginationCursor;
        return c34415x790ce5de.invokeSuspend(Unit.INSTANCE);
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
        PaginationCursor paginationCursor = (PaginationCursor) this.L$0;
        RecurringApi recurringApi = this.this$0.recurringApi;
        String str = this.$accountNumber;
        String value = paginationCursor != null ? paginationCursor.getValue() : null;
        this.label = 1;
        Object investmentSchedules = recurringApi.getInvestmentSchedules(str, value, this);
        return investmentSchedules == coroutine_suspended ? coroutine_suspended : investmentSchedules;
    }
}

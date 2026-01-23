package com.robinhood.librobinhood.data.store;

import com.robinhood.models.PaginatedResult;
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
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\n"}, m3636d2 = {"<anonymous>", "", "accountNumber", "", "combinedResult", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$getSelectedAccountInvestmentSchedules$2", m3645f = "TraderInvestmentScheduleStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$getSelectedAccountInvestmentSchedules$2 */
/* loaded from: classes13.dex */
final class C34416xfcf2540 extends ContinuationImpl7 implements Function3<String, PaginatedResult<? extends ApiInvestmentSchedule>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ TraderInvestmentScheduleStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C34416xfcf2540(TraderInvestmentScheduleStore traderInvestmentScheduleStore, Continuation<? super C34416xfcf2540> continuation) {
        super(3, continuation);
        this.this$0 = traderInvestmentScheduleStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(String str, PaginatedResult<? extends ApiInvestmentSchedule> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2(str, (PaginatedResult<ApiInvestmentSchedule>) paginatedResult, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, PaginatedResult<ApiInvestmentSchedule> paginatedResult, Continuation<? super Unit> continuation) {
        C34416xfcf2540 c34416xfcf2540 = new C34416xfcf2540(this.this$0, continuation);
        c34416xfcf2540.L$0 = str;
        c34416xfcf2540.L$1 = paginatedResult;
        return c34416xfcf2540.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.dao.insertPaginated((String) this.L$0, (PaginatedResult) this.L$1);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

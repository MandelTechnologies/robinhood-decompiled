package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.recurring.retrofit.RecurringApi;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiInvestmentScheduleEvent;
import com.robinhood.recurring.models.api.ApiAssetType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: TraderInvestmentScheduleEventStore.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\"\u0010\u0003\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiInvestmentScheduleEvent;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore$getInvestmentScheduleEvents$1", m3645f = "TraderInvestmentScheduleEventStore.kt", m3646l = {94}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleEventStore$getInvestmentScheduleEvents$1, reason: use source file name */
/* loaded from: classes13.dex */
final class TraderInvestmentScheduleEventStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends Tuples2<? extends String, ? extends ApiAssetType>, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiInvestmentScheduleEvent>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TraderInvestmentScheduleEventStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TraderInvestmentScheduleEventStore2(TraderInvestmentScheduleEventStore traderInvestmentScheduleEventStore, Continuation<? super TraderInvestmentScheduleEventStore2> continuation) {
        super(2, continuation);
        this.this$0 = traderInvestmentScheduleEventStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TraderInvestmentScheduleEventStore2 traderInvestmentScheduleEventStore2 = new TraderInvestmentScheduleEventStore2(this.this$0, continuation);
        traderInvestmentScheduleEventStore2.L$0 = obj;
        return traderInvestmentScheduleEventStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Tuples2<? extends String, ? extends ApiAssetType>, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiInvestmentScheduleEvent>> continuation) {
        return invoke2((Tuples2<? extends Tuples2<String, ? extends ApiAssetType>, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiInvestmentScheduleEvent>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<? extends Tuples2<String, ? extends ApiAssetType>, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiInvestmentScheduleEvent>> continuation) {
        return ((TraderInvestmentScheduleEventStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Tuples2 tuples22 = (Tuples2) tuples2.component1();
        PaginationCursor paginationCursor = (PaginationCursor) tuples2.component2();
        String str = (String) tuples22.component1();
        ApiAssetType apiAssetType = (ApiAssetType) tuples22.component2();
        RecurringApi recurringApi = this.this$0.recurringApi;
        String value = paginationCursor != null ? paginationCursor.getValue() : null;
        this.label = 1;
        Object investmentScheduleEvents = recurringApi.getInvestmentScheduleEvents(apiAssetType, str, value, this);
        return investmentScheduleEvents == coroutine_suspended ? coroutine_suspended : investmentScheduleEvents;
    }
}

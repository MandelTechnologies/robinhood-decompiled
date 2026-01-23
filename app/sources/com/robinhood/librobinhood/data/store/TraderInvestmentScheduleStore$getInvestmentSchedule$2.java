package com.robinhood.librobinhood.data.store;

import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: TraderInvestmentScheduleStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$getInvestmentSchedule$2", m3645f = "TraderInvestmentScheduleStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class TraderInvestmentScheduleStore$getInvestmentSchedule$2 extends ContinuationImpl7 implements Function2<ApiInvestmentSchedule, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TraderInvestmentScheduleStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TraderInvestmentScheduleStore$getInvestmentSchedule$2(TraderInvestmentScheduleStore traderInvestmentScheduleStore, Continuation<? super TraderInvestmentScheduleStore$getInvestmentSchedule$2> continuation) {
        super(2, continuation);
        this.this$0 = traderInvestmentScheduleStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TraderInvestmentScheduleStore$getInvestmentSchedule$2 traderInvestmentScheduleStore$getInvestmentSchedule$2 = new TraderInvestmentScheduleStore$getInvestmentSchedule$2(this.this$0, continuation);
        traderInvestmentScheduleStore$getInvestmentSchedule$2.L$0 = obj;
        return traderInvestmentScheduleStore$getInvestmentSchedule$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiInvestmentSchedule apiInvestmentSchedule, Continuation<? super Unit> continuation) {
        return ((TraderInvestmentScheduleStore$getInvestmentSchedule$2) create(apiInvestmentSchedule, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.dao.insert((ApiInvestmentSchedule) this.L$0);
        return Unit.INSTANCE;
    }
}

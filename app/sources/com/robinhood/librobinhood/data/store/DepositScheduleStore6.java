package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.cashier.Cashier;
import com.robinhood.models.api.ApiDepositSchedule;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DepositScheduleStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiDepositSchedule;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/api/ApiDepositSchedule$Request;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.DepositScheduleStore$updateDepositScheduleEndpoint$1", m3645f = "DepositScheduleStore.kt", m3646l = {36}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.DepositScheduleStore$updateDepositScheduleEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class DepositScheduleStore6 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends ApiDepositSchedule.Request>, Continuation<? super ApiDepositSchedule>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DepositScheduleStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DepositScheduleStore6(DepositScheduleStore depositScheduleStore, Continuation<? super DepositScheduleStore6> continuation) {
        super(2, continuation);
        this.this$0 = depositScheduleStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DepositScheduleStore6 depositScheduleStore6 = new DepositScheduleStore6(this.this$0, continuation);
        depositScheduleStore6.L$0 = obj;
        return depositScheduleStore6;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends ApiDepositSchedule.Request> tuples2, Continuation<? super ApiDepositSchedule> continuation) {
        return invoke2((Tuples2<String, ApiDepositSchedule.Request>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, ApiDepositSchedule.Request> tuples2, Continuation<? super ApiDepositSchedule> continuation) {
        return ((DepositScheduleStore6) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        String str = (String) tuples2.component1();
        ApiDepositSchedule.Request request = (ApiDepositSchedule.Request) tuples2.component2();
        Cashier cashier = this.this$0.cashier;
        this.label = 1;
        Object objUpdateDepositSchedule = cashier.updateDepositSchedule(str, request, this);
        return objUpdateDepositSchedule == coroutine_suspended ? coroutine_suspended : objUpdateDepositSchedule;
    }
}

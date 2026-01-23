package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.recurring.retrofit.RecurringApi;
import com.robinhood.models.api.ApiScheduleAlert;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ScheduleAlertStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/ApiScheduleAlert;", "<destruct>", "Lkotlin/Pair;", "Ljava/util/UUID;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ScheduleAlertStore$endpoint$1", m3645f = "ScheduleAlertStore.kt", m3646l = {29}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.ScheduleAlertStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class ScheduleAlertStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends UUID, ? extends String>, Continuation<? super Optional<? extends ApiScheduleAlert>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ScheduleAlertStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScheduleAlertStore2(ScheduleAlertStore scheduleAlertStore, Continuation<? super ScheduleAlertStore2> continuation) {
        super(2, continuation);
        this.this$0 = scheduleAlertStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScheduleAlertStore2 scheduleAlertStore2 = new ScheduleAlertStore2(this.this$0, continuation);
        scheduleAlertStore2.L$0 = obj;
        return scheduleAlertStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends String> tuples2, Continuation<? super Optional<? extends ApiScheduleAlert>> continuation) {
        return invoke2((Tuples2<UUID, String>) tuples2, (Continuation<? super Optional<ApiScheduleAlert>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<UUID, String> tuples2, Continuation<? super Optional<ApiScheduleAlert>> continuation) {
        return ((ScheduleAlertStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            UUID uuid = (UUID) tuples2.component1();
            String str = (String) tuples2.component2();
            RecurringApi recurringApi = this.this$0.recurringApi;
            this.label = 1;
            obj = recurringApi.getScheduleAlert(uuid, str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Optional3.asOptional(obj);
    }
}

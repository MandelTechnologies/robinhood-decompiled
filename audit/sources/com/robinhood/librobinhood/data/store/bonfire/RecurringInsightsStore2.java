package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.recurring.retrofit.RecurringApi;
import com.robinhood.models.api.bonfire.ApiRecurringInsightsPageResponse;
import com.robinhood.models.p320db.bonfire.RecurringInsightsPageResponse;
import com.robinhood.models.p320db.bonfire.RecurringInsightsPageResponse2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RecurringInsightsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/bonfire/RecurringInsightsPageResponse;", "scheduleId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.RecurringInsightsStore$endpoint$1", m3645f = "RecurringInsightsStore.kt", m3646l = {25}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.RecurringInsightsStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class RecurringInsightsStore2 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super RecurringInsightsPageResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RecurringInsightsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecurringInsightsStore2(RecurringInsightsStore recurringInsightsStore, Continuation<? super RecurringInsightsStore2> continuation) {
        super(2, continuation);
        this.this$0 = recurringInsightsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecurringInsightsStore2 recurringInsightsStore2 = new RecurringInsightsStore2(this.this$0, continuation);
        recurringInsightsStore2.L$0 = obj;
        return recurringInsightsStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super RecurringInsightsPageResponse> continuation) {
        return ((RecurringInsightsStore2) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UUID uuid = (UUID) this.L$0;
            RecurringApi recurringApi = this.this$0.recurringApi;
            this.label = 1;
            obj = recurringApi.getRecurringInsightsPage(uuid, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return RecurringInsightsPageResponse2.toDbModel((ApiRecurringInsightsPageResponse) obj);
    }
}

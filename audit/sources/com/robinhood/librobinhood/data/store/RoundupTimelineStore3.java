package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.pluto.ApiRoundupTimeline;
import com.robinhood.models.p320db.mcduckling.RoundupTimeline2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RoundupTimelineStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "apiRoundupTimeline", "Lcom/robinhood/models/api/pluto/ApiRoundupTimeline;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RoundupTimelineStore$endpoint$2", m3645f = "RoundupTimelineStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.RoundupTimelineStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class RoundupTimelineStore3 extends ContinuationImpl7 implements Function2<ApiRoundupTimeline, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RoundupTimelineStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoundupTimelineStore3(RoundupTimelineStore roundupTimelineStore, Continuation<? super RoundupTimelineStore3> continuation) {
        super(2, continuation);
        this.this$0 = roundupTimelineStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RoundupTimelineStore3 roundupTimelineStore3 = new RoundupTimelineStore3(this.this$0, continuation);
        roundupTimelineStore3.L$0 = obj;
        return roundupTimelineStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiRoundupTimeline apiRoundupTimeline, Continuation<? super Unit> continuation) {
        return ((RoundupTimelineStore3) create(apiRoundupTimeline, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.dao.insert(RoundupTimeline2.toDbModel((ApiRoundupTimeline) this.L$0));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

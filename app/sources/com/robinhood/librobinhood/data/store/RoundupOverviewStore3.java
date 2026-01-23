package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.pluto.ApiRoundupOverview;
import com.robinhood.models.p320db.mcduckling.RoundupOverview2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RoundupOverviewStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "apiRoundupOverview", "Lcom/robinhood/models/api/pluto/ApiRoundupOverview;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RoundupOverviewStore$endpoint$2", m3645f = "RoundupOverviewStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.RoundupOverviewStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class RoundupOverviewStore3 extends ContinuationImpl7 implements Function2<ApiRoundupOverview, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RoundupOverviewStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoundupOverviewStore3(RoundupOverviewStore roundupOverviewStore, Continuation<? super RoundupOverviewStore3> continuation) {
        super(2, continuation);
        this.this$0 = roundupOverviewStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RoundupOverviewStore3 roundupOverviewStore3 = new RoundupOverviewStore3(this.this$0, continuation);
        roundupOverviewStore3.L$0 = obj;
        return roundupOverviewStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiRoundupOverview apiRoundupOverview, Continuation<? super Unit> continuation) {
        return ((RoundupOverviewStore3) create(apiRoundupOverview, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.dao.insert(RoundupOverview2.toDbModel((ApiRoundupOverview) this.L$0));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

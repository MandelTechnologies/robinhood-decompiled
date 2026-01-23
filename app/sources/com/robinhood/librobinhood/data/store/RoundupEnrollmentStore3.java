package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.pluto.ApiRoundupEnrollment;
import com.robinhood.models.p320db.mcduckling.RoundupEnrollment2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RoundupEnrollmentStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "apiRoundupEnrollment", "Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RoundupEnrollmentStore$endpoint$2", m3645f = "RoundupEnrollmentStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.RoundupEnrollmentStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class RoundupEnrollmentStore3 extends ContinuationImpl7 implements Function2<ApiRoundupEnrollment, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RoundupEnrollmentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoundupEnrollmentStore3(RoundupEnrollmentStore roundupEnrollmentStore, Continuation<? super RoundupEnrollmentStore3> continuation) {
        super(2, continuation);
        this.this$0 = roundupEnrollmentStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RoundupEnrollmentStore3 roundupEnrollmentStore3 = new RoundupEnrollmentStore3(this.this$0, continuation);
        roundupEnrollmentStore3.L$0 = obj;
        return roundupEnrollmentStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiRoundupEnrollment apiRoundupEnrollment, Continuation<? super Unit> continuation) {
        return ((RoundupEnrollmentStore3) create(apiRoundupEnrollment, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.dao.insert(RoundupEnrollment2.toDbModel((ApiRoundupEnrollment) this.L$0));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

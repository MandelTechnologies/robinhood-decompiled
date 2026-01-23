package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.bonfire.ApiEarlyPayEnrollment;
import com.robinhood.models.p320db.EarlyPayEnrollment2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EarlyPayEnrollmentStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/api/bonfire/ApiEarlyPayEnrollment;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.EarlyPayEnrollmentStore$saveAction$1", m3645f = "EarlyPayEnrollmentStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.EarlyPayEnrollmentStore$saveAction$1, reason: use source file name */
/* loaded from: classes13.dex */
final class EarlyPayEnrollmentStore4 extends ContinuationImpl7 implements Function2<ApiEarlyPayEnrollment, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EarlyPayEnrollmentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EarlyPayEnrollmentStore4(EarlyPayEnrollmentStore earlyPayEnrollmentStore, Continuation<? super EarlyPayEnrollmentStore4> continuation) {
        super(2, continuation);
        this.this$0 = earlyPayEnrollmentStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EarlyPayEnrollmentStore4 earlyPayEnrollmentStore4 = new EarlyPayEnrollmentStore4(this.this$0, continuation);
        earlyPayEnrollmentStore4.L$0 = obj;
        return earlyPayEnrollmentStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiEarlyPayEnrollment apiEarlyPayEnrollment, Continuation<? super Unit> continuation) {
        return ((EarlyPayEnrollmentStore4) create(apiEarlyPayEnrollment, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.dao.insert(EarlyPayEnrollment2.toDbModel((ApiEarlyPayEnrollment) this.L$0));
        return Unit.INSTANCE;
    }
}

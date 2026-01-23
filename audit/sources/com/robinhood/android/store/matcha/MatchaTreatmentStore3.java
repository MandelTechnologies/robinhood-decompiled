package com.robinhood.android.store.matcha;

import com.robinhood.android.models.matcha.api.ApiMatchaTreatment;
import com.robinhood.models.p320db.matcha.MatchaTreatment2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MatchaTreatmentStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/models/matcha/api/ApiMatchaTreatment;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.store.matcha.MatchaTreatmentStore$getTreatment$2", m3645f = "MatchaTreatmentStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.store.matcha.MatchaTreatmentStore$getTreatment$2, reason: use source file name */
/* loaded from: classes5.dex */
final class MatchaTreatmentStore3 extends ContinuationImpl7 implements Function2<ApiMatchaTreatment, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MatchaTreatmentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchaTreatmentStore3(MatchaTreatmentStore matchaTreatmentStore, Continuation<? super MatchaTreatmentStore3> continuation) {
        super(2, continuation);
        this.this$0 = matchaTreatmentStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MatchaTreatmentStore3 matchaTreatmentStore3 = new MatchaTreatmentStore3(this.this$0, continuation);
        matchaTreatmentStore3.L$0 = obj;
        return matchaTreatmentStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiMatchaTreatment apiMatchaTreatment, Continuation<? super Unit> continuation) {
        return ((MatchaTreatmentStore3) create(apiMatchaTreatment, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.dao.insert(MatchaTreatment2.toDbModel((ApiMatchaTreatment) this.L$0));
        return Unit.INSTANCE;
    }
}

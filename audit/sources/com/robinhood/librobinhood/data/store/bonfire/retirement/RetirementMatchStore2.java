package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.api.ApiRetirementMatchResponse;
import com.robinhood.android.models.retirement.p194db.RetirementMatchRate;
import com.robinhood.android.models.retirement.p194db.RetirementMatchRate3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RetirementMatchStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/retirement/db/RetirementMatchRate;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementMatchStore$endpoint$1", m3645f = "RetirementMatchStore.kt", m3646l = {25}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementMatchStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class RetirementMatchStore2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super RetirementMatchRate>, Object> {
    int label;
    final /* synthetic */ RetirementMatchStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementMatchStore2(RetirementMatchStore retirementMatchStore, Continuation<? super RetirementMatchStore2> continuation) {
        super(2, continuation);
        this.this$0 = retirementMatchStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RetirementMatchStore2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super RetirementMatchRate> continuation) {
        return ((RetirementMatchStore2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RetirementApi retirementApi = this.this$0.retirementApi;
            this.label = 1;
            obj = retirementApi.getRetirementMatchRate(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return RetirementMatchRate3.toDbModel((ApiRetirementMatchResponse) obj);
    }
}

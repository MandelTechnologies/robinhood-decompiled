package com.robinhood.lib.sweep.enrollment;

import com.robinhood.android.api.gold.GoldApi;
import com.robinhood.models.api.bonfire.ApiGoldSweepEnrollment;
import com.robinhood.models.api.bonfire.ApiGoldSweepEnrollmentBody;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SweepEnrollmentStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiGoldSweepEnrollment;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore$postGoldSweepEndpoint$1", m3645f = "SweepEnrollmentStore.kt", m3646l = {98}, m3647m = "invokeSuspend")
/* loaded from: classes27.dex */
final class SweepEnrollmentStore$postGoldSweepEndpoint$1 extends ContinuationImpl7 implements Function2<String, Continuation<? super ApiGoldSweepEnrollment>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SweepEnrollmentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SweepEnrollmentStore$postGoldSweepEndpoint$1(SweepEnrollmentStore sweepEnrollmentStore, Continuation<? super SweepEnrollmentStore$postGoldSweepEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = sweepEnrollmentStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SweepEnrollmentStore$postGoldSweepEndpoint$1 sweepEnrollmentStore$postGoldSweepEndpoint$1 = new SweepEnrollmentStore$postGoldSweepEndpoint$1(this.this$0, continuation);
        sweepEnrollmentStore$postGoldSweepEndpoint$1.L$0 = obj;
        return sweepEnrollmentStore$postGoldSweepEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super ApiGoldSweepEnrollment> continuation) {
        return ((SweepEnrollmentStore$postGoldSweepEndpoint$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
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
        String str = (String) this.L$0;
        GoldApi goldApi = this.this$0.goldApi;
        ApiGoldSweepEnrollmentBody apiGoldSweepEnrollmentBody = new ApiGoldSweepEnrollmentBody(null, str, 1, null);
        this.label = 1;
        Object objEnrollInSweep = goldApi.enrollInSweep(apiGoldSweepEnrollmentBody, this);
        return objEnrollInSweep == coroutine_suspended ? coroutine_suspended : objEnrollInSweep;
    }
}

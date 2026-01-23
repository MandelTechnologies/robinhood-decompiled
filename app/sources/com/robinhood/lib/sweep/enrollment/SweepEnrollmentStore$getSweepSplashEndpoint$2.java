package com.robinhood.lib.sweep.enrollment;

import com.robinhood.models.api.bonfire.ApiSweepSplash;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SweepEnrollmentStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/models/api/bonfire/ApiSweepSplash;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore$getSweepSplashEndpoint$2", m3645f = "SweepEnrollmentStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes27.dex */
final class SweepEnrollmentStore$getSweepSplashEndpoint$2 extends ContinuationImpl7 implements Function2<ApiSweepSplash, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SweepEnrollmentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SweepEnrollmentStore$getSweepSplashEndpoint$2(SweepEnrollmentStore sweepEnrollmentStore, Continuation<? super SweepEnrollmentStore$getSweepSplashEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = sweepEnrollmentStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SweepEnrollmentStore$getSweepSplashEndpoint$2 sweepEnrollmentStore$getSweepSplashEndpoint$2 = new SweepEnrollmentStore$getSweepSplashEndpoint$2(this.this$0, continuation);
        sweepEnrollmentStore$getSweepSplashEndpoint$2.L$0 = obj;
        return sweepEnrollmentStore$getSweepSplashEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiSweepSplash apiSweepSplash, Continuation<? super Unit> continuation) {
        return ((SweepEnrollmentStore$getSweepSplashEndpoint$2) create(apiSweepSplash, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ApiSweepSplash apiSweepSplash = (ApiSweepSplash) this.L$0;
        this.this$0.getSweepSplashRelay(apiSweepSplash.getAccount_number()).accept(apiSweepSplash);
        return Unit.INSTANCE;
    }
}

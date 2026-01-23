package com.robinhood.lib.sweep.enrollment;

import com.robinhood.lib.sweep.enrollment.api.ApiSweepEnrollment;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SweepEnrollmentStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/lib/sweep/enrollment/api/ApiSweepEnrollment;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore$postEndpoint$2", m3645f = "SweepEnrollmentStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes27.dex */
final class SweepEnrollmentStore$postEndpoint$2 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends ApiSweepEnrollment>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SweepEnrollmentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SweepEnrollmentStore$postEndpoint$2(SweepEnrollmentStore sweepEnrollmentStore, Continuation<? super SweepEnrollmentStore$postEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = sweepEnrollmentStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SweepEnrollmentStore$postEndpoint$2 sweepEnrollmentStore$postEndpoint$2 = new SweepEnrollmentStore$postEndpoint$2(this.this$0, continuation);
        sweepEnrollmentStore$postEndpoint$2.L$0 = obj;
        return sweepEnrollmentStore$postEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends ApiSweepEnrollment> tuples2, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<String, ApiSweepEnrollment>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, ApiSweepEnrollment> tuples2, Continuation<? super Unit> continuation) {
        return ((SweepEnrollmentStore$postEndpoint$2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            String str = (String) tuples2.component1();
            this.this$0.getEnrollmentRelay(str).accept((ApiSweepEnrollment) tuples2.component2());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

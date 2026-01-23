package com.robinhood.lib.sweep.enrollment;

import com.robinhood.lib.sweep.enrollment.api.ApiSweepEnrollment;
import com.robinhood.lib.sweep.enrollment.api.SweepEnrollmentApi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SweepEnrollmentStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/robinhood/lib/sweep/enrollment/api/ApiSweepEnrollment;", "accountNumber"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore$getEndpoint$1", m3645f = "SweepEnrollmentStore.kt", m3646l = {46}, m3647m = "invokeSuspend")
/* loaded from: classes27.dex */
final class SweepEnrollmentStore$getEndpoint$1 extends ContinuationImpl7 implements Function2<String, Continuation<? super Tuples2<? extends String, ? extends ApiSweepEnrollment>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SweepEnrollmentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SweepEnrollmentStore$getEndpoint$1(SweepEnrollmentStore sweepEnrollmentStore, Continuation<? super SweepEnrollmentStore$getEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = sweepEnrollmentStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SweepEnrollmentStore$getEndpoint$1 sweepEnrollmentStore$getEndpoint$1 = new SweepEnrollmentStore$getEndpoint$1(this.this$0, continuation);
        sweepEnrollmentStore$getEndpoint$1.L$0 = obj;
        return sweepEnrollmentStore$getEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(String str, Continuation<? super Tuples2<? extends String, ? extends ApiSweepEnrollment>> continuation) {
        return invoke2(str, (Continuation<? super Tuples2<String, ApiSweepEnrollment>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, Continuation<? super Tuples2<String, ApiSweepEnrollment>> continuation) {
        return ((SweepEnrollmentStore$getEndpoint$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str2 = (String) this.L$0;
            SweepEnrollmentApi sweepEnrollmentApi = this.this$0.sweepOnboardingApi;
            this.L$0 = str2;
            this.label = 1;
            Object sweepEnrollment = sweepEnrollmentApi.getSweepEnrollment(str2, this);
            if (sweepEnrollment == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = str2;
            obj = sweepEnrollment;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return Tuples4.m3642to(str, obj);
    }
}

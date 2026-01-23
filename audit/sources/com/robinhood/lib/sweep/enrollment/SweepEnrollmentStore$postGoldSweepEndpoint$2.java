package com.robinhood.lib.sweep.enrollment;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.models.api.bonfire.ApiGoldSweepEnrollment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: SweepEnrollmentStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
/* synthetic */ class SweepEnrollmentStore$postGoldSweepEndpoint$2 extends AdaptedFunctionReference implements Function2<ApiGoldSweepEnrollment, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    SweepEnrollmentStore$postGoldSweepEndpoint$2(Object obj) {
        super(2, obj, BehaviorRelay.class, "accept", "accept(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiGoldSweepEnrollment apiGoldSweepEnrollment, Continuation<? super Unit> continuation) {
        return SweepEnrollmentStore.postGoldSweepEndpoint$accept((BehaviorRelay) this.receiver, apiGoldSweepEnrollment, continuation);
    }
}

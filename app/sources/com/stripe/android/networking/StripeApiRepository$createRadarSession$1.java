package com.stripe.android.networking;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripeApiRepository.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.networking.StripeApiRepository", m3645f = "StripeApiRepository.kt", m3646l = {1017, 1025}, m3647m = "createRadarSession-gIAlu-s")
/* loaded from: classes22.dex */
final class StripeApiRepository$createRadarSession$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripeApiRepository$createRadarSession$1(StripeApiRepository stripeApiRepository, Continuation<? super StripeApiRepository$createRadarSession$1> continuation) {
        super(continuation);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo26877createRadarSessiongIAlus = this.this$0.mo26877createRadarSessiongIAlus(null, this);
        return objMo26877createRadarSessiongIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo26877createRadarSessiongIAlus : Result.m28549boximpl(objMo26877createRadarSessiongIAlus);
    }
}

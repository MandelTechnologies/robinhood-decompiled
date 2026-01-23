package com.stripe.android.networking;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripeApiRepository.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.networking.StripeApiRepository", m3645f = "StripeApiRepository.kt", m3646l = {942}, m3647m = "start3ds2Auth-0E7RQCE")
/* loaded from: classes22.dex */
final class StripeApiRepository$start3ds2Auth$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripeApiRepository$start3ds2Auth$1(StripeApiRepository stripeApiRepository, Continuation<? super StripeApiRepository$start3ds2Auth$1> continuation) {
        super(continuation);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo26888start3ds2Auth0E7RQCE = this.this$0.mo26888start3ds2Auth0E7RQCE(null, null, this);
        return objMo26888start3ds2Auth0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo26888start3ds2Auth0E7RQCE : Result.m28549boximpl(objMo26888start3ds2Auth0E7RQCE);
    }
}

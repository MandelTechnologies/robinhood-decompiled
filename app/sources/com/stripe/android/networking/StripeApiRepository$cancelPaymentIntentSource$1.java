package com.stripe.android.networking;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripeApiRepository.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.networking.StripeApiRepository", m3645f = "StripeApiRepository.kt", m3646l = {380}, m3647m = "cancelPaymentIntentSource-BWLJW6A")
/* loaded from: classes22.dex */
final class StripeApiRepository$cancelPaymentIntentSource$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripeApiRepository$cancelPaymentIntentSource$1(StripeApiRepository stripeApiRepository, Continuation<? super StripeApiRepository$cancelPaymentIntentSource$1> continuation) {
        super(continuation);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo26869cancelPaymentIntentSourceBWLJW6A = this.this$0.mo26869cancelPaymentIntentSourceBWLJW6A(null, null, null, this);
        return objMo26869cancelPaymentIntentSourceBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo26869cancelPaymentIntentSourceBWLJW6A : Result.m28549boximpl(objMo26869cancelPaymentIntentSourceBWLJW6A);
    }
}

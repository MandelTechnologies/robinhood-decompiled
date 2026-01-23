package com.stripe.android.networking;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripeApiRepository.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.networking.StripeApiRepository", m3645f = "StripeApiRepository.kt", m3646l = {414}, m3647m = "confirmSetupIntent-BWLJW6A")
/* loaded from: classes22.dex */
final class StripeApiRepository$confirmSetupIntent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripeApiRepository$confirmSetupIntent$1(StripeApiRepository stripeApiRepository, Continuation<? super StripeApiRepository$confirmSetupIntent$1> continuation) {
        super(continuation);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo26873confirmSetupIntentBWLJW6A = this.this$0.mo26873confirmSetupIntentBWLJW6A(null, null, null, this);
        return objMo26873confirmSetupIntentBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo26873confirmSetupIntentBWLJW6A : Result.m28549boximpl(objMo26873confirmSetupIntentBWLJW6A);
    }
}

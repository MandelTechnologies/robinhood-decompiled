package com.stripe.android.payments;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PaymentFlowResultProcessor.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.payments.SetupIntentFlowResultProcessor", m3645f = "PaymentFlowResultProcessor.kt", m3646l = {370}, m3647m = "retrieveStripeIntent-BWLJW6A")
/* loaded from: classes22.dex */
final class SetupIntentFlowResultProcessor$retrieveStripeIntent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SetupIntentFlowResultProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetupIntentFlowResultProcessor$retrieveStripeIntent$1(SetupIntentFlowResultProcessor setupIntentFlowResultProcessor, Continuation<? super SetupIntentFlowResultProcessor$retrieveStripeIntent$1> continuation) {
        super(continuation);
        this.this$0 = setupIntentFlowResultProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo26916retrieveStripeIntentBWLJW6A = this.this$0.mo26916retrieveStripeIntentBWLJW6A(null, null, null, this);
        return objMo26916retrieveStripeIntentBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo26916retrieveStripeIntentBWLJW6A : Result.m28549boximpl(objMo26916retrieveStripeIntentBWLJW6A);
    }
}

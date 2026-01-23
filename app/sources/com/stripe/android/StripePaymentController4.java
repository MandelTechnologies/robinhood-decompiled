package com.stripe.android;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripePaymentController.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.StripePaymentController", m3645f = "StripePaymentController.kt", m3646l = {357}, m3647m = "getPaymentIntentResult-gIAlu-s")
/* renamed from: com.stripe.android.StripePaymentController$getPaymentIntentResult$1, reason: use source file name */
/* loaded from: classes10.dex */
final class StripePaymentController4 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripePaymentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripePaymentController4(StripePaymentController stripePaymentController, Continuation<? super StripePaymentController4> continuation) {
        super(continuation);
        this.this$0 = stripePaymentController;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo26836getPaymentIntentResultgIAlus = this.this$0.mo26836getPaymentIntentResultgIAlus(null, this);
        return objMo26836getPaymentIntentResultgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo26836getPaymentIntentResultgIAlus : Result.m28549boximpl(objMo26836getPaymentIntentResultgIAlus);
    }
}

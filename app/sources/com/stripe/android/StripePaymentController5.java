package com.stripe.android;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripePaymentController.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.StripePaymentController", m3645f = "StripePaymentController.kt", m3646l = {369}, m3647m = "getSetupIntentResult-gIAlu-s")
/* renamed from: com.stripe.android.StripePaymentController$getSetupIntentResult$1, reason: use source file name */
/* loaded from: classes10.dex */
final class StripePaymentController5 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripePaymentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripePaymentController5(StripePaymentController stripePaymentController, Continuation<? super StripePaymentController5> continuation) {
        super(continuation);
        this.this$0 = stripePaymentController;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo26837getSetupIntentResultgIAlus = this.this$0.mo26837getSetupIntentResultgIAlus(null, this);
        return objMo26837getSetupIntentResultgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo26837getSetupIntentResultgIAlus : Result.m28549boximpl(objMo26837getSetupIntentResultgIAlus);
    }
}

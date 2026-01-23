package com.stripe.android;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StripePaymentController.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.StripePaymentController", m3645f = "StripePaymentController.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE}, m3647m = "confirmSetupIntent-0E7RQCE")
/* renamed from: com.stripe.android.StripePaymentController$confirmSetupIntent$1, reason: use source file name */
/* loaded from: classes10.dex */
final class StripePaymentController3 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripePaymentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripePaymentController3(StripePaymentController stripePaymentController, Continuation<? super StripePaymentController3> continuation) {
        super(continuation);
        this.this$0 = stripePaymentController;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM26842confirmSetupIntent0E7RQCE = this.this$0.m26842confirmSetupIntent0E7RQCE(null, null, this);
        return objM26842confirmSetupIntent0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM26842confirmSetupIntent0E7RQCE : Result.m28549boximpl(objM26842confirmSetupIntent0E7RQCE);
    }
}

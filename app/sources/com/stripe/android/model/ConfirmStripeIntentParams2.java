package com.stripe.android.model;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfirmStripeIntentParams.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"createParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.model.ConfirmStripeIntentParamsKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class ConfirmStripeIntentParams2 {
    public static final PaymentMethodCreateParams createParams(ConfirmStripeIntentParams confirmStripeIntentParams) {
        Intrinsics.checkNotNullParameter(confirmStripeIntentParams, "<this>");
        if (confirmStripeIntentParams instanceof ConfirmPaymentIntentParams) {
            return ((ConfirmPaymentIntentParams) confirmStripeIntentParams).getPaymentMethodCreateParams();
        }
        if (confirmStripeIntentParams instanceof ConfirmSetupIntentParams) {
            return ((ConfirmSetupIntentParams) confirmStripeIntentParams).getPaymentMethodCreateParams();
        }
        throw new NoWhenBranchMatchedException();
    }
}

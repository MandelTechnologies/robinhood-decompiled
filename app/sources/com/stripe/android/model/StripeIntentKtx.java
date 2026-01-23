package com.stripe.android.model;

import com.stripe.android.StripePaymentController;
import com.stripe.android.model.PaymentMethod;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeIntentKtx.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/model/StripeIntent;", "", "getRequestCode", "(Lcom/stripe/android/model/StripeIntent;)I", "", "shouldRefresh", "(Lcom/stripe/android/model/StripeIntent;)Z", "", "Lcom/stripe/android/model/PaymentMethod$Type;", "REFRESHABLE_PAYMENT_METHODS", "Ljava/util/Set;", "getREFRESHABLE_PAYMENT_METHODS", "()Ljava/util/Set;", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.model.StripeIntentKtxKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class StripeIntentKtx {
    private static final Set<PaymentMethod.Type> REFRESHABLE_PAYMENT_METHODS = SetsKt.setOf(PaymentMethod.Type.WeChatPay);

    public static final int getRequestCode(StripeIntent stripeIntent) {
        Intrinsics.checkNotNullParameter(stripeIntent, "<this>");
        return StripePaymentController.INSTANCE.getRequestCode$payments_core_release(stripeIntent);
    }

    public static final boolean shouldRefresh(StripeIntent stripeIntent) {
        Intrinsics.checkNotNullParameter(stripeIntent, "<this>");
        if (!(stripeIntent instanceof PaymentIntent)) {
            return false;
        }
        Set<PaymentMethod.Type> set = REFRESHABLE_PAYMENT_METHODS;
        PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
        return CollectionsKt.contains(set, paymentMethod != null ? paymentMethod.type : null) && stripeIntent.requiresAction();
    }
}

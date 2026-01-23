package com.stripe.android.payments;

import android.content.Context;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.R$string;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.StripeErrorMapping;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentFlowFailureMessageFactory.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\f\u0010\u0011\u001a\u00020\u0012*\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "", "intent", "Lcom/stripe/android/model/StripeIntent;", "outcome", "", "createForPaymentIntent", "paymentIntent", "Lcom/stripe/android/model/PaymentIntent;", "createForSetupIntent", "setupIntent", "Lcom/stripe/android/model/SetupIntent;", "is3DS2", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public final class PaymentFlowFailureMessageFactory {
    private final Context context;

    public PaymentFlowFailureMessageFactory(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final String create(StripeIntent intent, int outcome) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (outcome == 4) {
            return this.context.getResources().getString(R$string.stripe_failure_reason_timed_out);
        }
        if (is3DS2(intent)) {
            return null;
        }
        if (intent.getStatus() != StripeIntent.Status.RequiresPaymentMethod && intent.getStatus() != StripeIntent.Status.RequiresAction) {
            return null;
        }
        if (intent instanceof PaymentIntent) {
            return createForPaymentIntent((PaymentIntent) intent);
        }
        if (intent instanceof SetupIntent) {
            return createForSetupIntent((SetupIntent) intent);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String createForPaymentIntent(PaymentIntent paymentIntent) {
        PaymentMethod paymentMethod;
        PaymentMethod.Type type2;
        if (paymentIntent.getStatus() != StripeIntent.Status.RequiresAction || ((paymentMethod = paymentIntent.getPaymentMethod()) != null && (type2 = paymentMethod.type) != null && type2.isVoucher)) {
            PaymentIntent.Error lastPaymentError = paymentIntent.getLastPaymentError();
            if (!Intrinsics.areEqual(lastPaymentError != null ? lastPaymentError.getCode() : null, "payment_intent_authentication_failure")) {
                PaymentIntent.Error lastPaymentError2 = paymentIntent.getLastPaymentError();
                if ((lastPaymentError2 != null ? lastPaymentError2.getType() : null) == PaymentIntent.Error.Type.CardError) {
                    return StripeErrorMapping.withLocalizedMessage(paymentIntent.getLastPaymentError(), this.context).getMessage();
                }
                return null;
            }
        }
        return this.context.getResources().getString(R$string.stripe_failure_reason_authentication);
    }

    private final String createForSetupIntent(SetupIntent setupIntent) {
        SetupIntent.Error lastSetupError = setupIntent.getLastSetupError();
        if (Intrinsics.areEqual(lastSetupError != null ? lastSetupError.getCode() : null, "setup_intent_authentication_failure")) {
            return this.context.getResources().getString(R$string.stripe_failure_reason_authentication);
        }
        SetupIntent.Error lastSetupError2 = setupIntent.getLastSetupError();
        if ((lastSetupError2 != null ? lastSetupError2.getType() : null) == SetupIntent.Error.Type.CardError) {
            return StripeErrorMapping.withLocalizedMessage(setupIntent.getLastSetupError(), this.context).getMessage();
        }
        return null;
    }

    private final boolean is3DS2(StripeIntent stripeIntent) {
        PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
        return (paymentMethod != null ? paymentMethod.type : null) == PaymentMethod.Type.Card && (stripeIntent.getNextActionData() instanceof StripeIntent.NextActionData.SdkData.Use3DS2);
    }
}

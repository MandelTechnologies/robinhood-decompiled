package com.stripe.android.view;

import androidx.view.result.ActivityResultCallback;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodsActivity.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
/* synthetic */ class PaymentMethodsActivity$onCreate$addPaymentMethodLauncher$1 implements ActivityResultCallback, FunctionAdapter {
    final /* synthetic */ PaymentMethodsActivity $tmp0;

    PaymentMethodsActivity$onCreate$addPaymentMethodLauncher$1(PaymentMethodsActivity paymentMethodsActivity) {
        this.$tmp0 = paymentMethodsActivity;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ActivityResultCallback) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.$tmp0, PaymentMethodsActivity.class, "onAddPaymentMethodResult", "onAddPaymentMethodResult$payments_core_release(Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.view.result.ActivityResultCallback
    public final void onActivityResult(AddPaymentMethodActivityStarter2 p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        this.$tmp0.onAddPaymentMethodResult$payments_core_release(p0);
    }
}

package com.stripe.android.payments.paymentlauncher;

import androidx.view.result.ActivityResultCallback;
import com.stripe.android.payments.Unvalidated;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentLauncherViewModel.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
/* synthetic */ class PaymentLauncherViewModel$register$1 implements ActivityResultCallback, FunctionAdapter {
    final /* synthetic */ PaymentLauncherViewModel $tmp0;

    PaymentLauncherViewModel$register$1(PaymentLauncherViewModel paymentLauncherViewModel) {
        this.$tmp0 = paymentLauncherViewModel;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ActivityResultCallback) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.$tmp0, PaymentLauncherViewModel.class, "onPaymentFlowResult", "onPaymentFlowResult$payments_core_release(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.view.result.ActivityResultCallback
    public final void onActivityResult(Unvalidated p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        this.$tmp0.onPaymentFlowResult$payments_core_release(p0);
    }
}

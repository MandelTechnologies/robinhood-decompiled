package com.stripe.android.payments.core.injection;

import com.stripe.android.PaymentAuthConfig;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* renamed from: com.stripe.android.payments.core.injection.Stripe3DSNextActionHandlerModule_Companion_ProvidePaymentAuthConfigFactory */
/* loaded from: classes22.dex */
public final class C42601x700f45a1 implements Factory<PaymentAuthConfig> {

    /* renamed from: com.stripe.android.payments.core.injection.Stripe3DSNextActionHandlerModule_Companion_ProvidePaymentAuthConfigFactory$InstanceHolder */
    private static final class InstanceHolder {
        private static final C42601x700f45a1 INSTANCE = new C42601x700f45a1();
    }

    @Override // javax.inject.Provider
    public PaymentAuthConfig get() {
        return providePaymentAuthConfig();
    }

    public static C42601x700f45a1 create() {
        return InstanceHolder.INSTANCE;
    }

    public static PaymentAuthConfig providePaymentAuthConfig() {
        return (PaymentAuthConfig) Preconditions.checkNotNullFromProvides(Stripe3DSNextActionHandlerModule.INSTANCE.providePaymentAuthConfig());
    }
}

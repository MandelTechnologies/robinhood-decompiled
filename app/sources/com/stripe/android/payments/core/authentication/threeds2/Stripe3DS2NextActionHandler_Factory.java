package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.PaymentAuthConfig;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;

/* loaded from: classes22.dex */
public final class Stripe3DS2NextActionHandler_Factory implements Factory<Stripe3DS2NextActionHandler> {
    private final Provider<PaymentAuthConfig> configProvider;
    private final Provider<Boolean> enableLoggingProvider;
    private final Provider<Set<String>> productUsageProvider;
    private final Provider<Function0<String>> publishableKeyProvider;

    public Stripe3DS2NextActionHandler_Factory(Provider<PaymentAuthConfig> provider, Provider<Boolean> provider2, Provider<Function0<String>> provider3, Provider<Set<String>> provider4) {
        this.configProvider = provider;
        this.enableLoggingProvider = provider2;
        this.publishableKeyProvider = provider3;
        this.productUsageProvider = provider4;
    }

    @Override // javax.inject.Provider
    public Stripe3DS2NextActionHandler get() {
        return newInstance(this.configProvider.get(), this.enableLoggingProvider.get().booleanValue(), this.publishableKeyProvider.get(), this.productUsageProvider.get());
    }

    public static Stripe3DS2NextActionHandler_Factory create(Provider<PaymentAuthConfig> provider, Provider<Boolean> provider2, Provider<Function0<String>> provider3, Provider<Set<String>> provider4) {
        return new Stripe3DS2NextActionHandler_Factory(provider, provider2, provider3, provider4);
    }

    public static Stripe3DS2NextActionHandler newInstance(PaymentAuthConfig paymentAuthConfig, boolean z, Function0<String> function0, Set<String> set) {
        return new Stripe3DS2NextActionHandler(paymentAuthConfig, z, function0, set);
    }
}

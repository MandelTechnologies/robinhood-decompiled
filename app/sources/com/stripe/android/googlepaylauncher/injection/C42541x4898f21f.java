package com.stripe.android.googlepaylauncher.injection;

import com.google.android.gms.wallet.PaymentsClient;
import com.stripe.android.googlepaylauncher.Config;
import com.stripe.android.googlepaylauncher.PaymentsClientFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* renamed from: com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherModule_Companion_ProvidePaymentsClientFactory */
/* loaded from: classes8.dex */
public final class C42541x4898f21f implements Factory<PaymentsClient> {
    private final Provider<Config> googlePayConfigProvider;
    private final Provider<PaymentsClientFactory> paymentsClientFactoryProvider;

    public C42541x4898f21f(Provider<Config> provider, Provider<PaymentsClientFactory> provider2) {
        this.googlePayConfigProvider = provider;
        this.paymentsClientFactoryProvider = provider2;
    }

    @Override // javax.inject.Provider
    public PaymentsClient get() {
        return providePaymentsClient(this.googlePayConfigProvider.get(), this.paymentsClientFactoryProvider.get());
    }

    public static C42541x4898f21f create(Provider<Config> provider, Provider<PaymentsClientFactory> provider2) {
        return new C42541x4898f21f(provider, provider2);
    }

    public static PaymentsClient providePaymentsClient(Config config, PaymentsClientFactory paymentsClientFactory) {
        return (PaymentsClient) Preconditions.checkNotNullFromProvides(GooglePayPaymentMethodLauncherModule.INSTANCE.providePaymentsClient(config, paymentsClientFactory));
    }
}

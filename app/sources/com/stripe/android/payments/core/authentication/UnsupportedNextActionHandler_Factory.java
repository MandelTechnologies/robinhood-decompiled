package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.view.AuthActivityStarterHost;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.functions.Function1;

/* loaded from: classes22.dex */
public final class UnsupportedNextActionHandler_Factory implements Factory<UnsupportedNextActionHandler> {
    private final Provider<Function1<AuthActivityStarterHost, PaymentRelayStarter>> paymentRelayStarterFactoryProvider;

    public UnsupportedNextActionHandler_Factory(Provider<Function1<AuthActivityStarterHost, PaymentRelayStarter>> provider) {
        this.paymentRelayStarterFactoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public UnsupportedNextActionHandler get() {
        return newInstance(this.paymentRelayStarterFactoryProvider.get());
    }

    public static UnsupportedNextActionHandler_Factory create(Provider<Function1<AuthActivityStarterHost, PaymentRelayStarter>> provider) {
        return new UnsupportedNextActionHandler_Factory(provider);
    }

    public static UnsupportedNextActionHandler newInstance(Function1<AuthActivityStarterHost, PaymentRelayStarter> function1) {
        return new UnsupportedNextActionHandler(function1);
    }
}

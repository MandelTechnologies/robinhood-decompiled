package com.stripe.android.payments.core.injection;

import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry;
import com.stripe.android.view.AuthActivityStarterHost;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.jvm.functions.Function1;

/* renamed from: com.stripe.android.payments.core.injection.NextActionHandlerModule_Companion_ProvidePaymentRelayStarterFactoryFactory */
/* loaded from: classes22.dex */
public final class C42599x94a494e8 implements Factory<Function1<AuthActivityStarterHost, PaymentRelayStarter>> {
    private final Provider<DefaultPaymentNextActionHandlerRegistry> registryProvider;

    public C42599x94a494e8(Provider<DefaultPaymentNextActionHandlerRegistry> provider) {
        this.registryProvider = provider;
    }

    @Override // javax.inject.Provider
    public Function1<AuthActivityStarterHost, PaymentRelayStarter> get() {
        return providePaymentRelayStarterFactory(DoubleCheck.lazy(this.registryProvider));
    }

    public static C42599x94a494e8 create(Provider<DefaultPaymentNextActionHandlerRegistry> provider) {
        return new C42599x94a494e8(provider);
    }

    public static Function1<AuthActivityStarterHost, PaymentRelayStarter> providePaymentRelayStarterFactory(Lazy<DefaultPaymentNextActionHandlerRegistry> lazy) {
        return (Function1) Preconditions.checkNotNullFromProvides(NextActionHandlerModule.INSTANCE.providePaymentRelayStarterFactory(lazy));
    }
}

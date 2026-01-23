package com.stripe.android.payments.core.injection;

import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry;
import com.stripe.android.view.AuthActivityStarterHost;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.jvm.functions.Function1;

/* renamed from: com.stripe.android.payments.core.injection.NextActionHandlerModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory */
/* loaded from: classes22.dex */
public final class C42598xe959d869 implements Factory<Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter>> {
    private final Provider<DefaultReturnUrl> defaultReturnUrlProvider;
    private final Provider<DefaultPaymentNextActionHandlerRegistry> registryProvider;

    public C42598xe959d869(Provider<DefaultPaymentNextActionHandlerRegistry> provider, Provider<DefaultReturnUrl> provider2) {
        this.registryProvider = provider;
        this.defaultReturnUrlProvider = provider2;
    }

    @Override // javax.inject.Provider
    public Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter> get() {
        return providePaymentBrowserAuthStarterFactory(DoubleCheck.lazy(this.registryProvider), this.defaultReturnUrlProvider.get());
    }

    public static C42598xe959d869 create(Provider<DefaultPaymentNextActionHandlerRegistry> provider, Provider<DefaultReturnUrl> provider2) {
        return new C42598xe959d869(provider, provider2);
    }

    public static Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter> providePaymentBrowserAuthStarterFactory(Lazy<DefaultPaymentNextActionHandlerRegistry> lazy, DefaultReturnUrl defaultReturnUrl) {
        return (Function1) Preconditions.checkNotNullFromProvides(NextActionHandlerModule.INSTANCE.providePaymentBrowserAuthStarterFactory(lazy, defaultReturnUrl));
    }
}

package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.view.AuthActivityStarterHost;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes22.dex */
public final class SourceNextActionHandler_Factory implements Factory<SourceNextActionHandler> {
    private final Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Provider<Boolean> enableLoggingProvider;
    private final Provider<Boolean> isInstantAppProvider;
    private final Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Provider<Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter>> paymentBrowserAuthStarterFactoryProvider;
    private final Provider<Function1<AuthActivityStarterHost, PaymentRelayStarter>> paymentRelayStarterFactoryProvider;
    private final Provider<Function0<String>> publishableKeyProvider;
    private final Provider<CoroutineContext> uiContextProvider;

    public SourceNextActionHandler_Factory(Provider<Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter>> provider, Provider<Function1<AuthActivityStarterHost, PaymentRelayStarter>> provider2, Provider<AnalyticsRequestExecutor> provider3, Provider<PaymentAnalyticsRequestFactory> provider4, Provider<Boolean> provider5, Provider<CoroutineContext> provider6, Provider<Function0<String>> provider7, Provider<Boolean> provider8) {
        this.paymentBrowserAuthStarterFactoryProvider = provider;
        this.paymentRelayStarterFactoryProvider = provider2;
        this.analyticsRequestExecutorProvider = provider3;
        this.paymentAnalyticsRequestFactoryProvider = provider4;
        this.enableLoggingProvider = provider5;
        this.uiContextProvider = provider6;
        this.publishableKeyProvider = provider7;
        this.isInstantAppProvider = provider8;
    }

    @Override // javax.inject.Provider
    public SourceNextActionHandler get() {
        return newInstance(this.paymentBrowserAuthStarterFactoryProvider.get(), this.paymentRelayStarterFactoryProvider.get(), this.analyticsRequestExecutorProvider.get(), this.paymentAnalyticsRequestFactoryProvider.get(), this.enableLoggingProvider.get().booleanValue(), this.uiContextProvider.get(), this.publishableKeyProvider.get(), this.isInstantAppProvider.get().booleanValue());
    }

    public static SourceNextActionHandler_Factory create(Provider<Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter>> provider, Provider<Function1<AuthActivityStarterHost, PaymentRelayStarter>> provider2, Provider<AnalyticsRequestExecutor> provider3, Provider<PaymentAnalyticsRequestFactory> provider4, Provider<Boolean> provider5, Provider<CoroutineContext> provider6, Provider<Function0<String>> provider7, Provider<Boolean> provider8) {
        return new SourceNextActionHandler_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static SourceNextActionHandler newInstance(Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter> function1, Function1<AuthActivityStarterHost, PaymentRelayStarter> function12, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z, CoroutineContext coroutineContext, Function0<String> function0, boolean z2) {
        return new SourceNextActionHandler(function1, function12, analyticsRequestExecutor, paymentAnalyticsRequestFactory, z, coroutineContext, function0, z2);
    }
}

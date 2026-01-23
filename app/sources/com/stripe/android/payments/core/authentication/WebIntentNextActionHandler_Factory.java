package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.view.AuthActivityStarterHost;
import dagger.internal.Factory;
import java.util.Map;
import javax.inject.Provider;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes22.dex */
public final class WebIntentNextActionHandler_Factory implements Factory<WebIntentNextActionHandler> {
    private final Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Provider<DefaultReturnUrl> defaultReturnUrlProvider;
    private final Provider<Boolean> enableLoggingProvider;
    private final Provider<Boolean> isInstantAppProvider;
    private final Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Provider<Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter>> paymentBrowserAuthStarterFactoryProvider;
    private final Provider<Function0<String>> publishableKeyProvider;
    private final Provider<RedirectResolver> redirectResolverProvider;
    private final Provider<Map<String, String>> threeDs1IntentReturnUrlMapProvider;
    private final Provider<CoroutineContext> uiContextProvider;

    public WebIntentNextActionHandler_Factory(Provider<Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter>> provider, Provider<AnalyticsRequestExecutor> provider2, Provider<PaymentAnalyticsRequestFactory> provider3, Provider<Boolean> provider4, Provider<CoroutineContext> provider5, Provider<Map<String, String>> provider6, Provider<Function0<String>> provider7, Provider<Boolean> provider8, Provider<DefaultReturnUrl> provider9, Provider<RedirectResolver> provider10) {
        this.paymentBrowserAuthStarterFactoryProvider = provider;
        this.analyticsRequestExecutorProvider = provider2;
        this.paymentAnalyticsRequestFactoryProvider = provider3;
        this.enableLoggingProvider = provider4;
        this.uiContextProvider = provider5;
        this.threeDs1IntentReturnUrlMapProvider = provider6;
        this.publishableKeyProvider = provider7;
        this.isInstantAppProvider = provider8;
        this.defaultReturnUrlProvider = provider9;
        this.redirectResolverProvider = provider10;
    }

    @Override // javax.inject.Provider
    public WebIntentNextActionHandler get() {
        return newInstance(this.paymentBrowserAuthStarterFactoryProvider.get(), this.analyticsRequestExecutorProvider.get(), this.paymentAnalyticsRequestFactoryProvider.get(), this.enableLoggingProvider.get().booleanValue(), this.uiContextProvider.get(), this.threeDs1IntentReturnUrlMapProvider.get(), this.publishableKeyProvider.get(), this.isInstantAppProvider.get().booleanValue(), this.defaultReturnUrlProvider.get(), this.redirectResolverProvider.get());
    }

    public static WebIntentNextActionHandler_Factory create(Provider<Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter>> provider, Provider<AnalyticsRequestExecutor> provider2, Provider<PaymentAnalyticsRequestFactory> provider3, Provider<Boolean> provider4, Provider<CoroutineContext> provider5, Provider<Map<String, String>> provider6, Provider<Function0<String>> provider7, Provider<Boolean> provider8, Provider<DefaultReturnUrl> provider9, Provider<RedirectResolver> provider10) {
        return new WebIntentNextActionHandler_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static WebIntentNextActionHandler newInstance(Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter> function1, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z, CoroutineContext coroutineContext, Map<String, String> map, Function0<String> function0, boolean z2, DefaultReturnUrl defaultReturnUrl, RedirectResolver redirectResolver) {
        return new WebIntentNextActionHandler(function1, analyticsRequestExecutor, paymentAnalyticsRequestFactory, z, coroutineContext, map, function0, z2, defaultReturnUrl, redirectResolver);
    }
}

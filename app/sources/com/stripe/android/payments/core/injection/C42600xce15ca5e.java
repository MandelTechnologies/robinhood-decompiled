package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandlerRegistry;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* renamed from: com.stripe.android.payments.core.injection.PaymentLauncherModule_ProvidePaymentNextActionHandlerRegistryFactory */
/* loaded from: classes22.dex */
public final class C42600xce15ca5e implements Factory<PaymentNextActionHandlerRegistry> {
    private final Provider<Context> contextProvider;
    private final Provider<Boolean> enableLoggingProvider;
    private final Provider<Boolean> includePaymentSheetNextHandlersProvider;
    private final Provider<Boolean> isInstantAppProvider;
    private final PaymentLauncherModule module;
    private final Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Provider<Set<String>> productUsageProvider;
    private final Provider<Function0<String>> publishableKeyProvider;
    private final Provider<Map<String, String>> threeDs1IntentReturnUrlMapProvider;
    private final Provider<CoroutineContext> uiContextProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public C42600xce15ca5e(PaymentLauncherModule paymentLauncherModule, Provider<Context> provider, Provider<Boolean> provider2, Provider<CoroutineContext> provider3, Provider<CoroutineContext> provider4, Provider<Map<String, String>> provider5, Provider<PaymentAnalyticsRequestFactory> provider6, Provider<Function0<String>> provider7, Provider<Set<String>> provider8, Provider<Boolean> provider9, Provider<Boolean> provider10) {
        this.module = paymentLauncherModule;
        this.contextProvider = provider;
        this.enableLoggingProvider = provider2;
        this.workContextProvider = provider3;
        this.uiContextProvider = provider4;
        this.threeDs1IntentReturnUrlMapProvider = provider5;
        this.paymentAnalyticsRequestFactoryProvider = provider6;
        this.publishableKeyProvider = provider7;
        this.productUsageProvider = provider8;
        this.isInstantAppProvider = provider9;
        this.includePaymentSheetNextHandlersProvider = provider10;
    }

    @Override // javax.inject.Provider
    public PaymentNextActionHandlerRegistry get() {
        return providePaymentNextActionHandlerRegistry(this.module, this.contextProvider.get(), this.enableLoggingProvider.get().booleanValue(), this.workContextProvider.get(), this.uiContextProvider.get(), this.threeDs1IntentReturnUrlMapProvider.get(), this.paymentAnalyticsRequestFactoryProvider.get(), this.publishableKeyProvider.get(), this.productUsageProvider.get(), this.isInstantAppProvider.get().booleanValue(), this.includePaymentSheetNextHandlersProvider.get().booleanValue());
    }

    public static C42600xce15ca5e create(PaymentLauncherModule paymentLauncherModule, Provider<Context> provider, Provider<Boolean> provider2, Provider<CoroutineContext> provider3, Provider<CoroutineContext> provider4, Provider<Map<String, String>> provider5, Provider<PaymentAnalyticsRequestFactory> provider6, Provider<Function0<String>> provider7, Provider<Set<String>> provider8, Provider<Boolean> provider9, Provider<Boolean> provider10) {
        return new C42600xce15ca5e(paymentLauncherModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static PaymentNextActionHandlerRegistry providePaymentNextActionHandlerRegistry(PaymentLauncherModule paymentLauncherModule, Context context, boolean z, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, Map<String, String> map, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Function0<String> function0, Set<String> set, boolean z2, boolean z3) {
        return (PaymentNextActionHandlerRegistry) Preconditions.checkNotNullFromProvides(paymentLauncherModule.providePaymentNextActionHandlerRegistry(context, z, coroutineContext, coroutineContext2, map, paymentAnalyticsRequestFactory, function0, set, z2, z3));
    }
}

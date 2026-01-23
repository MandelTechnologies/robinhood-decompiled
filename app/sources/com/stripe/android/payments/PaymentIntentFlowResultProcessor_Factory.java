package com.stripe.android.payments;

import android.content.Context;
import com.stripe.android.core.Logger;
import com.stripe.android.networking.StripeRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* loaded from: classes22.dex */
public final class PaymentIntentFlowResultProcessor_Factory implements Factory<PaymentIntentFlowResultProcessor> {
    private final Provider<Context> contextProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<Function0<String>> publishableKeyProvider;
    private final Provider<StripeRepository> stripeRepositoryProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public PaymentIntentFlowResultProcessor_Factory(Provider<Context> provider, Provider<Function0<String>> provider2, Provider<StripeRepository> provider3, Provider<Logger> provider4, Provider<CoroutineContext> provider5) {
        this.contextProvider = provider;
        this.publishableKeyProvider = provider2;
        this.stripeRepositoryProvider = provider3;
        this.loggerProvider = provider4;
        this.workContextProvider = provider5;
    }

    @Override // javax.inject.Provider
    public PaymentIntentFlowResultProcessor get() {
        return newInstance(this.contextProvider.get(), this.publishableKeyProvider.get(), this.stripeRepositoryProvider.get(), this.loggerProvider.get(), this.workContextProvider.get());
    }

    public static PaymentIntentFlowResultProcessor_Factory create(Provider<Context> provider, Provider<Function0<String>> provider2, Provider<StripeRepository> provider3, Provider<Logger> provider4, Provider<CoroutineContext> provider5) {
        return new PaymentIntentFlowResultProcessor_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static PaymentIntentFlowResultProcessor newInstance(Context context, Function0<String> function0, StripeRepository stripeRepository, Logger logger, CoroutineContext coroutineContext) {
        return new PaymentIntentFlowResultProcessor(context, function0, stripeRepository, logger, coroutineContext);
    }
}

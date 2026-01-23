package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2Service;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.coroutines.CoroutineContext;

/* renamed from: com.stripe.android.payments.core.injection.Stripe3ds2TransactionModule_Companion_ProvideStripeThreeDs2ServiceFactory */
/* loaded from: classes22.dex */
public final class C42603xd3c74c43 implements Factory<StripeThreeDs2Service> {
    private final Provider<Context> contextProvider;
    private final Provider<Boolean> enableLoggingProvider;
    private final Provider<CoroutineContext> workContextProvider;

    public C42603xd3c74c43(Provider<Context> provider, Provider<Boolean> provider2, Provider<CoroutineContext> provider3) {
        this.contextProvider = provider;
        this.enableLoggingProvider = provider2;
        this.workContextProvider = provider3;
    }

    @Override // javax.inject.Provider
    public StripeThreeDs2Service get() {
        return provideStripeThreeDs2Service(this.contextProvider.get(), this.enableLoggingProvider.get().booleanValue(), this.workContextProvider.get());
    }

    public static C42603xd3c74c43 create(Provider<Context> provider, Provider<Boolean> provider2, Provider<CoroutineContext> provider3) {
        return new C42603xd3c74c43(provider, provider2, provider3);
    }

    public static StripeThreeDs2Service provideStripeThreeDs2Service(Context context, boolean z, CoroutineContext coroutineContext) {
        return (StripeThreeDs2Service) Preconditions.checkNotNullFromProvides(Stripe3ds2TransactionModule.INSTANCE.provideStripeThreeDs2Service(context, z, coroutineContext));
    }
}

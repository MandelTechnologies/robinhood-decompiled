package com.stripe.android.googlepaylauncher;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes8.dex */
public final class DefaultPaymentsClientFactory_Factory implements Factory<PaymentsClientFactory2> {
    private final Provider<Context> contextProvider;

    public DefaultPaymentsClientFactory_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public PaymentsClientFactory2 get() {
        return newInstance(this.contextProvider.get());
    }

    public static DefaultPaymentsClientFactory_Factory create(Provider<Context> provider) {
        return new DefaultPaymentsClientFactory_Factory(provider);
    }

    public static PaymentsClientFactory2 newInstance(Context context) {
        return new PaymentsClientFactory2(context);
    }
}

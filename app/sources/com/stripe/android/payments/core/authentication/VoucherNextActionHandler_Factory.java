package com.stripe.android.payments.core.authentication;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes22.dex */
public final class VoucherNextActionHandler_Factory implements Factory<VoucherNextActionHandler> {
    private final Provider<Context> contextProvider;
    private final Provider<NoOpIntentNextActionHandler> noOpIntentAuthenticatorProvider;
    private final Provider<WebIntentNextActionHandler> webIntentAuthenticatorProvider;

    public VoucherNextActionHandler_Factory(Provider<WebIntentNextActionHandler> provider, Provider<NoOpIntentNextActionHandler> provider2, Provider<Context> provider3) {
        this.webIntentAuthenticatorProvider = provider;
        this.noOpIntentAuthenticatorProvider = provider2;
        this.contextProvider = provider3;
    }

    @Override // javax.inject.Provider
    public VoucherNextActionHandler get() {
        return newInstance(this.webIntentAuthenticatorProvider.get(), this.noOpIntentAuthenticatorProvider.get(), this.contextProvider.get());
    }

    public static VoucherNextActionHandler_Factory create(Provider<WebIntentNextActionHandler> provider, Provider<NoOpIntentNextActionHandler> provider2, Provider<Context> provider3) {
        return new VoucherNextActionHandler_Factory(provider, provider2, provider3);
    }

    public static VoucherNextActionHandler newInstance(WebIntentNextActionHandler webIntentNextActionHandler, NoOpIntentNextActionHandler noOpIntentNextActionHandler, Context context) {
        return new VoucherNextActionHandler(webIntentNextActionHandler, noOpIntentNextActionHandler, context);
    }
}

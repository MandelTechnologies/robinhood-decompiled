package com.stripe.android.payments.core.injection;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandler;
import com.stripe.android.payments.core.authentication.UnsupportedNextActionHandler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* renamed from: com.stripe.android.payments.core.injection.WeChatPayNextActionHandlerModule_ProvideWeChatNextActionHandler$payments_core_releaseFactory */
/* loaded from: classes22.dex */
public final class C42605xef1d3027 implements Factory<PaymentNextActionHandler<StripeIntent>> {
    private final WeChatPayNextActionHandlerModule module;
    private final Provider<UnsupportedNextActionHandler> unsupportedNextActionHandlerProvider;

    public C42605xef1d3027(WeChatPayNextActionHandlerModule weChatPayNextActionHandlerModule, Provider<UnsupportedNextActionHandler> provider) {
        this.module = weChatPayNextActionHandlerModule;
        this.unsupportedNextActionHandlerProvider = provider;
    }

    @Override // javax.inject.Provider
    public PaymentNextActionHandler<StripeIntent> get() {
        return provideWeChatNextActionHandler$payments_core_release(this.module, this.unsupportedNextActionHandlerProvider.get());
    }

    public static C42605xef1d3027 create(WeChatPayNextActionHandlerModule weChatPayNextActionHandlerModule, Provider<UnsupportedNextActionHandler> provider) {
        return new C42605xef1d3027(weChatPayNextActionHandlerModule, provider);
    }

    public static PaymentNextActionHandler<StripeIntent> provideWeChatNextActionHandler$payments_core_release(WeChatPayNextActionHandlerModule weChatPayNextActionHandlerModule, UnsupportedNextActionHandler unsupportedNextActionHandler) {
        return (PaymentNextActionHandler) Preconditions.checkNotNullFromProvides(weChatPayNextActionHandlerModule.provideWeChatNextActionHandler$payments_core_release(unsupportedNextActionHandler));
    }
}

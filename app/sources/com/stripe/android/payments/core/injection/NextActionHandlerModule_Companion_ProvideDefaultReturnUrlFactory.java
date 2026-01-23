package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.stripe.android.payments.DefaultReturnUrl;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* loaded from: classes22.dex */
public final class NextActionHandlerModule_Companion_ProvideDefaultReturnUrlFactory implements Factory<DefaultReturnUrl> {
    private final Provider<Context> contextProvider;

    public NextActionHandlerModule_Companion_ProvideDefaultReturnUrlFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public DefaultReturnUrl get() {
        return provideDefaultReturnUrl(this.contextProvider.get());
    }

    public static NextActionHandlerModule_Companion_ProvideDefaultReturnUrlFactory create(Provider<Context> provider) {
        return new NextActionHandlerModule_Companion_ProvideDefaultReturnUrlFactory(provider);
    }

    public static DefaultReturnUrl provideDefaultReturnUrl(Context context) {
        return (DefaultReturnUrl) Preconditions.checkNotNullFromProvides(NextActionHandlerModule.INSTANCE.provideDefaultReturnUrl(context));
    }
}

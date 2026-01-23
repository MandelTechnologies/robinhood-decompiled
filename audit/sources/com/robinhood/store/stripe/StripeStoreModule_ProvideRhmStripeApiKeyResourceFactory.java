package com.robinhood.store.stripe;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeStoreModule_ProvideRhmStripeApiKeyResourceFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0000H\u0007J\b\u0010\b\u001a\u00020\u0002H\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/store/stripe/StripeStoreModule_ProvideRhmStripeApiKeyResourceFactory;", "Ldagger/internal/Factory;", "", "<init>", "()V", "get", "()Ljava/lang/Integer;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideRhmStripeApiKeyResource", "lib-store-stripe_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StripeStoreModule_ProvideRhmStripeApiKeyResourceFactory implements Factory<Integer> {
    public static final StripeStoreModule_ProvideRhmStripeApiKeyResourceFactory INSTANCE = new StripeStoreModule_ProvideRhmStripeApiKeyResourceFactory();

    private StripeStoreModule_ProvideRhmStripeApiKeyResourceFactory() {
    }

    @Override // javax.inject.Provider
    public Integer get() {
        return Integer.valueOf(provideRhmStripeApiKeyResource());
    }

    @JvmStatic
    public static final StripeStoreModule_ProvideRhmStripeApiKeyResourceFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final int provideRhmStripeApiKeyResource() {
        Object objCheckNotNull = Preconditions.checkNotNull(Integer.valueOf(StripeStoreModule.INSTANCE.provideRhmStripeApiKeyResource()), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return ((Number) objCheckNotNull).intValue();
    }
}

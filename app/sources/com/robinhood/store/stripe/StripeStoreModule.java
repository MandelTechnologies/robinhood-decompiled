package com.robinhood.store.stripe;

import kotlin.Metadata;

/* compiled from: StripeStoreModule.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\b\u0010\u0007\u001a\u00020\u0005H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/store/stripe/StripeStoreModule;", "", "<init>", "()V", "provideRhmStripeApiKeyResource", "", "provideRhsStripeApiKeyResource", "provideRhyStripeApiKeyResource", "lib-store-stripe_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class StripeStoreModule {
    public static final StripeStoreModule INSTANCE = new StripeStoreModule();

    private StripeStoreModule() {
    }

    @RhmStripeApiKeyResource
    public final int provideRhmStripeApiKeyResource() {
        return C41573R.string.rhm_stripe_api_key;
    }

    @RhsStripeApiKeyResource
    public final int provideRhsStripeApiKeyResource() {
        return C41573R.string.rhs_stripe_api_key;
    }

    @RhyStripeApiKeyResource
    public final int provideRhyStripeApiKeyResource() {
        return C41573R.string.rhy_stripe_api_key;
    }
}

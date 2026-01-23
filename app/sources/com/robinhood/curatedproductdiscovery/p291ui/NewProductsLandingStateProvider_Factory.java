package com.robinhood.curatedproductdiscovery.p291ui;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: NewProductsLandingStateProvider_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingStateProvider_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingStateProvider;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "newInstance", "feature-curated-product-discovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class NewProductsLandingStateProvider_Factory implements Factory<NewProductsLandingStateProvider> {
    public static final int $stable = 0;
    public static final NewProductsLandingStateProvider_Factory INSTANCE = new NewProductsLandingStateProvider_Factory();

    private NewProductsLandingStateProvider_Factory() {
    }

    @Override // javax.inject.Provider
    public NewProductsLandingStateProvider get() {
        return newInstance();
    }

    @JvmStatic
    public static final NewProductsLandingStateProvider_Factory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final NewProductsLandingStateProvider newInstance() {
        return new NewProductsLandingStateProvider();
    }
}

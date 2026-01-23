package com.robinhood.android.notification.dagger;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.notification.data.ProductUpsellManager;
import com.robinhood.android.notification.data.ProductUpsellManager_Factory;
import com.robinhood.android.productupsell.contracts.ProductUpsellKey;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProductUpsellManagerFactory_Impl.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/notification/dagger/ProductUpsellManagerFactory_Impl;", "Lcom/robinhood/android/notification/dagger/ProductUpsellManagerFactory;", "delegateFactory", "Lcom/robinhood/android/notification/data/ProductUpsellManager_Factory;", "<init>", "(Lcom/robinhood/android/notification/data/ProductUpsellManager_Factory;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/notification/data/ProductUpsellManager;", "upsellKey", "Lcom/robinhood/android/productupsell/contracts/ProductUpsellKey;", "Companion", "feature-lib-product-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ProductUpsellManagerFactory_Impl implements ProductUpsellManagerFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ProductUpsellManager_Factory delegateFactory;

    @JvmStatic
    public static final Provider<ProductUpsellManagerFactory> create(ProductUpsellManager_Factory productUpsellManager_Factory) {
        return INSTANCE.create(productUpsellManager_Factory);
    }

    @JvmStatic
    public static final dagger.internal.Provider<ProductUpsellManagerFactory> createFactoryProvider(ProductUpsellManager_Factory productUpsellManager_Factory) {
        return INSTANCE.createFactoryProvider(productUpsellManager_Factory);
    }

    public ProductUpsellManagerFactory_Impl(ProductUpsellManager_Factory delegateFactory) {
        Intrinsics.checkNotNullParameter(delegateFactory, "delegateFactory");
        this.delegateFactory = delegateFactory;
    }

    @Override // com.robinhood.android.notification.dagger.ProductUpsellManagerFactory
    public ProductUpsellManager create(ProductUpsellKey upsellKey) {
        Intrinsics.checkNotNullParameter(upsellKey, "upsellKey");
        return this.delegateFactory.get(upsellKey);
    }

    /* compiled from: ProductUpsellManagerFactory_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/notification/dagger/ProductUpsellManagerFactory_Impl$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ljavax/inject/Provider;", "Lcom/robinhood/android/notification/dagger/ProductUpsellManagerFactory;", "delegateFactory", "Lcom/robinhood/android/notification/data/ProductUpsellManager_Factory;", "createFactoryProvider", "Ldagger/internal/Provider;", "feature-lib-product-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Provider<ProductUpsellManagerFactory> create(ProductUpsellManager_Factory delegateFactory) {
            Intrinsics.checkNotNullParameter(delegateFactory, "delegateFactory");
            Factory factoryCreate = InstanceFactory.create(new ProductUpsellManagerFactory_Impl(delegateFactory));
            Intrinsics.checkNotNullExpressionValue(factoryCreate, "create(...)");
            return factoryCreate;
        }

        @JvmStatic
        public final dagger.internal.Provider<ProductUpsellManagerFactory> createFactoryProvider(ProductUpsellManager_Factory delegateFactory) {
            Intrinsics.checkNotNullParameter(delegateFactory, "delegateFactory");
            Factory factoryCreate = InstanceFactory.create(new ProductUpsellManagerFactory_Impl(delegateFactory));
            Intrinsics.checkNotNullExpressionValue(factoryCreate, "create(...)");
            return factoryCreate;
        }
    }
}

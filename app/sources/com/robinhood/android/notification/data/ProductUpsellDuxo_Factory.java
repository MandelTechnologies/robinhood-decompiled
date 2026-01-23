package com.robinhood.android.notification.data;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.notification.dagger.ProductUpsellManagerFactory;
import com.robinhood.android.notification.data.ProductUpsellDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.contentful.StaticContentStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: ProductUpsellDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/notification/data/ProductUpsellDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/notification/data/ProductUpsellDuxo;", "staticContentStore", "Ljavax/inject/Provider;", "Lcom/robinhood/contentful/StaticContentStore;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "managerFactory", "Lcom/robinhood/android/notification/dagger/ProductUpsellManagerFactory;", "stateProvider", "Lcom/robinhood/android/notification/data/ProductUpsellDuxo$NotificationUpsellStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-product-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ProductUpsellDuxo_Factory implements Factory<ProductUpsellDuxo> {
    private final Provider<CoroutineDispatcher> dispatcher;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ProductUpsellManagerFactory> managerFactory;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<ProductUpsellDuxo.NotificationUpsellStateProvider> stateProvider;
    private final Provider<StaticContentStore> staticContentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final ProductUpsellDuxo_Factory create(Provider<StaticContentStore> provider, Provider<CoroutineDispatcher> provider2, Provider<ProductUpsellManagerFactory> provider3, Provider<ProductUpsellDuxo.NotificationUpsellStateProvider> provider4, Provider<DuxoBundle> provider5, Provider<SavedStateHandle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final ProductUpsellDuxo newInstance(StaticContentStore staticContentStore, CoroutineDispatcher coroutineDispatcher, ProductUpsellManagerFactory productUpsellManagerFactory, ProductUpsellDuxo.NotificationUpsellStateProvider notificationUpsellStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(staticContentStore, coroutineDispatcher, productUpsellManagerFactory, notificationUpsellStateProvider, duxoBundle, savedStateHandle);
    }

    public ProductUpsellDuxo_Factory(Provider<StaticContentStore> staticContentStore, Provider<CoroutineDispatcher> dispatcher, Provider<ProductUpsellManagerFactory> managerFactory, Provider<ProductUpsellDuxo.NotificationUpsellStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(managerFactory, "managerFactory");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.staticContentStore = staticContentStore;
        this.dispatcher = dispatcher;
        this.managerFactory = managerFactory;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public ProductUpsellDuxo get() {
        Companion companion = INSTANCE;
        StaticContentStore staticContentStore = this.staticContentStore.get();
        Intrinsics.checkNotNullExpressionValue(staticContentStore, "get(...)");
        CoroutineDispatcher coroutineDispatcher = this.dispatcher.get();
        Intrinsics.checkNotNullExpressionValue(coroutineDispatcher, "get(...)");
        ProductUpsellManagerFactory productUpsellManagerFactory = this.managerFactory.get();
        Intrinsics.checkNotNullExpressionValue(productUpsellManagerFactory, "get(...)");
        ProductUpsellDuxo.NotificationUpsellStateProvider notificationUpsellStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(notificationUpsellStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(staticContentStore, coroutineDispatcher, productUpsellManagerFactory, notificationUpsellStateProvider, duxoBundle, savedStateHandle);
    }

    /* compiled from: ProductUpsellDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/notification/data/ProductUpsellDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/notification/data/ProductUpsellDuxo_Factory;", "staticContentStore", "Ljavax/inject/Provider;", "Lcom/robinhood/contentful/StaticContentStore;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "managerFactory", "Lcom/robinhood/android/notification/dagger/ProductUpsellManagerFactory;", "stateProvider", "Lcom/robinhood/android/notification/data/ProductUpsellDuxo$NotificationUpsellStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/notification/data/ProductUpsellDuxo;", "feature-product-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ProductUpsellDuxo_Factory create(Provider<StaticContentStore> staticContentStore, Provider<CoroutineDispatcher> dispatcher, Provider<ProductUpsellManagerFactory> managerFactory, Provider<ProductUpsellDuxo.NotificationUpsellStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(managerFactory, "managerFactory");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new ProductUpsellDuxo_Factory(staticContentStore, dispatcher, managerFactory, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final ProductUpsellDuxo newInstance(StaticContentStore staticContentStore, CoroutineDispatcher dispatcher, ProductUpsellManagerFactory managerFactory, ProductUpsellDuxo.NotificationUpsellStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(managerFactory, "managerFactory");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new ProductUpsellDuxo(staticContentStore, dispatcher, managerFactory, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}

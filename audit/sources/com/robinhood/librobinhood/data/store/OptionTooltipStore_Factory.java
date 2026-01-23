package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.optionsproduct.OptionsProduct;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionTooltipStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionTooltipStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/OptionTooltipStore;", "optionsProductApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/optionsproduct/OptionsProduct;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OptionTooltipStore_Factory implements Factory<OptionTooltipStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<OptionsProduct> optionsProductApi;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final OptionTooltipStore_Factory create(Provider<OptionsProduct> provider, Provider<StoreBundle> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final OptionTooltipStore newInstance(OptionsProduct optionsProduct, StoreBundle storeBundle) {
        return INSTANCE.newInstance(optionsProduct, storeBundle);
    }

    public OptionTooltipStore_Factory(Provider<OptionsProduct> optionsProductApi, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(optionsProductApi, "optionsProductApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.optionsProductApi = optionsProductApi;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public OptionTooltipStore get() {
        Companion companion = INSTANCE;
        OptionsProduct optionsProduct = this.optionsProductApi.get();
        Intrinsics.checkNotNullExpressionValue(optionsProduct, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(optionsProduct, storeBundle);
    }

    /* compiled from: OptionTooltipStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionTooltipStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/OptionTooltipStore_Factory;", "optionsProductApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/optionsproduct/OptionsProduct;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/OptionTooltipStore;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionTooltipStore_Factory create(Provider<OptionsProduct> optionsProductApi, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(optionsProductApi, "optionsProductApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new OptionTooltipStore_Factory(optionsProductApi, storeBundle);
        }

        @JvmStatic
        public final OptionTooltipStore newInstance(OptionsProduct optionsProductApi, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(optionsProductApi, "optionsProductApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new OptionTooltipStore(optionsProductApi, storeBundle);
        }
    }
}

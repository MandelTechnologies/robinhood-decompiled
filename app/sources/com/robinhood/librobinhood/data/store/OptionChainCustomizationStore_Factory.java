package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.optionsproduct.OptionsProduct;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.dao.OptionChainAvailableMetricsDao;
import com.robinhood.models.dao.OptionChainCustomizationEducationDao;
import com.robinhood.models.dao.OptionChainSelectedMetricsDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainCustomizationStore_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;", "optionChainSelectedMetricsDao", "Ljavax/inject/Provider;", "Lcom/robinhood/models/dao/OptionChainSelectedMetricsDao;", "optionChainAvailableMetricsDao", "Lcom/robinhood/models/dao/OptionChainAvailableMetricsDao;", "optionChainCustomizationEducationDao", "Lcom/robinhood/models/dao/OptionChainCustomizationEducationDao;", "optionsProduct", "Lcom/robinhood/android/api/optionsproduct/OptionsProduct;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OptionChainCustomizationStore_Factory implements Factory<OptionChainCustomizationStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<OptionChainAvailableMetricsDao> optionChainAvailableMetricsDao;
    private final Provider<OptionChainCustomizationEducationDao> optionChainCustomizationEducationDao;
    private final Provider<OptionChainSelectedMetricsDao> optionChainSelectedMetricsDao;
    private final Provider<OptionsProduct> optionsProduct;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final OptionChainCustomizationStore_Factory create(Provider<OptionChainSelectedMetricsDao> provider, Provider<OptionChainAvailableMetricsDao> provider2, Provider<OptionChainCustomizationEducationDao> provider3, Provider<OptionsProduct> provider4, Provider<StoreBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final OptionChainCustomizationStore newInstance(OptionChainSelectedMetricsDao optionChainSelectedMetricsDao, OptionChainAvailableMetricsDao optionChainAvailableMetricsDao, OptionChainCustomizationEducationDao optionChainCustomizationEducationDao, OptionsProduct optionsProduct, StoreBundle storeBundle) {
        return INSTANCE.newInstance(optionChainSelectedMetricsDao, optionChainAvailableMetricsDao, optionChainCustomizationEducationDao, optionsProduct, storeBundle);
    }

    public OptionChainCustomizationStore_Factory(Provider<OptionChainSelectedMetricsDao> optionChainSelectedMetricsDao, Provider<OptionChainAvailableMetricsDao> optionChainAvailableMetricsDao, Provider<OptionChainCustomizationEducationDao> optionChainCustomizationEducationDao, Provider<OptionsProduct> optionsProduct, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(optionChainSelectedMetricsDao, "optionChainSelectedMetricsDao");
        Intrinsics.checkNotNullParameter(optionChainAvailableMetricsDao, "optionChainAvailableMetricsDao");
        Intrinsics.checkNotNullParameter(optionChainCustomizationEducationDao, "optionChainCustomizationEducationDao");
        Intrinsics.checkNotNullParameter(optionsProduct, "optionsProduct");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.optionChainSelectedMetricsDao = optionChainSelectedMetricsDao;
        this.optionChainAvailableMetricsDao = optionChainAvailableMetricsDao;
        this.optionChainCustomizationEducationDao = optionChainCustomizationEducationDao;
        this.optionsProduct = optionsProduct;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public OptionChainCustomizationStore get() {
        Companion companion = INSTANCE;
        OptionChainSelectedMetricsDao optionChainSelectedMetricsDao = this.optionChainSelectedMetricsDao.get();
        Intrinsics.checkNotNullExpressionValue(optionChainSelectedMetricsDao, "get(...)");
        OptionChainAvailableMetricsDao optionChainAvailableMetricsDao = this.optionChainAvailableMetricsDao.get();
        Intrinsics.checkNotNullExpressionValue(optionChainAvailableMetricsDao, "get(...)");
        OptionChainCustomizationEducationDao optionChainCustomizationEducationDao = this.optionChainCustomizationEducationDao.get();
        Intrinsics.checkNotNullExpressionValue(optionChainCustomizationEducationDao, "get(...)");
        OptionsProduct optionsProduct = this.optionsProduct.get();
        Intrinsics.checkNotNullExpressionValue(optionsProduct, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(optionChainSelectedMetricsDao, optionChainAvailableMetricsDao, optionChainCustomizationEducationDao, optionsProduct, storeBundle);
    }

    /* compiled from: OptionChainCustomizationStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore_Factory;", "optionChainSelectedMetricsDao", "Ljavax/inject/Provider;", "Lcom/robinhood/models/dao/OptionChainSelectedMetricsDao;", "optionChainAvailableMetricsDao", "Lcom/robinhood/models/dao/OptionChainAvailableMetricsDao;", "optionChainCustomizationEducationDao", "Lcom/robinhood/models/dao/OptionChainCustomizationEducationDao;", "optionsProduct", "Lcom/robinhood/android/api/optionsproduct/OptionsProduct;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionChainCustomizationStore_Factory create(Provider<OptionChainSelectedMetricsDao> optionChainSelectedMetricsDao, Provider<OptionChainAvailableMetricsDao> optionChainAvailableMetricsDao, Provider<OptionChainCustomizationEducationDao> optionChainCustomizationEducationDao, Provider<OptionsProduct> optionsProduct, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(optionChainSelectedMetricsDao, "optionChainSelectedMetricsDao");
            Intrinsics.checkNotNullParameter(optionChainAvailableMetricsDao, "optionChainAvailableMetricsDao");
            Intrinsics.checkNotNullParameter(optionChainCustomizationEducationDao, "optionChainCustomizationEducationDao");
            Intrinsics.checkNotNullParameter(optionsProduct, "optionsProduct");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new OptionChainCustomizationStore_Factory(optionChainSelectedMetricsDao, optionChainAvailableMetricsDao, optionChainCustomizationEducationDao, optionsProduct, storeBundle);
        }

        @JvmStatic
        public final OptionChainCustomizationStore newInstance(OptionChainSelectedMetricsDao optionChainSelectedMetricsDao, OptionChainAvailableMetricsDao optionChainAvailableMetricsDao, OptionChainCustomizationEducationDao optionChainCustomizationEducationDao, OptionsProduct optionsProduct, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(optionChainSelectedMetricsDao, "optionChainSelectedMetricsDao");
            Intrinsics.checkNotNullParameter(optionChainAvailableMetricsDao, "optionChainAvailableMetricsDao");
            Intrinsics.checkNotNullParameter(optionChainCustomizationEducationDao, "optionChainCustomizationEducationDao");
            Intrinsics.checkNotNullParameter(optionsProduct, "optionsProduct");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new OptionChainCustomizationStore(optionChainSelectedMetricsDao, optionChainAvailableMetricsDao, optionChainCustomizationEducationDao, optionsProduct, storeBundle);
        }
    }
}

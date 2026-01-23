package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.android.api.options.retrofit.OptionsBonfireApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyDetailStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionStrategyDetailStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/OptionStrategyDetailStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "optionsApi", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "optionsBonfireApi", "Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OptionStrategyDetailStore_Factory implements Factory<OptionStrategyDetailStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<LazyMoshi> moshi;
    private final Provider<OptionsApi> optionsApi;
    private final Provider<OptionsBonfireApi> optionsBonfireApi;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final OptionStrategyDetailStore_Factory create(Provider<StoreBundle> provider, Provider<LazyMoshi> provider2, Provider<OptionsApi> provider3, Provider<OptionsBonfireApi> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final OptionStrategyDetailStore newInstance(StoreBundle storeBundle, LazyMoshi lazyMoshi, OptionsApi optionsApi, OptionsBonfireApi optionsBonfireApi) {
        return INSTANCE.newInstance(storeBundle, lazyMoshi, optionsApi, optionsBonfireApi);
    }

    public OptionStrategyDetailStore_Factory(Provider<StoreBundle> storeBundle, Provider<LazyMoshi> moshi, Provider<OptionsApi> optionsApi, Provider<OptionsBonfireApi> optionsBonfireApi) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        Intrinsics.checkNotNullParameter(optionsBonfireApi, "optionsBonfireApi");
        this.storeBundle = storeBundle;
        this.moshi = moshi;
        this.optionsApi = optionsApi;
        this.optionsBonfireApi = optionsBonfireApi;
    }

    @Override // javax.inject.Provider
    public OptionStrategyDetailStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        OptionsApi optionsApi = this.optionsApi.get();
        Intrinsics.checkNotNullExpressionValue(optionsApi, "get(...)");
        OptionsBonfireApi optionsBonfireApi = this.optionsBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(optionsBonfireApi, "get(...)");
        return companion.newInstance(storeBundle, lazyMoshi, optionsApi, optionsBonfireApi);
    }

    /* compiled from: OptionStrategyDetailStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionStrategyDetailStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/OptionStrategyDetailStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "optionsApi", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "optionsBonfireApi", "Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;", "newInstance", "Lcom/robinhood/librobinhood/data/store/OptionStrategyDetailStore;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionStrategyDetailStore_Factory create(Provider<StoreBundle> storeBundle, Provider<LazyMoshi> moshi, Provider<OptionsApi> optionsApi, Provider<OptionsBonfireApi> optionsBonfireApi) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
            Intrinsics.checkNotNullParameter(optionsBonfireApi, "optionsBonfireApi");
            return new OptionStrategyDetailStore_Factory(storeBundle, moshi, optionsApi, optionsBonfireApi);
        }

        @JvmStatic
        public final OptionStrategyDetailStore newInstance(StoreBundle storeBundle, LazyMoshi moshi, OptionsApi optionsApi, OptionsBonfireApi optionsBonfireApi) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
            Intrinsics.checkNotNullParameter(optionsBonfireApi, "optionsBonfireApi");
            return new OptionStrategyDetailStore(storeBundle, moshi, optionsApi, optionsBonfireApi);
        }
    }
}

package com.robinhood.android.lib.store.p171fx;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.api.p164fx.FxOrderApi;
import com.robinhood.models.p325fx.FxOrderDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FxOrderStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/lib/store/fx/FxOrderStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/lib/store/fx/FxOrderStore;", "api", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/api/fx/FxOrderApi;", "dao", "Lcom/robinhood/models/fx/FxOrderDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-fx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class FxOrderStore_Factory implements Factory<FxOrderStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<FxOrderApi> api;
    private final Provider<FxOrderDao> dao;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final FxOrderStore_Factory create(Provider<FxOrderApi> provider, Provider<FxOrderDao> provider2, Provider<StoreBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final FxOrderStore newInstance(FxOrderApi fxOrderApi, FxOrderDao fxOrderDao, StoreBundle storeBundle) {
        return INSTANCE.newInstance(fxOrderApi, fxOrderDao, storeBundle);
    }

    public FxOrderStore_Factory(Provider<FxOrderApi> api, Provider<FxOrderDao> dao, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.api = api;
        this.dao = dao;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public FxOrderStore get() {
        Companion companion = INSTANCE;
        FxOrderApi fxOrderApi = this.api.get();
        Intrinsics.checkNotNullExpressionValue(fxOrderApi, "get(...)");
        FxOrderDao fxOrderDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(fxOrderDao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(fxOrderApi, fxOrderDao, storeBundle);
    }

    /* compiled from: FxOrderStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/lib/store/fx/FxOrderStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/lib/store/fx/FxOrderStore_Factory;", "api", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/api/fx/FxOrderApi;", "dao", "Lcom/robinhood/models/fx/FxOrderDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/android/lib/store/fx/FxOrderStore;", "lib-store-fx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FxOrderStore_Factory create(Provider<FxOrderApi> api, Provider<FxOrderDao> dao, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new FxOrderStore_Factory(api, dao, storeBundle);
        }

        @JvmStatic
        public final FxOrderStore newInstance(FxOrderApi api, FxOrderDao dao, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new FxOrderStore(api, dao, storeBundle);
        }
    }
}

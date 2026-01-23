package com.robinhood.librobinhood.data.store.bonfire.screener.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.equityscreener.models.dao.IndicatorsDao;
import com.robinhood.librobinhood.data.store.bonfire.screener.api.ScreenersApi;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndicatorsStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore;", "api", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/api/ScreenersApi;", "allIndicatorsDao", "Lcom/robinhood/equityscreener/models/dao/IndicatorsDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-equityscreener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class IndicatorsStore_Factory implements Factory<IndicatorsStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<IndicatorsDao> allIndicatorsDao;
    private final Provider<ScreenersApi> api;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final IndicatorsStore_Factory create(Provider<ScreenersApi> provider, Provider<IndicatorsDao> provider2, Provider<StoreBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final IndicatorsStore newInstance(ScreenersApi screenersApi, IndicatorsDao indicatorsDao, StoreBundle storeBundle) {
        return INSTANCE.newInstance(screenersApi, indicatorsDao, storeBundle);
    }

    public IndicatorsStore_Factory(Provider<ScreenersApi> api, Provider<IndicatorsDao> allIndicatorsDao, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(allIndicatorsDao, "allIndicatorsDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.api = api;
        this.allIndicatorsDao = allIndicatorsDao;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public IndicatorsStore get() {
        Companion companion = INSTANCE;
        ScreenersApi screenersApi = this.api.get();
        Intrinsics.checkNotNullExpressionValue(screenersApi, "get(...)");
        IndicatorsDao indicatorsDao = this.allIndicatorsDao.get();
        Intrinsics.checkNotNullExpressionValue(indicatorsDao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(screenersApi, indicatorsDao, storeBundle);
    }

    /* compiled from: IndicatorsStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore_Factory;", "api", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/api/ScreenersApi;", "allIndicatorsDao", "Lcom/robinhood/equityscreener/models/dao/IndicatorsDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore;", "lib-store-equityscreener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IndicatorsStore_Factory create(Provider<ScreenersApi> api, Provider<IndicatorsDao> allIndicatorsDao, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(allIndicatorsDao, "allIndicatorsDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new IndicatorsStore_Factory(api, allIndicatorsDao, storeBundle);
        }

        @JvmStatic
        public final IndicatorsStore newInstance(ScreenersApi api, IndicatorsDao allIndicatorsDao, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(allIndicatorsDao, "allIndicatorsDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new IndicatorsStore(api, allIndicatorsDao, storeBundle);
        }
    }
}

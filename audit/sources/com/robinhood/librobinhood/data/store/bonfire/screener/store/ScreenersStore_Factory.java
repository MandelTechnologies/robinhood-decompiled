package com.robinhood.librobinhood.data.store.bonfire.screener.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.equityscreener.models.dao.ScreenersDao;
import com.robinhood.librobinhood.data.store.bonfire.screener.api.ScreenersApi;
import com.robinhood.shared.store.lists.store.ListsOrderStore;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenersStore_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;", "api", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/api/ScreenersApi;", "screenersDao", "Lcom/robinhood/equityscreener/models/dao/ScreenersDao;", "indicatorsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore;", "listsOrderStore", "Lcom/robinhood/shared/store/lists/store/ListsOrderStore;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-equityscreener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class ScreenersStore_Factory implements Factory<ScreenersStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ScreenersApi> api;
    private final Provider<IndicatorsStore> indicatorsStore;
    private final Provider<ListsOrderStore> listsOrderStore;
    private final Provider<LazyMoshi> moshi;
    private final Provider<ScreenersDao> screenersDao;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final ScreenersStore_Factory create(Provider<ScreenersApi> provider, Provider<ScreenersDao> provider2, Provider<IndicatorsStore> provider3, Provider<ListsOrderStore> provider4, Provider<LazyMoshi> provider5, Provider<StoreBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final ScreenersStore newInstance(ScreenersApi screenersApi, ScreenersDao screenersDao, IndicatorsStore indicatorsStore, ListsOrderStore listsOrderStore, LazyMoshi lazyMoshi, StoreBundle storeBundle) {
        return INSTANCE.newInstance(screenersApi, screenersDao, indicatorsStore, listsOrderStore, lazyMoshi, storeBundle);
    }

    public ScreenersStore_Factory(Provider<ScreenersApi> api, Provider<ScreenersDao> screenersDao, Provider<IndicatorsStore> indicatorsStore, Provider<ListsOrderStore> listsOrderStore, Provider<LazyMoshi> moshi, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(screenersDao, "screenersDao");
        Intrinsics.checkNotNullParameter(indicatorsStore, "indicatorsStore");
        Intrinsics.checkNotNullParameter(listsOrderStore, "listsOrderStore");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.api = api;
        this.screenersDao = screenersDao;
        this.indicatorsStore = indicatorsStore;
        this.listsOrderStore = listsOrderStore;
        this.moshi = moshi;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public ScreenersStore get() {
        Companion companion = INSTANCE;
        ScreenersApi screenersApi = this.api.get();
        Intrinsics.checkNotNullExpressionValue(screenersApi, "get(...)");
        ScreenersDao screenersDao = this.screenersDao.get();
        Intrinsics.checkNotNullExpressionValue(screenersDao, "get(...)");
        IndicatorsStore indicatorsStore = this.indicatorsStore.get();
        Intrinsics.checkNotNullExpressionValue(indicatorsStore, "get(...)");
        ListsOrderStore listsOrderStore = this.listsOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(listsOrderStore, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(screenersApi, screenersDao, indicatorsStore, listsOrderStore, lazyMoshi, storeBundle);
    }

    /* compiled from: ScreenersStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore_Factory;", "api", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/api/ScreenersApi;", "screenersDao", "Lcom/robinhood/equityscreener/models/dao/ScreenersDao;", "indicatorsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore;", "listsOrderStore", "Lcom/robinhood/shared/store/lists/store/ListsOrderStore;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;", "lib-store-equityscreener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ScreenersStore_Factory create(Provider<ScreenersApi> api, Provider<ScreenersDao> screenersDao, Provider<IndicatorsStore> indicatorsStore, Provider<ListsOrderStore> listsOrderStore, Provider<LazyMoshi> moshi, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(screenersDao, "screenersDao");
            Intrinsics.checkNotNullParameter(indicatorsStore, "indicatorsStore");
            Intrinsics.checkNotNullParameter(listsOrderStore, "listsOrderStore");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new ScreenersStore_Factory(api, screenersDao, indicatorsStore, listsOrderStore, moshi, storeBundle);
        }

        @JvmStatic
        public final ScreenersStore newInstance(ScreenersApi api, ScreenersDao screenersDao, IndicatorsStore indicatorsStore, ListsOrderStore listsOrderStore, LazyMoshi moshi, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(screenersDao, "screenersDao");
            Intrinsics.checkNotNullParameter(indicatorsStore, "indicatorsStore");
            Intrinsics.checkNotNullParameter(listsOrderStore, "listsOrderStore");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new ScreenersStore(api, screenersDao, indicatorsStore, listsOrderStore, moshi, storeBundle);
        }
    }
}

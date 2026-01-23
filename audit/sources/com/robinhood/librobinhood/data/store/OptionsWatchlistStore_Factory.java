package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.discovery.DiscoveryApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.dao.CuratedListDao;
import com.robinhood.shared.store.lists.store.CuratedListItemsStore;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsWatchlistStore_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "curatedListItemsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "discoveryApi", "Lcom/robinhood/android/api/discovery/DiscoveryApi;", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/CuratedListDao;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OptionsWatchlistStore_Factory implements Factory<OptionsWatchlistStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CuratedListItemsStore> curatedListItemsStore;
    private final Provider<CuratedListStore> curatedListStore;
    private final Provider<CuratedListDao> dao;
    private final Provider<DiscoveryApi> discoveryApi;
    private final Provider<OptionStrategyInfoStore> optionStrategyInfoStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final OptionsWatchlistStore_Factory create(Provider<CuratedListItemsStore> provider, Provider<CuratedListStore> provider2, Provider<DiscoveryApi> provider3, Provider<OptionStrategyInfoStore> provider4, Provider<StoreBundle> provider5, Provider<CuratedListDao> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final OptionsWatchlistStore newInstance(CuratedListItemsStore curatedListItemsStore, CuratedListStore curatedListStore, DiscoveryApi discoveryApi, OptionStrategyInfoStore optionStrategyInfoStore, StoreBundle storeBundle, CuratedListDao curatedListDao) {
        return INSTANCE.newInstance(curatedListItemsStore, curatedListStore, discoveryApi, optionStrategyInfoStore, storeBundle, curatedListDao);
    }

    public OptionsWatchlistStore_Factory(Provider<CuratedListItemsStore> curatedListItemsStore, Provider<CuratedListStore> curatedListStore, Provider<DiscoveryApi> discoveryApi, Provider<OptionStrategyInfoStore> optionStrategyInfoStore, Provider<StoreBundle> storeBundle, Provider<CuratedListDao> dao) {
        Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
        Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
        Intrinsics.checkNotNullParameter(discoveryApi, "discoveryApi");
        Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.curatedListItemsStore = curatedListItemsStore;
        this.curatedListStore = curatedListStore;
        this.discoveryApi = discoveryApi;
        this.optionStrategyInfoStore = optionStrategyInfoStore;
        this.storeBundle = storeBundle;
        this.dao = dao;
    }

    @Override // javax.inject.Provider
    public OptionsWatchlistStore get() {
        Companion companion = INSTANCE;
        CuratedListItemsStore curatedListItemsStore = this.curatedListItemsStore.get();
        Intrinsics.checkNotNullExpressionValue(curatedListItemsStore, "get(...)");
        CuratedListStore curatedListStore = this.curatedListStore.get();
        Intrinsics.checkNotNullExpressionValue(curatedListStore, "get(...)");
        DiscoveryApi discoveryApi = this.discoveryApi.get();
        Intrinsics.checkNotNullExpressionValue(discoveryApi, "get(...)");
        OptionStrategyInfoStore optionStrategyInfoStore = this.optionStrategyInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(optionStrategyInfoStore, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        CuratedListDao curatedListDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(curatedListDao, "get(...)");
        return companion.newInstance(curatedListItemsStore, curatedListStore, discoveryApi, optionStrategyInfoStore, storeBundle, curatedListDao);
    }

    /* compiled from: OptionsWatchlistStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore_Factory;", "curatedListItemsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "discoveryApi", "Lcom/robinhood/android/api/discovery/DiscoveryApi;", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/CuratedListDao;", "newInstance", "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionsWatchlistStore_Factory create(Provider<CuratedListItemsStore> curatedListItemsStore, Provider<CuratedListStore> curatedListStore, Provider<DiscoveryApi> discoveryApi, Provider<OptionStrategyInfoStore> optionStrategyInfoStore, Provider<StoreBundle> storeBundle, Provider<CuratedListDao> dao) {
            Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
            Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
            Intrinsics.checkNotNullParameter(discoveryApi, "discoveryApi");
            Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            return new OptionsWatchlistStore_Factory(curatedListItemsStore, curatedListStore, discoveryApi, optionStrategyInfoStore, storeBundle, dao);
        }

        @JvmStatic
        public final OptionsWatchlistStore newInstance(CuratedListItemsStore curatedListItemsStore, CuratedListStore curatedListStore, DiscoveryApi discoveryApi, OptionStrategyInfoStore optionStrategyInfoStore, StoreBundle storeBundle, CuratedListDao dao) {
            Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
            Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
            Intrinsics.checkNotNullParameter(discoveryApi, "discoveryApi");
            Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            return new OptionsWatchlistStore(curatedListItemsStore, curatedListStore, discoveryApi, optionStrategyInfoStore, storeBundle, dao);
        }
    }
}

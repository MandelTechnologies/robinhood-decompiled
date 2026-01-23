package com.robinhood.shared.store.lists.store;

import com.robinhood.android.api.discovery.DiscoveryApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.dao.ListItemIdToUserListIdsDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ListItemIdToUserListIdsStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;", "discoveryApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/discovery/DiscoveryApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/ListItemIdToUserListIdsDao;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ListItemIdToUserListIdsStore_Factory implements Factory<ListItemIdToUserListIdsStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ListItemIdToUserListIdsDao> dao;
    private final Provider<DiscoveryApi> discoveryApi;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final ListItemIdToUserListIdsStore_Factory create(Provider<DiscoveryApi> provider, Provider<StoreBundle> provider2, Provider<ListItemIdToUserListIdsDao> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final ListItemIdToUserListIdsStore newInstance(DiscoveryApi discoveryApi, StoreBundle storeBundle, ListItemIdToUserListIdsDao listItemIdToUserListIdsDao) {
        return INSTANCE.newInstance(discoveryApi, storeBundle, listItemIdToUserListIdsDao);
    }

    public ListItemIdToUserListIdsStore_Factory(Provider<DiscoveryApi> discoveryApi, Provider<StoreBundle> storeBundle, Provider<ListItemIdToUserListIdsDao> dao) {
        Intrinsics.checkNotNullParameter(discoveryApi, "discoveryApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.discoveryApi = discoveryApi;
        this.storeBundle = storeBundle;
        this.dao = dao;
    }

    @Override // javax.inject.Provider
    public ListItemIdToUserListIdsStore get() {
        Companion companion = INSTANCE;
        DiscoveryApi discoveryApi = this.discoveryApi.get();
        Intrinsics.checkNotNullExpressionValue(discoveryApi, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        ListItemIdToUserListIdsDao listItemIdToUserListIdsDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(listItemIdToUserListIdsDao, "get(...)");
        return companion.newInstance(discoveryApi, storeBundle, listItemIdToUserListIdsDao);
    }

    /* compiled from: ListItemIdToUserListIdsStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore_Factory;", "discoveryApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/discovery/DiscoveryApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/ListItemIdToUserListIdsDao;", "newInstance", "Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;", "lib-store-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ListItemIdToUserListIdsStore_Factory create(Provider<DiscoveryApi> discoveryApi, Provider<StoreBundle> storeBundle, Provider<ListItemIdToUserListIdsDao> dao) {
            Intrinsics.checkNotNullParameter(discoveryApi, "discoveryApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            return new ListItemIdToUserListIdsStore_Factory(discoveryApi, storeBundle, dao);
        }

        @JvmStatic
        public final ListItemIdToUserListIdsStore newInstance(DiscoveryApi discoveryApi, StoreBundle storeBundle, ListItemIdToUserListIdsDao dao) {
            Intrinsics.checkNotNullParameter(discoveryApi, "discoveryApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            return new ListItemIdToUserListIdsStore(discoveryApi, storeBundle, dao);
        }
    }
}

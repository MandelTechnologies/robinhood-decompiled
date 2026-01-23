package com.robinhood.shared.store.lists.store;

import com.robinhood.android.api.discovery.DiscoveryApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.dao.CuratedListDao;
import com.robinhood.models.dao.FollowedCuratedListIdDao;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/store/lists/store/CuratedListStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "discoveryApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/discovery/DiscoveryApi;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "curatedListItemViewModeStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemViewModeStore;", "listItemIdToUserListIdsStore", "Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/CuratedListDao;", "followedCuratedListIdDao", "Lcom/robinhood/models/dao/FollowedCuratedListIdDao;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CuratedListStore_Factory implements Factory<CuratedListStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CuratedListItemViewModeStore> curatedListItemViewModeStore;
    private final Provider<CuratedListItemsStore> curatedListItemsStore;
    private final Provider<CuratedListDao> dao;
    private final Provider<DiscoveryApi> discoveryApi;
    private final Provider<FollowedCuratedListIdDao> followedCuratedListIdDao;
    private final Provider<ListItemIdToUserListIdsStore> listItemIdToUserListIdsStore;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<UserStore> userStore;

    @JvmStatic
    public static final CuratedListStore_Factory create(Provider<DiscoveryApi> provider, Provider<UserStore> provider2, Provider<CuratedListItemsStore> provider3, Provider<CuratedListItemViewModeStore> provider4, Provider<ListItemIdToUserListIdsStore> provider5, Provider<StoreBundle> provider6, Provider<CuratedListDao> provider7, Provider<FollowedCuratedListIdDao> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final CuratedListStore newInstance(DiscoveryApi discoveryApi, UserStore userStore, CuratedListItemsStore curatedListItemsStore, CuratedListItemViewModeStore curatedListItemViewModeStore, ListItemIdToUserListIdsStore listItemIdToUserListIdsStore, StoreBundle storeBundle, CuratedListDao curatedListDao, FollowedCuratedListIdDao followedCuratedListIdDao) {
        return INSTANCE.newInstance(discoveryApi, userStore, curatedListItemsStore, curatedListItemViewModeStore, listItemIdToUserListIdsStore, storeBundle, curatedListDao, followedCuratedListIdDao);
    }

    public CuratedListStore_Factory(Provider<DiscoveryApi> discoveryApi, Provider<UserStore> userStore, Provider<CuratedListItemsStore> curatedListItemsStore, Provider<CuratedListItemViewModeStore> curatedListItemViewModeStore, Provider<ListItemIdToUserListIdsStore> listItemIdToUserListIdsStore, Provider<StoreBundle> storeBundle, Provider<CuratedListDao> dao, Provider<FollowedCuratedListIdDao> followedCuratedListIdDao) {
        Intrinsics.checkNotNullParameter(discoveryApi, "discoveryApi");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
        Intrinsics.checkNotNullParameter(curatedListItemViewModeStore, "curatedListItemViewModeStore");
        Intrinsics.checkNotNullParameter(listItemIdToUserListIdsStore, "listItemIdToUserListIdsStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(followedCuratedListIdDao, "followedCuratedListIdDao");
        this.discoveryApi = discoveryApi;
        this.userStore = userStore;
        this.curatedListItemsStore = curatedListItemsStore;
        this.curatedListItemViewModeStore = curatedListItemViewModeStore;
        this.listItemIdToUserListIdsStore = listItemIdToUserListIdsStore;
        this.storeBundle = storeBundle;
        this.dao = dao;
        this.followedCuratedListIdDao = followedCuratedListIdDao;
    }

    @Override // javax.inject.Provider
    public CuratedListStore get() {
        Companion companion = INSTANCE;
        DiscoveryApi discoveryApi = this.discoveryApi.get();
        Intrinsics.checkNotNullExpressionValue(discoveryApi, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        CuratedListItemsStore curatedListItemsStore = this.curatedListItemsStore.get();
        Intrinsics.checkNotNullExpressionValue(curatedListItemsStore, "get(...)");
        CuratedListItemViewModeStore curatedListItemViewModeStore = this.curatedListItemViewModeStore.get();
        Intrinsics.checkNotNullExpressionValue(curatedListItemViewModeStore, "get(...)");
        ListItemIdToUserListIdsStore listItemIdToUserListIdsStore = this.listItemIdToUserListIdsStore.get();
        Intrinsics.checkNotNullExpressionValue(listItemIdToUserListIdsStore, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        CuratedListDao curatedListDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(curatedListDao, "get(...)");
        FollowedCuratedListIdDao followedCuratedListIdDao = this.followedCuratedListIdDao.get();
        Intrinsics.checkNotNullExpressionValue(followedCuratedListIdDao, "get(...)");
        return companion.newInstance(discoveryApi, userStore, curatedListItemsStore, curatedListItemViewModeStore, listItemIdToUserListIdsStore, storeBundle, curatedListDao, followedCuratedListIdDao);
    }

    /* compiled from: CuratedListStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/store/lists/store/CuratedListStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/store/lists/store/CuratedListStore_Factory;", "discoveryApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/discovery/DiscoveryApi;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "curatedListItemViewModeStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemViewModeStore;", "listItemIdToUserListIdsStore", "Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/CuratedListDao;", "followedCuratedListIdDao", "Lcom/robinhood/models/dao/FollowedCuratedListIdDao;", "newInstance", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "lib-store-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CuratedListStore_Factory create(Provider<DiscoveryApi> discoveryApi, Provider<UserStore> userStore, Provider<CuratedListItemsStore> curatedListItemsStore, Provider<CuratedListItemViewModeStore> curatedListItemViewModeStore, Provider<ListItemIdToUserListIdsStore> listItemIdToUserListIdsStore, Provider<StoreBundle> storeBundle, Provider<CuratedListDao> dao, Provider<FollowedCuratedListIdDao> followedCuratedListIdDao) {
            Intrinsics.checkNotNullParameter(discoveryApi, "discoveryApi");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
            Intrinsics.checkNotNullParameter(curatedListItemViewModeStore, "curatedListItemViewModeStore");
            Intrinsics.checkNotNullParameter(listItemIdToUserListIdsStore, "listItemIdToUserListIdsStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(followedCuratedListIdDao, "followedCuratedListIdDao");
            return new CuratedListStore_Factory(discoveryApi, userStore, curatedListItemsStore, curatedListItemViewModeStore, listItemIdToUserListIdsStore, storeBundle, dao, followedCuratedListIdDao);
        }

        @JvmStatic
        public final CuratedListStore newInstance(DiscoveryApi discoveryApi, UserStore userStore, CuratedListItemsStore curatedListItemsStore, CuratedListItemViewModeStore curatedListItemViewModeStore, ListItemIdToUserListIdsStore listItemIdToUserListIdsStore, StoreBundle storeBundle, CuratedListDao dao, FollowedCuratedListIdDao followedCuratedListIdDao) {
            Intrinsics.checkNotNullParameter(discoveryApi, "discoveryApi");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
            Intrinsics.checkNotNullParameter(curatedListItemViewModeStore, "curatedListItemViewModeStore");
            Intrinsics.checkNotNullParameter(listItemIdToUserListIdsStore, "listItemIdToUserListIdsStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(followedCuratedListIdDao, "followedCuratedListIdDao");
            return new CuratedListStore(discoveryApi, userStore, curatedListItemsStore, curatedListItemViewModeStore, listItemIdToUserListIdsStore, storeBundle, dao, followedCuratedListIdDao);
        }
    }
}

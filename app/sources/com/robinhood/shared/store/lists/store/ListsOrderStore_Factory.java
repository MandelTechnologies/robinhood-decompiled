package com.robinhood.shared.store.lists.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.dao.ListsOrderDao;
import com.robinhood.shared.store.lists.ListsApi;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ListsOrderStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/store/lists/store/ListsOrderStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/store/lists/store/ListsOrderStore;", "listsApi", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/store/lists/ListsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/ListsOrderDao;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ListsOrderStore_Factory implements Factory<ListsOrderStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ListsOrderDao> dao;
    private final Provider<ListsApi> listsApi;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final ListsOrderStore_Factory create(Provider<ListsApi> provider, Provider<StoreBundle> provider2, Provider<ListsOrderDao> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final ListsOrderStore newInstance(ListsApi listsApi, StoreBundle storeBundle, ListsOrderDao listsOrderDao) {
        return INSTANCE.newInstance(listsApi, storeBundle, listsOrderDao);
    }

    public ListsOrderStore_Factory(Provider<ListsApi> listsApi, Provider<StoreBundle> storeBundle, Provider<ListsOrderDao> dao) {
        Intrinsics.checkNotNullParameter(listsApi, "listsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.listsApi = listsApi;
        this.storeBundle = storeBundle;
        this.dao = dao;
    }

    @Override // javax.inject.Provider
    public ListsOrderStore get() {
        Companion companion = INSTANCE;
        ListsApi listsApi = this.listsApi.get();
        Intrinsics.checkNotNullExpressionValue(listsApi, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        ListsOrderDao listsOrderDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(listsOrderDao, "get(...)");
        return companion.newInstance(listsApi, storeBundle, listsOrderDao);
    }

    /* compiled from: ListsOrderStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/store/lists/store/ListsOrderStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/store/lists/store/ListsOrderStore_Factory;", "listsApi", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/store/lists/ListsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/ListsOrderDao;", "newInstance", "Lcom/robinhood/shared/store/lists/store/ListsOrderStore;", "lib-store-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ListsOrderStore_Factory create(Provider<ListsApi> listsApi, Provider<StoreBundle> storeBundle, Provider<ListsOrderDao> dao) {
            Intrinsics.checkNotNullParameter(listsApi, "listsApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            return new ListsOrderStore_Factory(listsApi, storeBundle, dao);
        }

        @JvmStatic
        public final ListsOrderStore newInstance(ListsApi listsApi, StoreBundle storeBundle, ListsOrderDao dao) {
            Intrinsics.checkNotNullParameter(listsApi, "listsApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            return new ListsOrderStore(listsApi, storeBundle, dao);
        }
    }
}

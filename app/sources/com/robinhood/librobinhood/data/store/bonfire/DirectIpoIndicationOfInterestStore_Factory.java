package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.api.directipo.DirectIpoApi;
import com.robinhood.models.dao.bonfire.DirectIpoIndicationOfInterestDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoIndicationOfInterestStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/DirectIpoIndicationOfInterestStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectIpoIndicationOfInterestStore;", "api", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/bonfire/DirectIpoIndicationOfInterestDao;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class DirectIpoIndicationOfInterestStore_Factory implements Factory<DirectIpoIndicationOfInterestStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<DirectIpoApi> api;
    private final Provider<DirectIpoIndicationOfInterestDao> dao;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final DirectIpoIndicationOfInterestStore_Factory create(Provider<DirectIpoApi> provider, Provider<StoreBundle> provider2, Provider<DirectIpoIndicationOfInterestDao> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final DirectIpoIndicationOfInterestStore newInstance(DirectIpoApi directIpoApi, StoreBundle storeBundle, DirectIpoIndicationOfInterestDao directIpoIndicationOfInterestDao) {
        return INSTANCE.newInstance(directIpoApi, storeBundle, directIpoIndicationOfInterestDao);
    }

    public DirectIpoIndicationOfInterestStore_Factory(Provider<DirectIpoApi> api, Provider<StoreBundle> storeBundle, Provider<DirectIpoIndicationOfInterestDao> dao) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.api = api;
        this.storeBundle = storeBundle;
        this.dao = dao;
    }

    @Override // javax.inject.Provider
    public DirectIpoIndicationOfInterestStore get() {
        Companion companion = INSTANCE;
        DirectIpoApi directIpoApi = this.api.get();
        Intrinsics.checkNotNullExpressionValue(directIpoApi, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        DirectIpoIndicationOfInterestDao directIpoIndicationOfInterestDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(directIpoIndicationOfInterestDao, "get(...)");
        return companion.newInstance(directIpoApi, storeBundle, directIpoIndicationOfInterestDao);
    }

    /* compiled from: DirectIpoIndicationOfInterestStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/DirectIpoIndicationOfInterestStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/bonfire/DirectIpoIndicationOfInterestStore_Factory;", "api", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/bonfire/DirectIpoIndicationOfInterestDao;", "newInstance", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectIpoIndicationOfInterestStore;", "lib-store-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DirectIpoIndicationOfInterestStore_Factory create(Provider<DirectIpoApi> api, Provider<StoreBundle> storeBundle, Provider<DirectIpoIndicationOfInterestDao> dao) {
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            return new DirectIpoIndicationOfInterestStore_Factory(api, storeBundle, dao);
        }

        @JvmStatic
        public final DirectIpoIndicationOfInterestStore newInstance(DirectIpoApi api, StoreBundle storeBundle, DirectIpoIndicationOfInterestDao dao) {
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            return new DirectIpoIndicationOfInterestStore(api, storeBundle, dao);
        }
    }
}

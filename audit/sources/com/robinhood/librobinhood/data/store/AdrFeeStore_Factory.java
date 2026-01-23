package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.models.dao.AdrFeeDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdrFeeStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AdrFeeStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/AdrFeeStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "equitiesBrokeback", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "dao", "Lcom/robinhood/models/dao/AdrFeeDao;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class AdrFeeStore_Factory implements Factory<AdrFeeStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AdrFeeDao> dao;
    private final Provider<EquitiesBrokeback> equitiesBrokeback;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final AdrFeeStore_Factory create(Provider<StoreBundle> provider, Provider<EquitiesBrokeback> provider2, Provider<AdrFeeDao> provider3, Provider<InstrumentStore> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final AdrFeeStore newInstance(StoreBundle storeBundle, EquitiesBrokeback equitiesBrokeback, AdrFeeDao adrFeeDao, InstrumentStore instrumentStore) {
        return INSTANCE.newInstance(storeBundle, equitiesBrokeback, adrFeeDao, instrumentStore);
    }

    public AdrFeeStore_Factory(Provider<StoreBundle> storeBundle, Provider<EquitiesBrokeback> equitiesBrokeback, Provider<AdrFeeDao> dao, Provider<InstrumentStore> instrumentStore) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(equitiesBrokeback, "equitiesBrokeback");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        this.storeBundle = storeBundle;
        this.equitiesBrokeback = equitiesBrokeback;
        this.dao = dao;
        this.instrumentStore = instrumentStore;
    }

    @Override // javax.inject.Provider
    public AdrFeeStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        EquitiesBrokeback equitiesBrokeback = this.equitiesBrokeback.get();
        Intrinsics.checkNotNullExpressionValue(equitiesBrokeback, "get(...)");
        AdrFeeDao adrFeeDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(adrFeeDao, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        return companion.newInstance(storeBundle, equitiesBrokeback, adrFeeDao, instrumentStore);
    }

    /* compiled from: AdrFeeStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AdrFeeStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/AdrFeeStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "equitiesBrokeback", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "dao", "Lcom/robinhood/models/dao/AdrFeeDao;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "newInstance", "Lcom/robinhood/librobinhood/data/store/AdrFeeStore;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AdrFeeStore_Factory create(Provider<StoreBundle> storeBundle, Provider<EquitiesBrokeback> equitiesBrokeback, Provider<AdrFeeDao> dao, Provider<InstrumentStore> instrumentStore) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(equitiesBrokeback, "equitiesBrokeback");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            return new AdrFeeStore_Factory(storeBundle, equitiesBrokeback, dao, instrumentStore);
        }

        @JvmStatic
        public final AdrFeeStore newInstance(StoreBundle storeBundle, EquitiesBrokeback equitiesBrokeback, AdrFeeDao dao, InstrumentStore instrumentStore) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(equitiesBrokeback, "equitiesBrokeback");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            return new AdrFeeStore(storeBundle, equitiesBrokeback, dao, instrumentStore);
        }
    }
}

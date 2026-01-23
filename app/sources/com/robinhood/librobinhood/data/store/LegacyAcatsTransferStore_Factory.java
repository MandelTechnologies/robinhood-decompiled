package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.models.dao.LegacyAcatsTransferDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LegacyAcatsTransferStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/LegacyAcatsTransferStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/LegacyAcatsTransferStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/LegacyAcatsTransferDao;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-acats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class LegacyAcatsTransferStore_Factory implements Factory<LegacyAcatsTransferStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Brokeback> brokeback;
    private final Provider<LegacyAcatsTransferDao> dao;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final LegacyAcatsTransferStore_Factory create(Provider<StoreBundle> provider, Provider<LegacyAcatsTransferDao> provider2, Provider<Brokeback> provider3, Provider<InstrumentStore> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final LegacyAcatsTransferStore newInstance(StoreBundle storeBundle, LegacyAcatsTransferDao legacyAcatsTransferDao, Brokeback brokeback, InstrumentStore instrumentStore) {
        return INSTANCE.newInstance(storeBundle, legacyAcatsTransferDao, brokeback, instrumentStore);
    }

    public LegacyAcatsTransferStore_Factory(Provider<StoreBundle> storeBundle, Provider<LegacyAcatsTransferDao> dao, Provider<Brokeback> brokeback, Provider<InstrumentStore> instrumentStore) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        this.storeBundle = storeBundle;
        this.dao = dao;
        this.brokeback = brokeback;
        this.instrumentStore = instrumentStore;
    }

    @Override // javax.inject.Provider
    public LegacyAcatsTransferStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        LegacyAcatsTransferDao legacyAcatsTransferDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(legacyAcatsTransferDao, "get(...)");
        Brokeback brokeback = this.brokeback.get();
        Intrinsics.checkNotNullExpressionValue(brokeback, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        return companion.newInstance(storeBundle, legacyAcatsTransferDao, brokeback, instrumentStore);
    }

    /* compiled from: LegacyAcatsTransferStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/LegacyAcatsTransferStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/LegacyAcatsTransferStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/LegacyAcatsTransferDao;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "newInstance", "Lcom/robinhood/librobinhood/data/store/LegacyAcatsTransferStore;", "lib-store-acats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LegacyAcatsTransferStore_Factory create(Provider<StoreBundle> storeBundle, Provider<LegacyAcatsTransferDao> dao, Provider<Brokeback> brokeback, Provider<InstrumentStore> instrumentStore) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(brokeback, "brokeback");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            return new LegacyAcatsTransferStore_Factory(storeBundle, dao, brokeback, instrumentStore);
        }

        @JvmStatic
        public final LegacyAcatsTransferStore newInstance(StoreBundle storeBundle, LegacyAcatsTransferDao dao, Brokeback brokeback, InstrumentStore instrumentStore) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(brokeback, "brokeback");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            return new LegacyAcatsTransferStore(storeBundle, dao, brokeback, instrumentStore);
        }
    }
}

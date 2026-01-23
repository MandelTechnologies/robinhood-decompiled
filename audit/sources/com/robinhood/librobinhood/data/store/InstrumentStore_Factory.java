package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.models.dao.InstrumentDao;
import com.robinhood.models.dao.InstrumentExternalHaltDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentStore_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/InstrumentStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/InstrumentDao;", "externalHaltDao", "Lcom/robinhood/models/dao/InstrumentExternalHaltDao;", "equitiesBrokeback", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class InstrumentStore_Factory implements Factory<InstrumentStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<InstrumentDao> dao;
    private final Provider<EquitiesBrokeback> equitiesBrokeback;
    private final Provider<InstrumentExternalHaltDao> externalHaltDao;
    private final Provider<QuoteStore> quoteStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final InstrumentStore_Factory create(Provider<StoreBundle> provider, Provider<InstrumentDao> provider2, Provider<InstrumentExternalHaltDao> provider3, Provider<EquitiesBrokeback> provider4, Provider<QuoteStore> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final InstrumentStore newInstance(StoreBundle storeBundle, InstrumentDao instrumentDao, InstrumentExternalHaltDao instrumentExternalHaltDao, EquitiesBrokeback equitiesBrokeback, QuoteStore quoteStore) {
        return INSTANCE.newInstance(storeBundle, instrumentDao, instrumentExternalHaltDao, equitiesBrokeback, quoteStore);
    }

    public InstrumentStore_Factory(Provider<StoreBundle> storeBundle, Provider<InstrumentDao> dao, Provider<InstrumentExternalHaltDao> externalHaltDao, Provider<EquitiesBrokeback> equitiesBrokeback, Provider<QuoteStore> quoteStore) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(externalHaltDao, "externalHaltDao");
        Intrinsics.checkNotNullParameter(equitiesBrokeback, "equitiesBrokeback");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        this.storeBundle = storeBundle;
        this.dao = dao;
        this.externalHaltDao = externalHaltDao;
        this.equitiesBrokeback = equitiesBrokeback;
        this.quoteStore = quoteStore;
    }

    @Override // javax.inject.Provider
    public InstrumentStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        InstrumentDao instrumentDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(instrumentDao, "get(...)");
        InstrumentExternalHaltDao instrumentExternalHaltDao = this.externalHaltDao.get();
        Intrinsics.checkNotNullExpressionValue(instrumentExternalHaltDao, "get(...)");
        EquitiesBrokeback equitiesBrokeback = this.equitiesBrokeback.get();
        Intrinsics.checkNotNullExpressionValue(equitiesBrokeback, "get(...)");
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        return companion.newInstance(storeBundle, instrumentDao, instrumentExternalHaltDao, equitiesBrokeback, quoteStore);
    }

    /* compiled from: InstrumentStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/InstrumentStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/InstrumentStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/InstrumentDao;", "externalHaltDao", "Lcom/robinhood/models/dao/InstrumentExternalHaltDao;", "equitiesBrokeback", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "newInstance", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InstrumentStore_Factory create(Provider<StoreBundle> storeBundle, Provider<InstrumentDao> dao, Provider<InstrumentExternalHaltDao> externalHaltDao, Provider<EquitiesBrokeback> equitiesBrokeback, Provider<QuoteStore> quoteStore) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(externalHaltDao, "externalHaltDao");
            Intrinsics.checkNotNullParameter(equitiesBrokeback, "equitiesBrokeback");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            return new InstrumentStore_Factory(storeBundle, dao, externalHaltDao, equitiesBrokeback, quoteStore);
        }

        @JvmStatic
        public final InstrumentStore newInstance(StoreBundle storeBundle, InstrumentDao dao, InstrumentExternalHaltDao externalHaltDao, EquitiesBrokeback equitiesBrokeback, QuoteStore quoteStore) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(externalHaltDao, "externalHaltDao");
            Intrinsics.checkNotNullParameter(equitiesBrokeback, "equitiesBrokeback");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            return new InstrumentStore(storeBundle, dao, externalHaltDao, equitiesBrokeback, quoteStore);
        }
    }
}

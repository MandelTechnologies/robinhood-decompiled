package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.bonfire.api.InstrumentsApi;
import com.robinhood.models.dao.InstrumentChartBoundsDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentChartBoundsStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartBoundsStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartBoundsStore;", "instrumentsApi", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/api/InstrumentsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/InstrumentChartBoundsDao;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class InstrumentChartBoundsStore_Factory implements Factory<InstrumentChartBoundsStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<InstrumentChartBoundsDao> dao;
    private final Provider<InstrumentsApi> instrumentsApi;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final InstrumentChartBoundsStore_Factory create(Provider<InstrumentsApi> provider, Provider<StoreBundle> provider2, Provider<InstrumentChartBoundsDao> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final InstrumentChartBoundsStore newInstance(InstrumentsApi instrumentsApi, StoreBundle storeBundle, InstrumentChartBoundsDao instrumentChartBoundsDao) {
        return INSTANCE.newInstance(instrumentsApi, storeBundle, instrumentChartBoundsDao);
    }

    public InstrumentChartBoundsStore_Factory(Provider<InstrumentsApi> instrumentsApi, Provider<StoreBundle> storeBundle, Provider<InstrumentChartBoundsDao> dao) {
        Intrinsics.checkNotNullParameter(instrumentsApi, "instrumentsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.instrumentsApi = instrumentsApi;
        this.storeBundle = storeBundle;
        this.dao = dao;
    }

    @Override // javax.inject.Provider
    public InstrumentChartBoundsStore get() {
        Companion companion = INSTANCE;
        InstrumentsApi instrumentsApi = this.instrumentsApi.get();
        Intrinsics.checkNotNullExpressionValue(instrumentsApi, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        InstrumentChartBoundsDao instrumentChartBoundsDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(instrumentChartBoundsDao, "get(...)");
        return companion.newInstance(instrumentsApi, storeBundle, instrumentChartBoundsDao);
    }

    /* compiled from: InstrumentChartBoundsStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartBoundsStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartBoundsStore_Factory;", "instrumentsApi", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/api/InstrumentsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/InstrumentChartBoundsDao;", "newInstance", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartBoundsStore;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InstrumentChartBoundsStore_Factory create(Provider<InstrumentsApi> instrumentsApi, Provider<StoreBundle> storeBundle, Provider<InstrumentChartBoundsDao> dao) {
            Intrinsics.checkNotNullParameter(instrumentsApi, "instrumentsApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            return new InstrumentChartBoundsStore_Factory(instrumentsApi, storeBundle, dao);
        }

        @JvmStatic
        public final InstrumentChartBoundsStore newInstance(InstrumentsApi instrumentsApi, StoreBundle storeBundle, InstrumentChartBoundsDao dao) {
            Intrinsics.checkNotNullParameter(instrumentsApi, "instrumentsApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            return new InstrumentChartBoundsStore(instrumentsApi, storeBundle, dao);
        }
    }
}

package com.robinhood.store.event;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.models.event.p186db.dao.EventOrderDao;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.futures.FuturesAccountStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventOrderStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/store/event/EventOrderStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/event/EventOrderStore;", "ceres", "Ljavax/inject/Provider;", "Lcom/robinhood/ceres/v1/Ceres;", "eventOrderDao", "Lcom/robinhood/android/models/event/db/dao/EventOrderDao;", "eventStore", "Lcom/robinhood/store/event/EventStore;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "contractDetailsDisplayStore", "Lcom/robinhood/store/event/ContractDetailsDisplayStore;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class EventOrderStore_Factory implements Factory<EventOrderStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Ceres> ceres;
    private final Provider<ContractDetailsDisplayStore> contractDetailsDisplayStore;
    private final Provider<EventOrderDao> eventOrderDao;
    private final Provider<EventStore> eventStore;
    private final Provider<ExperimentsProvider> experimentsProvider;
    private final Provider<FuturesAccountStore> futuresAccountStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final EventOrderStore_Factory create(Provider<Ceres> provider, Provider<EventOrderDao> provider2, Provider<EventStore> provider3, Provider<FuturesAccountStore> provider4, Provider<ContractDetailsDisplayStore> provider5, Provider<ExperimentsProvider> provider6, Provider<StoreBundle> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final EventOrderStore newInstance(Ceres ceres, EventOrderDao eventOrderDao, EventStore eventStore, FuturesAccountStore futuresAccountStore, ContractDetailsDisplayStore contractDetailsDisplayStore, ExperimentsProvider experimentsProvider, StoreBundle storeBundle) {
        return INSTANCE.newInstance(ceres, eventOrderDao, eventStore, futuresAccountStore, contractDetailsDisplayStore, experimentsProvider, storeBundle);
    }

    public EventOrderStore_Factory(Provider<Ceres> ceres, Provider<EventOrderDao> eventOrderDao, Provider<EventStore> eventStore, Provider<FuturesAccountStore> futuresAccountStore, Provider<ContractDetailsDisplayStore> contractDetailsDisplayStore, Provider<ExperimentsProvider> experimentsProvider, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(ceres, "ceres");
        Intrinsics.checkNotNullParameter(eventOrderDao, "eventOrderDao");
        Intrinsics.checkNotNullParameter(eventStore, "eventStore");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(contractDetailsDisplayStore, "contractDetailsDisplayStore");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.ceres = ceres;
        this.eventOrderDao = eventOrderDao;
        this.eventStore = eventStore;
        this.futuresAccountStore = futuresAccountStore;
        this.contractDetailsDisplayStore = contractDetailsDisplayStore;
        this.experimentsProvider = experimentsProvider;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public EventOrderStore get() {
        Companion companion = INSTANCE;
        Ceres ceres = this.ceres.get();
        Intrinsics.checkNotNullExpressionValue(ceres, "get(...)");
        EventOrderDao eventOrderDao = this.eventOrderDao.get();
        Intrinsics.checkNotNullExpressionValue(eventOrderDao, "get(...)");
        EventStore eventStore = this.eventStore.get();
        Intrinsics.checkNotNullExpressionValue(eventStore, "get(...)");
        FuturesAccountStore futuresAccountStore = this.futuresAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresAccountStore, "get(...)");
        ContractDetailsDisplayStore contractDetailsDisplayStore = this.contractDetailsDisplayStore.get();
        Intrinsics.checkNotNullExpressionValue(contractDetailsDisplayStore, "get(...)");
        ExperimentsProvider experimentsProvider = this.experimentsProvider.get();
        Intrinsics.checkNotNullExpressionValue(experimentsProvider, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(ceres, eventOrderDao, eventStore, futuresAccountStore, contractDetailsDisplayStore, experimentsProvider, storeBundle);
    }

    /* compiled from: EventOrderStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/store/event/EventOrderStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/event/EventOrderStore_Factory;", "ceres", "Ljavax/inject/Provider;", "Lcom/robinhood/ceres/v1/Ceres;", "eventOrderDao", "Lcom/robinhood/android/models/event/db/dao/EventOrderDao;", "eventStore", "Lcom/robinhood/store/event/EventStore;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "contractDetailsDisplayStore", "Lcom/robinhood/store/event/ContractDetailsDisplayStore;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/store/event/EventOrderStore;", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EventOrderStore_Factory create(Provider<Ceres> ceres, Provider<EventOrderDao> eventOrderDao, Provider<EventStore> eventStore, Provider<FuturesAccountStore> futuresAccountStore, Provider<ContractDetailsDisplayStore> contractDetailsDisplayStore, Provider<ExperimentsProvider> experimentsProvider, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(ceres, "ceres");
            Intrinsics.checkNotNullParameter(eventOrderDao, "eventOrderDao");
            Intrinsics.checkNotNullParameter(eventStore, "eventStore");
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(contractDetailsDisplayStore, "contractDetailsDisplayStore");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new EventOrderStore_Factory(ceres, eventOrderDao, eventStore, futuresAccountStore, contractDetailsDisplayStore, experimentsProvider, storeBundle);
        }

        @JvmStatic
        public final EventOrderStore newInstance(Ceres ceres, EventOrderDao eventOrderDao, EventStore eventStore, FuturesAccountStore futuresAccountStore, ContractDetailsDisplayStore contractDetailsDisplayStore, ExperimentsProvider experimentsProvider, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(ceres, "ceres");
            Intrinsics.checkNotNullParameter(eventOrderDao, "eventOrderDao");
            Intrinsics.checkNotNullParameter(eventStore, "eventStore");
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(contractDetailsDisplayStore, "contractDetailsDisplayStore");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new EventOrderStore(ceres, eventOrderDao, eventStore, futuresAccountStore, contractDetailsDisplayStore, experimentsProvider, storeBundle);
        }
    }
}

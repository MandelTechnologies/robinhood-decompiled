package com.robinhood.store.event;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.models.event.p186db.dao.EventContractPositionDao;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.futures.FuturesAccountStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventContractPositionStore_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/store/event/EventContractPositionStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/event/EventContractPositionStore;", "ceres", "Ljavax/inject/Provider;", "Lcom/robinhood/ceres/v1/Ceres;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "eventContractPositionDao", "Lcom/robinhood/android/models/event/db/dao/EventContractPositionDao;", "eventStore", "Lcom/robinhood/store/event/EventStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class EventContractPositionStore_Factory implements Factory<EventContractPositionStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Ceres> ceres;
    private final Provider<EventContractPositionDao> eventContractPositionDao;
    private final Provider<EventStore> eventStore;
    private final Provider<FuturesAccountStore> futuresAccountStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final EventContractPositionStore_Factory create(Provider<Ceres> provider, Provider<FuturesAccountStore> provider2, Provider<EventContractPositionDao> provider3, Provider<EventStore> provider4, Provider<StoreBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final EventContractPositionStore newInstance(Ceres ceres, FuturesAccountStore futuresAccountStore, EventContractPositionDao eventContractPositionDao, EventStore eventStore, StoreBundle storeBundle) {
        return INSTANCE.newInstance(ceres, futuresAccountStore, eventContractPositionDao, eventStore, storeBundle);
    }

    public EventContractPositionStore_Factory(Provider<Ceres> ceres, Provider<FuturesAccountStore> futuresAccountStore, Provider<EventContractPositionDao> eventContractPositionDao, Provider<EventStore> eventStore, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(ceres, "ceres");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(eventContractPositionDao, "eventContractPositionDao");
        Intrinsics.checkNotNullParameter(eventStore, "eventStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.ceres = ceres;
        this.futuresAccountStore = futuresAccountStore;
        this.eventContractPositionDao = eventContractPositionDao;
        this.eventStore = eventStore;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public EventContractPositionStore get() {
        Companion companion = INSTANCE;
        Ceres ceres = this.ceres.get();
        Intrinsics.checkNotNullExpressionValue(ceres, "get(...)");
        FuturesAccountStore futuresAccountStore = this.futuresAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresAccountStore, "get(...)");
        EventContractPositionDao eventContractPositionDao = this.eventContractPositionDao.get();
        Intrinsics.checkNotNullExpressionValue(eventContractPositionDao, "get(...)");
        EventStore eventStore = this.eventStore.get();
        Intrinsics.checkNotNullExpressionValue(eventStore, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(ceres, futuresAccountStore, eventContractPositionDao, eventStore, storeBundle);
    }

    /* compiled from: EventContractPositionStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/store/event/EventContractPositionStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/event/EventContractPositionStore_Factory;", "ceres", "Ljavax/inject/Provider;", "Lcom/robinhood/ceres/v1/Ceres;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "eventContractPositionDao", "Lcom/robinhood/android/models/event/db/dao/EventContractPositionDao;", "eventStore", "Lcom/robinhood/store/event/EventStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/store/event/EventContractPositionStore;", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EventContractPositionStore_Factory create(Provider<Ceres> ceres, Provider<FuturesAccountStore> futuresAccountStore, Provider<EventContractPositionDao> eventContractPositionDao, Provider<EventStore> eventStore, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(ceres, "ceres");
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(eventContractPositionDao, "eventContractPositionDao");
            Intrinsics.checkNotNullParameter(eventStore, "eventStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new EventContractPositionStore_Factory(ceres, futuresAccountStore, eventContractPositionDao, eventStore, storeBundle);
        }

        @JvmStatic
        public final EventContractPositionStore newInstance(Ceres ceres, FuturesAccountStore futuresAccountStore, EventContractPositionDao eventContractPositionDao, EventStore eventStore, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(ceres, "ceres");
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(eventContractPositionDao, "eventContractPositionDao");
            Intrinsics.checkNotNullParameter(eventStore, "eventStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new EventContractPositionStore(ceres, futuresAccountStore, eventContractPositionDao, eventStore, storeBundle);
        }
    }
}

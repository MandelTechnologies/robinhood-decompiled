package com.robinhood.store.event;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.models.event.p186db.dao.EventContractRealizedPnlDao;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.futures.FuturesAccountStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventContractsPnlStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/store/event/EventContractsPnlStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/event/EventContractsPnlStore;", "ceres", "Ljavax/inject/Provider;", "Lcom/robinhood/ceres/v1/Ceres;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "eventContractRealizedPnlDao", "Lcom/robinhood/android/models/event/db/dao/EventContractRealizedPnlDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class EventContractsPnlStore_Factory implements Factory<EventContractsPnlStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Ceres> ceres;
    private final Provider<EventContractRealizedPnlDao> eventContractRealizedPnlDao;
    private final Provider<FuturesAccountStore> futuresAccountStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final EventContractsPnlStore_Factory create(Provider<Ceres> provider, Provider<FuturesAccountStore> provider2, Provider<EventContractRealizedPnlDao> provider3, Provider<StoreBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final EventContractsPnlStore newInstance(Ceres ceres, FuturesAccountStore futuresAccountStore, EventContractRealizedPnlDao eventContractRealizedPnlDao, StoreBundle storeBundle) {
        return INSTANCE.newInstance(ceres, futuresAccountStore, eventContractRealizedPnlDao, storeBundle);
    }

    public EventContractsPnlStore_Factory(Provider<Ceres> ceres, Provider<FuturesAccountStore> futuresAccountStore, Provider<EventContractRealizedPnlDao> eventContractRealizedPnlDao, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(ceres, "ceres");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(eventContractRealizedPnlDao, "eventContractRealizedPnlDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.ceres = ceres;
        this.futuresAccountStore = futuresAccountStore;
        this.eventContractRealizedPnlDao = eventContractRealizedPnlDao;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public EventContractsPnlStore get() {
        Companion companion = INSTANCE;
        Ceres ceres = this.ceres.get();
        Intrinsics.checkNotNullExpressionValue(ceres, "get(...)");
        FuturesAccountStore futuresAccountStore = this.futuresAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresAccountStore, "get(...)");
        EventContractRealizedPnlDao eventContractRealizedPnlDao = this.eventContractRealizedPnlDao.get();
        Intrinsics.checkNotNullExpressionValue(eventContractRealizedPnlDao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(ceres, futuresAccountStore, eventContractRealizedPnlDao, storeBundle);
    }

    /* compiled from: EventContractsPnlStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/store/event/EventContractsPnlStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/event/EventContractsPnlStore_Factory;", "ceres", "Ljavax/inject/Provider;", "Lcom/robinhood/ceres/v1/Ceres;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "eventContractRealizedPnlDao", "Lcom/robinhood/android/models/event/db/dao/EventContractRealizedPnlDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/store/event/EventContractsPnlStore;", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EventContractsPnlStore_Factory create(Provider<Ceres> ceres, Provider<FuturesAccountStore> futuresAccountStore, Provider<EventContractRealizedPnlDao> eventContractRealizedPnlDao, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(ceres, "ceres");
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(eventContractRealizedPnlDao, "eventContractRealizedPnlDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new EventContractsPnlStore_Factory(ceres, futuresAccountStore, eventContractRealizedPnlDao, storeBundle);
        }

        @JvmStatic
        public final EventContractsPnlStore newInstance(Ceres ceres, FuturesAccountStore futuresAccountStore, EventContractRealizedPnlDao eventContractRealizedPnlDao, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(ceres, "ceres");
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(eventContractRealizedPnlDao, "eventContractRealizedPnlDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new EventContractsPnlStore(ceres, futuresAccountStore, eventContractRealizedPnlDao, storeBundle);
        }
    }
}

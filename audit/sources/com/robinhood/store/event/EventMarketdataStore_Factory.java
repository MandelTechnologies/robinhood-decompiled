package com.robinhood.store.event;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.eventcontracts.models.event.api.EventManagedMarketdataApi;
import com.robinhood.android.eventcontracts.models.event.api.EventMarketdataApi;
import com.robinhood.android.models.event.p186db.dao.EventFundamentalDao;
import com.robinhood.android.models.event.p186db.dao.EventGameDataDao;
import com.robinhood.android.models.event.p186db.dao.EventHistoricalDao;
import com.robinhood.android.models.event.p186db.dao.EventQuoteDao;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.store.StoreBundle;
import com.robinhood.targetbackend.TargetBackend;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: EventMarketdataStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0085\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/store/event/EventMarketdataStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/event/EventMarketdataStore;", "Ljavax/inject/Provider;", "Lcom/robinhood/targetbackend/TargetBackend;", "targetBackend", "Lcom/robinhood/android/eventcontracts/models/event/api/EventMarketdataApi;", "eventMarketdataApi", "Lcom/robinhood/android/eventcontracts/models/event/api/EventManagedMarketdataApi;", "eventManagedMarketdataApi", "Lcom/robinhood/android/models/event/db/dao/EventFundamentalDao;", "eventFundamentalDao", "Lcom/robinhood/android/models/event/db/dao/EventHistoricalDao;", "eventHistoricalDao", "Lcom/robinhood/android/models/event/db/dao/EventQuoteDao;", "eventQuoteDao", "Lcom/robinhood/android/models/event/db/dao/EventGameDataDao;", "eventGameDataDao", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/store/event/EventMarketdataStore;", "Ljavax/inject/Provider;", "Companion", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class EventMarketdataStore_Factory implements Factory<EventMarketdataStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Clock> clock;
    private final Provider<EventFundamentalDao> eventFundamentalDao;
    private final Provider<EventGameDataDao> eventGameDataDao;
    private final Provider<EventHistoricalDao> eventHistoricalDao;
    private final Provider<EventManagedMarketdataApi> eventManagedMarketdataApi;
    private final Provider<EventMarketdataApi> eventMarketdataApi;
    private final Provider<EventQuoteDao> eventQuoteDao;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<TargetBackend> targetBackend;

    @JvmStatic
    public static final EventMarketdataStore_Factory create(Provider<TargetBackend> provider, Provider<EventMarketdataApi> provider2, Provider<EventManagedMarketdataApi> provider3, Provider<EventFundamentalDao> provider4, Provider<EventHistoricalDao> provider5, Provider<EventQuoteDao> provider6, Provider<EventGameDataDao> provider7, Provider<Clock> provider8, Provider<StoreBundle> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final EventMarketdataStore newInstance(TargetBackend targetBackend, EventMarketdataApi eventMarketdataApi, EventManagedMarketdataApi eventManagedMarketdataApi, EventFundamentalDao eventFundamentalDao, EventHistoricalDao eventHistoricalDao, EventQuoteDao eventQuoteDao, EventGameDataDao eventGameDataDao, Clock clock, StoreBundle storeBundle) {
        return INSTANCE.newInstance(targetBackend, eventMarketdataApi, eventManagedMarketdataApi, eventFundamentalDao, eventHistoricalDao, eventQuoteDao, eventGameDataDao, clock, storeBundle);
    }

    public EventMarketdataStore_Factory(Provider<TargetBackend> targetBackend, Provider<EventMarketdataApi> eventMarketdataApi, Provider<EventManagedMarketdataApi> eventManagedMarketdataApi, Provider<EventFundamentalDao> eventFundamentalDao, Provider<EventHistoricalDao> eventHistoricalDao, Provider<EventQuoteDao> eventQuoteDao, Provider<EventGameDataDao> eventGameDataDao, Provider<Clock> clock, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(eventMarketdataApi, "eventMarketdataApi");
        Intrinsics.checkNotNullParameter(eventManagedMarketdataApi, "eventManagedMarketdataApi");
        Intrinsics.checkNotNullParameter(eventFundamentalDao, "eventFundamentalDao");
        Intrinsics.checkNotNullParameter(eventHistoricalDao, "eventHistoricalDao");
        Intrinsics.checkNotNullParameter(eventQuoteDao, "eventQuoteDao");
        Intrinsics.checkNotNullParameter(eventGameDataDao, "eventGameDataDao");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.targetBackend = targetBackend;
        this.eventMarketdataApi = eventMarketdataApi;
        this.eventManagedMarketdataApi = eventManagedMarketdataApi;
        this.eventFundamentalDao = eventFundamentalDao;
        this.eventHistoricalDao = eventHistoricalDao;
        this.eventQuoteDao = eventQuoteDao;
        this.eventGameDataDao = eventGameDataDao;
        this.clock = clock;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public EventMarketdataStore get() {
        Companion companion = INSTANCE;
        TargetBackend targetBackend = this.targetBackend.get();
        Intrinsics.checkNotNullExpressionValue(targetBackend, "get(...)");
        EventMarketdataApi eventMarketdataApi = this.eventMarketdataApi.get();
        Intrinsics.checkNotNullExpressionValue(eventMarketdataApi, "get(...)");
        EventManagedMarketdataApi eventManagedMarketdataApi = this.eventManagedMarketdataApi.get();
        Intrinsics.checkNotNullExpressionValue(eventManagedMarketdataApi, "get(...)");
        EventFundamentalDao eventFundamentalDao = this.eventFundamentalDao.get();
        Intrinsics.checkNotNullExpressionValue(eventFundamentalDao, "get(...)");
        EventHistoricalDao eventHistoricalDao = this.eventHistoricalDao.get();
        Intrinsics.checkNotNullExpressionValue(eventHistoricalDao, "get(...)");
        EventQuoteDao eventQuoteDao = this.eventQuoteDao.get();
        Intrinsics.checkNotNullExpressionValue(eventQuoteDao, "get(...)");
        EventGameDataDao eventGameDataDao = this.eventGameDataDao.get();
        Intrinsics.checkNotNullExpressionValue(eventGameDataDao, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(targetBackend, eventMarketdataApi, eventManagedMarketdataApi, eventFundamentalDao, eventHistoricalDao, eventQuoteDao, eventGameDataDao, clock, storeBundle);
    }

    /* compiled from: EventMarketdataStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u008d\u0001\u0010\u0018\u001a\u00020\u00172\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019JW\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/store/event/EventMarketdataStore_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/targetbackend/TargetBackend;", "targetBackend", "Lcom/robinhood/android/eventcontracts/models/event/api/EventMarketdataApi;", "eventMarketdataApi", "Lcom/robinhood/android/eventcontracts/models/event/api/EventManagedMarketdataApi;", "eventManagedMarketdataApi", "Lcom/robinhood/android/models/event/db/dao/EventFundamentalDao;", "eventFundamentalDao", "Lcom/robinhood/android/models/event/db/dao/EventHistoricalDao;", "eventHistoricalDao", "Lcom/robinhood/android/models/event/db/dao/EventQuoteDao;", "eventQuoteDao", "Lcom/robinhood/android/models/event/db/dao/EventGameDataDao;", "eventGameDataDao", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/store/event/EventMarketdataStore_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/store/event/EventMarketdataStore_Factory;", "Lcom/robinhood/store/event/EventMarketdataStore;", "newInstance", "(Lcom/robinhood/targetbackend/TargetBackend;Lcom/robinhood/android/eventcontracts/models/event/api/EventMarketdataApi;Lcom/robinhood/android/eventcontracts/models/event/api/EventManagedMarketdataApi;Lcom/robinhood/android/models/event/db/dao/EventFundamentalDao;Lcom/robinhood/android/models/event/db/dao/EventHistoricalDao;Lcom/robinhood/android/models/event/db/dao/EventQuoteDao;Lcom/robinhood/android/models/event/db/dao/EventGameDataDao;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)Lcom/robinhood/store/event/EventMarketdataStore;", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EventMarketdataStore_Factory create(Provider<TargetBackend> targetBackend, Provider<EventMarketdataApi> eventMarketdataApi, Provider<EventManagedMarketdataApi> eventManagedMarketdataApi, Provider<EventFundamentalDao> eventFundamentalDao, Provider<EventHistoricalDao> eventHistoricalDao, Provider<EventQuoteDao> eventQuoteDao, Provider<EventGameDataDao> eventGameDataDao, Provider<Clock> clock, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            Intrinsics.checkNotNullParameter(eventMarketdataApi, "eventMarketdataApi");
            Intrinsics.checkNotNullParameter(eventManagedMarketdataApi, "eventManagedMarketdataApi");
            Intrinsics.checkNotNullParameter(eventFundamentalDao, "eventFundamentalDao");
            Intrinsics.checkNotNullParameter(eventHistoricalDao, "eventHistoricalDao");
            Intrinsics.checkNotNullParameter(eventQuoteDao, "eventQuoteDao");
            Intrinsics.checkNotNullParameter(eventGameDataDao, "eventGameDataDao");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new EventMarketdataStore_Factory(targetBackend, eventMarketdataApi, eventManagedMarketdataApi, eventFundamentalDao, eventHistoricalDao, eventQuoteDao, eventGameDataDao, clock, storeBundle);
        }

        @JvmStatic
        public final EventMarketdataStore newInstance(TargetBackend targetBackend, EventMarketdataApi eventMarketdataApi, EventManagedMarketdataApi eventManagedMarketdataApi, EventFundamentalDao eventFundamentalDao, EventHistoricalDao eventHistoricalDao, EventQuoteDao eventQuoteDao, EventGameDataDao eventGameDataDao, Clock clock, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            Intrinsics.checkNotNullParameter(eventMarketdataApi, "eventMarketdataApi");
            Intrinsics.checkNotNullParameter(eventManagedMarketdataApi, "eventManagedMarketdataApi");
            Intrinsics.checkNotNullParameter(eventFundamentalDao, "eventFundamentalDao");
            Intrinsics.checkNotNullParameter(eventHistoricalDao, "eventHistoricalDao");
            Intrinsics.checkNotNullParameter(eventQuoteDao, "eventQuoteDao");
            Intrinsics.checkNotNullParameter(eventGameDataDao, "eventGameDataDao");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new EventMarketdataStore(targetBackend, eventMarketdataApi, eventManagedMarketdataApi, eventFundamentalDao, eventHistoricalDao, eventQuoteDao, eventGameDataDao, clock, storeBundle);
        }
    }
}

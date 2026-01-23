package com.robinhood.store.event;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.models.event.p186db.EventDatabase;
import com.robinhood.android.models.event.p186db.dao.ContractGroupDao;
import com.robinhood.android.models.event.p186db.dao.ContractGroupSectionDao;
import com.robinhood.android.models.event.p186db.dao.EventBracketDao;
import com.robinhood.android.models.event.p186db.dao.EventContractDao;
import com.robinhood.android.models.event.p186db.dao.EventDao;
import com.robinhood.android.models.event.p186db.dao.EventTimelineDao;
import com.robinhood.android.models.event.p186db.dao.EventToContractMapDao;
import com.robinhood.arsenal.proto.p281v1.idl.InstrumentService;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.util.PredictionMarketsRequestHeaderDelegate2;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B½\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010 \u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/store/event/EventStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/event/EventStore;", "instrumentService", "Ljavax/inject/Provider;", "Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;", "predictionMarketsInstrumentService", "Lcom/robinhood/prediction_markets/proto/v1/idl/InstrumentService;", "eventContractDao", "Lcom/robinhood/android/models/event/db/dao/EventContractDao;", "eventDao", "Lcom/robinhood/android/models/event/db/dao/EventDao;", "eventTimelineDao", "Lcom/robinhood/android/models/event/db/dao/EventTimelineDao;", "eventBracketDao", "Lcom/robinhood/android/models/event/db/dao/EventBracketDao;", "requestHeaderPlugin", "Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;", "eventToContractDao", "Lcom/robinhood/android/models/event/db/dao/EventToContractMapDao;", "contractGroupDao", "Lcom/robinhood/android/models/event/db/dao/ContractGroupDao;", "contractGroupSectionDao", "Lcom/robinhood/android/models/event/db/dao/ContractGroupSectionDao;", "eventDatabase", "Lcom/robinhood/android/models/event/db/EventDatabase;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class EventStore_Factory implements Factory<EventStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ContractGroupDao> contractGroupDao;
    private final Provider<ContractGroupSectionDao> contractGroupSectionDao;
    private final Provider<EventBracketDao> eventBracketDao;
    private final Provider<EventContractDao> eventContractDao;
    private final Provider<EventDao> eventDao;
    private final Provider<EventDatabase> eventDatabase;
    private final Provider<EventTimelineDao> eventTimelineDao;
    private final Provider<EventToContractMapDao> eventToContractDao;
    private final Provider<ExperimentsProvider> experimentsProvider;
    private final Provider<InstrumentService> instrumentService;
    private final Provider<com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService> predictionMarketsInstrumentService;
    private final Provider<PredictionMarketsRequestHeaderDelegate2> requestHeaderPlugin;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final EventStore_Factory create(Provider<InstrumentService> provider, Provider<com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService> provider2, Provider<EventContractDao> provider3, Provider<EventDao> provider4, Provider<EventTimelineDao> provider5, Provider<EventBracketDao> provider6, Provider<PredictionMarketsRequestHeaderDelegate2> provider7, Provider<EventToContractMapDao> provider8, Provider<ContractGroupDao> provider9, Provider<ContractGroupSectionDao> provider10, Provider<EventDatabase> provider11, Provider<StoreBundle> provider12, Provider<ExperimentsProvider> provider13) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    @JvmStatic
    public static final EventStore newInstance(InstrumentService instrumentService, com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService instrumentService2, EventContractDao eventContractDao, EventDao eventDao, EventTimelineDao eventTimelineDao, EventBracketDao eventBracketDao, PredictionMarketsRequestHeaderDelegate2 predictionMarketsRequestHeaderDelegate2, EventToContractMapDao eventToContractMapDao, ContractGroupDao contractGroupDao, ContractGroupSectionDao contractGroupSectionDao, EventDatabase eventDatabase, StoreBundle storeBundle, ExperimentsProvider experimentsProvider) {
        return INSTANCE.newInstance(instrumentService, instrumentService2, eventContractDao, eventDao, eventTimelineDao, eventBracketDao, predictionMarketsRequestHeaderDelegate2, eventToContractMapDao, contractGroupDao, contractGroupSectionDao, eventDatabase, storeBundle, experimentsProvider);
    }

    public EventStore_Factory(Provider<InstrumentService> instrumentService, Provider<com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService> predictionMarketsInstrumentService, Provider<EventContractDao> eventContractDao, Provider<EventDao> eventDao, Provider<EventTimelineDao> eventTimelineDao, Provider<EventBracketDao> eventBracketDao, Provider<PredictionMarketsRequestHeaderDelegate2> requestHeaderPlugin, Provider<EventToContractMapDao> eventToContractDao, Provider<ContractGroupDao> contractGroupDao, Provider<ContractGroupSectionDao> contractGroupSectionDao, Provider<EventDatabase> eventDatabase, Provider<StoreBundle> storeBundle, Provider<ExperimentsProvider> experimentsProvider) {
        Intrinsics.checkNotNullParameter(instrumentService, "instrumentService");
        Intrinsics.checkNotNullParameter(predictionMarketsInstrumentService, "predictionMarketsInstrumentService");
        Intrinsics.checkNotNullParameter(eventContractDao, "eventContractDao");
        Intrinsics.checkNotNullParameter(eventDao, "eventDao");
        Intrinsics.checkNotNullParameter(eventTimelineDao, "eventTimelineDao");
        Intrinsics.checkNotNullParameter(eventBracketDao, "eventBracketDao");
        Intrinsics.checkNotNullParameter(requestHeaderPlugin, "requestHeaderPlugin");
        Intrinsics.checkNotNullParameter(eventToContractDao, "eventToContractDao");
        Intrinsics.checkNotNullParameter(contractGroupDao, "contractGroupDao");
        Intrinsics.checkNotNullParameter(contractGroupSectionDao, "contractGroupSectionDao");
        Intrinsics.checkNotNullParameter(eventDatabase, "eventDatabase");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        this.instrumentService = instrumentService;
        this.predictionMarketsInstrumentService = predictionMarketsInstrumentService;
        this.eventContractDao = eventContractDao;
        this.eventDao = eventDao;
        this.eventTimelineDao = eventTimelineDao;
        this.eventBracketDao = eventBracketDao;
        this.requestHeaderPlugin = requestHeaderPlugin;
        this.eventToContractDao = eventToContractDao;
        this.contractGroupDao = contractGroupDao;
        this.contractGroupSectionDao = contractGroupSectionDao;
        this.eventDatabase = eventDatabase;
        this.storeBundle = storeBundle;
        this.experimentsProvider = experimentsProvider;
    }

    @Override // javax.inject.Provider
    public EventStore get() {
        Companion companion = INSTANCE;
        InstrumentService instrumentService = this.instrumentService.get();
        Intrinsics.checkNotNullExpressionValue(instrumentService, "get(...)");
        com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService instrumentService2 = this.predictionMarketsInstrumentService.get();
        Intrinsics.checkNotNullExpressionValue(instrumentService2, "get(...)");
        EventContractDao eventContractDao = this.eventContractDao.get();
        Intrinsics.checkNotNullExpressionValue(eventContractDao, "get(...)");
        EventDao eventDao = this.eventDao.get();
        Intrinsics.checkNotNullExpressionValue(eventDao, "get(...)");
        EventTimelineDao eventTimelineDao = this.eventTimelineDao.get();
        Intrinsics.checkNotNullExpressionValue(eventTimelineDao, "get(...)");
        EventBracketDao eventBracketDao = this.eventBracketDao.get();
        Intrinsics.checkNotNullExpressionValue(eventBracketDao, "get(...)");
        PredictionMarketsRequestHeaderDelegate2 predictionMarketsRequestHeaderDelegate2 = this.requestHeaderPlugin.get();
        Intrinsics.checkNotNullExpressionValue(predictionMarketsRequestHeaderDelegate2, "get(...)");
        EventToContractMapDao eventToContractMapDao = this.eventToContractDao.get();
        Intrinsics.checkNotNullExpressionValue(eventToContractMapDao, "get(...)");
        ContractGroupDao contractGroupDao = this.contractGroupDao.get();
        Intrinsics.checkNotNullExpressionValue(contractGroupDao, "get(...)");
        ContractGroupSectionDao contractGroupSectionDao = this.contractGroupSectionDao.get();
        Intrinsics.checkNotNullExpressionValue(contractGroupSectionDao, "get(...)");
        EventDatabase eventDatabase = this.eventDatabase.get();
        Intrinsics.checkNotNullExpressionValue(eventDatabase, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        ExperimentsProvider experimentsProvider = this.experimentsProvider.get();
        Intrinsics.checkNotNullExpressionValue(experimentsProvider, "get(...)");
        return companion.newInstance(instrumentService, instrumentService2, eventContractDao, eventDao, eventTimelineDao, eventBracketDao, predictionMarketsRequestHeaderDelegate2, eventToContractMapDao, contractGroupDao, contractGroupSectionDao, eventDatabase, storeBundle, experimentsProvider);
    }

    /* compiled from: EventStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¾\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0007H\u0007Jp\u0010!\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0007¨\u0006#"}, m3636d2 = {"Lcom/robinhood/store/event/EventStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/event/EventStore_Factory;", "instrumentService", "Ljavax/inject/Provider;", "Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;", "predictionMarketsInstrumentService", "Lcom/robinhood/prediction_markets/proto/v1/idl/InstrumentService;", "eventContractDao", "Lcom/robinhood/android/models/event/db/dao/EventContractDao;", "eventDao", "Lcom/robinhood/android/models/event/db/dao/EventDao;", "eventTimelineDao", "Lcom/robinhood/android/models/event/db/dao/EventTimelineDao;", "eventBracketDao", "Lcom/robinhood/android/models/event/db/dao/EventBracketDao;", "requestHeaderPlugin", "Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;", "eventToContractDao", "Lcom/robinhood/android/models/event/db/dao/EventToContractMapDao;", "contractGroupDao", "Lcom/robinhood/android/models/event/db/dao/ContractGroupDao;", "contractGroupSectionDao", "Lcom/robinhood/android/models/event/db/dao/ContractGroupSectionDao;", "eventDatabase", "Lcom/robinhood/android/models/event/db/EventDatabase;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "newInstance", "Lcom/robinhood/store/event/EventStore;", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EventStore_Factory create(Provider<InstrumentService> instrumentService, Provider<com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService> predictionMarketsInstrumentService, Provider<EventContractDao> eventContractDao, Provider<EventDao> eventDao, Provider<EventTimelineDao> eventTimelineDao, Provider<EventBracketDao> eventBracketDao, Provider<PredictionMarketsRequestHeaderDelegate2> requestHeaderPlugin, Provider<EventToContractMapDao> eventToContractDao, Provider<ContractGroupDao> contractGroupDao, Provider<ContractGroupSectionDao> contractGroupSectionDao, Provider<EventDatabase> eventDatabase, Provider<StoreBundle> storeBundle, Provider<ExperimentsProvider> experimentsProvider) {
            Intrinsics.checkNotNullParameter(instrumentService, "instrumentService");
            Intrinsics.checkNotNullParameter(predictionMarketsInstrumentService, "predictionMarketsInstrumentService");
            Intrinsics.checkNotNullParameter(eventContractDao, "eventContractDao");
            Intrinsics.checkNotNullParameter(eventDao, "eventDao");
            Intrinsics.checkNotNullParameter(eventTimelineDao, "eventTimelineDao");
            Intrinsics.checkNotNullParameter(eventBracketDao, "eventBracketDao");
            Intrinsics.checkNotNullParameter(requestHeaderPlugin, "requestHeaderPlugin");
            Intrinsics.checkNotNullParameter(eventToContractDao, "eventToContractDao");
            Intrinsics.checkNotNullParameter(contractGroupDao, "contractGroupDao");
            Intrinsics.checkNotNullParameter(contractGroupSectionDao, "contractGroupSectionDao");
            Intrinsics.checkNotNullParameter(eventDatabase, "eventDatabase");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            return new EventStore_Factory(instrumentService, predictionMarketsInstrumentService, eventContractDao, eventDao, eventTimelineDao, eventBracketDao, requestHeaderPlugin, eventToContractDao, contractGroupDao, contractGroupSectionDao, eventDatabase, storeBundle, experimentsProvider);
        }

        @JvmStatic
        public final EventStore newInstance(InstrumentService instrumentService, com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService predictionMarketsInstrumentService, EventContractDao eventContractDao, EventDao eventDao, EventTimelineDao eventTimelineDao, EventBracketDao eventBracketDao, PredictionMarketsRequestHeaderDelegate2 requestHeaderPlugin, EventToContractMapDao eventToContractDao, ContractGroupDao contractGroupDao, ContractGroupSectionDao contractGroupSectionDao, EventDatabase eventDatabase, StoreBundle storeBundle, ExperimentsProvider experimentsProvider) {
            Intrinsics.checkNotNullParameter(instrumentService, "instrumentService");
            Intrinsics.checkNotNullParameter(predictionMarketsInstrumentService, "predictionMarketsInstrumentService");
            Intrinsics.checkNotNullParameter(eventContractDao, "eventContractDao");
            Intrinsics.checkNotNullParameter(eventDao, "eventDao");
            Intrinsics.checkNotNullParameter(eventTimelineDao, "eventTimelineDao");
            Intrinsics.checkNotNullParameter(eventBracketDao, "eventBracketDao");
            Intrinsics.checkNotNullParameter(requestHeaderPlugin, "requestHeaderPlugin");
            Intrinsics.checkNotNullParameter(eventToContractDao, "eventToContractDao");
            Intrinsics.checkNotNullParameter(contractGroupDao, "contractGroupDao");
            Intrinsics.checkNotNullParameter(contractGroupSectionDao, "contractGroupSectionDao");
            Intrinsics.checkNotNullParameter(eventDatabase, "eventDatabase");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            return new EventStore(instrumentService, predictionMarketsInstrumentService, eventContractDao, eventDao, eventTimelineDao, eventBracketDao, requestHeaderPlugin, eventToContractDao, contractGroupDao, contractGroupSectionDao, eventDatabase, storeBundle, experimentsProvider);
        }
    }
}

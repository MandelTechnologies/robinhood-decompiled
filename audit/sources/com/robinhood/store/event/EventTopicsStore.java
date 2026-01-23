package com.robinhood.store.event;

import com.robinhood.android.models.event.p186db.arsenal.EventTopic;
import com.robinhood.android.models.event.p186db.arsenal.EventTopic3;
import com.robinhood.android.models.event.p186db.dao.EventTopicDao;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.arsenal.proto.p281v1.idl.EventTopicDto;
import com.robinhood.arsenal.proto.p281v1.idl.InstrumentService;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: EventTopicsStore.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0012J!\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR2\u0010\u001f\u001a \u0012\u0004\u0012\u00020\u0015\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u000f\u0012\u0004\u0012\u00020\u00150\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R&\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R&\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R2\u0010'\u001a \u0012\u0004\u0012\u00020\f\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u000f0\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010 R&\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%¨\u0006)"}, m3636d2 = {"Lcom/robinhood/store/event/EventTopicsStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;", "instrumentService", "Lcom/robinhood/android/models/event/db/dao/EventTopicDao;", "eventTopicDao", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;Lcom/robinhood/android/models/event/db/dao/EventTopicDao;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)V", "Ljava/util/UUID;", "topicId", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/android/models/event/db/arsenal/EventTopic;", "streamEventTopicsListByRelevantTopicId", "(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "bracketId", "streamTopicIdByBracketId", "Lcom/robinhood/android/models/event/db/arsenal/EventTopicLocation;", "location", "streamEventTopicsListByLocation", "(Lcom/robinhood/android/models/event/db/arsenal/EventTopicLocation;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;", "Lcom/robinhood/android/models/event/db/dao/EventTopicDao;", "Lj$/time/Clock;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "Lcom/robinhood/arsenal/proto/v1/idl/EventTopicDto;", "getEventTopicsListByLocationEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "getAllEventTopicsListEndPoint", "Lcom/robinhood/android/moria/db/Query;", "queryEventTopicsListByLocation", "Lcom/robinhood/android/moria/db/Query;", "queryEventTopicIdByBracketId", "getRelevantTopicsListEndpoint", "queryRelevantTopicsListByTopicId", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class EventTopicsStore extends Store {
    private final Clock clock;
    private final EventTopicDao eventTopicDao;
    private final Endpoint<Unit, List<EventTopic>> getAllEventTopicsListEndPoint;
    private final Endpoint<EventTopic3, Tuples2<List<EventTopicDto>, EventTopic3>> getEventTopicsListByLocationEndpoint;
    private final Endpoint<UUID, Tuples2<UUID, List<EventTopicDto>>> getRelevantTopicsListEndpoint;
    private final InstrumentService instrumentService;
    private final Query<UUID, UUID> queryEventTopicIdByBracketId;
    private final Query<EventTopic3, List<EventTopic>> queryEventTopicsListByLocation;
    private final Query<UUID, List<EventTopic>> queryRelevantTopicsListByTopicId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventTopicsStore(InstrumentService instrumentService, EventTopicDao eventTopicDao, Clock clock, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(instrumentService, "instrumentService");
        Intrinsics.checkNotNullParameter(eventTopicDao, "eventTopicDao");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.instrumentService = instrumentService;
        this.eventTopicDao = eventTopicDao;
        this.clock = clock;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        Endpoint<EventTopic3, Tuples2<List<EventTopicDto>, EventTopic3>> endpointCreate$default = Endpoint.Companion.create$default(companion, new EventTopicsStore4(this, null), storeBundle.getLogoutKillswitch(), new EventTopicsStore5(this, null), storeBundle.getClock(), null, 16, null);
        this.getEventTopicsListByLocationEndpoint = endpointCreate$default;
        this.getAllEventTopicsListEndPoint = Endpoint.Companion.create$default(companion, new EventTopicsStore2(this, null), storeBundle.getLogoutKillswitch(), new EventTopicsStore3(this, null), storeBundle.getClock(), null, 16, null);
        Query.Companion companion2 = Query.INSTANCE;
        this.queryEventTopicsListByLocation = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryEventTopicsListByLocation", CollectionsKt.listOf(new RefreshEach(new EventTopicsStore8(endpointCreate$default))), new Function1() { // from class: com.robinhood.store.event.EventTopicsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventTopicsStore.queryEventTopicsListByLocation$lambda$0(this.f$0, (EventTopic3) obj);
            }
        }, false, 16, null);
        this.queryEventTopicIdByBracketId = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryEventTopicIdsByBracketId", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.store.event.EventTopicsStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventTopicsStore.queryEventTopicIdByBracketId$lambda$1(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.event.EventTopicsStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventTopicsStore.queryEventTopicIdByBracketId$lambda$2(this.f$0, (UUID) obj);
            }
        }, false, 16, null);
        Endpoint<UUID, Tuples2<UUID, List<EventTopicDto>>> endpointCreate$default2 = Endpoint.Companion.create$default(companion, new EventTopicsStore6(this, null), storeBundle.getLogoutKillswitch(), new EventTopicsStore7(this, null), storeBundle.getClock(), null, 16, null);
        this.getRelevantTopicsListEndpoint = endpointCreate$default2;
        this.queryRelevantTopicsListByTopicId = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryRelevantTopicsList", CollectionsKt.listOf(new RefreshEach(new EventTopicsStore9(endpointCreate$default2))), new Function1() { // from class: com.robinhood.store.event.EventTopicsStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventTopicsStore.queryRelevantTopicsListByTopicId$lambda$4(this.f$0, (UUID) obj);
            }
        }, false, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryEventTopicsListByLocation$lambda$0(EventTopicsStore eventTopicsStore, EventTopic3 location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return FlowKt.distinctUntilChanged(eventTopicsStore.eventTopicDao.getEventTopicsByLocation(location, Instant.now(eventTopicsStore.clock)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job queryEventTopicIdByBracketId$lambda$1(EventTopicsStore eventTopicsStore, UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<unused var>");
        return Endpoint.DefaultImpls.refresh$default(eventTopicsStore.getAllEventTopicsListEndPoint, Unit.INSTANCE, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryEventTopicIdByBracketId$lambda$2(EventTopicsStore eventTopicsStore, UUID bracketId) {
        Intrinsics.checkNotNullParameter(bracketId, "bracketId");
        return eventTopicsStore.eventTopicDao.getEventTopicIdByBracketId(bracketId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryRelevantTopicsListByTopicId$lambda$4(EventTopicsStore eventTopicsStore, UUID topicId) {
        Intrinsics.checkNotNullParameter(topicId, "topicId");
        return eventTopicsStore.eventTopicDao.getEventTopicsByRelevantTopicId(topicId, Instant.now(eventTopicsStore.clock));
    }

    public final Flow<List<EventTopic>> streamEventTopicsListByRelevantTopicId(UUID topicId) {
        Intrinsics.checkNotNullParameter(topicId, "topicId");
        return this.queryRelevantTopicsListByTopicId.asFlow(topicId);
    }

    public final Flow<UUID> streamTopicIdByBracketId(UUID bracketId) {
        Intrinsics.checkNotNullParameter(bracketId, "bracketId");
        return this.queryEventTopicIdByBracketId.asFlow(bracketId);
    }

    public final Flow<List<EventTopic>> streamEventTopicsListByLocation(EventTopic3 location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return FlowKt.distinctUntilChanged(this.queryEventTopicsListByLocation.asFlow(location));
    }
}

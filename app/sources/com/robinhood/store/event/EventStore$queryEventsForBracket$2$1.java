package com.robinhood.store.event;

import com.robinhood.android.models.event.p186db.arsenal.Event;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EventStore.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m3636d2 = {"", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/arsenal/Event;", "events", "", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "eventIdToContracts", "Lcom/robinhood/android/models/event/ui/UiEcEvent;", "<anonymous>", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.store.event.EventStore$queryEventsForBracket$2$1", m3645f = "EventStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes12.dex */
final class EventStore$queryEventsForBracket$2$1 extends ContinuationImpl7 implements Function3<Map<UUID, ? extends Event>, Map<UUID, ? extends List<? extends EventContract>>, Continuation<? super Map<UUID, ? extends UiEcEvent>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    EventStore$queryEventsForBracket$2$1(Continuation<? super EventStore$queryEventsForBracket$2$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends Event> map, Map<UUID, ? extends List<? extends EventContract>> map2, Continuation<? super Map<UUID, ? extends UiEcEvent>> continuation) {
        return invoke2((Map<UUID, Event>) map, (Map<UUID, ? extends List<EventContract>>) map2, (Continuation<? super Map<UUID, UiEcEvent>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Map<UUID, Event> map, Map<UUID, ? extends List<EventContract>> map2, Continuation<? super Map<UUID, UiEcEvent>> continuation) {
        EventStore$queryEventsForBracket$2$1 eventStore$queryEventsForBracket$2$1 = new EventStore$queryEventsForBracket$2$1(continuation);
        eventStore$queryEventsForBracket$2$1.L$0 = map;
        eventStore$queryEventsForBracket$2$1.L$1 = map2;
        return eventStore$queryEventsForBracket$2$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Map map = (Map) this.L$0;
        Map map2 = (Map) this.L$1;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            UUID uuid = (UUID) entry.getKey();
            Event event = (Event) entry.getValue();
            UiEcEvent.Companion companion = UiEcEvent.INSTANCE;
            List<EventContract> listEmptyList = (List) map2.get(uuid);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            linkedHashMap.put(key, companion.fromDbModels(event, listEmptyList));
        }
        return linkedHashMap;
    }
}

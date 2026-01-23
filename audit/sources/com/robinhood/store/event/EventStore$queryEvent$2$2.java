package com.robinhood.store.event;

import com.robinhood.android.models.event.p186db.arsenal.Event;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: EventStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class EventStore$queryEvent$2$2 extends AdaptedFunctionReference implements Function3<Event, List<? extends EventContract>, Continuation<? super UiEcEvent>, Object>, ContinuationImpl6 {
    EventStore$queryEvent$2$2(Object obj) {
        super(3, obj, UiEcEvent.Companion.class, "fromDbModels", "fromDbModels(Lcom/robinhood/android/models/event/db/arsenal/Event;Ljava/util/List;)Lcom/robinhood/android/models/event/ui/UiEcEvent;", 4);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Event event, List<EventContract> list, Continuation<? super UiEcEvent> continuation) {
        return EventStore.queryEvent$lambda$46$fromDbModels((UiEcEvent.Companion) this.receiver, event, list, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Event event, List<? extends EventContract> list, Continuation<? super UiEcEvent> continuation) {
        return invoke2(event, (List<EventContract>) list, continuation);
    }
}

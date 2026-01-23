package com.robinhood.android.futures.eventbrackets.screen.tournament;

import com.robinhood.android.models.event.p187ui.UiEcEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EventsTournamentBracketDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Ljava/util/UUID;", "eventsMap", "", "Lcom/robinhood/android/models/event/ui/UiEcEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$eventContractIdsFlow$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$eventContractIdsFlow$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EventsTournamentBracketDuxo2 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends UiEcEvent>, Continuation<? super List<? extends UUID>>, Object> {
    /* synthetic */ Object L$0;
    int label;

    EventsTournamentBracketDuxo2(Continuation<? super EventsTournamentBracketDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventsTournamentBracketDuxo2 eventsTournamentBracketDuxo2 = new EventsTournamentBracketDuxo2(continuation);
        eventsTournamentBracketDuxo2.L$0 = obj;
        return eventsTournamentBracketDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends UiEcEvent> map, Continuation<? super List<? extends UUID>> continuation) {
        return invoke2((Map<UUID, UiEcEvent>) map, (Continuation<? super List<UUID>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Map<UUID, UiEcEvent> map, Continuation<? super List<UUID>> continuation) {
        return ((EventsTournamentBracketDuxo2) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Collection collectionValues = ((Map) this.L$0).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((UiEcEvent) it.next()).getContractIds());
        }
        return arrayList;
    }
}

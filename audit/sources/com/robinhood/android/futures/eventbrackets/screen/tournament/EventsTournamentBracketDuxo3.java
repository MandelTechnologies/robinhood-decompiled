package com.robinhood.android.futures.eventbrackets.screen.tournament;

import com.robinhood.store.event.EventTopicsStore;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: EventsTournamentBracketDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u001a\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00020\u00050\u0001H\u0002¨\u0006\u0006"}, m3636d2 = {"streamTopicIdByTopicIdOrBracketId", "Lkotlinx/coroutines/flow/Flow;", "Ljava/util/UUID;", "Lcom/robinhood/store/event/EventTopicsStore;", "topicIdToBracketIdFlow", "Lkotlin/Pair;", "feature-event-brackets_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxoKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventsTournamentBracketDuxo3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow<UUID> streamTopicIdByTopicIdOrBracketId(EventTopicsStore eventTopicsStore, Flow<Tuples2<UUID, UUID>> flow) {
        return FlowKt.transformLatest(flow, new C17158x55058134(null, eventTopicsStore));
    }
}

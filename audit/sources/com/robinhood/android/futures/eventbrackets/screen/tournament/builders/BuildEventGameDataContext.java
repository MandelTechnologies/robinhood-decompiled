package com.robinhood.android.futures.eventbrackets.screen.tournament.builders;

import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.arsenal.EventViewMode;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.store.event.EventGameDataContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BuildEventGameDataContext.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u001a:\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\n0\u0004H\u0000¨\u0006\u000e"}, m3636d2 = {"buildEventGameDataContext", "", "Lcom/robinhood/store/event/EventGameDataContext;", "eventsMap", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/ui/UiEcEvent;", "getHomeAndAwayIndicesPair", "Lkotlin/Pair;", "", "V", "eventViewMode", "Lcom/robinhood/android/models/event/db/arsenal/EventViewMode;", "indexToDataMap", "feature-event-brackets_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.builders.BuildEventGameDataContextKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildEventGameDataContext {

    /* compiled from: BuildEventGameDataContext.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.builders.BuildEventGameDataContextKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventViewMode.values().length];
            try {
                iArr[EventViewMode.PAIR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventViewMode.MULTI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EventViewMode.UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final <V> Tuples2<Integer, Integer> getHomeAndAwayIndicesPair(EventViewMode eventViewMode, Map<Integer, ? extends V> indexToDataMap) {
        Intrinsics.checkNotNullParameter(eventViewMode, "eventViewMode");
        Intrinsics.checkNotNullParameter(indexToDataMap, "indexToDataMap");
        int i = WhenMappings.$EnumSwitchMapping$0[eventViewMode.ordinal()];
        if (i == 1) {
            return (indexToDataMap.get(-2) == null && indexToDataMap.get(-1) == null) ? new Tuples2<>(0, 1) : new Tuples2<>(-2, -1);
        }
        if (i == 2) {
            return new Tuples2<>(-2, -1);
        }
        if (i == 3) {
            return new Tuples2<>(null, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final List<EventGameDataContext> buildEventGameDataContext(Map<UUID, UiEcEvent> eventsMap) {
        SortedMap<Integer, EventContract> orderedContracts;
        Intrinsics.checkNotNullParameter(eventsMap, "eventsMap");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<UUID, UiEcEvent> entry : eventsMap.entrySet()) {
            UUID key = entry.getKey();
            UiEcEvent value = entry.getValue();
            UiEcEvent uiEcEvent = eventsMap.get(key);
            EventGameDataContext eventGameDataContext = null;
            if (uiEcEvent != null && (orderedContracts = uiEcEvent.getOrderedContracts()) != null) {
                Tuples2<Integer, Integer> homeAndAwayIndicesPair = getHomeAndAwayIndicesPair(value.getEvent().getViewMode(), orderedContracts);
                Integer numComponent1 = homeAndAwayIndicesPair.component1();
                Integer numComponent2 = homeAndAwayIndicesPair.component2();
                EventContract eventContract = orderedContracts.get(numComponent1);
                UUID contractId = eventContract != null ? eventContract.getContractId() : null;
                EventContract eventContract2 = orderedContracts.get(numComponent2);
                UUID contractId2 = eventContract2 != null ? eventContract2.getContractId() : null;
                if (contractId != null && contractId2 != null) {
                    eventGameDataContext = new EventGameDataContext(key, contractId, contractId2);
                }
            }
            if (eventGameDataContext != null) {
                arrayList.add(eventGameDataContext);
            }
        }
        return arrayList;
    }
}

package com.robinhood.android.eventcontracts.sharedeventui.animation;

import com.robinhood.android.models.event.p186db.marketdata.EventFundamental;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import p479j$.time.Instant;

/* compiled from: BuildOpenInterestAggregatedDeltaMapping.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u001au\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r\u001aA\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"j$/time/Instant", "timeReceived", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/marketdata/EventFundamental;", "newContractIdToFundamentals", "previousContractIdToFundamentals", "", "Lcom/robinhood/android/eventcontracts/sharedeventui/animation/Delta;", "previousContractIdToAggregatedDeltas", "", "pollDurationToNotOverlapAnimation", "buildOpenInterestDeltaMapping", "(Lj$/time/Instant;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Long;)Ljava/util/Map;", "buildOpenInterestDeltaMappingWithoutTime", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "lib-shared-event-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.animation.BuildOpenInterestAggregatedDeltaMappingKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildOpenInterestAggregatedDeltaMapping {
    public static /* synthetic */ Map buildOpenInterestDeltaMapping$default(Instant instant, Map map, Map map2, Map map3, Long l, int i, Object obj) {
        if ((i & 16) != 0) {
            l = null;
        }
        return buildOpenInterestDeltaMapping(instant, map, map2, map3, l);
    }

    public static final Map<UUID, List<Delta>> buildOpenInterestDeltaMapping(Instant timeReceived, Map<UUID, EventFundamental> newContractIdToFundamentals, Map<UUID, EventFundamental> previousContractIdToFundamentals, Map<UUID, ? extends List<Delta>> previousContractIdToAggregatedDeltas, Long l) {
        Delta delta;
        List listPlus;
        Integer num;
        Instant instantPlusMillis;
        Intrinsics.checkNotNullParameter(timeReceived, "timeReceived");
        Intrinsics.checkNotNullParameter(newContractIdToFundamentals, "newContractIdToFundamentals");
        Intrinsics.checkNotNullParameter(previousContractIdToFundamentals, "previousContractIdToFundamentals");
        Intrinsics.checkNotNullParameter(previousContractIdToAggregatedDeltas, "previousContractIdToAggregatedDeltas");
        List list = CollectionsKt.toList(SetsKt.plus((Set) newContractIdToFundamentals.keySet(), (Iterable) previousContractIdToFundamentals.keySet()));
        ArrayList<Tuples2> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(Tuples4.m3642to(Integer.valueOf(i), (UUID) obj));
            i = i2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (Tuples2 tuples2 : arrayList) {
            UUID uuid = (UUID) tuples2.getSecond();
            int iIntValue = ((Number) tuples2.component1()).intValue();
            UUID uuid2 = (UUID) tuples2.component2();
            EventFundamental eventFundamental = previousContractIdToFundamentals.get(uuid2);
            Integer openInterest = eventFundamental != null ? eventFundamental.getOpenInterest() : null;
            EventFundamental eventFundamental2 = newContractIdToFundamentals.get(uuid2);
            Integer openInterest2 = eventFundamental2 != null ? eventFundamental2.getOpenInterest() : null;
            if (openInterest == null || openInterest2 == null || Intrinsics.areEqual(openInterest, openInterest2)) {
                delta = null;
            } else {
                if (l != null) {
                    num = openInterest2;
                    instantPlusMillis = timeReceived.plusMillis((l.longValue() * iIntValue) / r4.size());
                } else {
                    num = openInterest2;
                    instantPlusMillis = timeReceived;
                }
                int iIntValue2 = num.intValue() - openInterest.intValue();
                Intrinsics.checkNotNull(instantPlusMillis);
                delta = new Delta(iIntValue2, instantPlusMillis);
            }
            List<Delta> list2 = previousContractIdToAggregatedDeltas.get(uuid2);
            if (list2 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (!((Delta) obj2).isComplete(timeReceived)) {
                        arrayList2.add(obj2);
                    }
                }
                listPlus = arrayList2;
            } else {
                listPlus = null;
            }
            if (listPlus == null) {
                listPlus = CollectionsKt.emptyList();
            }
            if (delta != null) {
                listPlus = CollectionsKt.plus((Collection<? extends Delta>) listPlus, delta);
            }
            linkedHashMap.put(uuid, listPlus);
        }
        return linkedHashMap;
    }

    public static final Map<UUID, Delta> buildOpenInterestDeltaMappingWithoutTime(Map<UUID, EventFundamental> newContractIdToFundamentals, Map<UUID, EventFundamental> previousContractIdToFundamentals) {
        Intrinsics.checkNotNullParameter(newContractIdToFundamentals, "newContractIdToFundamentals");
        Intrinsics.checkNotNullParameter(previousContractIdToFundamentals, "previousContractIdToFundamentals");
        Set<UUID> setPlus = SetsKt.plus((Set) newContractIdToFundamentals.keySet(), (Iterable) previousContractIdToFundamentals.keySet());
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        for (UUID uuid : setPlus) {
            EventFundamental eventFundamental = previousContractIdToFundamentals.get(uuid);
            Delta delta = null;
            Integer openInterest = eventFundamental != null ? eventFundamental.getOpenInterest() : null;
            EventFundamental eventFundamental2 = newContractIdToFundamentals.get(uuid);
            Integer openInterest2 = eventFundamental2 != null ? eventFundamental2.getOpenInterest() : null;
            if (openInterest != null && openInterest2 != null && !Intrinsics.areEqual(openInterest, openInterest2)) {
                delta = new Delta(openInterest2.intValue() - openInterest.intValue(), null, 2, null);
            }
            if (delta != null) {
                mapCreateMapBuilder.put(uuid, delta);
            }
        }
        return MapsKt.build(mapCreateMapBuilder);
    }
}

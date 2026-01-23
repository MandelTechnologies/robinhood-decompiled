package com.robinhood.android.futures.eventbrackets.screen.tournament.builders;

import com.robinhood.android.futures.eventbrackets.p141ui.NavigationRound;
import com.robinhood.android.models.event.p186db.arsenal.EventMetadata;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BuildBracketNavigationInfo.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000\u001a\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¨\u0006\b"}, m3636d2 = {"buildNavigationRounds", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/futures/eventbrackets/ui/NavigationRound;", "events", "", "Lcom/robinhood/android/models/event/ui/UiEcEvent;", "buildNavigationRegions", "", "feature-event-brackets_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.builders.BuildBracketNavigationInfoKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildBracketNavigationInfo {
    public static final ImmutableList3<NavigationRound> buildNavigationRounds(List<UiEcEvent> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        List listSortedWith = CollectionsKt.sortedWith(events, new Comparator() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.builders.BuildBracketNavigationInfoKt$buildNavigationRounds$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                EventMetadata round = ((UiEcEvent) t).getEvent().getRound();
                Integer numValueOf = round != null ? Integer.valueOf(round.getIndex()) : null;
                EventMetadata round2 = ((UiEcEvent) t2).getEvent().getRound();
                return ComparisonsKt.compareValues(numValueOf, round2 != null ? Integer.valueOf(round2.getIndex()) : null);
            }
        });
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = listSortedWith.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            EventMetadata round = ((UiEcEvent) next).getEvent().getRound();
            String name = round != null ? round.getName() : null;
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(next);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            boolean z = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((UiEcEvent) it2.next()).getEvent().getRegion() != null) {
                        z = true;
                        break;
                    }
                }
            }
            linkedHashMap2.put(key, Boolean.valueOf(z));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            String str = (String) entry2.getKey();
            NavigationRound navigationRound = str != null ? new NavigationRound(str, ((Boolean) entry2.getValue()).booleanValue()) : null;
            if (navigationRound != null) {
                arrayList2.add(navigationRound);
            }
        }
        return extensions2.toPersistentList(arrayList2);
    }

    public static final ImmutableList3<String> buildNavigationRegions(List<UiEcEvent> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = events.iterator();
        while (it.hasNext()) {
            EventMetadata region = ((UiEcEvent) it.next()).getEvent().getRegion();
            if (region != null) {
                arrayList.add(region);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((EventMetadata) obj).getName())) {
                arrayList2.add(obj);
            }
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.builders.BuildBracketNavigationInfoKt$buildNavigationRegions$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((EventMetadata) t).getIndex()), Integer.valueOf(((EventMetadata) t2).getIndex()));
            }
        });
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        Iterator it2 = listSortedWith.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((EventMetadata) it2.next()).getName());
        }
        return extensions2.toPersistentList(arrayList3);
    }
}

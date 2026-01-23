package com.robinhood.android.futures.eventbrackets.screen.tournament.builders;

import com.robinhood.android.futures.eventbrackets.screen.tournament.AppBarData;
import com.robinhood.android.models.event.p186db.arsenal.EventBracket;
import com.robinhood.android.models.event.p186db.arsenal.UiEventBracket;
import com.robinhood.android.models.event.p186db.ceres.EventContractRealizedPnlByContract;
import com.robinhood.android.models.event.p186db.marketdata.EventGameData;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BuildAppBarData.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001aR\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005\u001a@\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005H\u0002¨\u0006\u0011"}, m3636d2 = {"buildBracketAppBarData", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/AppBarData;", "bracket", "Lcom/robinhood/android/models/event/db/arsenal/UiEventBracket;", "eventsMap", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/ui/UiEcEvent;", "eventIdToEventGameDataMap", "Lcom/robinhood/android/models/event/db/marketdata/EventGameData;", "contractIdToRealizedPnl", "Lcom/robinhood/android/models/event/db/ceres/EventContractRealizedPnlByContract;", "computeBracketTotalPnl", "Lcom/robinhood/models/util/Money;", "finishedGamesContractIds", "", "championshipContractIds", "feature-event-brackets_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.builders.BuildAppBarDataKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildAppBarData {
    public static final AppBarData buildBracketAppBarData(UiEventBracket uiEventBracket, Map<UUID, UiEcEvent> map, Map<UUID, EventGameData> map2, Map<UUID, EventContractRealizedPnlByContract> map3) {
        ArrayList arrayList;
        EventBracket bracket;
        String name;
        List listFilterNotNull = null;
        StringResource stringResourceInvoke = (uiEventBracket == null || (bracket = uiEventBracket.getBracket()) == null || (name = bracket.getName()) == null) ? null : StringResource.INSTANCE.invoke(name);
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<UUID, UiEcEvent> entry : map.entrySet()) {
                if (entry.getValue().isFinalEvent()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            arrayList = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((UiEcEvent) ((Map.Entry) it.next()).getValue()).getContractIds());
            }
        } else {
            arrayList = null;
        }
        if (map2 != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<UUID, EventGameData> entry2 : map2.entrySet()) {
                if (entry2.getValue().getStatus().isGameOver()) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = linkedHashMap2.entrySet().iterator();
            while (it2.hasNext()) {
                EventGameData eventGameData = (EventGameData) ((Map.Entry) it2.next()).getValue();
                CollectionsKt.addAll(arrayList2, CollectionsKt.listOf((Object[]) new UUID[]{eventGameData.getHomeId(), eventGameData.getAwayId()}));
            }
            listFilterNotNull = CollectionsKt.filterNotNull(arrayList2);
        }
        return new AppBarData(stringResourceInvoke, computeBracketTotalPnl(listFilterNotNull, arrayList, map3));
    }

    private static final Money computeBracketTotalPnl(List<UUID> list, List<UUID> list2, Map<UUID, EventContractRealizedPnlByContract> map) {
        List listEmptyList;
        Money moneyPlus = null;
        if (list != null && list2 != null) {
            List<UUID> listPlus = CollectionsKt.plus((Collection) list, (Iterable) list2);
            if (listPlus.isEmpty()) {
                return Money3.toMoney(new BigDecimal(0), Currencies.USD);
            }
            ArrayList arrayList = new ArrayList();
            for (UUID uuid : listPlus) {
                if (map != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<UUID, EventContractRealizedPnlByContract> entry : map.entrySet()) {
                        if (Intrinsics.areEqual(entry.getKey(), uuid)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    listEmptyList = new ArrayList(linkedHashMap.size());
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        listEmptyList.add(((EventContractRealizedPnlByContract) ((Map.Entry) it.next()).getValue()).getRealizedPnl());
                    }
                } else {
                    listEmptyList = null;
                }
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                CollectionsKt.addAll(arrayList, listEmptyList);
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                moneyPlus = (Money) it2.next();
                while (it2.hasNext()) {
                    moneyPlus = moneyPlus.plus((Money) it2.next());
                }
            }
            if (moneyPlus == null) {
                return Money3.toMoney(new BigDecimal(0), Currencies.USD);
            }
        }
        return moneyPlus;
    }
}

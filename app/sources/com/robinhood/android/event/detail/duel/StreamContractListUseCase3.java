package com.robinhood.android.event.detail.duel;

import com.robinhood.android.event.detail.builders.ContractListData;
import com.robinhood.android.event.detail.p129ui.bottomsheets.EventDetailDisplayDataBottomSheet;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.arsenal.EventContractTradability;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.order.UiEventOrder;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: StreamContractListUseCase.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0082\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u00062\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00012\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00010\u0006H\u0007¨\u0006\u0011"}, m3636d2 = {"buildMultiContractListData", "", "Lcom/robinhood/android/event/detail/builders/ContractListData;", "contracts", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "positions", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "quotes", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "existingData", "displayMode", "Lcom/robinhood/android/event/detail/ui/bottomsheets/EventDetailContractDisplayMode;", "defaultSelectedContract", "pendingOrdersByContractId", "Lcom/robinhood/android/models/event/db/order/UiEventOrder;", "feature-event-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.detail.duel.StreamContractListUseCaseKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class StreamContractListUseCase3 {
    public static /* synthetic */ List buildMultiContractListData$default(List list, Map map, Map map2, List list2, EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet, UUID uuid, Map map3, int i, Object obj) {
        if ((i & 64) != 0) {
            map3 = MapsKt.emptyMap();
        }
        return buildMultiContractListData(list, map, map2, list2, eventDetailDisplayDataBottomSheet, uuid, map3);
    }

    public static final List<ContractListData> buildMultiContractListData(List<EventContract> contracts2, Map<UUID, UiEventContractPosition> positions, Map<UUID, EventQuote> quotes, List<UUID> list, EventDetailDisplayDataBottomSheet displayMode, final UUID uuid, Map<UUID, ? extends List<UiEventOrder>> pendingOrdersByContractId) {
        final LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(contracts2, "contracts");
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(quotes, "quotes");
        Intrinsics.checkNotNullParameter(displayMode, "displayMode");
        Intrinsics.checkNotNullParameter(pendingOrdersByContractId, "pendingOrdersByContractId");
        if (list != null) {
            List<UUID> list2 = list;
            ArrayList<Tuples2> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            int i = 0;
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(Tuples4.m3642to(Integer.valueOf(i), (UUID) obj));
                i = i2;
            }
            linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
            for (Tuples2 tuples2 : arrayList) {
                Tuples2 tuples2M3642to = Tuples4.m3642to((UUID) tuples2.component2(), Integer.valueOf(((Number) tuples2.component1()).intValue()));
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
        } else {
            linkedHashMap = null;
        }
        List<EventContract> list3 = contracts2;
        List arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        for (EventContract eventContract : list3) {
            arrayList2.add(new Tuples3(eventContract, positions.get(eventContract.getContractId()), quotes.get(eventContract.getContractId())));
        }
        if (list == null) {
            arrayList2 = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.robinhood.android.event.detail.duel.StreamContractListUseCaseKt$buildMultiContractListData$2$1
                @Override // java.util.Comparator
                public final int compare(Tuples3<EventContract, UiEventContractPosition, EventQuote> tuples3, Tuples3<EventContract, UiEventContractPosition, EventQuote> tuples32) {
                    EventContract eventContractComponent1 = tuples3.component1();
                    UiEventContractPosition uiEventContractPositionComponent2 = tuples3.component2();
                    EventQuote eventQuoteComponent3 = tuples3.component3();
                    EventContract eventContractComponent12 = tuples32.component1();
                    UiEventContractPosition uiEventContractPositionComponent22 = tuples32.component2();
                    EventQuote eventQuoteComponent32 = tuples32.component3();
                    BigDecimal quantity = uiEventContractPositionComponent2 != null ? uiEventContractPositionComponent2.getQuantity() : null;
                    BigDecimal quantity2 = uiEventContractPositionComponent22 != null ? uiEventContractPositionComponent22.getQuantity() : null;
                    BigDecimal yesAskPrice = eventQuoteComponent3 != null ? eventQuoteComponent3.getYesAskPrice() : null;
                    BigDecimal yesAskPrice2 = eventQuoteComponent32 != null ? eventQuoteComponent32.getYesAskPrice() : null;
                    if (Intrinsics.areEqual(eventContractComponent1.getContractId(), uuid)) {
                        return -1;
                    }
                    if (Intrinsics.areEqual(eventContractComponent12.getContractId(), uuid)) {
                        return 1;
                    }
                    EventContractTradability tradability = eventContractComponent1.getTradability();
                    EventContractTradability eventContractTradability = EventContractTradability.UNTRADABLE;
                    if (tradability != eventContractTradability && eventContractComponent12.getTradability() == eventContractTradability) {
                        return -1;
                    }
                    if (eventContractComponent12.getTradability() != eventContractTradability && eventContractComponent1.getTradability() == eventContractTradability) {
                        return 1;
                    }
                    if (quantity != null && quantity2 == null) {
                        return -1;
                    }
                    if (quantity == null && quantity2 != null) {
                        return 1;
                    }
                    if (!BigDecimals7.m2977eq(quantity != null ? quantity.abs() : null, quantity2 != null ? quantity2.abs() : null)) {
                        if (quantity == null) {
                            quantity = BigDecimal.ZERO;
                        }
                        if (quantity2 == null) {
                            quantity2 = BigDecimal.ZERO;
                        }
                        return quantity2.abs().compareTo(quantity.abs());
                    }
                    if (yesAskPrice2 == null) {
                        yesAskPrice2 = BigDecimal.ZERO;
                    }
                    if (yesAskPrice == null) {
                        yesAskPrice = BigDecimal.ZERO;
                    }
                    int iCompareTo = yesAskPrice2.compareTo(yesAskPrice);
                    return iCompareTo != 0 ? iCompareTo : eventContractComponent1.getName().compareTo(eventContractComponent12.getName());
                }
            });
        }
        if (list != null) {
            arrayList2 = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.robinhood.android.event.detail.duel.StreamContractListUseCaseKt$buildMultiContractListData$3$1
                @Override // java.util.Comparator
                public final int compare(Tuples3<EventContract, UiEventContractPosition, EventQuote> tuples3, Tuples3<EventContract, UiEventContractPosition, EventQuote> tuples32) {
                    EventContract eventContractComponent1 = tuples3.component1();
                    EventContract eventContractComponent12 = tuples32.component1();
                    Map<UUID, Integer> map = linkedHashMap;
                    Integer num = map != null ? map.get(eventContractComponent1.getContractId()) : null;
                    Map<UUID, Integer> map2 = linkedHashMap;
                    Integer num2 = map2 != null ? map2.get(eventContractComponent12.getContractId()) : null;
                    if (num != null && num2 != null) {
                        return Intrinsics.compare(num.intValue(), num2.intValue());
                    }
                    return eventContractComponent1.getName().compareTo(eventContractComponent12.getName());
                }
            });
        }
        List<Tuples3> list4 = arrayList2;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
        for (Tuples3 tuples3 : list4) {
            EventContract eventContract2 = (EventContract) tuples3.component1();
            UiEventContractPosition uiEventContractPosition = (UiEventContractPosition) tuples3.component2();
            EventQuote eventQuote = (EventQuote) tuples3.component3();
            List<UiEventOrder> listEmptyList = pendingOrdersByContractId.get(eventContract2.getContractId());
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet = displayMode;
            arrayList3.add(new ContractListData(eventContract2, uiEventContractPosition, eventQuote, eventDetailDisplayDataBottomSheet, listEmptyList));
            displayMode = eventDetailDisplayDataBottomSheet;
        }
        return arrayList3;
    }
}

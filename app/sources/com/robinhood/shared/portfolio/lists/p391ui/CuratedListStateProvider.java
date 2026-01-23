package com.robinhood.shared.portfolio.lists.p391ui;

import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.models.api.CuratedListObjectType;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.CuratedListViewMode;
import com.robinhood.models.p320db.bonfire.ListRecord;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListDuxo7;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListViewState;
import com.robinhood.shared.portfolio.lists.p391ui.watchlist.WatchlistItemRow;
import com.robinhood.utils.extensions.StringsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CuratedListStateProvider.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J(\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J4\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011H\u0002¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/CuratedListStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDataState;", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListViewState;", "<init>", "()V", "reduce", "dataState", "determineCuratedListOrder", "Lkotlin/Pair;", "", "Lcom/robinhood/shared/portfolio/lists/ui/UiCuratedListItem;", "determineWatchlistItems", "Lcom/robinhood/shared/portfolio/lists/ui/watchlist/WatchlistItemRow;", "curatedListItem", "Lcom/robinhood/models/db/CuratedListItem;", "positions", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/portfolio/PositionsV2$PositionListItemV2;", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CuratedListStateProvider implements StateProvider<CuratedListDataState, CuratedListViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public CuratedListViewState reduce(CuratedListDataState dataState) {
        Map mapEmptyMap;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getScreeners() == null || dataState.getFollowedCuratedLists() == null || dataState.getListOrder() == null || dataState.getCuratedListItems() == null || dataState.getActiveOptionWatchlistItems() == null) {
            return CuratedListViewState.Loading.INSTANCE;
        }
        Tuples2<List<CuratedListDuxo7>, List<CuratedListDuxo7>> tuples2DetermineCuratedListOrder = determineCuratedListOrder(dataState);
        List<CuratedListDuxo7> listComponent1 = tuples2DetermineCuratedListOrder.component1();
        ImmutableList immutableList = extensions2.toImmutableList(CollectionsKt.plus((Collection) listComponent1, (Iterable) tuples2DetermineCuratedListOrder.component2()));
        boolean z = !listComponent1.isEmpty();
        Map<UUID, CuratedListViewMode> curatedListViewModes = dataState.getCuratedListViewModes();
        if (curatedListViewModes == null) {
            mapEmptyMap = MapsKt.emptyMap();
        } else {
            mapEmptyMap = new LinkedHashMap(MapsKt.mapCapacity(curatedListViewModes.size()));
            Iterator<T> it = curatedListViewModes.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                mapEmptyMap.put(entry.getKey(), CuratedListStateProvider2.toDisplayType((CuratedListViewMode) entry.getValue()));
            }
        }
        return new CuratedListViewState.Loaded(z, immutableList, mapEmptyMap, dataState.isSwipeToBuyEnabled(), dataState.getSwipeAnimationPreview(), dataState.getSwipeTooltip(), dataState.isInEtfSupportedRegion(), dataState.getSubzeroEnabled());
    }

    private final Tuples2<List<CuratedListDuxo7>, List<CuratedListDuxo7>> determineCuratedListOrder(CuratedListDataState dataState) {
        if (dataState.getScreeners() == null || dataState.getFollowedCuratedLists() == null || dataState.getListOrder() == null || dataState.getCuratedListItems() == null || dataState.getActiveOptionWatchlistItems() == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        List<Screener> screeners = dataState.getScreeners();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(screeners, 10)), 16));
        for (Screener screener : screeners) {
            Tuples2 tuples2M3642to = Tuples4.m3642to(StringsKt.toUuid(screener.getId()), new CuratedListDuxo7.ScreenerItem(screener));
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        List<CuratedList> followedCuratedLists = dataState.getFollowedCuratedLists();
        ArrayList<CuratedList> arrayList = new ArrayList();
        for (Object obj : followedCuratedLists) {
            if (((CuratedList) obj).isRobinhoodList()) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (CuratedList curatedList : arrayList) {
            Tuples2 tuples2M3642to2 = Tuples4.m3642to(curatedList.getId(), new CuratedListDuxo7.CuratedItem(curatedList));
            linkedHashMap2.put(tuples2M3642to2.getFirst(), tuples2M3642to2.getSecond());
        }
        List<CuratedList> followedCuratedLists2 = dataState.getFollowedCuratedLists();
        ArrayList<CuratedList> arrayList2 = new ArrayList();
        for (Object obj2 : followedCuratedLists2) {
            if (!((CuratedList) obj2).isRobinhoodList()) {
                arrayList2.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        for (CuratedList curatedList2 : arrayList2) {
            Tuples2 tuples2M3642to3 = Tuples4.m3642to(curatedList2.getId(), new CuratedListDuxo7.WatchlistItem(curatedList2, !Intrinsics.areEqual(dataState.getExpandedCuratedListIds().get(curatedList2.getId()), Boolean.FALSE), determineWatchlistItems(dataState.getActiveOptionWatchlistItems().containsKey(curatedList2.getId()) ? dataState.getActiveOptionWatchlistItems().get(curatedList2.getId()) : dataState.getCuratedListItems().get(curatedList2.getId()), dataState.getPositions()), dataState.getShouldShowListRows()));
            linkedHashMap3.put(tuples2M3642to3.getFirst(), tuples2M3642to3.getSecond());
        }
        Map mapPlus = MapsKt.plus(MapsKt.plus(linkedHashMap, linkedHashMap2), linkedHashMap3);
        List<ListRecord> listOrder = dataState.getListOrder();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOrder, 10));
        Iterator<T> it = listOrder.iterator();
        while (it.hasNext()) {
            arrayList3.add(((ListRecord) it.next()).getId());
        }
        Set setKeySet = mapPlus.keySet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : setKeySet) {
            if (!arrayList3.contains((UUID) obj3)) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            CuratedListDuxo7 curatedListDuxo7 = (CuratedListDuxo7) mapPlus.get((UUID) it2.next());
            if (curatedListDuxo7 != null) {
                arrayList5.add(curatedListDuxo7);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            CuratedListDuxo7 curatedListDuxo72 = (CuratedListDuxo7) mapPlus.get((UUID) it3.next());
            if (curatedListDuxo72 != null) {
                arrayList6.add(curatedListDuxo72);
            }
        }
        return Tuples4.m3642to(CollectionsKt.sortedWith(arrayList6, new Comparator() { // from class: com.robinhood.shared.portfolio.lists.ui.CuratedListStateProvider$determineCuratedListOrder$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                boolean zIsRobinhoodList;
                CuratedListDuxo7 curatedListDuxo73 = (CuratedListDuxo7) t;
                boolean zIsRobinhoodList2 = false;
                if (curatedListDuxo73 instanceof CuratedListDuxo7.CuratedItem) {
                    zIsRobinhoodList = ((CuratedListDuxo7.CuratedItem) curatedListDuxo73).getCuratedList().isRobinhoodList();
                } else {
                    if (!(curatedListDuxo73 instanceof CuratedListDuxo7.WatchlistItem) && !(curatedListDuxo73 instanceof CuratedListDuxo7.ScreenerItem)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zIsRobinhoodList = false;
                }
                Boolean boolValueOf = Boolean.valueOf(zIsRobinhoodList);
                CuratedListDuxo7 curatedListDuxo74 = (CuratedListDuxo7) t2;
                if (curatedListDuxo74 instanceof CuratedListDuxo7.CuratedItem) {
                    zIsRobinhoodList2 = ((CuratedListDuxo7.CuratedItem) curatedListDuxo74).getCuratedList().isRobinhoodList();
                } else if (!(curatedListDuxo74 instanceof CuratedListDuxo7.WatchlistItem) && !(curatedListDuxo74 instanceof CuratedListDuxo7.ScreenerItem)) {
                    throw new NoWhenBranchMatchedException();
                }
                return ComparisonsKt.compareValues(boolValueOf, Boolean.valueOf(zIsRobinhoodList2));
            }
        }), arrayList5);
    }

    private final List<WatchlistItemRow> determineWatchlistItems(List<CuratedListItem> curatedListItem, Map<UUID, PositionsV2.PositionListItemV2> positions) {
        Object instrument;
        if (curatedListItem != null) {
            List<CuratedListItem> list = curatedListItem;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (CuratedListItem curatedListItem2 : list) {
                PositionsV2.PositionListItemV2 positionListItemV2 = positions != null ? positions.get(curatedListItem2.getId()) : null;
                if (positionListItemV2 != null) {
                    instrument = new WatchlistItemRow.Position(positionListItemV2, curatedListItem2);
                } else if (curatedListItem2.getObjectType() == CuratedListObjectType.OPTION_STRATEGY) {
                    instrument = new WatchlistItemRow.OptionsInstrument(curatedListItem2);
                } else {
                    instrument = new WatchlistItemRow.Instrument(curatedListItem2);
                }
                arrayList.add(instrument);
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }
}

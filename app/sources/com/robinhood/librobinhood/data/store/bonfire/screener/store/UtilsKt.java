package com.robinhood.librobinhood.data.store.bonfire.screener.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.models.api.bonfire.ApiListsOrder4;
import com.robinhood.models.p320db.bonfire.ListRecord;
import com.robinhood.models.p320db.bonfire.ListsOrder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: Utils.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¨\u0006\u0006"}, m3636d2 = {AnalyticsStrings.BUTTON_LIST_SORT, "", "Lcom/robinhood/equityscreener/models/db/Screener;", "screeners", "listsOrder", "Lcom/robinhood/models/db/bonfire/ListsOrder;", "lib-store-equityscreener_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class UtilsKt {
    public static final List<Screener> sort(List<Screener> screeners, ListsOrder listsOrder) {
        final LinkedHashMap linkedHashMap;
        List<ListRecord> lists;
        Intrinsics.checkNotNullParameter(screeners, "screeners");
        if (listsOrder == null || (lists = listsOrder.getLists()) == null) {
            linkedHashMap = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : lists) {
                if (((ListRecord) obj).getListType() == ApiListsOrder4.SCREENER) {
                    arrayList.add(obj);
                }
            }
            ArrayList<Tuples2> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            int i = 0;
            for (Object obj2 : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList2.add(Tuples4.m3642to(((ListRecord) obj2).getId().toString(), Integer.valueOf(i)));
                i = i2;
            }
            linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
            for (Tuples2 tuples2 : arrayList2) {
                linkedHashMap.put(tuples2.getFirst(), tuples2.getSecond());
            }
        }
        return linkedHashMap != null ? CollectionsKt.sortedWith(screeners, new Comparator() { // from class: com.robinhood.librobinhood.data.store.bonfire.screener.store.UtilsKt$sort$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues((Integer) linkedHashMap.get(((Screener) t).getId()), (Integer) linkedHashMap.get(((Screener) t2).getId()));
            }
        }) : screeners;
    }
}
